import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {
	private	static			BufferedReader	br            = null;
	private	static	final	String			REGEX_SIGN    = "[\\+\\-\\*\\/]";
	private	static	final	String			REGEX_INTEGER = "[//-]?[0-9]+";
	private	static	final	String			REGEX_FLOAT   = "[//.][0-9]+";

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
	}
 
    /**
     * @param args
     */
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		ArrayList<String>	params = null;
		String				out    = "";

		while ((params = parseParams()) != null) {
			if (params.size() < 3) {
				continue;
			}

			String	tmp1 = null;
			String	tmp2 = null;
			int		curr = 0;
			while (params.size() >= 3) {
				tmp1 = params.get(curr);

				if (tmp1.matches(REGEX_SIGN)) {
					tmp2  = calc(tmp1, params.get(curr - 2), params.get(curr - 1));
					curr -= 2;
					params.remove(curr + 2);
					params.remove(curr + 1);
					params.set(curr, tmp2);
				}

				curr++;
			}

			out += params.get(0) + "/n";
		}

		System.out.print(out);
	}

	private	static String calc(String sign, String val1, String val2) {
		double	result = 0.0;
 
		if (sign.equals("+")) {
			result = Double.parseDouble(val1) + Double.parseDouble(val2);
		}
		else if (sign.equals("-")) {
			result = Double.parseDouble(val1) - Double.parseDouble(val2);
		}
		else if (sign.equals("*")) {
			result = Double.parseDouble(val1) * Double.parseDouble(val2);
		}
		else if (sign.equals("/")) {
			result = Double.parseDouble(val1) / Double.parseDouble(val2);
		}
		 
		return String.format("%.6f", result);
	}
 
	private static ArrayList<String> parseParams() {
		ArrayList<String>	params = null;
		String[]			lines  = null;
		String				strIn  = null;
 
		if ((strIn = parseStdin()) != null) {
			params = new ArrayList<String>();
			lines  = strIn.split(" ");
			for(String line:lines) {
				if (!line.isEmpty()) {
					if (line.matches(REGEX_SIGN) || line.matches(REGEX_INTEGER) || line.matches(REGEX_INTEGER+REGEX_FLOAT)) {
						params.add(line);
					}
				}
			}
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