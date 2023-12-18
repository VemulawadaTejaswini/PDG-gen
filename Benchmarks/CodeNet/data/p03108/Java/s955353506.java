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
		for (int i = 0; i < m; i++) {
			a[i] = sc.nextInt() - 1;
			b[i] = sc.nextInt() - 1;
		}

		UnionFind uf = new UnionFind(n);
		long pre = (long)n * (n - 1) / 2;
		List<Long> ans = new ArrayList<>(n);
		for (int i = m - 1; i >= 0; i--) {
			ans.add(pre);

			if (!uf.same(a[i], b[i])) {
				long tmp = pre + f(uf.count(a[i])) + f(uf.count(b[i]));
				uf.unite(a[i], b[i]);
				tmp -= f(uf.count(a[i]));
				
				pre = tmp;
			}
		}
		
		Collections.reverse(ans);
		for (long e : ans) {
			pr.println(e);
		}
	}

	private static long f(int n) {
		if (n < 2) {
			return 0;
		}
		
		return (long)n * (n - 1) / 2;
	}

	/**
	 * 互いに素な集合族のためのデータ構造(disjoint-set data structure)
	 */
	static class UnionFind {
//		private int n;
		/** cnt : 異なる集合の数 */
		private int cnt;
		/** 
		 * parent[x] : 0～n-1 の場合、要素xのroot要素
		 *           : -1～-n の場合、自分自身がroot要素、
		 *             -parent[x]でxを含む集合の要素数
		 */
		private int[] parent;
		/** rank[x] : 要素xが属する木の高さ */
		private int[] rank;

		/**
		 * n個の要素数の集合を扱うインスタンスを返す
		 * 
		 * @param n 集合の要素数
		 */
		UnionFind(int n) {
//			this.n = n;
			cnt = n;
			parent = new int[n];
			Arrays.fill(parent, -1);
			rank = new int[n];
			Arrays.fill(rank, 0);
		}

		/**
		 * x が含まれる集合の代表元(root)を返す
		 * 
		 * @param x 対称要素{@literal (0<=x<n)}
		 * @return x が含まれる集合の代表元
		 */
		int find(int x) {
			if (parent[x] < 0) {
				return x;
			} else {
				return parent[x] = find(parent[x]);
			}
		}

		/**
		 * x と y が同じ集合に含まれるのかを返す
		 * 
		 * @param x 対称要素{@literal (0<=x<n)}
		 * @param y 対称要素{@literal (0<=y<n)}
		 * @return 指定された2つの要素が同じ集合に含まれている場合、true
		 */
		boolean same(int x, int y) {
			return find(x) == find(y);
		}

		/**
		 * x が含まれる集合と y が含まれる集合を統合し、これらの和集合を生成する
		 * 
		 * @param x 統合する対称要素{@literal (0<=x<n)}
		 * @param y 統合する対称要素{@literal (0<=y<n)}
		 */
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

		/**
		 * x が含まれる集合の要素数を返す
		 * 
		 * @param x 対称要素{@literal (0<=x<n)}
		 * @return x が含まれる集合の要素数
		 */
		int count(int x) {
			return -parent[find(x)];
		}

		/**
		 * n 個の要素を持つ集合がいくつの互いに素な集合に分割されているのかを返す
		 * 
		 * @return 集合全体での互いに素な集合の個数
		 */
		int count() {
			return cnt;
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
