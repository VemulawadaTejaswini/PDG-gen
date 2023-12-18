import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
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
			int[] a = new int[n];
			List<Integer>[] chains = new List[n];
			for (int i = 0; i < n; i++) {
				chains[i] = new ArrayList<>();
			}
			for (int i = 1; i < n; i++) {
				a[i] = in.nextInt() - 1;
				chains[a[i]].add(i);
			}
			out.println(solve(0, chains));
		}

		private int solve(int i, List<Integer>[] chains) {
			int[] a = new int[chains[i].size()];
			for (int j = 0; j < a.length; j++) {
				a[j] = solve(chains[i].get(j), chains);
			}
			Arrays.sort(a);
			int res = 0;
			for (int j = 0; j < a.length; j++) {
				res = Math.max(res, 1 + j + a[a.length - j - 1]);
			}
			return res;
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

