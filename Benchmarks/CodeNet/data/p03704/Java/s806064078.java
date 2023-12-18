import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		FastScanner in = new FastScanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskF solver = new TaskF();
		solver.solve(1, in, out);
		out.close();
	}

	static class TaskF {
		int MAX_LEN;
		int[] a;
		int[] d;
		int[] sum;
		int ans;

		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			char[] dc = in.next().toCharArray();
			MAX_LEN = dc.length + 7;
			ans = 0;
			a = new int[MAX_LEN];
			d = new int[MAX_LEN];
			sum = new int[MAX_LEN];
			for (int i = 0; i < dc.length; i++) {
				d[i] = dc[dc.length - i - 1] - '0';
			}
			Arrays.fill(a, -1);
			Arrays.fill(sum, -1);
			for (int len = dc.length; len < MAX_LEN; len++) {
				rec(0, 0, len);
			}
			out.println(ans);
		}

		private void rec(int i, int c, int n) {
			if (i == n) {
				if (c != 0) {
					return;
				}
				boolean ok = true;
				for (int j = 0; j < n && ok; j++) {
					if (sum[j] != a[n - 1 - j]) {
						ok = false;
					}
				}
				if (ok) {
					++ans;
				}
				return;
			}
			int l = 0;
			int r = 9;
			if (a[i] >= 0) {
				l = a[i];
				r = a[i];
			}
			if (i == n - 1) {
				l = Math.max(l, 1);
			}
			for (int v = l; v <= r; v++) {
				a[i] = v;
				int x = (a[i] + d[i] + c) % 10;
				int y = (a[i] + d[i] + c) / 10;
				int old = a[n - i - 1];
				if (old < 0 || old == x) {
					if (sum[n - i - 1] >= 0 && a[i] != sum[n - i - 1]) {
					} else {
						a[n - i - 1] = x;
						sum[i] = x;
						rec(i + 1, y, n);
						sum[i] = -1;
						a[n - i - 1] = old;
					}
				}
				a[i] = -1;
			}
		}

	}

	static class FastScanner {
		private BufferedReader in;
		private StringTokenizer st;

		public FastScanner(InputStream stream) {
			in = new BufferedReader(new InputStreamReader(stream));
		}

		public String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					String rl = in.readLine();
					if (rl == null) {
						return null;
					}
					st = new StringTokenizer(rl);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return st.nextToken();
		}

	}
}

