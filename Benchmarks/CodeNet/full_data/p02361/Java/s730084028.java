import java.util.*;

public class Main {

	private class Edge implements Comparable<Edge> {

		int from;
		int to;
		int cost;

		public Edge(int a, int b, int c) {
			from = a;
			to = b;
			cost = c;
		}

		@Override
		public int compareTo(Edge other) {

			return cost - other.cost;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Main obj = new Main();

		int vertex = sc.nextInt();
		int edge = sc.nextInt();

		int source = sc.nextInt();

		int[] cost = new int[vertex];

		ArrayList<Edge>[] graph = new ArrayList[vertex];
		for (int i = 0; i < vertex; i++) {
			cost[i] = 1 << 30;
			graph[i] = new ArrayList<Edge>();
		}

		for (int i = 0; i < edge; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			graph[a].add(obj.new Edge(a, b, c));
		}

		HashSet<Integer> visited = new HashSet<>();
		PriorityQueue<Edge> pq = new PriorityQueue<>();

		cost[source] = 0;
		pq.add(obj.new Edge(source, source, 0));

		while (!pq.isEmpty()) {
			Edge e = pq.poll();
			if (visited.contains(e.to)) {
				continue;
			}
			visited.add(e.to);
			cost[e.to] = e.cost + cost[e.from];

			for (Edge f : graph[e.to]) {
				pq.offer(f);
			}

		}
		for (int e : cost) {
			if (e != 1 << 30) {
				System.out.println(e);
			} else {
				System.out.println("INF");
			}
		}

	}

}

