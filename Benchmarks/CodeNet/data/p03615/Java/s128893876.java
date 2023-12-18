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
			final int MOD = 998244353;
			int n = in.nextInt();
			Point[] p = new Point[n];
			for (int i = 0; i < n; i++) {
				int x = in.nextInt();
				int y = in.nextInt();
				p[i] = new Point(x, y, i);
			}
			int[] p2 = new int[n + 1];
			p2[0] = 1;
			for (int i = 1; i < p2.length; i++) {
				p2[i] = 2 * p2[i - 1] % MOD;
			}

			Arrays.sort(p, (u, v) -> {
				if (u.x != v.x) {
					return u.x - v.x;
				}
				if (u.y != v.y) {
					return u.y - v.y;
				}
				return 0;
			});
			int ans = 0;
			for (int s = 0; s < n; s++) {
				Point[] r = new Point[n - s - 1];
				System.arraycopy(p, s + 1, r, 0, r.length);
				final Point o = p[s];
				Arrays.sort(r, (u, v) -> {
					Point u1 = u.sub(o);
					Point v1 = v.sub(o);
					return -Long.signum(cross(u1, v1));
				});

				// Number of points inside or on the borders of the triangle ij.
				int[][] u = new int[r.length][r.length];
				for (int i = 0; i < r.length; i++) {
					Point si = r[i].sub(o);
					for (int j = i + 1; j < r.length; j++) {
						Point sj = r[j].sub(o);
						Point ij = r[j].sub(r[i]);
						for (int k = 0; k < r.length; k++) {
							if (k == i || k == j) {
								continue;
							}
							Point sk = r[k].sub(o);
							if (cross(sk, sj) < 0) {
								continue;
							}
							if (cross(sk, si) > 0) {
								continue;
							}
							if (cross(r[k].sub(r[i]), ij) >= 0) {
								continue;
							}
							++u[i][j];
						}
					}
				}

				int[][] d = new int[r.length][r.length];
				for (int i = 0; i < r.length; i++) {
					for (int j = i + 1; j < r.length; j++) {
						if (cross(r[i].sub(o), r[j].sub(o)) <= 0) {
							continue;
						}
						d[i][j] += p2[u[i][j]];
						if (d[i][j] >= MOD) {
							d[i][j] -= MOD;
						}
						ans += d[i][j];
						if (ans >= MOD) {
							ans -= MOD;
						}
						for (int k = j + 1; k < r.length; k++) {
							if (cross(r[k].sub(r[j]), r[k].sub(r[i])) >= 0) {
								continue;
							}
							d[j][k] = (int) ((d[j][k] + (long) d[i][j] * p2[u[j][k]]) % MOD);
						}
					}
				}
			}
			out.println(ans);
		}

		private long cross(Point p1, Point p2) {
			return p1.x * (long) p2.y - p1.y * (long) p2.x;
		}

		class Point {
			int x;
			int y;
			int id;

			Point(int x, int y, int id) {
				this.x = x;
				this.y = y;
				this.id = id;
			}

			Point sub(Point o) {
				return new Point(x - o.x, y - o.y, -1);
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

