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
		B_Path solver = new B_Path();
		solver.solve(1, in, out);
		out.close();
	}

	static class B_Path {
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int[] deg = new int[4];
			for (int i = 0; i < 3; i++) {
				int a = in.nextInt() - 1;
				int b = in.nextInt() - 1;
				++deg[a];
				++deg[b];
			}
			Arrays.sort(deg);
			out.println(Arrays.equals(deg, new int[]{1, 1, 2, 2}) ? "YES" : "NO");
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

