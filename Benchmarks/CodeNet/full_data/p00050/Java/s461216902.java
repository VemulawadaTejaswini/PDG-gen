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

		while ((strIn = parseStdin()) != null) {
			conv(strIn);
		}
	}

	private static void conv(String strIn) {
		int	nA = -1;
		int	nP = -1;

		while (true) {
			nA = strIn.indexOf("apple");
			nP = strIn.indexOf("peach");

			if (nA == -1 && nP == -1) {
				System.out.println(strIn);
				break;
			}
			else if (nA != -1 && (nA < nP || nP == -1)) {
				System.out.print(strIn.substring(0, nA) + "peach");
				strIn = strIn.substring(nA + 5);
			}
			else {
				System.out.print(strIn.substring(0, nP) + "apple");
				strIn = strIn.substring(nP + 5);
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