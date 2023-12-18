import java.io.*;
import java.util.*;

class Main {

	private static class UnionFind {
		int[] parent;

		public UnionFind(int n) {
			parent = new int[n];

			for (int i = 0; i < n; i++) {
				parent[i] = i;
			}
		}

		public boolean union(int v, int w) {
			int a = root(v);
			int b = root(w);
			if (a == b) return false;
			parent[a] = parent[b];
			return true;
		}

		public boolean connected(int v, int w) {
			return root(v) == root(w);
		}

		public void clear() {
			for (int i = 0; i < parent.length; i++) {
				parent[i] = i;
			}
		}

		public int id(int v) {
			return parent[v];
		}

		private int root(int v) {
			while (parent[v] != parent[parent[v]]) parent[v] = parent[parent[v]];
			return parent[v];
		}
	}

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] a = new int[M];
		int[] b = new int[M];
		for (int i = 0; i < M; i++) {
			a[i] = sc.nextInt() - 1;
			b[i] = sc.nextInt() - 1;
		}

		int answer = 0;
		UnionFind uf = new UnionFind(N);
		for (int i = 0; i < M; i++) {
			uf.clear();
			for (int j = 0; j < M; j++) {
				if (i == j) continue;
				uf.union(a[j], b[j]);
			}

			int count = 0;
			for (int j = 0; j < N; j++) {
				if (uf.id(j) == j) {
					count++;
				}
			}
			if (count > 1) answer++;
		}

		System.out.println(answer);
	}
}
