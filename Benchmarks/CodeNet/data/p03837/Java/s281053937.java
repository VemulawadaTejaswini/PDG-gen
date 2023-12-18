import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] a = new int[m];
		int[] b = new int[m];
		int[] c = new int[m];
		Dijkstra di = new Dijkstra(n);
		for (int i = 0; i < m; i++) {
			a[i] = sc.nextInt() - 1;
			b[i] = sc.nextInt() - 1;
			c[i] = sc.nextInt();

			di.addEdge(a[i], b[i], c[i]);
			di.addEdge(b[i], a[i], c[i]);
		}

		int ans = 0;
		for (int i = 0; i < m; i++) {
			di.removeEdge(a[i], b[i], c[i]);
			di.removeEdge(b[i], a[i], c[i]);
			di.s = -1;
			if (di.getShortestPath(a[i], b[i]) <= c[i]) {
				ans++;
			}
			di.addEdge(a[i], b[i], c[i]);
			di.addEdge(b[i], a[i], c[i]);
		}

		pr.println(ans);
	}
	
	/**
	 * Dijkstra法による重み付き有向グラフ上の単一始点最短路問題を解く
	 * 重みは非負でなければならない
	 * O(E logV)
	 */
	static class Dijkstra {
		long[] d;
		List<List<Edge>> edges;
		private PriorityQueue<Vertex> pq;
		private int n;
		private int s;

		final long INF = Long.MAX_VALUE;

		/**
		 * n個の頂点を持つグラフに関するインスタンスを返す
		 * 
		 * @param n グラフの頂点数
		 */
		Dijkstra(int n) {
			this.n = n;

			edges = new ArrayList<>(n);
			for (int ii = 0; ii < n; ii++) {
				edges.add(new ArrayList<Edge>());
			}

			s = - 1;
		}

		/**
		 * グラフに有向辺(頂点 i から頂点 j へ)を追加する
		 * 無向グラフの場合は、逆向きも追加すること
		 * 
		 * @param i 有向辺の始点(from){@literal (0<=i<n)}
		 * @param j 有向辺の終点(to){@literal (0<=i<n)}
		 * @param c 有向辺の重み({@literal c>=0}でなければならない)
		 */
		public void addEdge(int i, int j, int c) {
			edges.get(i).add(new Edge(i, j, c));
		}

		public void removeEdge(int i, int j, int c) {
			edges.get(i).remove(new Edge(i, j, c));
		}

		/**
		 * 始点 i から終点 j までの最短路重みを返す
		 * 始点が同じ場合は前回の最短路結果を使い回す
		 * i を以前の呼び出しから変更した場合、最短路を計算しなおす(有向辺の情報はそのままで)
		 * 
		 * @param i 最短路を求める始点{@literal (0<=i<n)}
		 * @param j 最短路を求める終点{@literal (0<=j<n)}
		 * @return 最短路重み。始点から終点に到達できない場合、INF
		 */
		public long getShortestPath(int i, int j) {
			if (s != i) {
				d = new long[n];
				Arrays.fill(d, INF);
				d[i] = 0;
				pq = new PriorityQueue<Vertex>();
				pq.add(new Vertex(i, d[i]));

				while (!pq.isEmpty()) {
					Vertex u = pq.poll();
					if (d[u.me] < u.d) {
						continue;  // skip old vertex
					}

					List<Edge> uu = edges.get(u.me);
					for (int ii = 0, size = uu.size(); ii < size; ii++) {
						Edge v = uu.get(ii);
						if (d[u.me] != INF && d[v.v] > d[u.me] + v.w) {
							d[v.v] = d[u.me] + v.w;
							pq.add(new Vertex(v.v, d[v.v]));
						}
					}
				}

				s = i;
			}

			return d[j];
		}

		private static class Edge {
//			int u; // from
			int v; // to
			int w; // cost

			Edge(int u, int v, int w) {
//				this.u = u;
				this.v = v;
				this.w = w;
			}
			
			@Override
			public boolean equals(Object obj) {
				Edge o = (Edge)obj;
				return v == o.v && w == o.w;
			}
		}

		private static class Vertex implements Comparable<Vertex> {
			int me; // me
			long d; // cost

			Vertex(int u, long w) {
				this.me = u;
				this.d = w;
			}

			@Override
			public int compareTo(Vertex o) {
				return Long.compare(this.d, o.d);
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

	static class Scanner {
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

	static class Printer extends PrintWriter {
		Printer(OutputStream out) {
			super(out);
		}
	}
}
