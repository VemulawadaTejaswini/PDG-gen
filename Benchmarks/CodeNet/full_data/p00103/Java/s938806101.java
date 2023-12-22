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
		int	cnt = parseCnt();

		while(cnt-- > 0) {
			int	scr = 0;
			int	hit = 0;
			int out = 0;

			while(out < 3) {
				String	str = parseStdin();
				if (str.endsWith("OUT")) {
					out++;
				}
				else if (str.endsWith("HIT")) {
					if (hit == 3) {
						scr++;
					} else {
						hit++;
					}
				}
				else if (str.endsWith("HOMERUN")) {
					scr += (hit + 1);
					hit  = 0;
				}
			}

			System.out.println(scr);
		}
	}

	private static int parseCnt() {
		int		cnt = 0;
		String	str = null;

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
            	if (!tmp.isEmpty()) {
            		stdin = tmp;
            	}
        	}
        }
        catch (IOException e) {}
 
        return stdin;
	}
}