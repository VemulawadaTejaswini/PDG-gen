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
		String cnt;

		while ((cnt = parseStdin()) != null) {
			int	avr = 0;
			int	max = Integer.parseInt(cnt);

			for (int i = 0; i < max; i++) {
				avr += parseCnt();
			}
			avr = (max > 1) ? avr / max : avr;

			System.out.println(avr);
		}
	}
 
	private static int parseCnt() {
		int     cnt = 0;
		String  str = null;

		if ((str = parseStdin()) != null) {
			cnt = Integer.parseInt(str);
		}

		return cnt;
	}
 
	private static String parseStdin() {
        String  stdin = null;
        
        try {
        	String  tmp = br.readLine();
        	if (tmp != null) {
            	if (!tmp.isEmpty()) stdin = tmp;
        	}
        }
        catch (IOException e) {}
 
        return stdin;
	}
}