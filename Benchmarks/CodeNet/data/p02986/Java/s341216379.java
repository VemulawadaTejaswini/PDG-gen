import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {

	static PrintWriter out;
	static InputReader ir;
	static long[] f, fi;

	static void solve() {
		int n = ir.nextInt();
		int q = ir.nextInt();
		Graph[] g = new Graph[n];
		Graph[] col = new Graph[n];
		for (int i = 0; i < n; i++) {
			g[i] = new Graph();
			col[i] = new Graph();
		}
		for (int i = 0; i < n - 1; i++) {
			int u = ir.nextInt() - 1;
			int v = ir.nextInt() - 1;
			int c = ir.nextInt();
			int d = ir.nextInt();
			g[u].add(new int[] { v, c, d });
			g[v].add(new int[] { u, c, d });
		}
		int[] x = new int[q];
		int[] y = new int[q];
		int[] u = new int[q];
		int[] v = new int[q];
		int[] lca = new int[q];
		int[] pars = new int[n];
		int[] dep = new int[n];
		Arrays.fill(pars, -1);
		_dfs(0, -1, g, pars, dep);
		lca_init(n, pars);
		for (int i = 0; i < q; i++) {
			x[i] = ir.nextInt();
			y[i] = ir.nextInt();
			u[i] = ir.nextInt() - 1;
			v[i] = ir.nextInt() - 1;
			lca[i] = lca(u[i], v[i], dep);
			tr(lca[i]);
			col[u[i]].add(new int[] { x[i] });
			col[v[i]].add(new int[] { x[i] });
			col[lca[i]].add(new int[] { x[i] });
		}
		int[] ct = new int[n];
		int[] dist = new int[n];
		long[] dd = new long[n];
		HashMap<Long, Integer> mp = new HashMap<>();
		HashMap<Long, Integer> mp2 = new HashMap<>();
		dfs(0, -1, g, col, ct, dist, dd, mp, mp2);
		for (int i = 0; i < q; i++) {
			long res = dd[u[i]] + dd[v[i]] - 2 * dd[lca[i]];
			res -= mp2.get((long) u[i] << 30L | x[i]);
			res -= mp2.get((long) v[i] << 30L | x[i]);
			res += 2 * (long) mp2.get((long) lca[i] << 30L | x[i]);
			res += (long) mp.get((long) u[i] << 30L | x[i]) * y[i];
			res += (long) mp.get((long) v[i] << 30L | x[i]) * y[i];
			res -= 2L * (long) mp.get((long) lca[i] << 30L | x[i]) * y[i];
			out.println(res);
		}
	}

	static void _dfs(int cur, int par, Graph[] g, int[] pars, int[] dep) {
		pars[cur] = par;
		for (int[] to : g[cur]) {
			if (to[0] == par)
				continue;
			dep[to[0]] = dep[cur] + 1;
			_dfs(to[0], cur, g, pars, dep);
		}
	}

	static void dfs(int cur, int par, Graph[] g, Graph[] col, int[] ct, int[] dist, long[] dd,
			HashMap<Long, Integer> mp, HashMap<Long, Integer> mp2) {
		int n = g.length;
		for (int[] cc : col[cur]) {
			int c = cc[0];
			mp.put((long) cur << 30L | (long) c, ct[c]);
			mp2.put((long) cur << 30L | (long) c, dist[c]);
		}
		for (int[] to : g[cur]) {
			if (to[0] == par)
				continue;
			ct[to[1]]++;
			dist[to[1]] += to[2];
			dd[to[0]] = dd[cur] + to[2];
			dfs(to[0], cur, g, col, ct, dist, dd, mp, mp2);
			ct[to[1]]--;
			dist[to[1]] -= to[2];
		}
	}

	static int MAX_V = (int) 1e5 + 1, MAX_LOG_V = 17;
	static int[][] lca_par = new int[MAX_LOG_V][MAX_V];

	public static void lca_init(int v, int[] par) {
		for (int i = 0; i < v; i++) {
			lca_par[0][i] = par[i];
		}
		for (int i = 0; i < MAX_LOG_V - 1; i++) {
			for (int j = 0; j < v; j++) {
				if (lca_par[i][j] < 0)
					lca_par[i + 1][j] = -1;
				else
					lca_par[i + 1][j] = lca_par[i][lca_par[i][j]];
			}
		}
	}

	public static int lca(int u, int v, int[] depth) {
		if (depth[u] > depth[v]) {
			int temp = u;
			u = v;
			v = temp;
		}
		for (int i = 0; i < MAX_LOG_V; i++) {
			if (((depth[v] - depth[u]) >> i & 1) != 0) {
				v = lca_par[i][v];
			}
		}
		if (u == v)
			return u;
		for (int i = MAX_LOG_V - 1; i >= 0; i--) {
			if (lca_par[i][v] != lca_par[i][u]) {
				v = lca_par[i][v];
				u = lca_par[i][u];
			}
		}
		return lca_par[0][u];
	}

	static class Graph extends ArrayList<int[]> {
	}

	public static void main(String[] args) {
		ir = new InputReader(System.in);
		out = new PrintWriter(System.out);
		solve();
		out.flush();
	}

	static class InputReader {

		private InputStream in;
		private byte[] buffer = new byte[1024];
		private int curbuf;
		private int lenbuf;

		public InputReader(InputStream in) {
			this.in = in;
			this.curbuf = this.lenbuf = 0;
		}

		public boolean hasNextByte() {
			if (curbuf >= lenbuf) {
				curbuf = 0;
				try {
					lenbuf = in.read(buffer);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (lenbuf <= 0)
					return false;
			}
			return true;
		}

		private int readByte() {
			if (hasNextByte())
				return buffer[curbuf++];
			else
				return -1;
		}

		private boolean isSpaceChar(int c) {
			return !(c >= 33 && c <= 126);
		}

		private void skip() {
			while (hasNextByte() && isSpaceChar(buffer[curbuf]))
				curbuf++;
		}

		public boolean hasNext() {
			skip();
			return hasNextByte();
		}

		public String next() {
			if (!hasNext())
				throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (!isSpaceChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		public int nextInt() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			int res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}

		public long nextLong() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			long res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

		public int[] nextIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		public long[] nextLongArray(int n) {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}

		public char[][] nextCharMap(int n, int m) {
			char[][] map = new char[n][m];
			for (int i = 0; i < n; i++)
				map[i] = next().toCharArray();
			return map;
		}
	}

	static void tr(Object... o) {
		out.println(Arrays.deepToString(o));
	}
}
