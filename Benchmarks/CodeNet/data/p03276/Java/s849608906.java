import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Collections;
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
			int k = in.nextInt();
			List<Integer> pos = new ArrayList<>();
			List<Integer> neg = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				int x = in.nextInt();
				if (x >= 0) {
					pos.add(x);
				} else {
					neg.add(-x);
				}
			}
			Collections.reverse(neg);
			long[] sumP = sums(pos);
			long[] sumN = sums(neg);
			long ans = Long.MAX_VALUE;
			for (int p = 0; p <= k && p < sumP.length; p++) {
				int nn = k - p;
				if (nn < 0 || nn >= sumN.length) {
					continue;
				}
				ans = Math.min(ans, 2 * sumP[p] + 1 * sumN[nn]);
				ans = Math.min(ans, 1 * sumP[p] + 2 * sumN[nn]);
			}
			out.println(ans);
		}

		private long[] sums(List<Integer> a) {
			long[] s = new long[a.size() + 1];
			for (int i = 0; i < a.size(); i++) {
				s[i + 1] = s[i] + a.get(i);
				if (i > 0) {
					s[i + 1] -= a.get(i - 1);
				}
			}
			return s;
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

