import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	private	static			BufferedReader	br  = null;

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
	}
 
    /**
     * @param args
     */
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		int[]	params = null;
		String	out    = "";

		while ((params = parseParams()) != null) {
			if (params[0] == 0 && params[1] == 0) {
				break;
			}

			int		win   = 0;
			int		curr  = 0;
			int		count = 0;
			int		rest  = params[0];
			byte[]	check = new byte[rest];

			while(rest > 0) {
				if(check[curr] == 0) {
					count++;
					if (count == params[1]) {
						check[curr]++;
						rest--;
						win   = curr + 1;
						count = 0;
					}
				}
				curr = (curr + 1) % params[0];
			}

			out += String.format("%d\n", win);
		}

		System.out.println(out);
	}

	private static  int[] parseParams() {
		int[]		params = null;
		String[]	split  = null;
		String		strIn  = null;
 
		if ((strIn = parseStdin()) != null) {
			split = strIn.split(" ");
			params = new int[split.length];
			for (int n = 0; n < split.length; n++) {
				params[n] = Integer.parseInt(split[n]);
			}
		}
		 
		return params;
	}
 
	private static String parseStdin() {
		String	strNum = null;
 
		try {
			String line = br.readLine();
			if (line != null) {
				if (!line.isEmpty()) {
					strNum = line;
				}
			}
		}
		catch (IOException e) {}
 
		return strNum;
	}
}