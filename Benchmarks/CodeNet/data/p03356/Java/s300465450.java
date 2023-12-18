import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		sa = br.readLine().split(" ");
		int[] p = new int[n];
		for (int i = 0; i < n; i++) {
			p[i] = Integer.parseInt(sa[i]) - 1;
		}
		UnionFind uf = new UnionFind(n);
		for (int i = 0; i < m; i++) {
			sa = br.readLine().split(" ");
			int x = Integer.parseInt(sa[0]) - 1;
			int y = Integer.parseInt(sa[1]) - 1;
			uf.union(x, y);
		}
		br.close();

		int ans = 0;
		for (int i = 0; i < n; i++) {
			if (uf.same(i, p[i])) {
				ans++;
			}
		}
		System.out.println(ans);
	}

	static class UnionFind {
		int[] parent;

		UnionFind(int n) {
			parent = new int[n];
			for (int i = 0; i < n; i++) {
				parent[i] = i;
			}
		}

		void union(int x, int y) {
			int px = find(x);
			int py = find(y);
			if (px != py) {
				parent[px] = py;
			}
		}

		int find(int x) {
			if (parent[x] == x) {
				return x;
			}
			parent[x] = find(parent[x]);
			return parent[x];
		}

		/**
		 * xとyが同一連結成分か
		 */
		boolean same(int x, int y) {
			return find(x) == find(y);
		}
	}
}
