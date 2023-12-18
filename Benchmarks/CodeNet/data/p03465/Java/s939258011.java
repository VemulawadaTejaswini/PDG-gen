import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.Math.min;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	static void sort(int a[]) {
		int n = a.length;
		if (n == 0) {
			return;
		}
		for (int i = 1; i < n; i++) {
			int j = i;
			int ca = a[i];
			do {
				int nj = (j - 1) >> 1;
				int na = a[nj];
				if (ca <= na) {
					break;
				}
				a[j] = na;
				j = nj;
			} while (j != 0);
			a[j] = ca;
		}
		int ca = a[0];
		for (int i = n - 1; i > 0; i--) {
			int j = 0;
			while ((j << 1) + 2 + Integer.MIN_VALUE < i + Integer.MIN_VALUE) {
				j <<= 1;
				j += (a[j + 2] > a[j + 1]) ? 2 : 1;
			}
			if ((j << 1) + 2 == i) {
				j = (j << 1) + 1;
			}
			int na = a[i];
			a[i] = ca;
			ca = na;
			while (j != 0 && a[j] < ca) {
				j = (j - 1) >> 1;
			}
			while (j != 0) {
				na = a[j];
				a[j] = ca;
				ca = na;
				j = (j - 1) >> 1;
			}
		}
		a[0] = ca;
	}

	static void solve() throws Exception {
		int n = scanInt();
//		int n = 2000;
		int a[] = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			a[i] = scanInt();
//			a[i] = 2000;
			sum += a[i];
		}
		sort(a);
		long have[] = new long[(sum >> 7) + 1];
		have[0] = 1;
		sum = 0;
		for (int i: a) {
			sum += i;
			if ((i & 63) == 0) {
				for (int j = min(have.length - 1, sum >> 6); j >= i >> 6; j--) {
					have[j] |= have[j - (i >> 6)];
				}
			} else {
				for (int j = min(have.length - 1, sum >> 6); j > i >> 6; j--) {
					have[j] |= (have[j - (i >> 6)] << i) | (have[j - (i >> 6) - 1] >>> -i);
				}
				if (i >> 6 < have.length) {
					have[i >> 6] |= have[0] << i;
				}
			}
		}
		for (int i = sum / 2;; i--) {
			if ((have[i >> 6] & (1L << i)) != 0) {
				out.print(sum - i);
				return;
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