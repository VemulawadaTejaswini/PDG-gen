
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Graph<T> {

	private HashMap<T, Set<T> > graph;

	public Graph() {
		this.graph = new HashMap<T, Set<T> >();
	}

	public void addNode(T node) {
		if (! this.graph.containsKey(node)) {
			this.graph.put(node, new HashSet<T>());
		}
	}

	public void addEdge(T src, T dest) {
		this.graph.get(src).add(dest);
	}

	public Set<T> getEdges(T node) {
		return this.graph.get(node);
	}

	public Set<T> getNodes() {
		return this.graph.keySet();
	}

	private boolean has_cycle(T node, Set<T> active, Set<T> seen) {

		if (seen.contains(node)) {
			return false;
		}
		seen.add(node);
		active.add(node);
		for (T next_node : this.getEdges(node)) {
			if (active.contains(next_node) || this.has_cycle(next_node, active, seen)) {
				return true;
			}
		}
		active.remove(node);
		return false;
	}

	public Set<T> find_cycle(T start_node) {

		Set<T> seen = new HashSet<T>();
		Set<T> active = new HashSet<T>();

		this.has_cycle(start_node, active, seen);
		return active;

	}

	/*
	static class Node {

		int num;


		Node(int num) {
			this.num = num;
		}

	}

	static class Edge {

		Node src;
		Node dest;

		Edge(Node src, Node dest) {
			this.src = src;
			this.dest = dest;
		}

	}
	*/


}

public class Main {


	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Graph<Integer> graph = new Graph<Integer>();

		int v = scan.nextInt();
		int e = scan.nextInt();
		for (int i = 0; i < e; i++) {
			int s = scan.nextInt();
			int t = scan.nextInt();

			graph.addNode(s);
			graph.addNode(t);
			graph.addEdge(s, t);
		}

		for (int n : graph.getNodes()) {
			if (graph.find_cycle(n).size() > 0) {
				Set<Integer> a = graph.find_cycle(n);
				for(int b:a) {
					System.out.println(b);
				}
				return;
			}
		}
		System.out.println("-1");
	}

}