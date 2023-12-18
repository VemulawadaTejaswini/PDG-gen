import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.*;

public class Main {

	int[] next;
	int[] head;
	int[] to;

	boolean dfs(int v, int p, int goal, ArrayList<Integer> path) {
		path.add(v);
		if (v == goal) {
			return true;
		}

		for (int e = head[v]; e >= 0; e = next[e]) {
			int u = to[e];
			if (u != p && dfs(u, v, goal, path)) {
				return true;
			}
		}
		path.remove(path.size() - 1);
		return false;
	}

	int[] getPath(int v, int u) {
		ArrayList<Integer> path = new ArrayList<>();
		dfs(v, -1, u, path);
		int[] ret = new int[path.size()];
		for (int i = 0; i < ret.length; i++) {
			ret[i] = path.get(i);
		}
		return ret;
	}

	int[] par;

	void dfsPar(int v, int p) {
		par[v] = p;
		for (int e = head[v]; e >= 0; e = next[e]) {
			int u = to[e];
			if (u != p) {
				dfsPar(u, v);
			}
		}
	}

	void solve(int[] vs, int[] us, int[] ps, int[] qs) {
		int n = vs.length + 1;

		next = new int[2 * n - 2];
		head = new int[n];
		Arrays.fill(head, -1);
		to = new int[2 * n - 2];

		for (int i = 0; i < n - 1; i++) {
			int v = vs[i];
			int u = us[i];
			next[2 * i] = head[v];
			to[2 * i] = u;
			head[v] = 2 * i;

			next[2 * i + 1] = head[u];
			to[2 * i + 1] = v;
			head[u] = 2 * i + 1;
		}

		int m = ps.length;
		int[][] paths = new int[m][];

		for (int i = 0; i < m; i++) {
			paths[i] = getPath(ps[i], qs[i]);
		}

		par = new int[n];
		dfsPar(0, -1);

		ArrayList<Integer>[] here = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			here[i] = new ArrayList<>();
		}
		for (int pId = 0; pId < m; pId++) {
			int[] path = paths[pId];
			for (int i = 0; i < path.length - 1; i++) {
				// cnt[getEdge(path[i], path[i + 1])]++;
				int idx = getEdge(path[i], path[i + 1]);
				if (idx == path[i]) {
					here[idx].add(pId);
				} else {
					here[idx].add(~pId);
				}
			}
		}

		int ans1 = 0;
		for (ArrayList<Integer> lst : here) {
			ans1 += Math.min(lst.size(), 2);
		}

		out.println(ans1);

		color = new int[m];
		Arrays.fill(color, -1);

		for (ArrayList<Integer> lst : here) {
			if (lst.size() < 2) {
				continue;
			}

			boolean[] f = { false, false };

			for (int v : lst) {
				int idx = 0;
				if (v < 0) {
					v = ~v;
					idx ^= 1;
				}

				if (color[v] == -1) {
					continue;
				}

				if (color[v] == 1) {
					idx ^= 1;
				}

				f[idx] = true;
			}

			if (f[0] && f[1]) {
				continue;
			}

			if (!f[0] && !f[1]) {
				outer: for (int ii = 0; ii < lst.size(); ii++) {
					for (int jj = ii + 1; jj < lst.size(); jj++) {
						int one = lst.get(ii);
						int two = lst.get(jj);

						int diff = 1;
						if (one < 0) {
							one = ~one;
							diff ^= 1;
						}
						if (two < 0) {
							two = ~two;
							diff ^= 1;
						}

						if (color[one] != -1 && color[two] != -1) {
							if ((color[one] ^ color[two]) != diff) {
								continue;
							} else {
								break outer;
							}
						}

						if (color[one] == -1 && color[two] == -1) {
							color[one] = 0;
							color[two] = diff;
							break outer;
						}

						if (color[one] == -1) {
							color[one] = color[two] ^ diff;
							break outer;
						}

						if (color[two] == -1) {
							color[two] = color[one] ^ diff;
							break outer;
						}
					}
				}
			}

			if (!f[1]) {
				for (int ii = 0; ii < lst.size(); ii++) {
					int one = lst.get(ii);
					int diff = 0;
					if (one < 0) {
						one = ~one;
						diff ^= 1;
					}
					if (color[one] != -1) {
						continue;
					}
					color[one] = diff;
					break;
				}
			}

			if (!f[0]) {
				for (int ii = 0; ii < lst.size(); ii++) {
					int one = lst.get(ii);
					int diff = 1;
					if (one < 0) {
						one = ~one;
						diff ^= 1;
					}
					if (color[one] != -1) {
						continue;
					}
					color[one] = diff;
					break;
				}
			}

		}

		for (int i = 0; i < m; i++) {
			if (color[i] == 0) {
				out.println((ps[i] + 1) + " " + (qs[i] + 1));
			} else {
				out.println((qs[i] + 1) + " " + (ps[i] + 1));
			}
		}
	}

	int[] color;

	int getEdge(int v, int u) {
		return par[v] == u ? v : u;
	}

	boolean dfsFunny(int v, int p, boolean[][] g, int[][] cnt, int goal) {
		if (v == goal) {
			return true;
		}

		for (int u = 0; u < g.length; u++) {
			if (u == p || !g[v][u]) {
				continue;
			}
			if (dfsFunny(u, v, g, cnt, goal)) {
				cnt[v][u]++;
				cnt[u][v]++;
				return true;
			}
		}
		return false;
	}

	boolean dfsSlow(int v, int p, boolean[][] g, int[][] cnt, int goal) {
		if (v == goal) {
			return true;
		}

		for (int u = 0; u < g.length; u++) {
			if (u == p || !g[v][u]) {
				continue;
			}
			if (dfsSlow(u, v, g, cnt, goal)) {
				cnt[v][u]++;
				return true;
			}
		}
		return false;
	}

	int funny(int[] vs, int[] us, int[] ps, int[] qs) {
		int n = vs.length + 1;
		boolean[][] g = new boolean[n][n];
		for (int i = 0; i < n - 1; i++) {
			g[vs[i]][us[i]] = g[us[i]][vs[i]] = true;
		}

		int[][] cnt = new int[n][n];
		for (int i = 0; i < ps.length; i++) {
			dfsFunny(ps[i], -1, g, cnt, qs[i]);
		}

		int ret = 0;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				ret += Math.min(cnt[i][j], 2);
			}
		}

		return ret;
	}

	int slow(int[] vs, int[] us, int[] ps, int[] qs) {
		int n = vs.length + 1;
		boolean[][] g = new boolean[n][n];
		for (int i = 0; i < n - 1; i++) {
			g[vs[i]][us[i]] = g[us[i]][vs[i]] = true;
		}

		int ret = 0;

		int m = ps.length;
		for (int mask = 0; mask < (1 << m); mask++) {
			int[][] cnt = new int[n][n];
			for (int i = 0; i < ps.length; i++) {
				if (test(mask, i)) {
					dfsSlow(ps[i], -1, g, cnt, qs[i]);
				} else {
					dfsSlow(qs[i], -1, g, cnt, ps[i]);
				}
			}

			int cur = 0;

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					cur += Math.min(cnt[i][j], 1);
				}
			}

			ret = Math.max(ret, cur);
		}

		return ret;
	}

	static boolean test(int mask, int i) {
		return ((mask >> i) & 1) == 1;
	}

	void submit() {
		int n = nextInt();
		int m = nextInt();
		int[] vs = new int[n - 1];
		int[] us = new int[n - 1];
		for (int i = 0; i < n - 1; i++) {
			vs[i] = nextInt() - 1;
			us[i] = nextInt() - 1;
		}

		int[] ps = new int[m];
		int[] qs = new int[m];

		for (int i = 0; i < m; i++) {
			ps[i] = nextInt() - 1;
			qs[i] = nextInt() - 1;
		}

		solve(vs, us, ps, qs);
	}

	void oneTest() {
		int n = rand(2, C);
		int m = rand(1, C);

		int[] vs = new int[n - 1];
		int[] us = new int[n - 1];
		int[] ps = new int[m];
		int[] qs = new int[m];

		for (int i = 1; i < n; i++) {
			vs[i - 1] = i;
			us[i - 1] = rand(0, i - 1);
		}

		for (int i = 0; i < m; i++) {
			ps[i] = rand(0, n - 1);
			qs[i] = (ps[i] + rand(1, n - 1)) % n;
		}

		try {
			solve(vs, us, ps, qs);
		} catch (AssertionError e) {
			System.err.println(Arrays.toString(vs));
			System.err.println(Arrays.toString(us));
			System.err.println(Arrays.toString(ps));
			System.err.println(Arrays.toString(qs));
			throw e;
		}
		// int fun = funny(vs, us, ps, qs);
		// int slow = slow(vs, us, ps, qs);
		// if (fun != slow) {
		// System.err.println(Arrays.toString(vs));
		// System.err.println(Arrays.toString(us));
		// System.err.println(Arrays.toString(ps));
		// System.err.println(Arrays.toString(qs));
		// System.err.println(fun);
		// System.err.println(slow);
		// throw new AssertionError();
		// }
	}

	void stress() {
		for (int tst = 0;; tst++) {
			oneTest();
			System.err.println(tst);
		}
	}

	void test() {
		int[] vs = { 1, 2, 3, 4 };
		int[] us = { 0, 1, 1, 1 };
		int[] ps = { 4, 0 };
		int[] qs = { 3, 2 };
		System.err.println(slow(vs, us, ps, qs));
	}

	Main() throws IOException {
		is = System.in;
		out = new PrintWriter(System.out);
		submit();
		// stress();
		// test();
		out.close();
	}

	static final Random rng = new Random();
	static final int C = 5;

	static int rand(int l, int r) {
		return l + rng.nextInt(r - l + 1);
	}

	public static void main(String[] args) throws IOException {
		new Main();
	}

	private InputStream is;
	PrintWriter out;

	private byte[] buf = new byte[1 << 14];
	private int bufSz = 0, bufPtr = 0;

	private int readByte() {
		if (bufSz == -1)
			throw new RuntimeException("Reading past EOF");
		if (bufPtr >= bufSz) {
			bufPtr = 0;
			try {
				bufSz = is.read(buf);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
			if (bufSz <= 0)
				return -1;
		}
		return buf[bufPtr++];
	}

	private boolean isTrash(int c) {
		return c < 33 || c > 126;
	}

	private int skip() {
		int b;
		while ((b = readByte()) != -1 && isTrash(b))
			;
		return b;
	}

	String nextToken() {
		int b = skip();
		StringBuilder sb = new StringBuilder();
		while (!isTrash(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	String nextString() {
		int b = readByte();
		StringBuilder sb = new StringBuilder();
		while (!isTrash(b) || b == ' ') {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	double nextDouble() {
		return Double.parseDouble(nextToken());
	}

	char nextChar() {
		return (char) skip();
	}

	int nextInt() {
		int ret = 0;
		int b = skip();
		if (b != '-' && (b < '0' || b > '9')) {
			throw new InputMismatchException();
		}
		boolean neg = false;
		if (b == '-') {
			neg = true;
			b = readByte();
		}
		while (true) {
			if (b >= '0' && b <= '9') {
				ret = ret * 10 + (b - '0');
			} else {
				if (b != -1 && !isTrash(b)) {
					throw new InputMismatchException();
				}
				return neg ? -ret : ret;
			}
			b = readByte();
		}
	}

	long nextLong() {
		long ret = 0;
		int b = skip();
		if (b != '-' && (b < '0' || b > '9')) {
			throw new InputMismatchException();
		}
		boolean neg = false;
		if (b == '-') {
			neg = true;
			b = readByte();
		}
		while (true) {
			if (b >= '0' && b <= '9') {
				ret = ret * 10 + (b - '0');
			} else {
				if (b != -1 && !isTrash(b)) {
					throw new InputMismatchException();
				}
				return neg ? -ret : ret;
			}
			b = readByte();
		}
	}
}
