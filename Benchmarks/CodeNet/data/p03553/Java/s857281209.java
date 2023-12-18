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
		TaskE solver = new TaskE();
		solver.solve(1, in, out);
		out.close();
	}

	static class TaskE {
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int n = in.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = in.nextInt();
			}
			long ans = solve(a);
			out.println(ans);
		}

		private long solve(int[] a) {
			int n = a.length;
			int k = Math.min(11, n);
			boolean[] dead = new boolean[n];
			long res = 0;
			for (int mask = 0; mask < 1 << k; mask++) {
				Arrays.fill(dead, false);
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < k; j++) {
						if ((mask & (1 << j)) > 0 && (i + 1) % (j + 1) == 0) {
							dead[i] = true;
							break;
						}
					}
				}
				long cur = 0;
				for (int i = 0; i < k; i++) {
					if (!dead[i]) {
						cur += a[i];
					}
				}
				for (int i = k; i < n; i++) {
					if (dead[i]) {
						continue;
					}
					List<Integer> b = new ArrayList<>();
					for (int j = i + 1; j <= n; j += i + 1) {
						if (!dead[j - 1]) {
							b.add(a[j - 1]);
						} else {
							b.add(0);
						}
						dead[j - 1] = true;
					}
					int[] bArr = new int[b.size()];
					for (int j = 0; j < b.size(); j++) {
						bArr[j] = b.get(j);
					}
					cur += solve(bArr);
				}
				res = Math.max(res, cur);
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

