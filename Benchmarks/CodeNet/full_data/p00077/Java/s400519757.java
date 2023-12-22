import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	private	static	BufferedReader br = null;

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String	strIn = null;

		while ((strIn = parseStdin()) != null) {
			System.out.println(decode(strIn));
		}
	}

	private static String decode(String plain) {
		String	decode = "";
		int		len    = plain.length();

		for (int i = 0; i < len; i++) {
			char	c = plain.charAt(i);
			if (c == '@') {
				c = plain.charAt(i + 2);
				for (int j = plain.charAt(i + 1) - '0'; j > 0; j--) {
					decode += c;
				}
				i += 2;
			}
			else {
				decode += c;
			}
		}
		
		return decode;
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