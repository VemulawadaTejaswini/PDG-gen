import java.util.*;

public class Main {

	private class Edge implements Comparable<Edge> {

		int from;
		int to;
		int weight;

		public Edge(int a, int b, int c) {
			from = a;
			to = b;
			weight = c;
		}

		@Override
		public int compareTo(Edge other) {
			return this.weight - other.weight;

		}

	}

	static int vertex;
	static int edge;
	static ArrayList<Edge>[] graph;
	static boolean[] visited;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Main obj = new Main();
		Scanner sc = new Scanner(System.in);
		vertex = sc.nextInt();
		edge = sc.nextInt();
		visited = new boolean[vertex];
		graph = new ArrayList[vertex];
		for (int i = 0; i < graph.length; i++) {
			graph[i] = new ArrayList<Edge>();
		}
		for (int i = 0; i < edge; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			graph[a].add(obj.new Edge(a, b, c));
			graph[b].add(obj.new Edge(b, a, c));
		}
		PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
		for (Edge e : graph[0]) {
			pq.offer(e);
		}
		visited[0] = true;
		int sum = 0;
		while (!pq.isEmpty()) {
			Edge e = pq.poll();
			if (visited[e.to]) {
				continue;
			}
			visited[e.to] = true;
			sum += e.weight;
			for (Edge f : graph[e.to]) {
				if (!visited[f.to]) {
					pq.offer(f);
				}
			}
		}
		System.out.println(sum);
	}
}