import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
		ProblemC solver = new ProblemC();
		solver.solve(1, in, out);
		out.close();
	}

	static class ProblemC {
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int n = in.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = in.nextInt();
			}
			TwoMax[] tm = new TwoMax[2];
			for (int step = 0; step < 2; step++) {
				Map<Integer, Integer> m = new HashMap<>();
				for (int i = step; i < n; i += 2) {
					int v = 0;
					if (m.containsKey(a[i])) {
						v = m.get(a[i]);
					}
					m.put(a[i], v + 1);
				}
				tm[step] = new TwoMax();
				for (Map.Entry<Integer, Integer> e : m.entrySet()) {
					tm[step].update(e.getKey(), e.getValue());
				}
			}
			int ans = 0;
			if (tm[0].key0 == tm[1].key0) {
				ans = Math.max(ans, tm[0].value0 + tm[1].value1);
				ans = Math.max(ans, tm[0].value1 + tm[1].value0);
			} else {
				ans = tm[0].value0 + tm[1].value0;
			}
			ans = n - ans;
			out.println(ans);
		}

		class TwoMax {
			int key0;
			int value0;
			int key1;
			int value1;

			void update(int key, int value) {
				if (value > value0) {
					value1 = value0;
					key1 = key0;
					value0 = value;
					key0 = key;
				} else if (value > value1) {
					value1 = value;
					key1 = key;
				}
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

