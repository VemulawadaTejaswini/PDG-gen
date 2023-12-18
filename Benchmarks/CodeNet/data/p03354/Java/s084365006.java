import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt() - 1;
		}

		UnionFind uf = new UnionFind(n);
		for (int i = 0; i < m; i++) {
			uf.union(sc.nextInt() - 1, sc.nextInt() - 1);
		}

		int answer = 0;
		for (int i = 0; i < n; i++) {
			if (uf.connected(i, a[i])) answer++;
		}

		System.out.println(answer);
	}

	private static class UnionFind {
		int[] parent;

		public UnionFind(int n) {
			parent = new int[n];
			for (int i = 0; i < n; i++) {
				parent[i] = i;
			}
		}

		public boolean connected(int x, int y) {
			return root(x) == root(y);
		}

		public void union(int x, int y) {
			parent[root(x)] = parent[root(y)];
		}

		private int root(int x) {
			while (parent[x] != parent[parent[x]]) {
				parent[x] = parent[parent[x]];
			}

			return parent[x];
		}
	}
}
