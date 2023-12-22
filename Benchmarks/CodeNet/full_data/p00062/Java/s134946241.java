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
		int[]	number = null;

		while ((number = parseNumber()) != null) {
			for (int len = number.length; len > 1; len--) {
				for (int m = 0; m < len - 1; m++) {
					number[m] = (number[m] + number[m + 1]) % 10;
				}
			}

			System.out.println(number[0]);
		}
	}

	private static int[] parseNumber() {
		String	stdin  = null;
		int[]	number = null;

		if ((stdin = parseStdin()) != null) {
			number = new int[stdin.length()];
			for (int n = 0; n < number.length; n++) {
				number[n] = stdin.charAt(n) - '0';
			}
		}

		return number;
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