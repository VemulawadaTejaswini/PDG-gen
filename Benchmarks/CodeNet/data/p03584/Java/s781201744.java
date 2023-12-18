import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
		TaskD solver = new TaskD();
		solver.solve(1, in, out);
		out.close();
	}

	static class TaskD {
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int n = in.nextInt();
			int k = in.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = in.nextInt();
				b[i] = in.nextInt();
			}
			long ans = 0;
			if (k == 0) {
				for (int i = 0; i < n; i++) {
					if (a[i] == 0) {
						ans += b[i];
					}
				}
				out.println(ans);
				return;
			}
			int len = 0;
			int x = k;
			while (x > 0) {
				x /= 2;
				++len;
			}
			for (int same = 0; same <= len; same++) {
				long cur = 0;
				int m = k >> (len - same) << (len - same);
				for (int i = 0; i < n; i++) {
					if (same == len && a[i] == k) {
						cur += b[i];
					}
					int t = a[i] >> (len - same) << (len - same);
					if (same < len && (t | m) == m && ((a[i] >> (len - same - 1)) & 1) == 0) {
						cur += b[i];
					}
				}
				ans = Math.max(ans, cur);
			}
			out.println(ans);
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

		public int nextInt() {
			return Integer.parseInt(next());
		}

	}
}

