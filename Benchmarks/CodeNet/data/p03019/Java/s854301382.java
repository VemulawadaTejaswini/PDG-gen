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
		C_Tests solver = new C_Tests();
		solver.solve(1, in, out);
		out.close();
	}

	static class C_Tests {
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int n = in.nextInt();
			long x = in.nextInt();
			Test[] tests = new Test[n];
			long need = 0;
			for (int i = 0; i < n; i++) {
				Test t = new Test();
				t.b = in.nextInt();
				t.l = in.nextInt();
				t.u = in.nextInt();
				t.profit = t.b * t.l + (x - t.b) * t.u;
				tests[i] = t;

				need += t.b * t.l;
			}

			long ans = 0;
			Arrays.sort(tests, (u, v) -> (-Long.compare(u.profit, v.profit)));
			for (int i = 0; i < n; i++) {
				if (need <= 0) {
					break;
				}
				if (need >= tests[i].profit) {
					ans += x;
					need -= tests[i].profit;
					continue;
				}
				long best = Long.MAX_VALUE;
				for (int j = i; j < n; j++) {
					long l = -1;
					long r = x + 1;
					long cur = Long.MAX_VALUE;
					while (r - l > 1) {
						long m = l + (r - l) / 2;
						long ls = Math.min(m, tests[j].b);
						long us = m - ls;
						if (need <= ls * tests[j].l + us * tests[j].u) {
							r = m;
							cur = r;
						} else {
							l = m;
						}
					}
					if (cur != Long.MAX_VALUE) {
						best = Math.min(best, cur);
					}
				}
				ans += best;
				break;
			}
			out.println(ans);
		}

		class Test {
			long b;
			long l;
			long u;
			long profit;

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

