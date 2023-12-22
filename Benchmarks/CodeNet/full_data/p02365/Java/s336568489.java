import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

	static List<edge>[] graph;
	static int V;
	static int R;

	static int total;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] V_E_R = br.readLine().split(" ");

		V = Integer.parseInt(V_E_R[0]);

		int E = Integer.parseInt(V_E_R[1]);

		R = Integer.parseInt(V_E_R[2]);

		graph = new List[V];

		for (int i = 0; i < V; i++) {
			graph[i] = new ArrayList<>();
		}

		for (int i = 0; i < E; i++) {
			String[] edge = br.readLine().split(" ");

			int from = Integer.parseInt(edge[0]);

			int to = Integer.parseInt(edge[1]);

			int cost = Integer.parseInt(edge[2]);

			graph[from].add(new edge(from, to, cost));

		}

		prim();
		System.out.println(total);

	}

	static void prim() {

		boolean[] visited = new boolean[V];

		Queue<edge> edges = new PriorityQueue<>();
		edges.offer(new edge(0, R, 0));

		while (!(edges.isEmpty())) {
			edge e = edges.poll();

			if (visited[e.to]) {
				continue;
			}
			visited[e.to] = true;

			total += e.cost;

			for (edge ed : graph[e.to]) {
				edges.offer(ed);
			}

		}

	}

	static class edge implements Comparable<edge> {
		int from;
		int to;
		int cost;

		edge(int a, int b, int c) {
			this.from = a;
			this.to = b;
			this.cost = c;

		}

		@Override
		public int compareTo(edge o) {
			// TODO ?????????????????????????????????????????????
			return this.cost - o.cost;
		}
	}

}