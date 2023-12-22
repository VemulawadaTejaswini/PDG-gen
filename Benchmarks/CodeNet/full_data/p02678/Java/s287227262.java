

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		SparseWeightedGraph sparseGraph = new SparseWeightedGraph(n, false);
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			sparseGraph.addEdge(a-1,b-1);
		}
		Queue<Edge> queue = new LinkedList<>();
		Map<Integer, Integer> map = new HashMap<>();
		queue.add(new Edge(0, 0));
		map.put(0,0);
		while (!queue.isEmpty()) {
			Edge p = queue.remove();
			for (Edge edge : sparseGraph.adj(p.v())) {
				int newP = edge.other(p.v());
				if (map.containsKey(newP)) {
					continue;
				}
				queue.add(new Edge(newP, p.v()));
				map.put(newP, p.v());
			}
		}
		for (int i = 0; i < n; i++) {
			if (!map.containsKey(i)) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
		for (int i = 1; i < n; i++) {
			System.out.println(map.get(i)+1);
		}
	}
}

class Edge {
	private int a, b;

	Edge(int v, int w) {
		this.a = v;
		this.b = w;
	}

	public int v() {
		return a;
	}

	public int w() {
		return b;
	}

	public int other(int x) {
		assert (x == a) || (x == b);
		return x == a ? b : a;
	}
}

class SparseWeightedGraph {
	private int n, m;
	private boolean directed;
	private ArrayList<ArrayList<Edge>> g;

	SparseWeightedGraph(int n, boolean directed) {
		this.n = n;
		this.m = 0;
		this.g = new ArrayList<>();
		this.directed = directed;
		for (int i = 0; i < n; i++) {
			g.add(i, new ArrayList<>());
		}
	}

	private void checkOutOfRange(int v) {
		if (v > n || v < 0) {
			throw new IllegalArgumentException("v is out of range");
		}
	}

	public int V() {
		return this.n;
	}

	public int E() {
		return this.m;
	}

	public void addEdge(int v, int w) {
		g.get(v).add(new Edge(v, w));
		if (v != w && !directed) {
			g.get(w).add(new Edge(w, v));
		}
		m++;
	}

	public Iterable<Edge> adj(int v) {
		this.checkOutOfRange(v);
		return g.get(v);
	}
}