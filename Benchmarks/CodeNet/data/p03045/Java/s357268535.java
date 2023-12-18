import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);

		UnionFind uf = new UnionFind(n);
		for (int i = 0; i < m; i++) {
			sa = br.readLine().split(" ");
			int x = Integer.parseInt(sa[0]) - 1;
			int y = Integer.parseInt(sa[1]) - 1;
			uf.union(x, y);
		}
		br.close();

		System.out.println(uf.num);
	}

	static class UnionFind {
		int[] parent, size;
		int num = 0; // 連結成分の数

		UnionFind(int n) {
			parent = new int[n];
			size = new int[n];
			num = n;
			for (int i = 0; i < n; i++) {
				parent[i] = i;
				size[i] = 1;
			}
		}

		void union(int x, int y) {
			int px = find(x);
			int py = find(y);
			if (px != py) {
				parent[px] = py;
				size[py] += size[px];
				num--;
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

		/**
		 * xを含む連結成分のサイズ
		 */
		int size(int x) {
			return size[find(x)];
		}
	}
}
