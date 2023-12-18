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
		TaskE solver = new TaskE();
		solver.solve(1, in, out);
		out.close();
	}

	static class TaskE {
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			final int N = 410;
			final long infinity = (long) 1e18;
			int n = in.nextInt();
			int[] l = new int[n];
			int[] r = new int[n];
			int[] len = new int[n];
			for (int i = 0; i < n; i++) {
				l[i] = in.nextInt();
				r[i] = in.nextInt();
				len[i] = r[i] - l[i];
			}
			int[] sortedL = l.clone();
			Arrays.sort(sortedL);
			int medL = -1;
			for (int i = 0; i < n; i++) {
				if (l[i] == sortedL[n / 2]) {
					medL = i;
				}
			}
			int[] sortedR = r.clone();
			Arrays.sort(sortedR);
			int medR = -1;
			for (int i = 0; i < n; i++) {
				if (r[i] == sortedR[n / 2]) {
					medR = i;
				}
			}
			int[] sortedLen = len.clone();
			Arrays.sort(sortedLen);
			int medLen = -1;
			for (int i = 0; i < n; i++) {
				if (len[i] == sortedLen[n / 2]) {
					medLen = i;
				}
			}
			long ans = infinity;
			ans = Math.min(ans, calc(medL, n, l, r));
			ans = Math.min(ans, calc(medR, n, l, r));
			ans = Math.min(ans, calc(medLen, n, l, r));
			out.println(ans);
		}

		private long calc(int med, int n, int[] l, int[] r) {
			long res = 0;
			int[] nl = new int[med];
			int[] nr = new int[med];
			System.arraycopy(l, 0, nl, 0, nl.length);
			System.arraycopy(r, 0, nr, 0, nl.length);
			reverse(nl);
			reverse(nr);
			res += greedy(l[med], r[med] - l[med], nl, nr);
			nl = new int[n - med - 1];
			nr = new int[n - med - 1];
			System.arraycopy(l, med + 1, nl, 0, nl.length);
			System.arraycopy(r, med + 1, nr, 0, nl.length);
			res += greedy(l[med], r[med] - l[med], nl, nr);
			return res;
		}

		private void reverse(int[] a) {
			for (int i = 0; i < a.length - i - 1; i++) {
				int j = a.length - i - 1;
				int t = a[i];
				a[i] = a[j];
				a[j] = t;
			}
		}

		private long greedy(long x1, long len1, int[] l, int[] r) {
			long res = 0;
			for (int i = 0; i < l.length; i++) {
				long x2 = l[i];
				long len2 = r[i] - l[i];
				long L = Math.max(x1, x2);
				long R = Math.min(x1 + len1, x2 + len2);
				if (L <= R) {
					x1 = x2;
					len1 = len2;
					continue;
				}
				long nx2;
				if (x2 > x1 + len1) {
					nx2 = x1 + len1;
				} else {
					nx2 = x1 - len2;
				}
				res += Math.abs(x2 - nx2);
				x1 = nx2;
				len1 = len2;
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

