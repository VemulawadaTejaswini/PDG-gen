import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


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

		int[]	r = parseRange();
		System.out.printf("%.6f\n", (double)(r[0] * r[1]) / 3.305785);
	}

	private static int[] parseRange() {
		int[]	params = new int[2];
		String	strin  = null;

		if ((strin = parseStdin()) != null) {
			String[]	lines = strin.split(" ");
			params[0] = Integer.parseInt(lines[0]);
			params[1] = Integer.parseInt(lines[1]);
		}
 
		return params;
	}

	private static String parseStdin() {
        String  stdin = null;
        
        try {
        	String  tmp = br.readLine();
        	if (!tmp.isEmpty()) stdin = tmp;
        }
        catch (IOException e) {}
 
        return stdin;
	}
}