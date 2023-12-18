import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.Map.Entry;
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
			Map<Integer, Integer> m = compress(a);
			int[] prev = new int[n];
			Arrays.fill(prev, -1);
			int last = 0;
			for (int i = 1; i < n; i++) {
				if (a[i] > a[last]) {
					prev[i] = last;
					last = i;
				}
			}
			Map<Integer, Integer> invM = new HashMap<>();
			for (Map.Entry<Integer, Integer> e : m.entrySet()) {
				invM.put(e.getValue(), e.getKey());
			}
			long[] am = new long[m.size()];
			int amPtr = am.length - 1;
			long[] ans = new long[n];
			for (int i = n - 1; i >= 0; i--) {
				++am[m.get(a[i])];
				if (i > 0 && prev[i] < 0) {
					continue;
				}
				int x = 0;
				if (i > 0) {
					x = a[prev[i]];
				}
				int xPtr = m.get(x);
				while (amPtr > xPtr) {
					int p = amPtr - 1;
					if (p < 0) {
						throw new AssertionError();
					}
					long dist = invM.get(amPtr) - invM.get(p);
					ans[i] += dist * am[amPtr];
					am[p] += am[amPtr];
					am[amPtr] = 0;
					amPtr = p;
				}
			}
			for (int i = 0; i < n; i++) {
				out.println(ans[i]);
			}
		}

		private Map<Integer, Integer> compress(int[] a) {
			int[] b = a.clone();
			Arrays.sort(b);
			Map<Integer, Integer> m = new HashMap<>();
			m.put(0, 0);
			for (int x : b) {
				if (!m.containsKey(x)) {
					int sz = m.size();
					m.put(x, sz);
				}
			}
			return m;
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

