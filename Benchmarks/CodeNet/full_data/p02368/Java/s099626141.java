import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String[] args) {
		// long t = System.currentTimeMillis();
		new Main().run();
		// System.err.println(System.currentTimeMillis() - t);
	}

	int[] col;
	int color;
	int[] ord;
	int order;
	int[] low;
	ArrayDeque<Integer> pnd;

	void scc(ArrayList<Integer>[] g) {
		int n = g.length;
		color = 0;
		order = 0;
		col = new int[n];
		ord = new int[n];
		low = new int[n];
		Arrays.fill(col, -1);
		Arrays.fill(ord, -1);
		pnd = new ArrayDeque<>();
		for (int i = 0; i < n; ++i) {
			if (col[i] != -1) {
				continue;
			}
			scc_dfs(g, i, -1);
		}
	}

	void scc_dfs(ArrayList<Integer>[] g, int cur, int par) {
		ord[cur] = order;
		low[cur] = ord[cur];
		++order;
		pnd.addLast(cur);
		for (int dst : g[cur]) {
			if (ord[dst] == -1) {
				scc_dfs(g, dst, cur);
			}
			low[cur] = Math.min(low[cur], low[dst]);
		}
		if (ord[cur] == low[cur]) {
			int v = -1;
			while (v != cur) {
				v = pnd.pollLast();
				col[v] = color;
			}
			++color;
		}
	}

	void solve(int n, int m, int k, char[] c, int[] a, int[] b) {
		ArrayList<Integer>[] g = new ArrayList[n];
		for (int i = 0; i < n; ++i)
			g[i] = new ArrayList<>();
		for (int i = 0; i < m; ++i) {
			g[a[i]].add(b[i]);
		}

	}

	void run() {
		Scanner sc = new Scanner();
		// int n = sc.nextInt();
		// int m = sc.nextInt();
		// int k = sc.nextInt();
		// char[] c = new char[n];
		// for (int i = 0; i < n; ++i) {
		// c[i] = sc.next().toCharArray()[0];
		// }
		// int[] a = new int[m];
		// int[] b = new int[m];
		// for (int i = 0; i < m; ++i) {
		// a[i] = sc.nextInt();
		// b[i] = sc.nextInt();
		// --a[i];
		// --b[i];
		// }

		// solve(n, m, k, c, a, b);
		int V = sc.nextInt();
		int E = sc.nextInt();
		@SuppressWarnings("unchecked")
		ArrayList<Integer>[] g = new ArrayList[V];
		for (int i = 0; i < V; ++i) {
			g[i] = new ArrayList<>();
		}
		for (int i = 0; i < E; ++i) {
			int s = sc.nextInt();
			int t = sc.nextInt();
			g[s].add(t);
			g[t].add(s);
		}
		scc(g);
		int Q = sc.nextInt();
		while (Q-- > 0) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			System.out.println(col[u] == col[v] ? 1 : 0);
		}
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

	class Scanner {
		private final InputStream in = System.in;
		private final byte[] buffer = new byte[1024];
		private int ptr = 0;
		private int buflen = 0;

		private boolean hasNextByte() {
			if (ptr < buflen) {
				return true;
			} else {
				ptr = 0;
				try {
					buflen = in.read(buffer);
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (buflen <= 0) {
					return false;
				}
			}
			return true;
		}

		private int readByte() {
			if (hasNextByte())
				return buffer[ptr++];
			else
				return -1;
		}

		private boolean isPrintableChar(int c) {
			return 33 <= c && c <= 126;
		}

		private void skipUnprintable() {
			while (hasNextByte() && !isPrintableChar(buffer[ptr]))
				ptr++;
		}

		public boolean hasNext() {
			skipUnprintable();
			return hasNextByte();
		}

		public String next() {
			if (!hasNext())
				throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (isPrintableChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		public int nextInt() {
			if (!hasNext())
				throw new NoSuchElementException();
			int n = 0;
			boolean minus = false;
			int b = readByte();
			if (b == '-') {
				minus = true;
				b = readByte();
			}
			if (b < '0' || '9' < b) {
				throw new NumberFormatException();
			}
			while (true) {
				if ('0' <= b && b <= '9') {
					n *= 10;
					n += b - '0';
				} else if (b == -1 || !isPrintableChar(b)) {
					return minus ? -n : n;
				} else {
					throw new NumberFormatException();
				}
				b = readByte();
			}
		}

		public long nextLong() {
			if (!hasNext())
				throw new NoSuchElementException();
			long n = 0;
			boolean minus = false;
			int b = readByte();
			if (b == '-') {
				minus = true;
				b = readByte();
			}
			if (b < '0' || '9' < b) {
				throw new NumberFormatException();
			}
			while (true) {
				if ('0' <= b && b <= '9') {
					n *= 10;
					n += b - '0';
				} else if (b == -1 || !isPrintableChar(b)) {
					return minus ? -n : n;
				} else {
					throw new NumberFormatException();
				}
				b = readByte();
			}
		}
	}
}