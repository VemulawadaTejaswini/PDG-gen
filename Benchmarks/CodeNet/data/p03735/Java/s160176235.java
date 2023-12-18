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
		TaskE solver = new TaskE();
		solver.solve(1, in, out);
		out.close();
	}

	static class TaskE {
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int n = in.nextInt();
			int[] x = new int[n];
			int[] y = new int[n];
			int maxPos = 0;
			for (int i = 0; i < n; i++) {
				x[i] = in.nextInt();
				y[i] = in.nextInt();
				if (x[i] < y[i]) {
					int t = x[i];
					x[i] = y[i];
					y[i] = t;
				}
				if (x[maxPos] < x[i]) {
					maxPos = i;
				}
			}

			{
				int t;
				t = x[maxPos];
				x[maxPos] = x[0];
				x[0] = t;
				t = y[maxPos];
				y[maxPos] = y[0];
				y[0] = t;
			}

			long ans = Long.MAX_VALUE / 2;
			for (int step = 0; step < 2; step++) {
				long rmax = x[0];
				long rmin = x[0];
				long bmax = y[0];
				long bmin = y[0];
				for (int i = 1; i < n; i++) {
					rmax = Math.max(rmax, y[i]);
					rmin = Math.min(rmin, y[i]);
					bmax = Math.max(bmax, x[i]);
					bmin = Math.min(bmin, x[i]);
					int t;
					t = x[i];
					x[i] = y[i];
					y[i] = t;
				}
				ans = Math.min(ans, (rmax - rmin) * (bmax - bmin));
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

