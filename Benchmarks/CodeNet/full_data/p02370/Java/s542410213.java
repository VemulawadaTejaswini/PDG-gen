import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Queue;
import java.util.ArrayDeque;

public class Main {
	static class Vertex {
		int id;
		Set<Integer> adj;

		public Vertex(int id) {
			this.id = id;
			this.adj = new HashSet<>();
		}

		public void addEdge(int v) {
			adj.add(v);
		}

		public boolean contains(int v) {
			return adj.contains(v);
		}

		public List<Integer> getAdjacentVertices() {
			List<Integer> vs = new ArrayList<>(adj);

//			vs.sort((x, y) -> x-y);

			return vs;
		}
	}

	static class Graph {
		private Vertex[] vertices;
		private int n;

		public Graph(int n) {
			this.n = n;

			this.vertices = new Vertex[n];
			for (int i = 0; i < n; i++)
				vertices[i] = new Vertex(i);
		}

		public int getNumVertices() {
			return n;
		}

		public int getIndegree(int v) {
			if (v < 0 || v >= n)
				throw new IllegalArgumentException("invalid vertex");

			int d = 0;
			for (int i = 0; i < n; i++) {
				if (vertices[i].contains(v))
					d++;
			}

			return d;
		}

		public List<Integer> getAdjacentVertices(int v) {
			return vertices[v].getAdjacentVertices();
		}

		public void addEdge(int v1, int v2) {
			if (v1 < 0 || v2 < 0 || v1 >= n|| v2 >= n)
				throw new IllegalArgumentException("invalid vertex");

			vertices[v1].addEdge(v2);
		}							
	}

	public static List<Integer> sort(Graph g) {
		Queue<Integer> q = new ArrayDeque<>();
		Map<Integer, Integer> m = new HashMap<>();

		int n = g.getNumVertices();
		for (int i = 0; i < n; i++) {
			int d = g.getIndegree(i);
			m.put(i, d);

			if (d == 0)
				q.add(i);
		}

		List<Integer> vs = new ArrayList<>();
		while (!q.isEmpty()) {
			int v = q.remove();

			vs.add(v);
			List<Integer> adj = g.getAdjacentVertices(v);
			for (int a : adj) {
				m.replace(a, m.get(a)-1);
				if (m.get(a) == 0)
					q.add(a);
			}
		}

		if (vs.size() != n)
			throw new IllegalStateException("cycle detected!");

		return vs;
	}														

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int n = in.nextInt();
			int m = in.nextInt();
			Graph g = new Graph(n);

			for (int i = 0; i < m; i++) {
				int x = in.nextInt();
				int y = in.nextInt();

				g.addEdge(x, y);
			}

			List<Integer> vs = sort(g);
			for (int v : vs)
				System.out.println(v);
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
}