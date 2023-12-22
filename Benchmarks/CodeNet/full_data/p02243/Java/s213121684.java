
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	int n;
	boolean[] color;
	int[][] map;
	int INF = 1 << 24;
	List<List<List<Integer>>> adj = new ArrayList<List<List<Integer>>>();

	private void run() {
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		map = new int[n][n];
		for (int i = 0; i < n; i++) {
			adj.add(new ArrayList<List<Integer>>());
		}
		for (int i = 0; i < n; i++) {
			int u = scanner.nextInt();
			int k = scanner.nextInt();
			for (int j = 0; j < k; j++) {
				int v = scanner.nextInt();
				int c = scanner.nextInt();
				adj.get(u).add(Arrays.asList(v, c));
			}
		}
		dijkstra();
	}

	private void dijkstra() {
		PriorityQueue<Edge> pq = new PriorityQueue<Main.Edge>();
		color = new boolean[n];
		int[] d = new int[n];
		Arrays.fill(d, INF);
		d[0] = 0;
		pq.add(new Edge(0, 0));
		while (!pq.isEmpty()) {
			Edge f = pq.poll();
			int u = f.to;
			color[u] = true;
			if (d[u] < f.from * (-1))
				continue;
			for (int j = 0; j < adj.get(u).size(); j++) {
				int v = adj.get(u).get(j).get(0);
				if (color[v])
					continue;
				if (d[v] > d[u] + adj.get(u).get(j).get(1)) {
					d[v] = d[u] + adj.get(u).get(j).get(1);
					pq.add(new Edge(d[v], v));
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.printf("%d %d\n", i, d[i] == INF ? -1 : d[i]);
		}

	}

	class Edge implements Comparable<Edge> {
		int from;
		int to;

		public Edge(int from, int to) {
			super();
			this.from = from;
			this.to = to;
		}

		@Override
		public int compareTo(Edge o) {
			return this.from - o.from;
		}

	}
}