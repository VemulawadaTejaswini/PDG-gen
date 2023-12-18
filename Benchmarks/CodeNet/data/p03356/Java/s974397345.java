import java.io.*;
import java.util.*;

public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] p = new int[n];
		for (int i = 0; i < n; i++) {
			p[i] = sc.nextInt() - 1;
		}

		UnionFind uf = new UnionFind(n);
		int[] x = new int[m];
		int[] y = new int[m];
		for (int i = 0; i < m; i++) {
			x[i] = sc.nextInt() - 1;
			y[i] = sc.nextInt() - 1;
			uf.unite(x[i], y[i]);
		}

		int ans = 0;
		for (int i = 0; i < n; i++) {
			if (uf.same(i, p[i])) {
				ans++;
			}
		}

		pr.println(ans);
	}

	@SuppressWarnings("unused")
	private static class UnionFind {
		int n;
		// cnt : 異なる集合の数
		int cnt;
		// parent[x] : 0～n-1 の場合、要素xのroot要素
		//           : -1～-n の場合、自分自身がroot要素、
		//                            -parent[x]でxを含む集合の要素数
		int[] parent;
		// rank[x] : 要素xが属する木の高さ
		int[] rank;

		UnionFind(int n) {
			this.n = n;
			cnt = n;
			parent = new int[n];
			Arrays.fill(parent, -1);
			rank = new int[n];
			Arrays.fill(rank, 0);
		}

		// xのrootを求める
		int find(int x) {
			if (parent[x] < 0) {
				return x;
			} else {
				return parent[x] = find(parent[x]);
			}
		}

		// xとyが同じ集合に属するのか
		boolean same(int x, int y) {
			return find(x) == find(y);
		}

		// xとyの属する集合を併合する
		void unite(int x, int y) {
			x = find(x);
			y = find(y);
			if (x == y) {
				return;
			}

			cnt--;
			// rankが大きい集合をrootにする
			if (rank[x] > rank[y]) {
				parent[x] += parent[y];
				parent[y] = x;
			} else {
				parent[y] += parent[x];
				parent[x] = y;
				if (rank[x] == rank[y]) {
					rank[y]++;
				}
			}

			return;
		}

		// 要素xを含む集合の要素数
		int count(int x) {
			return -parent[find(x)];
		}

		// 異なる集合の数
		int count() {
			return cnt;
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
