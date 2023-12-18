
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(final String[] args) {
		@SuppressWarnings("resource")
		final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		final int N = in.nextInt();
		final int M = in.nextInt();
		final int X[] = new int[M];
		final int Y[] = new int[M];
		final int Z[] = new int[M];
		for (int i = 0; i < M; ++i) {
			X[i] = in.nextInt();
			Y[i] = in.nextInt();
			Z[i] = in.nextInt();
		}
		int cost = solve(N, M, X, Y, Z);
		System.out.println(cost);
	}

	public static class UnionFind {
		final int[] parent;
		final int[] rank;
		int disjointCount;

		public UnionFind(final int N) {
			this.parent = new int[N];
			this.rank = new int[N];
			for (int i = 0; i < N; ++i) {
				parent[i] = i;
			}
			this.disjointCount = N;
		}

		public int find(final int i) {
			if (parent[i] == i)
				return i;
			int top = find(parent[i]);
			parent[i] = top;
			return top;
		}

		public void unite(int i, int j) {
			i = find(i);
			j = find(j);
			if (i == j)
				return;
			--disjointCount;
			if (rank[i] < rank[j]) {
				parent[i] = j;
			} else {
				parent[j] = i;
				if (rank[i] == rank[j])
					++rank[i];
			}
		}

		public boolean same(int i, int j) {
			return find(i) == find(j);
		}

		public int disjointCount() {
			return disjointCount;
		}
	}

	public static int solve(int N, int M, int[] X, int[] Y, int[] Z) {
		final UnionFind uf = new UnionFind(N);
		for (int i = 0; i < M; ++i) {
			uf.unite(X[i] - 1, Y[i] - 1);
		}
		return uf.disjointCount();
	}
}
