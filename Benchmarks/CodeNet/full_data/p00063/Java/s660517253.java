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
		String	stdin = null;
		int		cnt   = 0;
		int		len   = 0;
		int		fin   = 0;
		boolean	rev   = true;

		while ((stdin = parseStdin()) != null) {
			rev = true;
			len = stdin.length();
			fin = len / 2;
			for (int n = 0; n < fin; n++) {
				if (!(rev = (stdin.charAt(n) == stdin.charAt(len - 1 - n)))) {
					break;
				}
			}

			if (rev) {
				cnt++;
			}
		}

		System.out.println(cnt);
	}

	private static String parseStdin() {
		String	stdin = null;

		try {
			String line = br.readLine();
			if (line != null) {
				if (!line.isEmpty()) {
					stdin = line;
				}
			}
		}
		catch (IOException e) {}

		return stdin;
	}
}