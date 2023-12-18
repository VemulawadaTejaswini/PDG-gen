import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Map;
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
		ProblemD solver = new ProblemD();
		solver.solve(1, in, out);
		out.close();
	}

	static class ProblemD {
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int height = in.nextInt();
			int width = in.nextInt();
			int n = in.nextInt();
			int[] rs = new int[n];
			int[] cs = new int[n];
			long[] as = new long[n];
			Map<Long, Long> map = new HashMap<>();
			for (int i = 0; i < n; i++) {
				rs[i] = in.nextInt();
				cs[i] = in.nextInt();
				as[i] = in.nextInt();
				map.put(f(rs[i], cs[i]), as[i]);
			}
			long[] hor = new long[height];
			long[] ver = new long[width];
			boolean[] gotHor = new boolean[height + 1];
			boolean[] gotVer = new boolean[width + 1];
			int[] dr = {-1, 0, 1, 0};
			int[] dc = {0, -1, 0, 1};
			for (int i = 0; i < n; i++) {
				int r1 = rs[i];
				int c1 = cs[i];
				for (int dir = 0; dir < 4; dir++) {
					int r2 = rs[i] + dr[dir];
					int c2 = cs[i] + dc[dir];
					if (!map.containsKey(f(r2, c2))) {
						continue;
					}
					int rm = Math.min(r1, r2);
					int rM = Math.max(r1, r2);
					int cm = Math.min(c1, c2);
					int cM = Math.max(c1, c2);
					long v = map.get(f(rM, cM)) - map.get(f(rm, cm));
					if (dr[dir] == 0) {
						int id = cm;
						if (gotVer[id] && ver[id] != v) {
							out.println("No");
							return;
						}
						gotVer[id] = true;
						ver[id] = v;
					} else {
						int id = rm;
						if (gotHor[id] && hor[id] != v) {
							out.println("No");
							return;
						}
						gotHor[id] = true;
						hor[id] = v;
					}
				}
			}
			if (!check(rs, as, gotHor, hor)) {
				out.println("No");
				return;
			}
			if (!check(cs, as, gotVer, ver)) {
				out.println("No");
				return;
			}
			out.println("Yes");
		}

		private boolean check(int[] xs, long[] as, boolean[] got, long[] v) {
			long[] minL = new long[v.length];
			long[] minR = new long[v.length];
			for (int i = 0; i < v.length; i++) {
				if (!got[i]) {
					minL[i] = Long.MAX_VALUE / 2;
					continue;
				}
				minL[i] = -v[i];
				if (i > 0) {
					minL[i] = Math.min(minL[i], minL[i - 1] - v[i]);
				}
			}
			for (int i = v.length - 1; i >= 0; i--) {
				if (!got[i]) {
					minR[i] = Long.MAX_VALUE / 2;
					continue;
				}
				minR[i] = v[i];
				if (i + 1 < v.length) {
					minR[i] = Math.min(minR[i], minR[i + 1] + v[i]);
				}
			}
			for (int i = 0; i < xs.length; i++) {
				int x = xs[i];
				if (got[x] && as[i] + minR[x] < 0) {
					return false;
				}
				if (x > 0 && got[x - 1] && as[i] + minL[x - 1] < 0) {
					return false;
				}
			}
			return true;
		}

		private long f(int r, int c) {
			return r * (long) (1e6) + c;
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

