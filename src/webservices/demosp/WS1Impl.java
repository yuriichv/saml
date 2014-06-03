package webservices.demosp;
import javax.jws.soap.SOAPBinding; 
import javax.jws.WebService;

// Standard JWS annotation that specifies the mapping of the service onto the
// SOAP message protocol.  In particular, it specifies that the SOAP messages
// are document-literal-wrapped.
@SOAPBinding(style=SOAPBinding.Style.DOCUMENT,
             use=SOAPBinding.Use.LITERAL,
             parameterStyle=SOAPBinding.ParameterStyle.WRAPPED)

@WebService(name="WS1", serviceName="WS1")
public class WS1Impl {
  // By default, all public methods are exposed as Web Services operation
  public String sayMsg(String message) {
  	try {
    	System.out.println("say message:" + message);
  	} catch (Exception ex) { ex.printStackTrace(); }
 
    return "Here is the message: '" + message + "'";
  }
}
