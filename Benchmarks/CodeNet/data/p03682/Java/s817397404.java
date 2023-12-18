import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] x = new int[N][2];
		int[][] y = new int[N][2];
		for (int i = 0; i < N; i++) {
			x[i][0] = sc.nextInt() - 1;
			x[i][1] = i;
			y[i][0] = sc.nextInt() - 1;
			y[i][1] = i;
		}
		Arrays.sort(x, (a, b) -> Integer.compare(a[0], b[0]));
		Arrays.sort(y, (a, b) -> Integer.compare(a[0], b[0]));
		Queue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
		for (int i = 0; i < N - 1; i++) {
			pq.offer(new int[]{x[i + 1][0] - x[i][0], x[i + 1][1], x[i][1]});
			pq.offer(new int[]{y[i + 1][0] - y[i][0], y[i + 1][1], y[i][1]});
		}

		UnionFind uf = new UnionFind(N);
		long a = 0;
		while (!pq.isEmpty()) {
			int[] p = pq.poll();
			if (uf.union(p[1], p[2])) {
				a += p[0];
			}
		}

		System.out.println(a);
	}

	private static class UnionFind {

		private int[] parent;
		private int[] count;

		public UnionFind(int n) {
			parent = new int[n];
			count = new int[n];
			for (int i = 0; i < n; i++) {
				parent[i] = i;
				count[i] = 1;
			}
		}

		public boolean union(int v, int w) {
			int a = root(v);
			int b = root(w);
			if (a == b) return false;

			if (count[a] >= count[b]) {
				parent[b] = a;
			} else {
				parent[a] = b;
			}
			count[a] = count[b] = count[a] + count[b];

			return true;
		}

		public boolean connected(int v, int w) {
			return root(v) == root(w);
		}

		public int count(int v) {
			return count[root(v)];
		}

		private int root(int v) {
			while (parent[v] != parent[parent[v]]) parent[v] = parent[parent[v]];
			return parent[v];
		}
	}

}
