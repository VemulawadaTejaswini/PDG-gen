import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	static void solve() throws Exception {
		String s = scanString();
		if (s.length() < 26) {
			out.print(s);
			for (char c = 'a';; c++) {
				if (s.indexOf(c) < 0) {
					out.print(c);
					break;
				}
			}
		} else {
			boolean can[] = new boolean[26];
			i: for (int i = 25;; i--) {
				if (i < 0) {
					out.print("-1");
					break;
				}
				for (char c = (char) (s.charAt(i) + 1); c <= 'z'; c++) {
					if (can[c - 'a']) {
						out.print(s.substring(0, i));
						out.print(c);
						break i;
					}
				}
				can[s.charAt(i) - 'a'] = true;
			}
		}
	}

	static int scanInt() throws IOException {
		return parseInt(scanString());
	}

	static long scanLong() throws IOException {
		return parseLong(scanString());
	}

	static String scanString() throws IOException {
		while (tok == null || !tok.hasMoreTokens()) {
			tok = new StringTokenizer(in.readLine());
		}
		return tok.nextToken();
	}

	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer tok;

	public static void main(String[] args) {
		try {
			in = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintWriter(System.out);
			solve();
			in.close();
			out.close();
		} catch (Throwable e) {
			e.printStackTrace();
			exit(1);
		}
	}
}