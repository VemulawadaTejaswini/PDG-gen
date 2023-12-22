
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		SparseWeightedGraph<Double> sparseGraph = new SparseWeightedGraph(n, false);
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			sparseGraph.addEdge(a-1,b-1,1d);
		}
		Dijkstra<Double> doubleDijkstra = new Dijkstra<>(sparseGraph, 0);
		for (int i = 2; i <= n; i++) {
			if (doubleDijkstra.hasPathTo(i-1)==false) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
		for (int i = 2; i <= n; i++) {
			System.out.println(doubleDijkstra.shortestPathReverse(i-1).get(0).v()+1);
		}
	}

}

class Dijkstra<Weight extends Number & Comparable> {
	private SparseWeightedGraph<Weight> graph;
	private int s;
	private boolean[] marked;
	private Edge<Weight>[] from;

	Dijkstra(SparseWeightedGraph<Weight> graph, int s) {
		this.graph = graph;
		this.s = s;
		this.marked = new boolean[graph.V()];
		this.from = new Edge[graph.V()];
		for (int i = 0; i < graph.V(); i++) {
			marked[i] = false;
			from[i] = null;
		}
		Stack<Integer> stack = new Stack<Integer>();
		// Dijkstra
		from[s] = new Edge<Weight>(s, s, (Weight) (Number) (1.0));
		marked[s] = true;
		stack.add(s);
		while (!stack.isEmpty()) {
			int v = stack.pop();
			marked[v] = true;
			// relaxation
			graph.adj(v).forEach(item -> {
				int w = item.other(v);
				if (!marked[w]) {
					if (from[w] == null) {
						from[w] = item;
						if (!stack.contains(w)) {
							stack.add(w);
						}
					}
				}
			});
		}
	}

	public boolean hasPathTo(int w) {
		assert w >= 0 && w < graph.V();
		return marked[w];
	}

	// find the shortest path from s to w
	public List<Edge<Weight>> shortestPathReverse(int w) {
		assert w >= 0 && w < graph.V();
		assert hasPathTo(w);
		Stack<Edge<Weight>> stack = new Stack<Edge<Weight>>();
		Edge<Weight> edge = from[w];
		while (edge.v() != this.s) {
			stack.push(edge);
			edge = from[edge.v()];
		}
		stack.push(edge);
		List<Edge<Weight>> list = new ArrayList(stack);
		return list;
	}

}

class Edge<Weight extends Number & Comparable> implements Comparable<Edge> {
	private int a, b;
	private Weight weight;

	Edge(int v, int w, Weight weight) {
		this.a = v;
		this.b = w;
		this.weight = weight;
	}

	public int v() {
		return a;
	}

	public int w() {
		return b;
	}

	public Weight wt() {
		return weight;
	}

	public int other(int x) {
		assert (x == a) || (x == b);
		return x == a ? b : a;
	}

	@Override
	public String toString() {
		return "Edge{" +
				"a=" + a +
				", b=" + b +
				", weight=" + weight +
				'}';
	}

	@Override
	public int compareTo(Edge that) {
		if (this.weight.compareTo(that.weight) < 0) {
			return -1;
		} else if (this.weight.compareTo(that.weight) > 0) {
			return 1;
		} else {
			return 0;
		}
	}
}

class SparseWeightedGraph<Weight extends Number & Comparable>{
	private int n, m;
	private boolean directed;
	private ArrayList<ArrayList<Edge<Weight>>> g;

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

	public void addEdge(Edge edge) {
		this.addEdge(edge.v(), edge.w(), (Weight) edge.wt());
	}

	public void addEdge(int v, int w, Weight weight) {
		this.checkOutOfRange(v);
		this.checkOutOfRange(w);

		if (this.hasEdge(v, w)) {
			return;
		}
		g.get(v).add(new Edge<Weight>(v, w, weight));
		if (v != w && !directed) {
			g.get(w).add(new Edge<Weight>(w, v, weight));
		}
		m++;
	}

	public boolean hasEdge(int v, int w) {
		this.checkOutOfRange(v);
		this.checkOutOfRange(w);
		for (int j = 0; j < g.get(v).size(); j++) {
			if (g.get(v).get(j).other(v) == w) {
				return true;
			}
		}
		return false;
	}

	public Iterable<Edge<Weight>> adj(int v) {
		this.checkOutOfRange(v);
		return g.get(v);
	}
}
