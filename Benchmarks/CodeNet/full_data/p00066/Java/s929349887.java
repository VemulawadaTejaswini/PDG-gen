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
		char	d     = 'd';

		while ((stdin = parseStdin()) != null) {
			char	c = checkHori(stdin);

			if (c == d) {
				c = checkVert(stdin);
			}

			if (c == d) {
				c = checkDiag(stdin);
			}

			System.out.println(c);
		}
	}

	private static char checkHori(String board) {
		char	c = 'd';
		char	s = 's';

		if (board.charAt(0) == board.charAt(1) && board.charAt(1) == board.charAt(2) && board.charAt(0) != s) {
			c = board.charAt(0);
		}
		else if (board.charAt(3) == board.charAt(4) && board.charAt(4) == board.charAt(5) && board.charAt(3) != s) {
			c = board.charAt(3);
		}
		else if (board.charAt(6) == board.charAt(7) && board.charAt(7) == board.charAt(8) && board.charAt(6) != s) {
			c = board.charAt(6);
		}

		return c;
	}

	private static char checkVert(String board) {
		char	c = 'd';
		char	s = 's';

		if (board.charAt(0) == board.charAt(3) && board.charAt(3) == board.charAt(6) && board.charAt(0) != s) {
			c = board.charAt(0);
		}
		else if (board.charAt(1) == board.charAt(4) && board.charAt(4) == board.charAt(7) && board.charAt(1) != s) {
			c = board.charAt(3);
		}
		else if (board.charAt(2) == board.charAt(5) && board.charAt(5) == board.charAt(8) && board.charAt(2) != s) {
			c = board.charAt(6);
		}

		return c;
	}

	private static char checkDiag(String board) {
		char	c = 'd';
		char	s = 's';

		if (board.charAt(0) == board.charAt(4) && board.charAt(4) == board.charAt(8) && board.charAt(4) != s) {
			c = board.charAt(4);
		}
		else if (board.charAt(2) == board.charAt(4) && board.charAt(4) == board.charAt(6) && board.charAt(4) != s) {
			c = board.charAt(4);
		}

		return c;
	}

	private static String parseStdin() {
		String	stdin = null;

		try {
			String line = br.readLine();
//			if (line != null) {
//				if (!line.isEmpty()) {
					stdin = line;
//				}
//			}
		}
		catch (IOException e) {}

		return stdin;
	}
}