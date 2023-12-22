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
		String	strIn = null;
		int[]	blcnt = new int[4];
		int		len   = 0;
		int		c     = 0;

		while ((strIn = parseBlood()) != null) {
			len = strIn.length();
			c   = strIn.charAt(0);

			switch (c) {
			case 'O':
				blcnt[3]++;
				break;
			case 'B':
				blcnt[1]++;
				break;
			case 'A':
				if (len == 2) {
					blcnt[2]++;
				}
				else {
					blcnt[0]++;
				}
				break;
			}
		}

		for (int n = 0; n < blcnt.length; n++) {
			System.out.println(blcnt[n]);
		}
	}

	private static String parseBlood() {
		String	strIn = null;

		if ((strIn = parseStdin()) != null) {
			strIn = strIn.split(",")[1];
		}
		
		return strIn;
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