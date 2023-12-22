import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	static class Edge implements Comparable<Edge> {
		int from, to, cost;

		public Edge(int from, int to, int cost) {
			this.from = from;
			this.to = to;
			this.cost = cost;
		}

		@Override
		public int compareTo(Edge other) {
			return cost - other.cost;
		}
	}

	// Graph must be undirected!
	public static Long prims(Map<Integer, List<Edge>> graph, int n) {

		if (graph == null)
			return null;

		long sum = 0, nodesVisited = 1;
		boolean[] visited = new boolean[n];
		PriorityQueue<Edge> pq = new PriorityQueue<>();

		// Add initial set of edges to the pq
		List<Edge> edges = graph.get(0);
		if (edges == null || edges.size() == 0)
			return null;
		for (Edge edge : edges)
			pq.offer(edge);
		visited[0] = true;

		// Loop while the MST is not complete
		while (nodesVisited != n && !pq.isEmpty()) {
			Edge edge = pq.poll();
			if (!visited[edge.to]) {

				// Add edges to nodes we have not yet visited
				edges = graph.get(edge.to);
				if (edges == null || edges.size() == 0)
					return null;
				for (Edge e : edges)
					if (!visited[e.to])
						pq.offer(e);

				visited[edge.to] = true;
				sum += edge.cost;
				nodesVisited++;

			}
		}

		// Check if MST spans entire graph
		if (nodesVisited == n)
			return sum;
		return null;

	}

	// Example usage
	public static void main(String[] args) throws IOException {

		// Contains tuples of (from, to, weight)
		StringTokenizer st = new StringTokenizer(br.readLine());
		final int NUM_NODES = Integer.parseInt(st.nextToken());
		final int k = Integer.parseInt(st.nextToken());

		int[][] edges = new int[k][k];

		for (int i = 0; i < k; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			edges[i][0] = a;
			edges[i][1] = b;
			edges[i][2] = c;

		}

		// Setup graph as adjacency list
		Map<Integer, List<Edge>> graph = new HashMap<>();
		for (int i = 0; i < NUM_NODES; i++)
			graph.put(i, new ArrayList<>());
		for (int[] tuple : edges) {
			int from = tuple[0];
			int to = tuple[1];
			int cost = tuple[2];
			Edge edge = new Edge(from, to, cost);
			Edge revEdge = new Edge(to, from, cost);
			graph.get(from).add(edge);
			graph.get(to).add(revEdge);
		}

		Long mstCost = prims(graph, NUM_NODES);
		if(mstCost != null){
			System.out.println(mstCost);
		}else{
			System.out.println(0);
		}

	}

}