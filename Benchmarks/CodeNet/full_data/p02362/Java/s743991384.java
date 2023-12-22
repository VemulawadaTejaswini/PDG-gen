import java.io.*;
import java.util.*;

// AOJ GRL_1_B BellmanFord O(VE)
public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int v = sc.nextInt();
		int e = sc.nextInt();
		int r = sc.nextInt();

		BellmanFord bf = new BellmanFord(v);
		for (int i = 0; i < e; i++) {
			int s = sc.nextInt();
			int t = sc.nextInt();
			int d = sc.nextInt();
			bf.addEdge(s, t, d);
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < v; i++) {
			long tmp = bf.getShortestPath(r, i);
			if (tmp == -bf.INF) {
//				pr.println("NEGATIVE CYCLE");
				sb = new StringBuilder("NEGATIVE CYCLE\n");
				break;
			} else if (tmp == bf.INF) {
//				pr.println("INF");
				sb.append("INF\n");
			} else {
//				pr.println(tmp);
				sb.append(tmp);
				sb.append("\n");
			}
		}

		pr.print(sb);
	}

	// BellmanFord O(VE);
	private static class BellmanFord {
		long[] d;
		List<Edge> edges;
		int n;
		int s;

		final long INF = Long.MAX_VALUE;

		BellmanFord(int n) {
			this.n = n;
			edges = new ArrayList<Edge>();
			s = -1;
		}

		// i, j:0-indexed
		public void addEdge(int i, int j, int c) {
			edges.add(new Edge(i, j, c));
		}

		// iからjまでの途中に負閉路があれば -INF を返す
		public long getShortestPath(int i, int j) {
			if (s != i) {
				s = i;

				d = new long[n];
				Arrays.fill(d, INF);
				d[s] = 0;

				boolean update = false;
				for (int kk = 0; kk < n - 1; kk++) {
					update = false;
					for (int jj = 0, size = edges.size(); jj < size; jj++) {
						Edge e = edges.get(jj);
						if (d[e.u] != INF && d[e.v] > d[e.u] + e.w) {
							d[e.v] = d[e.u] + e.w;
							update = true;
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
						for (int jj = 0, size = edges.size(); jj < size; jj++) {
							Edge e = edges.get(jj);
							if (d[e.u] == -INF) {
								d[e.v] = -INF;
								update = true;
							} else if (d[e.u] != INF && d[e.v] > d[e.u] + e.w) {
								d[e.v] = -INF;
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
		sc = new Scanner(INPUT == null ? System.in : new ByteArrayInputStream(INPUT.getBytes()));
		pr = new Printer(System.out);

		solve();

//		pr.close();
		pr.flush();
//		sc.close();
	}

	static String INPUT = null;

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
		Printer(OutputStream out) {
			super(out);
		}
	}
}

