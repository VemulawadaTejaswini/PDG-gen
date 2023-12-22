import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int N, M;

	public static void main(String[] args) {
		while (true) {
			N = sc.nextInt();
			M = sc.nextInt();
			if (N == 0) break;
			Edge[] edges = new Edge[M];
			for (int i = 0; i < M; ++i) {
				int s = sc.nextInt() - 1;
				int t = sc.nextInt() - 1;
				int c = sc.nextInt();
				edges[i] = new Edge(s, t, c);
			}
			Arrays.sort(edges);
			ArrayList<Integer> costs = new ArrayList<Integer>();
			UnionFind uf = new UnionFind(N);
			for (int i = 0; i < M; ++i) {
				if (!uf.find(edges[i].s, edges[i].e)) {
					uf.union(edges[i].s, edges[i].e);
					costs.add(edges[i].c);
					if (costs.size() == N - 1) break;
				}
			}
			System.out.println(costs.get(N / 2 - 1));
		}
	}

	static class Edge implements Comparable<Edge> {
		int s, e, c;

		Edge(int s, int e, int c) {
			this.s = s;
			this.e = e;
			this.c = c;
		}

		public int compareTo(Edge o) {
			return this.c - o.c;
		}
	}

	static class UnionFind {
		int[] set;

		UnionFind(int n) {
			set = new int[n];
			Arrays.fill(set, -1);
		}

		void union(int a, int b) {
			int rtA = root(a);
			int rtb = root(b);
			if (rtA == rtb) {
				return;
			}
			set[rtA] += set[rtb];
			set[rtb] = rtA;
		}

		boolean find(int a, int b) {
			return root(a) == root(b);
		}

		int root(int a) {
			if (set[a] < 0) {
				return a;
			} else {
				set[a] = root(set[a]);
				return set[a];
			}
		}

		int size(int a) {
			return -set[root(a)];
		}
	}

}