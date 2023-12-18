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
		TaskB solver = new TaskB();
		solver.solve(1, in, out);
		out.close();
	}

	static class TaskB {
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int n = in.nextInt();
			long sumA = 0;
			long sumB = 0;
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = in.nextInt();
				sumA += a[i];
			}
			int[] b = new int[n];
			for (int i = 0; i < n; i++) {
				b[i] = in.nextInt();
				sumB += b[i];
			}
			long total = sumB - sumA;
			if (total < 0) {
				out.println("No");
				return;
			}
			long min = 0;
			for (int i = 0; i < n; i++) {
				if (a[i] >= b[i]) {
					min += a[i] - b[i];
				} else if (a[i] % 2 != b[i] % 2) {
					min += 1;
				}
			}
			if (min > total) {
				out.println("No");
			} else {
				out.println("Yes");
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

		public int nextInt() {
			return Integer.parseInt(next());
		}

	}
}

