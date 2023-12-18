import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	static boolean isOdd(int n, int k) {
		if (2 * k > n) {
			k = n - k;
		}
		if (k == 0) {
			return true;
		}
		int m = n - Integer.highestOneBit(n);
		return k <= m && isOdd(m, k);
	}

	static void solve() throws Exception {
		int n = scanInt();
		int a[] = new int[n];
		String s = scanString();
		boolean haveOne = false;
		for (int i = 0; i < n; i++) {
			a[i] = s.charAt(i) - '1';
			if (a[i] == 1) {
				haveOne = true;
			}
		}
		if (!haveOne) {
			for (int i = 0; i < n; i++) {
				a[i] >>= 1;
			}
		}
		boolean odd = false;
		for (int i = 0; i < n; i++) {
			if (a[i] == 1 && isOdd(n - 1, i)) {
				odd = !odd;
			}
		}
		out.print(odd ? haveOne ? 1 : 2 : 0);
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