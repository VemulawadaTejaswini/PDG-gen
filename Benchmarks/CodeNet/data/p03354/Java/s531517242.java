import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = Integer.parseInt(sc.next());
			int m = Integer.parseInt(sc.next());
			int[] p = new int[n];
			for (int i = 0; i < n; i++) {
				p[i] = sc.nextInt();
			}
			UnionFind uf = new UnionFind(n + 1);
			for (int i = 0; i < m; i++) {
				uf.unite(sc.nextInt(), sc.nextInt());
			}
			int ans = 0;
			for (int i = 0; i < n; i++) {
				if (uf.same(i + 1, p[i]))
					ans++;
			}
			System.out.println(ans);
		}
	}

	static class UnionFind {
		int[] parent;

		public UnionFind(int size) {
			this.parent = new int[size];
			for (int i = 0; i < size; i++) {
				parent[i] = i;
			}
		}

		public void unite(int x, int y) {
			int rootx = root(x);
			int rooty = root(y);
			if (rootx != rooty)
				parent[rooty] = parent[rootx];
		}

		public int root(int x) {
			if (parent[x] == x) {
				return x;
			}
			return root(parent[x]);
		}

		public boolean same(int x, int y) {
			return root(x) == root(y);
		}
	}
}