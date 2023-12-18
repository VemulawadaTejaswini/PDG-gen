
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		Integer N = Integer.parseInt(sc.next());
		Node v[] = new Node[N];
		int c[] = new int[N-1];
		for(int i=0;i<N;i++){
			v[i] = new Node(i);
		}
		Edge e[] = new Edge[N-1];
		for(int i=0;i<N-1;i++) {
			e[i] = new Edge(v[Integer.parseInt(sc.next())-1],v[Integer.parseInt(sc.next())-1],Integer.parseInt(sc.next()));
		}
		int Q = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		int x[] = new int[Q];
		int y[] = new int[Q];
		for(int i=0;i<Q;i++) {
			x[i] = Integer.parseInt(sc.next());
			y[i] = Integer.parseInt(sc.next());
		}
		
		Graph.search(v[K-1],v[K-1],0);



		long result = 0;
		for(int i=0;i<Q;i++) {
			result = v[x[i]-1].d + v[y[i]-1].d;
			out.println(result);
		}


		out.flush();
	}
}

class Node{
	int id;
	long d;
	Node prev = null;
	ArrayList<Edge> edges = new ArrayList<>();

	public Node(int id) {
		this.id = id;
		this.d = Integer.MAX_VALUE;
	}

	public void Reset() {
		this.d = Integer.MAX_VALUE;
		this.prev = null;
	}

	public void Reload_dist(long dist) {
		this.d = dist;
	}

	public void Reload_prev(Node v) {
		this.prev = v;
	}

	@Override public Node clone() {
		return new Node(this.id);
	}

	public void Connect(Edge e) {
		edges.add(e);
	}
}

class Edge{
	Node v1, v2;
	int cost;
	public Edge(Node id1,Node id2, int c) {
		this.v1 = id1;
		this.v2 = id2;
		this.cost = c;
		v1.Connect(this);
		v2.Connect(this);
	}

	public Node First_one() {
		return this.v1;
	}

	public Node Second_one() {
		return this.v2;
	}

	public Node Other_one(Node v) {
		if(v.equals(this.v1)) {
			return this.v2;
		}
		else {
			return this.v1;
		}
	}
}

class MyComparator implements Comparator<Node>{
	@Override public int compare(Node u,Node v) {

		int num1 = u.id;
		int num2 = v.id;
		if(num1 > num2) {
			return 1;
		}
		else if(num1 < num2) {
			return -1;
		}
		else {
			return 0;
		}
	}
}

class Graph{
	static Node[] nodes;
	static Edge[] edges;

	public Graph(Node[] v,Edge[] e) {
		Graph.nodes = v;
		Graph.edges = e;
	}

	public int size() {
		return nodes.length;
	}

	public boolean Bellman_Ford(Node s) {
		boolean negative_loop[] = new boolean[size()];
		Arrays.fill(negative_loop, false);
		s.Reload_dist(0);
		for(int i=0;i<size();i++) {
			for(Node v : nodes) {
				for(Edge e : v.edges) {
					if((v.d != Long.MAX_VALUE && e.Other_one(v).d > v.d + e.cost)) {
						e.Other_one(v).Reload_dist(v.d + e.cost);
						negative_loop[e.Other_one(v).id] = true;
					}
					if(i==size()-1) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public static long search(Node current,Node from,long dist) {
		for(Edge e:current.edges) {
			Node searching = e.Other_one(current);
			if(searching!=from) {
				searching.Reload_dist(dist + e.cost);
				search(searching,current,searching.d);
			}
		}
		return current.d;
	}
}

