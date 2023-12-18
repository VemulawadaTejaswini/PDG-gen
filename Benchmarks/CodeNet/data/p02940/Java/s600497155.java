import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	static final int MOD = 998244353;

	static int mul(int a, int b) {
		int res = (int) ((long) a * b % MOD);
		return res < 0 ? res + MOD : res;
	}

	static void solve() throws Exception {
		int n = scanInt();
		String s = scanString();
		int freeColor = 0, freeCount = 0;
		int pairCounts[] = new int[3];
		int ans = 1;
		for (int i = 2; i <= n; i++) {
			ans = mul(ans, i);
		}
		for (int i = 0; i < 3 * n; i++) {
			int color = "RGB".indexOf(s.charAt(i));
			if (pairCounts[color] != 0) {
				ans = mul(ans, pairCounts[color]);
				--pairCounts[color];
			} else if (freeCount != 0 && freeColor != color) {
				ans = mul(ans, freeCount);
				--freeCount;
				++pairCounts[3 - color - freeColor];
			} else {
				freeColor = color;
				++freeCount;
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