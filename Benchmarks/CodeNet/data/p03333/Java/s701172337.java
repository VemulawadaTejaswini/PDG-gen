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
		ProblemC solver = new ProblemC();
		solver.solve(1, in, out);
		out.close();
	}

	static class ProblemC {
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int n = in.nextInt();
			Segment[] s = new Segment[n];
			for (int i = 0; i < n; i++) {
				s[i] = new Segment();
				s[i].l = in.nextInt();
				s[i].r = in.nextInt();
				s[i].id = i;
			}
			Segment[] byL = s.clone();
			Segment[] byR = s.clone();
			Arrays.sort(byL, (u, v) -> (u.l - v.l));
			Arrays.sort(byR, (u, v) -> (u.r - v.r));
			int x = 0;
			long ans = 0;
			for (int step = 0; step < 2; step++) {
				boolean[] used = new boolean[n];
				long sum = 0;
				int pl = n - 1;
				int pr = 0;
				for (int i = 0; i < n; i++) {
					Segment cur;
					if (i % 2 == step) {
						while (used[byL[pl].id]) {
							--pl;
						}
						cur = byL[pl];
					} else {
						while (used[byR[pr].id]) {
							++pr;
						}
						cur = byR[pr];
					}
					used[cur.id] = true;
					if (x < cur.l) {
						sum += cur.l - x;
						x = cur.l;
					} else if (x > cur.r) {
						sum += x - cur.r;
						x = cur.r;
					}
				}
				sum += Math.abs(x);
				ans = Math.max(ans, sum);
			}
			out.println(ans);
		}

		class Segment {
			int l;
			int r;
			int id;

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

