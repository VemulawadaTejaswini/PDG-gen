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

	static void sortBy(int a[], int n, long v[]) {
		if (n == 0) {
			return;
		}
		for (int i = 1; i < n; i++) {
			int j = i;
			int ca = a[i];
			long cv = v[ca];
			do {
				int nj = (j - 1) >> 1;
				int na = a[nj];
				if (cv <= v[na]) {
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
				j += (v[a[j + 2]] > v[a[j + 1]]) ? 2 : 1;
			}
			if ((j << 1) + 2 == i) {
				j = (j << 1) + 1;
			}
			int na = a[i];
			a[i] = ca;
			ca = na;
			long cv = v[ca];
			while (j != 0 && v[a[j]] < cv) {
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
		int n = scanInt(), x = scanInt();
		int b[] = new int[n], l[] = new int[n], u[] = new int[n], idx[] = new int[n];
		long v[] = new long[n];
		long s = 0;
		for (int i = 0; i < n; i++) {
			b[i] = scanInt();
			l[i] = scanInt();
			u[i] = scanInt();
			v[i] = (long) u[i] * (x - b[i]) + (long) l[i] * b[i];
			s += (long) l[i] * b[i];
			idx[i] = i;
		}
		sortBy(idx, n, v);
		long ans = 0;
		int i;
		for (i = n - 1; i >= 0; i--) {
			if (s < v[idx[i]]) {
				break;
			}
			s -= v[idx[i]];
			ans += x;
		}
		if (s > 0) {
			long ans2 = Long.MAX_VALUE;
			for (; i >= 0; i--) {
				long cl = l[idx[i]], cb = b[idx[i]], cu = u[idx[i]];
				ans2 = min(ans2, s <= cl * cb ? (s - 1) / cl + 1 : cb + (s - cl * cb - 1) / cu + 1);
			}
			ans += ans2;
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