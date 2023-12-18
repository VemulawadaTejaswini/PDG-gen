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
		long k = scanInt();
		boolean same = true;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) != s.charAt(0)) {
				same = false;
				break;
			}
		}
		if (same) {
			out.print(s.length() * k / 2);
			return;
		}
		long ans = 0, scnt = 0;
		for (int i = 0, j; i < s.length(); i = j) {
			for (j = i + 1; j < s.length() && s.charAt(i) == s.charAt(j); j++) { }
			if (i == 0 && s.charAt(0) == s.charAt(s.length() - 1)) {
				ans += (j - i) / 2;
				scnt = j - i;
			} else if (j == s.length() && s.charAt(0) == s.charAt(s.length() - 1)) {
				ans += (j - i) / 2 + (scnt + j - i) / 2 * (k - 1);
			} else {
				ans += (j - i) / 2 * k;
			}
		}
		out.print(ans);
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