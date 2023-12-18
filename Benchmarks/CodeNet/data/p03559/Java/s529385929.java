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
		TaskC solver = new TaskC();
		solver.solve(1, in, out);
		out.close();
	}

	static class TaskC {
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int n = in.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = in.nextInt();
			}
			int[] b = new int[n];
			for (int i = 0; i < n; i++) {
				b[i] = in.nextInt();
			}
			int[] c = new int[n];
			for (int i = 0; i < n; i++) {
				c[i] = in.nextInt();
			}
			Arrays.sort(a);
			Arrays.sort(b);
			Arrays.sort(c);
			long ans = 0;
			int pa = 0;
			int pc = 0;
			for (int x : b) {
				pa = Math.max(pa, 0);
				while (pa < n && a[pa] < x) {
					++pa;
				}
				--pa;
				while (pc < n && c[pc] <= x) {
					++pc;
				}
				long u = pa + 1;
				long v = Math.max(n - pc, 0);
				ans += u * v;
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

