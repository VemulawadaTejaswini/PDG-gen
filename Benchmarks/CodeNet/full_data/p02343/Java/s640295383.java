import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Iterator;

// aoj DSL_1_A
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Printer pr = new Printer(System.out);

		int n = sc.nextInt();
		int q = sc.nextInt();

		UnionFind uf = new UnionFind(n);

		for (int i = 0; i < q; i++) {
			int com = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();

			if (com == 0) {
				uf.unite(x, y);
			} else {
				if (uf.same(x, y)) {
					pr.println(1);
				} else {
					pr.println(0);
				}
			}
		}

		pr.close();
		sc.close();
	}

	@SuppressWarnings("unused")
	private static class UnionFind {
		int n;
		// cnt : ??°?????????????????°
		int cnt;
		// parent[x] : 0???n-1 ?????´??????????´?x???root????´?
		//           : -1???-n ?????´?????????????????????root????´????
		//                            -parent[x]??§x??????????????????????´???°
		int[] parent;

		UnionFind(int n) {
			this.n = n;
			cnt = n;
			parent = new int[n];
			Arrays.fill(parent, -1);
		}

		// x???root????±???????
		int find(int x) {
			if (parent[x] < 0) {
				return x;
			} else {
				return parent[x] = find(parent[x]);
			}
		}

		// x??¨y???????????????????±?????????????
		boolean same(int x, int y) {
			return find(x) == find(y);
		}

		// x??¨y????±????????????????????????????
		void unite(int x, int y) {
			x = find(x);
			y = find(y);
			if (x == y) {
				return;
			}

			cnt--;
			// ????´???°?????§???????????????root?????????(Quick Find Weighted?)
			if (parent[x] > parent[y]) {
				parent[y] += parent[x];
				parent[x] = y;
			} else {
				parent[x] += parent[y];
				parent[y] = x;
			}

			return;
		}

		// ????´?x??????????????????????´???°
		int count(int x) {
			return -parent[find(x)];
		}

		// ??°?????????????????°
		int count() {
			return cnt;
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