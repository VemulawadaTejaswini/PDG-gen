import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Set;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
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
		ProblemC solver = new ProblemC();
		solver.solve(1, in, out);
		out.close();
	}

	static class ProblemC {
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int x1 = in.nextInt();
			int y1 = in.nextInt();
			int x2 = in.nextInt();
			int y2 = in.nextInt();
			int n = in.nextInt();
			int[] x = new int[n];
			int[] y = new int[n];
			for (int i = 0; i < n; i++) {
				x[i] = in.nextInt();
				y[i] = in.nextInt();
			}
			if (x1 > x2) {
				x1 = -x1;
				x2 = -x2;
				for (int i = 0; i < n; i++) {
					x[i] = -x[i];
				}
			}
			if (y1 > y2) {
				y1 = -y1;
				y2 = -y2;
				for (int i = 0; i < n; i++) {
					y[i] = -y[i];
				}
			}

			double ans = 100.0 * (x2 - x1 + y2 - y1);
			if (x1 == x2) {
				for (int i = 0; i < n; i++) {
					if (x[i] == x1 && y[i] >= y1 && y[i] <= y2) {
						ans -= 20;
						ans += Math.PI * 10;
					}
				}
			} else if (y1 == y2) {
				for (int i = 0; i < n; i++) {
					if (y[i] == y1 && x[i] >= x1 && x[i] <= x2) {
						ans -= 20;
						ans += Math.PI * 10;
					}
				}
			} else {
				List<Point> ps = new ArrayList<>();
				for (int i = 0; i < n; i++) {
					if (x[i] >= x1 && x[i] <= x2 && y[i] >= y1 && y[i] <= y2) {
						ps.add(new Point(x[i], y[i]));
					}
				}
				Collections.sort(ps);
				Set<Integer> xs = new HashSet<>();
				for (Point p : ps) {
					xs.add(p.x);
				}
				int[] interestingX = new int[xs.size()];
				int ptr = 0;
				for (int cx : xs) {
					interestingX[ptr++] = cx;
				}
				Arrays.sort(interestingX);
				IntervalTree tree = new IntervalTree(xs.size());
				for (Point p : ps) {
					int id = Arrays.binarySearch(interestingX, p.x);
					int cur = 1 + tree.getMax(0, id);
					tree.set(id, cur);
				}
				long c = tree.getMax(0, ps.size() - 1);
				if (c == Math.min(x2 - x1, y2 - y1) + 1) {
					--c;
					ans -= 20;
					ans += Math.PI * 10;
				}
				ans -= c * 20;
				ans += c * Math.PI * 5;
			}
			out.printf("%.15f\n", ans);
		}

		class Point implements Comparable<Point> {
			int x;
			int y;

			Point(int x, int y) {
				this.x = x;
				this.y = y;
			}

			public int compareTo(Point o) {
				if (y != o.y) {
					return y < o.y ? -1 : 1;
				}
				if (x != o.x) {
					return x < o.x ? -1 : 1;
				}
				return 0;
			}

		}

		class IntervalTree {
			int[] max;
			int n;

			IntervalTree(int n) {
				this.n = n;
				max = new int[4 * n];
			}

			void set(int pos, int val) {
				set(0, pos, 0, n - 1, val);
			}

			int getMax(int l, int r) {
				return get(0, l, r, 0, n - 1);
			}

			private void set(int root, int pos, int L, int R, int val) {
				if (pos < L || pos > R) {
					return;
				}
				if (L == R) {
					max[root] = val;
					return;
				}
				int M = (L + R) / 2;
				set(2 * root + 1, pos, L, M, val);
				set(2 * root + 2, pos, M + 1, R, val);
				max[root] = Math.max(max[2 * root + 1], max[2 * root + 2]);
			}

			private int get(int root, int l, int r, int L, int R) {
				if (l > r || l > R || L > r || L > R) {
					return 0;
				}
				if (l == L && r == R) {
					return max[root];
				}
				int M = (L + R) / 2;
				int res = 0;
				res = Math.max(res, get(2 * root + 1, l, Math.min(r, M), L, M));
				res = Math.max(res, get(2 * root + 2, Math.max(l, M + 1), r, M + 1, R));
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

