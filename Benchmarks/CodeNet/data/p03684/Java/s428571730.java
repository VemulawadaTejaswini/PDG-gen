import java.io.*;
import java.util.*;
import java.util.Map.*;

public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();

		List<Tri> x = new ArrayList<>(n);
		List<Tri> y = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			int xx = sc.nextInt();
			int yy = sc.nextInt();
			x.add(new Tri(xx, yy, i));
			y.add(new Tri(xx, yy, i));
		}

		Collections.sort(x);
		Collections.sort(y, new Comparator<Tri>() {
			@Override
			public int compare(Tri o1, Tri o2) {
				if (o1.b == o2.b) {
					return Integer.compare(o1.a, o2.a);
				}
				return Integer.compare(o1.b, o2.b);
			}
		});

		UnionFind uf = new UnionFind(n);

		Map<Integer, List<Pair>> hm = new TreeMap<>();
		for (int i = 0; i < n - 1; i++) {
			Tri x1 = x.get(i);
			Tri x2 = x.get(i + 1);

			int d = x2.a - x1.a;
			if (d == 0) {
				uf.unite(x1.i, x2.i);
			} else {
				if (!hm.containsKey(d)) {
					hm.put(d, new ArrayList<>());
				}
				hm.get(d).add(new Pair(x1.i, x2.i));
			}
		}
		for (int i = 0; i < n - 1; i++) {
			Tri y1 = y.get(i);
			Tri y2 = y.get(i + 1);

			int d = y2.b - y1.b;
			if (d == 0) {
				uf.unite(y1.i, y2.i);
			} else {
				if (!hm.containsKey(d)) {
					hm.put(d, new ArrayList<>());
				}
				hm.get(d).add(new Pair(y1.i, y2.i));
			}
		}

		long ans = 0;
		for (Entry<Integer, List<Pair>> e : hm.entrySet()) {
			int d = e.getKey();
			for (Pair ee : e.getValue()) {
				if (!uf.same(ee.a, ee.b)) {
					ans += d;
					uf.unite(ee.a, ee.b);
				}
			}
		}

		pr.println(ans);
	}

	private static class Pair implements Comparable<Pair> {
		int a;
		int b;

		Pair(int a, int b) {
			this.a = a;
			this.b = b;
		}

		@Override
		public int compareTo(Pair o) {
			if (a == o.a) {
				return Integer.compare(b, o.b);
			}

			return Integer.compare(a, o.a);
		}

		@Override
		public int hashCode() {
			return Integer.hashCode(a);
		}

		@Override
		public String toString() {
			// [xxx, xxxx]
			StringBuilder stmp = new StringBuilder(32);
			stmp.append('[');
			stmp.append(a);
			stmp.append(',');
			stmp.append(' ');
			stmp.append(b);
			stmp.append(']');

			return stmp.toString();
		}
	}

	private static class Tri implements Comparable<Tri> {
		int a;
		int b;
		int i;

		Tri(int a, int b, int y) {
			this.a = a;
			this.b = b;
			this.i = y;
		}

		@Override
		public int compareTo(Tri o) {
			if (a == o.a) {
				return Integer.compare(b, o.b);
			}
			return Integer.compare(a, o.a);
		}
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
