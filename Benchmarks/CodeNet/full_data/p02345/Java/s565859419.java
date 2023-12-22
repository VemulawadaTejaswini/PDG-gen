import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Iterator;

// aoj DSL_2_A Range Minimum Query
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Printer pr = new Printer(System.out);

		int n = sc.nextInt();
		int q = sc.nextInt();

		SegmentTree st = new SegmentTree(n);

		for (int i = 0; i < q; i++) {
			int com = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if (com == 0) {
				st.update(x, y);
			} else {
				pr.println(st.query(x, y + 1));
			}
		}

		pr.close();
		sc.close();
	}
	
	private static class SegmentTree {
		int[] st;
		int n;
		final int INF = Integer.MAX_VALUE;
		
		SegmentTree(int n) {
			this.n = 1;
			while (this.n < n) {
				this.n *= 2;
			}
			st = new int[2 * this.n - 1];
			Arrays.fill(st, INF);
		}
		
		// i:0-indexed
		void update(int i, int x) {
			i = n - 1 + i;
			st[i] = x;
			while (i > 0) {
				i = (i - 1) / 2;
				st[i] = Math.min(st[2 * i + 1], st[2 * i + 2]);
			}
		}

		// a, b:0-indexed
		// [a, b)
		int query(int a, int b) {
			return query(a, b, 0, 0, n);
		}
		
		private int query(int a, int b, int i, int l, int r) {
			if (a >= r || b <= l) {
				return INF;
			}
			if (a <= l && b >= r) {
				return st[i];
			}

			return Math.min(query(a, b, i * 2 + 1, l, (l + r) / 2),
					query(a, b, i * 2 + 2, (l + r) / 2, r));
		}
	}

	@SuppressWarnings("unused")
	private static class UnionFind {
		int[] parent;
		int[] rank;

		UnionFind(int n) {
			parent = new int[n];
			rank = new int[n];
			for (int i = 0; i < n; i++) {
				parent[i] = i;
				rank[i] = 0;
			}
		}
		
		int find(int x) {
			if (parent[x] == x) {
				return x;
			} else {
				return parent[x] = find(parent[x]);
			}
		}
		
		boolean same(int x, int y) {
			return find(x) == find(y);
		}
		
		void union(int x, int y) {
			x = find(x);
			y = find(y);
			if (x != y) {
				if (rank[x] > rank[y]) {
					parent[y] = x;
				} else {
					parent[x] = y;
					if (rank[x] == rank[y]) {
						rank[y]++;
					}
				}
			}

			return;
		}

		// ??°?????????????????°
		int count() {
			int ret = 0;
			for (int i = 0; i < parent.length; i++) {
				if (find(i) == i) {
					ret++;
				}
			}
			
			return ret;
		}
	}

	@SuppressWarnings("unused")
	private static class Scanner {
		BufferedReader br;
		Iterator<String> it;
		
		Scanner (InputStream in) {
			br = new BufferedReader(new InputStreamReader(in));
		}
		
		String next() throws RuntimeException  {
			try {
				if (it == null || !it.hasNext()) {
					it = Arrays.asList(br.readLine().split(" ")).iterator();
				}
				return it.next();
			} catch (IOException e) {
				throw new IllegalStateException();
			}
		}
		
		int nextInt() throws RuntimeException {
			return Integer.parseInt(next());
		}

		long nextLong() throws RuntimeException {
			return Long.parseLong(next());
		}

		float nextFloat() throws RuntimeException {
			return Float.parseFloat(next());
		}

		double nextDouble() throws RuntimeException {
			return Double.parseDouble(next());
		}

		void close() {
			try {
				br.close();
			} catch (IOException e) {
//				throw new IllegalStateException();
			}
		}
	}

	private static class Printer extends PrintWriter {
		Printer(PrintStream out) {
			super(out);
		}
	}
}