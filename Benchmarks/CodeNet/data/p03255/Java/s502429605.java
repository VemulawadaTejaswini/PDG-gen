import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	static void solve() throws Exception {
		int n = scanInt();
		long xx = scanLong();
		long x[] = new long[n];
		long xs[] = new long[n + 1];
		for (int i = 0; i < n; i++) {
			x[i] = scanLong();
			xs[i + 1] = xs[i] + x[i];
		}
		long ans = xx * n + 5 * xs[n];
		i: for (int i = 1; i < n; i++) {
			long cans = xx * i + 5 * (xs[n] - xs[n - i]);
			for (int j = 5, k = n - i; k >= 0; j += 2, k -= i) {
				if (cans > ans) {
					continue i;
				}
				cans += j * (xs[k] - xs[max(k - i, 0)]);
			}
			ans = min(ans, cans);
		}
		out.print(ans + xx * n);
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