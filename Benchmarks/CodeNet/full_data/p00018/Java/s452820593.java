import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	private	static	BufferedReader	br = null;

	static {
		br   = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String	strTmp   = null;
		String	strStdin = null;
		char[]	aStdin   = null;
		char	c;

		while((strStdin = parseStdin()) != null) {
			aStdin = strStdin.toCharArray();
			for (int n1 = 0; n1 < 26; n1++) {
				for (int n2 = 0; n2 < aStdin.length; n2++) {
					c = aStdin[n2];
					if ('a' <= c && c <= 'z') {
						if ('z' < ++c) {
							c = 'a';
						}
					}
					aStdin[n2] = c;
				}
				strTmp = String.valueOf(aStdin);
				if (strTmp.contains("this") || strTmp.contains("that") || strTmp.contains("the")) {
					System.out.println(strTmp);
					break;
				}
			}
		}
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