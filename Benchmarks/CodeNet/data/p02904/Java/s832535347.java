import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.Math.max;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	static class IntMaxTree {

		final int n;
		final int t[];

		IntMaxTree(int n) {
			this.n = n;
			t = new int[2 * n - 1];
		}

		void init(int v[]) {
			for (int i = 0; i < n; i++) {
				t[n - 1 + i] = v[i];
			}
			for (int i = n - 1; i != 0; i--) {
				t[i - 1] = max(t[(i << 1) - 1], t[i << 1]);
			}
		}

		int get(int i) {
			return t[i + n - 1];
		}

		int getMax(int l, int r) {
			int v = Integer.MIN_VALUE;
			for (l += n, r += n; l != r; l >>>= 1, r >>>= 1) {
				if ((l & 1) != 0) {
					v = max(v, t[l++ - 1]);
				}
				if ((r & 1) != 0) {
					v = max(v, t[--r - 1]);
				}
			}
			return v;
		}

		void set(int i, int v) {
			t[(i += n) - 1] = v;
			for (i >>= 1; i != 0; i >>= 1) {
				t[i - 1] = max(t[(i << 1) - 1], t[i << 1]);
			}
		}
	}

	static void solve() throws Exception {
		int n = scanInt(), k = scanInt();
		int p[] = new int[n];
		IntMaxTree minTree = new IntMaxTree(n), maxTree = new IntMaxTree(n);
		for (int i = 0; i < n; i++) {
			p[i] = scanInt();
			minTree.set(i, -p[i]);
			maxTree.set(i, p[i]);
		}
		int ans = 0;
		boolean haveSorted = false;
		int cntSorted = 0;
		for (int i = 0; i < n; i++) {
			if (i == 0 || p[i] > p[i - 1]) {
				++cntSorted;
			} else {
				cntSorted = 1;
			}
			if (i < k - 1) {
				continue;
			}
			if (cntSorted >= k) {
				if (!haveSorted) {
					haveSorted = true;
					++ans;
				}
			} else {
				if (i >= k) {
					int min = -minTree.getMax(i - k + 1, i),
						max = maxTree.getMax(i - k + 1, i);
					if (p[i] > max && p[i - k] < min) {
						continue;
					}
				}
				++ans;
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