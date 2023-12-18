import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();

		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		int[] c = new int[n];
		int[] d = new int[n];
		for (int i = 0; i < n; i++) {
			c[i] = sc.nextInt();
			d[i] = sc.nextInt();
		}

		Dinic di = new Dinic(2 * n + 2);
		int s = 2 * n;
		int e = 2 * n + 1;
		for (int i = 0; i < n; i++) {
			di.addEdge(s, i, 1);
			di.addEdge(n + i, e, 1);
			for (int j = 0; j < n; j++) {
				if (a[i] < c[j] && b[i] < d[j]) {
					di.addEdge(i, n + j, 1);
				}
			}
		}

		pr.println(di.getMaxflow(s, e));
	}

	private static class Dinic {
		private static final int INF = Integer.MAX_VALUE;
		ArrayList<Edge>[] edges;
		int n;

		@SuppressWarnings("unchecked")
		Dinic(int n) {
			this.n = n;
			edges = new ArrayList[n];
			for (int ii = 0; ii < n; ii++) {
				edges[ii] = new ArrayList<Edge>();
			}
			checkedTo = new int[this.n];
			level = new int[this.n];
		}

		// i, j:0-indexed
		public void addEdge(int i, int j, int c) {
			edges[i].add(new Edge(j, c, edges[j].size(), false));
			// add reverse edge
			edges[j].add(new Edge(i, c, edges[i].size() - 1, true));
		}

		public int getMaxflow(int s, int t) {
			// initialize flow
			for (int i = 0; i < edges.length; i++) {
				for (Edge e : edges[i]) {
					if (!e.revFlag) {
						e.f = 0;
					} else {
						e.f = e.w;
					}
				}
			}

			int ret = 0;
			while (true) {
				Arrays.fill(level, -1);
				bfs(s);
				if (level[t] == -1) {
					break;
				}

				Arrays.fill(checkedTo, 0);
				int augmentation;
				while ((augmentation = dfs(s, t, INF)) > 0) {
					ret += augmentation;
				}
			}

			return ret;
		}

		private static int[] checkedTo;
		private static int[] level;

		// no capacity edges must be removed
		private void bfs(int s) {
			Queue<Integer> q = new ArrayDeque<Integer>();
			level[s] = 0;
			q.add(s);
			while (!q.isEmpty()) {
				int u = q.remove();
				for (Edge e : edges[u]) {
					if (level[e.v] == -1 && e.w - e.f > 0) {
						level[e.v] = level[u] + 1;
						q.add(e.v);
					}
				}
			}
		}

		// find max flow (less than f), on u -> v path
		// next vertex must has larger level
		private int dfs(int u, int v, int f) {
			if (u == v) {
				return f;
			}

			for (; checkedTo[u] < edges[u].size(); checkedTo[u]++) {
				Edge e = edges[u].get(checkedTo[u]);
				if (level[e.v] > level[u] && e.w - e.f > 0) {
					int a = dfs(e.v, v, Math.min(f, e.w - e.f));
					if (a != 0) {
						e.f += a;
						edges[e.v].get(e.revIndex).f -= a;

						return a;
					}
				}
			}

			return 0;
		}

		private static class Edge {
//			int u; // from
			int v; // to
			int w; // cost
			int f; // flow
			int revIndex; // index of reverse edge
			boolean revFlag; // flag of reverse edge

			Edge(int v, int w, int re, boolean f) {
//				this.u = u;
				this.v = v;
				this.w = w;
				this.f = 0;
				this.revIndex = re;
				this.revFlag = f;
			}
		}
	}

	// ---------------------------------------------------
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		pr = new Printer(System.out);

		solve();

		pr.close();
		sc.close();
	}

	@SuppressWarnings("unused")
	private static class Scanner {
		BufferedReader br;

		Scanner (InputStream in) {
			br = new BufferedReader(new InputStreamReader(in));
		}

		private boolean isPrintable(int ch) {
			return ch >= '!' && ch <= '~';
		}

		private boolean isCRLF(int ch) {
			return ch == '\n' || ch == '\r' || ch == -1;
		}

		private int nextPrintable() {
			try {
				int ch;
				while (!isPrintable(ch = br.read())) {
					if (ch == -1) {
						throw new NoSuchElementException();
					}
				}

				return ch;
			} catch (IOException e) {
				throw new NoSuchElementException();
			}
		}

		String next() {
			try {
				int ch = nextPrintable();
				StringBuilder sb = new StringBuilder();
				do {
					sb.appendCodePoint(ch);
				} while (isPrintable(ch = br.read()));

				return sb.toString();
			} catch (IOException e) {
				throw new NoSuchElementException();
			}
		}

		int nextInt() {
			try {
				// parseInt from Integer.parseInt()
				boolean negative = false;
				int res = 0;
				int limit = -Integer.MAX_VALUE;
				int radix = 10;

				int fc = nextPrintable();
				if (fc < '0') {
					if (fc == '-') {
						negative = true;
						limit = Integer.MIN_VALUE;
					} else if (fc != '+') {
						throw new NumberFormatException();
					}
					fc = br.read();
				}
				int multmin = limit / radix;

				int ch = fc;
				do {
					int digit = ch - '0';
					if (digit < 0 || digit >= radix) {
						throw new NumberFormatException();
					}
					if (res < multmin) {
						throw new NumberFormatException();
					}
					res *= radix;
					if (res < limit + digit) {
						throw new NumberFormatException();
					}
					res -= digit;

				} while (isPrintable(ch = br.read()));

				return negative ? res : -res;
			} catch (IOException e) {
				throw new NoSuchElementException();
			}
		}

		long nextLong() {
			try {
				// parseLong from Long.parseLong()
				boolean negative = false;
				long res = 0;
				long limit = -Long.MAX_VALUE;
				int radix = 10;

				int fc = nextPrintable();
				if (fc < '0') {
					if (fc == '-') {
						negative = true;
						limit = Long.MIN_VALUE;
					} else if (fc != '+') {
						throw new NumberFormatException();
					}
					fc = br.read();
				}
				long multmin = limit / radix;

				int ch = fc;
				do {
					int digit = ch - '0';
					if (digit < 0 || digit >= radix) {
						throw new NumberFormatException();
					}
					if (res < multmin) {
						throw new NumberFormatException();
					}
					res *= radix;
					if (res < limit + digit) {
						throw new NumberFormatException();
					}
					res -= digit;

				} while (isPrintable(ch = br.read()));

				return negative ? res : -res;
			} catch (IOException e) {
				throw new NoSuchElementException();
			}
		}

		float nextFloat() {
			return Float.parseFloat(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			try {
				int ch;
				while (isCRLF(ch = br.read())) {
					if (ch == -1) {
						throw new NoSuchElementException();
					}
				}
				StringBuilder sb = new StringBuilder();
				do {
					sb.appendCodePoint(ch);
				} while (!isCRLF(ch = br.read()));

				return sb.toString();
			} catch (IOException e) {
				throw new NoSuchElementException();
			}
		}

		void close() {
			try {
				br.close();
			} catch (IOException e) {
//				throw new NoSuchElementException();
			}
		}
	}

	private static class Printer extends PrintWriter {
		Printer(PrintStream out) {
			super(out);
		}
	}
}
