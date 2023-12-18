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
		TaskD solver = new TaskD();
		solver.solve(1, in, out);
		out.close();
	}

	static class TaskD {
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int n = in.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = in.nextInt();
			}

			int[] sorted = a.clone();
			Arrays.sort(sorted);
			int l = -1;
			int r = n - 1;
			long total = (long) n * (n + 1) / 2;
			while (r - l > 1) {
				int m = (l + r) / 2;
				if (countSubstringsWithMedianLessThanOrEqualTo(a, sorted[m]) > total / 2) {
					r = m;
				} else {
					l = m;
				}
			}
			out.println(sorted[r]);
		}

		private long countSubstringsWithMedianLessThanOrEqualTo(int[] a, int m) {
			int n = a.length;
//		long res = 0;
//		for (int i = 0; i < n; i++) {
//			List<Integer> cur = new ArrayList<>();
//			for (int j = i; j < n; j++) {
//				cur.add(a[j]);
//				List<Integer> b = new ArrayList<>(cur);
//				Collections.sort(b);
//				if (b.get(b.size() / 2) <= m) {
//					++res;
//				}
//			}
//		}
//		return res;

			int[] s = new int[n + 1];
			for (int i = 0; i < n; i++) {
				s[i + 1] = s[i] + (a[i] <= m ? 0 : 1);
			}

			for (int i = 0; i < n; i++) {
				s[i] = 2 * s[i + 1] - i;
			}

			return TaskD.InversionsCounter.countInversions(s);
		}

		static class InversionsCounter {
			public static long countInversions(int[] a) {
				int n = a.length;

				int[] b = sortUnique(a.clone());
				for (int i = 0; i < n; i++) {
					a[i] = Arrays.binarySearch(b, a[i]);
				}

				int[] tree = new int[n];
				long ans = 0;
				for (int i = n - 1; i >= 0; i--) {
					ans += sum(tree, a[i]);
					add(tree, a[i], 1);
				}
				return ans;
			}

			private static int[] sortUnique(int[] a) {
				Arrays.sort(a);
				int k = 0;
				for (int i = 0; i < a.length; i++) {
					if (i == 0 || a[i] != a[i - 1]) {
						a[k++] = a[i];
					}
				}
				return Arrays.copyOf(a, k);
			}

			private static void add(int[] tree, int pos, int val) {
				while (pos < tree.length) {
					tree[pos] += val;
					pos |= pos + 1;
				}
			}

			private static long sum(int[] tree, int r) {
				long res = 0;
				while (r >= 0) {
					res += tree[r];
					r = (r & (r + 1)) - 1;
				}
				return res;
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

