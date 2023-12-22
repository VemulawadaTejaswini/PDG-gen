import java.util.*;

public class Main {

	static Main obj = new Main();
	static int vertex;
	static int edge;
	static int source;
	static int[] cost;
	static ArrayList<Edge>[] graph;

	@SuppressWarnings("unchecked")
	public static void init() {
		Scanner sc = new Scanner(System.in);

		vertex = sc.nextInt();
		edge = sc.nextInt();

		source = sc.nextInt();

		cost = new int[vertex];

		graph = new ArrayList[vertex];
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
	}

	public static void dijk(int start) {

		HashSet<Integer> visited = new HashSet<>();
		PriorityQueue<Edge> pq = new PriorityQueue<>();

		cost[source] = 0;
		pq.add(obj.new Edge(start, start, 0));

		while (!pq.isEmpty()) {
			Edge e = pq.poll();
			if (visited.contains(e.to)) {
				continue;
			}
			visited.add(e.to);
			cost[e.to] = e.cost;

			for (Edge f : graph[e.to]) {
				pq.offer(obj.new Edge(f.from, f.to, f.cost + e.cost));
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

	public static void main(String[] args) {

		init();
		dijk(source);

	}

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

}

