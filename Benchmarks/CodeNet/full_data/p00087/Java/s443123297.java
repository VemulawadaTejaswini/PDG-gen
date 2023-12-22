import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class Main {
	private	static	BufferedReader	br = null;

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
	}
 
    /**
     * @param args
     */
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		String[]	params = null;

		while ((params = parseParams()) != null) {
			Stack<String>	stack = new Stack<String>();
			
			for(String param:params) {
				try {
					Double.parseDouble(param);
					stack.push(param);
				} catch (NumberFormatException e) {
					double	val2 = Double.parseDouble(stack.pop());
					double	val1 = Double.parseDouble(stack.pop());
					String	res  = calc(param, val1, val2);
					if (res != null) {
						stack.push(res);
					}
				}
			}

			System.out.println(stack.pop());
		}
	}

	private	static String calc(String sign, double val1, double val2) {
		String	result = null;
 
		if (sign.equals("+")) {
			result = String.format("%.6f", val1 + val2);
		}
		else if (sign.equals("-")) {
			result = String.format("%.6f", val1 - val2);
		}
		else if (sign.equals("*")) {
			result = String.format("%.6f", val1 * val2);
		}
		else if (sign.equals("/")) {
			result = String.format("%.6f", val1 / val2);
		}
		 
		return result;
	}
 
	private static String[] parseParams() {
		String[]	params = null;
		String		strIn  = null;
 
		if ((strIn = parseStdin()) != null) {
			params = strIn.split(" ");
		}
		 
		return params;
	}
 
	private static String parseStdin() {
        String  stdin = null;
        
        try {
       		stdin = br.readLine();
        }
        catch (IOException e) {}
 
        return stdin;
	}
}