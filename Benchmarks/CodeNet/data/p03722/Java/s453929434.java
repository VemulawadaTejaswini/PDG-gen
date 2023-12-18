import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] abc = sc.nextIntArrays(m, 3);

		BellmanFord bf = new BellmanFord(n);
		for (int i = 0; i < m; i++) {
			int a = abc[0][i] - 1;
			int b = abc[1][i] - 1;
			int c = -abc[2][i];

			bf.addEdge(a, b, c);
		}

		long tmp = bf.getShortestPathWeight(0, n - 1);
		if (tmp == -bf.INF) {
			pr.println("inf");
		} else {
			pr.println(-tmp);
		}
	}

	/**
	 * BellmanFord法による重み付き有向グラフ上の単一始点最短路問題を解く
	 * 負の重みも可
	 * O(VE)
	 */
	static class BellmanFord {
		long[] d;
		List<Edge> edges;
		int n;
		int s;
		int[] p;

		final long INF = Long.MAX_VALUE;

		BellmanFord(int n) {
			this.n = n;
			edges = new ArrayList<Edge>();
			s = -1;
		}

		/**
		 * グラフに有向辺(頂点 i から頂点 j へ)を追加する
		 * 無向グラフの場合は、逆向きも追加すること
		 * 
		 * @param i 有向辺の始点(from){@literal (0<=i<n)}
		 * @param j 有向辺の終点(to){@literal (0<=i<n)}
		 * @param c 有向辺の重み(負の値も可)
		 */
		public void addEdge(int i, int j, int c) {
			edges.add(new Edge(i, j, c));
		}

		/**
		 * 始点 i から終点 j までの最短路重みを返す
		 * 始点が同じ場合は前回の最短路結果を使い回す
		 * i を以前の呼び出しから変更した場合、最短路を計算しなおす(有向辺の情報はそのままで)
		 * 
		 * @param i 最短路を求める始点{@literal (0<=i<n)}
		 * @param j 最短路を求める終点{@literal (0<=j<n)}
		 * @return 最短路重み。始点から終点に到達できない場合、INF。
		 * iからjまでの最短路の途中に負閉路があれば -INF を返す
		 */
		public long getShortestPathWeight(int i, int j) {
			if (s != i) {
				s = i;

				d = new long[n];
				Arrays.fill(d, INF);
				d[s] = 0;
				p = new int[n];
				Arrays.fill(p, -1);

				boolean update = false;
				for (int kk = 0; kk < n - 1; kk++) {
					update = false;
					for (Edge e : edges) {
						if (d[e.u] == INF) {
						} else if (d[e.v] > d[e.u] + e.w) {
							d[e.v] = d[e.u] + e.w;
							p[e.v] = e.u;
							update = true;
						} else if (d[e.v] == d[e.u] + e.w) {
						}
					}
					if (!update) {
						break;
					}
				}

				// 負閉路のチェック
				if (update) {
					for (int kk = 0; kk < n; kk++) {
						update = false;
						for (Edge e : edges) {
							if (d[e.u] == INF) {
							} else if (d[e.u] == -INF) {
								if (d[e.v] != -INF) {
									d[e.v] = -INF;
									p[e.v] = e.u;
									update = true;
								}
							} else if (d[e.v] > d[e.u] + e.w) {
								d[e.v] = -INF;
								p[e.v] = e.u;
								update = true;
							}
						}
						if (!update) {
							break;
						}
					}
				}
			}

			return d[j];
		}

		/**
		 * 始点 i から終点 j までの最短路のうち1つを返す
		 * 始点が同じ場合は前回の最短路結果を使い回す
		 * i を以前の呼び出しから変更した場合、最短路を計算しなおす(有向辺の情報はそのままで)
		 * 
		 * @param i 最短路を求める始点{@literal (0<=i<n)}
		 * @param j 最短路を求める終点{@literal (0<=j<n)}
		 * @return 最短路を示す頂点の集合。始点から終点に到達できない場合あるいは始点から終点の間に負閉路がある場合、null
		 */
		public List<Integer> getShortestPath(int i, int j) {
			if (s != i) {
				getShortestPathWeight(i, j);
			}

			if (d[j] == INF || d[j] == -INF) {
				return null;
			}
			
			List<Integer> ret = new ArrayList<>();
			ret.add(j);
			while (p[j] >= 0) {
				j = p[j];
				ret.add(j);
			}
			Collections.reverse(ret);
			
			return ret;
		}

		private static class Edge {
			int u; // from
			int v; // to
			int w; // cost

			Edge(int u, int v, int w) {
				this.u = u;
				this.v = v;
				this.w = w;
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
		
		int[] nextIntArray(int n) {
			int[] ret = new int[n];
			for (int i = 0; i < n; i++) {
				ret[i] = sc.nextInt();
			}
			
			return ret;
		}

		int[][] nextIntArrays(int n, int m) {
			int[][] ret = new int[m][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					ret[j][i] = sc.nextInt();
				}
			}
			
			return ret;
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
