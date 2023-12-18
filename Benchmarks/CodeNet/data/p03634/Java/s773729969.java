import java.io.PrintWriter;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Vector;

public class Main {
	static Node[] nodes;
	static int src;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		int e = n - 1;
		nodes = new Node[n];
		for (int i = 0; i < n; i++) nodes[i] = new Node(i);
		for (int i = 0; i < e; i++) {
			int from = Integer.parseInt(sc.next()) - 1;
			int to = Integer.parseInt(sc.next()) - 1;
			double len = Integer.parseInt(sc.next());
			nodes[from].edges.add(new Edge(nodes[from], nodes[to], len));
			nodes[to].edges.add(new Edge(nodes[to], nodes[from], len));
		}
		int q = Integer.parseInt(sc.next());
		src = Integer.parseInt(sc.next()) - 1;
		PFSearch dj = new PFSearch(nodes);
		dj.solve(nodes[src]);
		for (int i = 0; i < q; i++) {
			int x = Integer.parseInt(sc.next()) - 1;
			int y = Integer.parseInt(sc.next()) - 1;
			out.println((long)(dj.nodes[x].value + dj.nodes[y].value));
		}
		out.flush();
	}
	public static class Node implements Comparable {
		int id;
		double value;
		Node via;
		Vector<Edge> edges;
		public Node(int id) {
			this.id = id;
			this.value = Double.MAX_VALUE;
			this.via = null;
			this.edges = new Vector<Edge>();
		}
		public int compareTo(Object o) {
			if (!(o instanceof Node)) throw new IllegalArgumentException("Node needed");
			Node x = (Node)o;
			return (this.value > x.value)? 1 :
				((this.value < x.value)? (-1) : 0);
		}
	}
	public static class Edge {
		Node src;
		Node dst;
		double value;
		public Edge(Node src,Node dst,double value) {
			this.src = src;
			this.dst = dst;
			this.value = value;
		}
	}
	public static class PFSearch {
		Node[] nodes;
		public PFSearch(Node[] nodes) {
			this.nodes = nodes;
		}
		public void solve(Node src) {
			PriorityQueue<Node> q = new PriorityQueue<Node>();
			for (int i = 0; i < nodes.length; i++) {
				nodes[i].value = Double.MAX_VALUE;
				q.add(nodes[i]);
			}
			q.remove(src);
			src.value = 0;
			q.offer(src);
			while (q.size() > 0) {
				Node x = q.poll();
				if (x.value == Double.MAX_VALUE) return;
				for (Iterator<Edge> it = x.edges.iterator(); it.hasNext(); ) {
					Edge e = it.next();
					Node y = e.dst;
					double newValue = x.value + e.value;
					if (newValue < y.value) {
						if (q.remove(y)) {
							y.value = newValue;
							y.via = x;
							q.offer(y);
						}
					}
				}
			}
		}
		public Node[] getPath(int id) {
			Vector<Node> v = new Vector<Node>();
			for (Node node = nodes[id]; node != null; node=node.via) v.add(node);
			for (int i = 0; i < v.size() / 2; i++) {
				int j = v.size() - 1 - i;
				Node tmp = v.get(i);
				v.set(i, v.get(j));
				v.set(j, tmp);
			}
			return v.toArray(new Node[0]);
		}
	}
}