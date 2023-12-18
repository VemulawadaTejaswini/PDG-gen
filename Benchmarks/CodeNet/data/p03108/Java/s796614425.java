import java.util.Scanner;

public class Main {

	private static class UnionFind {
		private int n;
		private int[] parent;
		private int c;

		public UnionFind(int n) {
			this.n = n;
			this.c = 0;
			this.parent = new int[n];
			for (int i = 0; i < n; i++) {
				parent[i] = i;
			}
		}

		public void union(int a, int b) {
			int rootA = root(a);
			int rootB = root(b);
			if (rootA != rootB) {
				parent[rootA] = parent[rootB];
				c++;
			}
		}

		public int rank() {
			return c;
		}

		private int root(int a) {
			while (parent[a] != parent[parent[a]]) parent[a] = parent[parent[a]];
			return parent[a];
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] ab = new int[m][2];
		for (int i = 0; i < m; i++) {
			ab[i][0] = sc.nextInt() - 1;
			ab[i][1] = sc.nextInt() - 1;
		}

		long[] answer = new long[m];
		answer[m - 1] = (long) n * (n - 1) / 2L;

		UnionFind uf = new UnionFind(n);
		for (int i = m - 2; i >= 0; i--) {
			uf.union(ab[i + 1][0], ab[i + 1][1]);
			answer[i] = (long) n * (n - 1) / 2L - ((uf.rank() * (uf.rank() + 1) / 2));
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < m; i++) {
			sb.append(answer[i]).append("\n");
		}

		System.out.print(sb.toString());
	}
}
