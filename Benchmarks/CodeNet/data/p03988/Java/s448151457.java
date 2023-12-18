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
			int[] a = new int[n];
			int max = 0;
			for (int i = 0; i < n; i++) {
				a[i] = in.nextInt();
				max = Math.max(max, a[i]);
			}
			if (max == 1) {
				out.println(n == 2 ? "Possible" : "Impossible");
				return;
			}
			int mid = (max + 1) / 2;
			int min = Math.min(max, mid + 1);
			boolean can = true;
			int spareMids = max % 2 == 0 ? 1 : 2;
			for (int i = 0; i < n; i++) {
				if (a[i] >= min) {
					continue;
				}
				if (a[i] == mid && spareMids > 0) {
					--spareMids;
					continue;
				}
				can = false;
			}
			out.println(can ? "Possible" : "Impossible");
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

