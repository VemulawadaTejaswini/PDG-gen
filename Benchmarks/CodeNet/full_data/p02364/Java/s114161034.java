
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		List<Edge> edges = new ArrayList<Main.Edge>();
		for (int i = 0; i < m; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			edges.add(new Edge(a, b, c));
		}
		System.out.println(kruskal(n, edges));
	}

	private int kruskal(int n, List<Edge> edges) {
		int totalCost = 0;
		Collections.sort(edges);
		UnionFind unionFind = new UnionFind(n);
		for (Edge edge:edges) {
			if (!unionFind.isSame(edge.sorce, edge.target)) {
				totalCost += edge.cost;
				unionFind.merge(edge.sorce, edge.target);
			}
		}
		return totalCost;
	}

	class Edge implements Comparable<Edge> {
		int sorce, target, cost;

		@Override
		public String toString() {
			return "Edge [sorce=" + sorce + ", target=" + target + ", cost="
					+ cost + "]";
		}

		public Edge(int sorce, int target, int cost) {
			super();
			this.sorce = sorce;
			this.target = target;
			this.cost = cost;
		}

		@Override
		public int compareTo(Edge o) {
			return this.cost - o.cost;
		}

	}

	class UnionFind {
		int[] rank, node;

		UnionFind(int size) {
			rank = new int[size];
			node = new int[size];
			for (int i = 0; i < size; i++) {
				node[i] = i;
			}
		}

		@Override
		public String toString() {
			return "UnionFind [rank=" + Arrays.toString(rank) + ", node="
					+ Arrays.toString(node) + "]";
		}

		int find(int x) {
			if (x == node[x])
				return x;
			return node[x] = find(node[x]);
		}

		boolean isSame(int x, int y) {
			return find(x) == find(y);
		}

		void merge(int x, int y) {
			x = find(x);
			y = find(y);
			if (x == y)
				return;
			if (rank[x] > rank[y])
				node[y] = x;
			else {
				node[x] = y;
				if (rank[x] == rank[y])
					rank[y]++;
			}
		}

	}
}