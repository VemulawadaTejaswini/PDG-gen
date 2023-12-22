import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main 
{
	private static final int INFINITY = 1 << 30;

	class Vertex {
		int u;
		int d;
		boolean visited;
		List<Edge> edges = new ArrayList<>();
		public Vertex(int u) {
			this.u = u;
			this.d = INFINITY;
			this.visited = false;
		}
	}
	
	class Edge {
		int v;
		int c;
		public Edge(int v, int c) {
			this.v = v;
			this.c = c;
		}
	}
	
	class VertexComparator implements Comparator<Vertex> {
		@Override
		public int compare(Vertex arg0, Vertex arg1) {
			return arg0.d - arg1.d;
		}
	}
	
	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	
	private void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		Vertex[] vertices = new Vertex[n];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			int u = Integer.parseInt(st.nextToken());
			vertices[i] = new Vertex(u); 
			int k = Integer.parseInt(st.nextToken());
			for (int j = 0; j < k; j++) {
				int v = Integer.parseInt(st.nextToken());
				int c = Integer.parseInt(st.nextToken());
				vertices[i].edges.add(new Edge(v, c));
			}
		}
		reader.close();
		
		dijkstra(n, vertices);
	}

	private void dijkstra(int n, Vertex[] vertices) {
		
		vertices[0].d = 0;
		PriorityQueue<Vertex> pq = new PriorityQueue<>(5, new VertexComparator());
		pq.add(vertices[0]);
		while (!pq.isEmpty()) {
			Vertex cur = pq.poll();
			if (cur.visited) continue;
			cur.visited = true;
			for (Edge edge : cur.edges) {
				vertices[edge.v].d = Math.min(vertices[edge.v].d, cur.d + edge.c);
				pq.add(vertices[edge.v]);
			}
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println(vertices[i].u + " " + vertices[i].d);
		}
	}
}
