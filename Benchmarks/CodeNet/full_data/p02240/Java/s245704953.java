import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static class Vertex {
		int id;
		int deg;
		int[] neighbors;
		Edge[] edges;
		
		public Vertex(int id, int[] neighbors) {
			this.id = id;
			this.deg = 0;
			this.neighbors = neighbors;
			this.edges = new Edge[neighbors.length];
			for (int i = 0; i < neighbors.length; i++) {
				edges[i] = new Edge(this.id, neighbors[i]);
			}
		}
		
		public boolean hasNeighbor(int id) {
			for (int n : neighbors) {
				if (n == id) {
					return true;
				}
			}
			return false;
		}
		
		public String toString() {
			return "" + this.id + ": " + Arrays.toString(this.neighbors);
		}
		
		public void addNeighbor(int n) {
			this.neighbors = Arrays.copyOf(neighbors, neighbors.length + 1);
			this.neighbors[this.neighbors.length-1] = n;
			this.edges = Arrays.copyOf(edges, edges.length + 1);
			this.edges[this.edges.length-1] = new Edge(this.id, n);
		}
		
		public void addNeighbor(int n, int weight) {
			this.neighbors = Arrays.copyOf(neighbors, neighbors.length + 1);
			this.neighbors[this.neighbors.length-1] = n;
			this.edges = Arrays.copyOf(edges, edges.length + 1);
			this.edges[this.edges.length-1] = new Edge(this.id, n, weight);
		}
		
		public int getWeight(int neighbor) {
			System.out.println("s: " + this.id + "\te:" + neighbor);
			for (int i = 0; i < this.edges.length; i++) {
				if (this.edges[i].e == neighbor) {
					return this.edges[i].w;
				}
			}
			
			return -1;
		}
	}
	
	static class Edge implements Comparable{
		int s;
		int e;
		int w;
		
		public Edge(int source, int dest) {
			this.s = source;
			this.e = dest;
			this.w = -1;
			//dest.deg += 1; // Adds one to the indegree of a Vertex when an edge is created
		}
		
		public Edge(int source, int dest, int weight) {
			this(source, dest);
			this.w = weight;
		}
		
		public int compareTo(Object other) {
			Edge e = (Edge) other;
			return e.w - this.w;
		}
	}
	
	static class DisjointSet {
		int[] parent;
		
		public DisjointSet(Main g) {
			parent = new int[g.vertices.size()];
			for (int i = 0; i < parent.length; i++) {
				parent[i] = i;
			}
		}
		
		public int find(int node) {
			int curr = node;
			if (curr == parent[curr]) { return curr; }
			parent[curr] = find(parent[curr]);
			return parent[curr];
		}
		
		public void union(int x, int y) {
			int a = find(x);
			int b = find(y);
			if (a != b) {
				parent[a] = b;
			}
		}
	}
	
	HashMap<Integer, Vertex> vertices;
	ArrayList<Edge> edges;
	ArrayList<Integer> components;
	
	public Main() {
		vertices = new HashMap<>();
		edges = new ArrayList<>();
		components = new ArrayList<>();
	}
	
	public Main(Vertex[] v) {
		this();
		for (Vertex vertex : v) {
			this.vertices.put(vertex.id, vertex);
			components.add(-1);
		}
		for (Vertex vertex : v) {
			for (int n : vertex.neighbors) {
				this.addEdge(new Edge(vertex.id, n));
			}
		}
		this.getComponents();
	}
	
	public void addVertex(Vertex v) {
		vertices.put(v.id, v);
	}
	
	public void addEdge(Edge e) {
		edges.add(e);
	}
	
	public Vertex get(int id) {
		return this.vertices.get(id);
	}
	
	public DisjointSet buildDJS() {
		DisjointSet djs = new DisjointSet(this);
		
		for (Vertex v : this.vertices.values()) {
			for (int n : v.neighbors) {
				djs.union(n, v.id); // sets the parent of every neighbor to the vertex that connects to it
			}
		}
		
		return djs;
	}
	
	public void getComponents() {
		// Groups all Vertices by how they're connected
		
		/*
		LinkedList<Vertex> s = new LinkedList<>();
		LinkedList<Integer> visited = new LinkedList<>();
		
		Vertex n;
		Vertex curr;
		int group = 0;
		
		while (min(this.components) != 0) {
			s.push(this.get(this.components.indexOf(min(this.components))));
			
			while (!s.isEmpty()) {
				curr = s.pop();
				visited.add(curr.id);
				this.components.set(curr.id, group);
				
				for (int v : curr.neighbors) {
					if (!visited.contains(v)) {
						n = this.get(v);
						s.push(this.get(v));
					}
				}
			}
			
			group++;
		}*/
	}
	
	public static int min(ArrayList<Integer> a) {
		// Min in list
		int m = a.get(0);
		for (Integer i : a) {
			if ( i < m) {
				m = i;
			}
		}
		return m;
	}
	
	public static int[] parse(String[] n) {
		// This is for turning the inputs into int arrays
		int[] r = new int[n.length];
		for (int i = 0; i < r.length; i++) {
			if (!n[i].equals("")) {
				r[i] = Integer.valueOf(n[i]);
			}
		}
		return r;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] counts = parse(in.nextLine().split(" "));
		Vertex[] v = new Vertex[counts[0]];
		
		// Create all the vertices from the input
		int[] c = parse(in.nextLine().split(" "));
		while (c.length > 1) {
			if (v[c[0]] == null) { v[c[0]] = new Vertex(c[0], new int[] {}); }
			if (v[c[1]] == null) { v[c[1]] = new Vertex(c[1], new int[] {}); }
			v[c[0]].addNeighbor(c[1]);
			v[c[1]].addNeighbor(c[0]);
			
			c = parse(in.nextLine().split(" "));
		}
		
		// This loop accounts for vertices with no connections
		for (int i = 0; i < v.length; i++) {
			if (v[i] == null) {
				v[i] = new Vertex(i, new int[] {});
			}
		}
		
		Main g = new Main(v);
		DisjointSet djs = g.buildDJS();

		// Run the queries
		int queries = c[0];
		for (int i = 0; i < queries; i++) {
			c = parse(in.nextLine().split(" "));
			if (djs.find(c[0]) == djs.find(c[1])) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}
}
