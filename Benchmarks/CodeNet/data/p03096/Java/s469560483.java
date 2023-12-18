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
		B_Reversi solver = new B_Reversi();
		solver.solve(1, in, out);
		out.close();
	}

	static class B_Reversi {
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			final int MOD = (int) (1e9 + 7);
			int n = in.nextInt();
			int[] a = new int[n];
			int max = 0;
			for (int i = 0; i < n; i++) {
				a[i] = in.nextInt();
				max = Math.max(max, a[i]);
			}
			int[] prev = new int[max + 1];
			int[] d = new int[n + 1];
			d[0] = 1;
			for (int i = 1; i <= n; i++) {
				int x = a[i - 1];
				d[i] = d[i - 1];
				if (prev[x] > 0 && prev[x] + 1 != i) {
					d[i] += d[prev[x]];
					if (d[i] >= MOD) {
						d[i] -= MOD;
					}
				}
				prev[x] = i;
			}
			out.println(d[n]);
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

