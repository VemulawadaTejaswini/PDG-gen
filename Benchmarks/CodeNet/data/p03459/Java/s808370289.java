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
		ProblemC solver = new ProblemC();
		solver.solve(1, in, out);
		out.close();
	}

	static class ProblemC {
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int n = in.nextInt();
			int[] t = new int[n + 1];
			int[] x = new int[n + 1];
			int[] y = new int[n + 1];
			for (int i = 0; i < n; i++) {
				t[i + 1] = in.nextInt();
				x[i + 1] = in.nextInt();
				y[i + 1] = in.nextInt();
				if (!can(t[i], x[i], y[i], t[i + 1], x[i + 1], y[i + 1])) {
					out.println("No");
					return;
				}
			}
			out.println("Yes");
		}

		private boolean can(int t1, int x1, int y1, int t2, int x2, int y2) {
			int dx = Math.abs(x1 - x2);
			int dy = Math.abs(y1 - y2);
			int dt = t2 - t1;
			if (dt < dx + dy) {
				return false;
			}
			dt -= dx + dy;
			return dt % 2 == 0;
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
					st = new StringTokenizer(in.readLine());
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

