import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	static int add(int a, int b) {
		int res = a + b;
		return res >= mod ? res - mod : res;
	}

	static int mul(int a, int b) {
		int res = (int) ((long) a * b % mod);
		return res < 0 ? res + mod : res;
	}

	static int mod;

	static void solve() throws Exception {
		int n = scanInt();
		mod = scanInt();
		int dyn[][] = new int[n + 1][3 * n + 1];
		dyn[0][0] = 1;
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= 3 * n; j++) {
				if (j + 1 <= 3 * n) {
					dyn[i][j + 1] = add(dyn[i][j + 1], dyn[i][j]);
				}
				if (i + 1 <= n && j + 2 <= 3 * n) {
					dyn[i + 1][j + 2] = add(dyn[i + 1][j + 2], mul(dyn[i][j], 3 * n - j - 1));
				}
				if (i + 1 <= n && j + 3 <= 3 * n) {
					dyn[i + 1][j + 3] = add(dyn[i + 1][j + 3], mul(dyn[i][j], (3 * n - j - 1) * (3 * n - j - 2)));
				}
			}
		}
		int ans = 0;
		for (int i = 0; i <= n; i++) {
			ans = add(ans, dyn[i][3 * n]);
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