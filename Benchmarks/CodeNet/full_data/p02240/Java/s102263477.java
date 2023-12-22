import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {
	static DisjointSet set;
	
	public static void buildSet(Graph g) {
		set = new DisjointSet(g);
	}
	public static boolean connected(int first, int second){
		return set.find(first) == set.find(second);
	}
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int users = scan.nextInt();
		int relations = scan.nextInt();
		
		Graph g = new Graph();
		int id, connection;
		for(int i = 0; i < relations; i++) {
			id = scan.nextInt();
			connection = scan.nextInt();
			g.addConnection(new Vertex(id, new int[] {connection}));
		}
		
		buildSet(g);
		
		int queries = scan.nextInt();
		for(int i = 0; i < queries; i++) {
			id = scan.nextInt();
			connection = scan.nextInt();
			System.out.println(connected(id, connection) ? "yes" : "no");
		}
		scan.close();
	}
}

class DisjointSet{
	int[] parent;
	
	public DisjointSet(Graph g) {
		HashMap<Integer, ArrayList<Integer>> graph = g.getGraph();
		ArrayList<Integer> ids = new ArrayList<Integer>(graph.keySet());
		int max = getMax(ids);
		
		if(max > 0)
			parent = new int[max + 1];
		else
			parent = new int[0];

		for(int i = 0; i < parent.length; i++)
			parent[i] = i;
		
		for(Integer id: ids) {
			for(Integer neighbor: graph.get(id))
				union(neighbor, id);
		}
		// displayParent(); // for debugging
	}
	
	public void union(int x, int y) {
		int r1 = find(x);
		int r2 = find(y);
		if(r1 != r2)
			parent[r1] = r2;
	}
	
	public int find(int x) {
		if(parent.length == 0)
			return x;
		if(parent.length <= x)
			return x;
		
		int current = x;
		if(parent[current] == current)
			return current;
		parent[current] = find(parent[current]);
		return parent[current];
	}
	
	public int getMax(ArrayList<Integer> nums) {
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < nums.size(); i++) {
			if(nums.get(i) > max)
				max = nums.get(i);
		}
		
		return max;
	}
	
	public void displayParent() {
		System.out.println();
		String indexStr = "{";
		String arrStr = "{";
		for(int i = 0; i < parent.length; i++) {
			indexStr += i + ", ";
			arrStr += parent[i] + ", ";
		}
		indexStr = indexStr.substring(0, indexStr.length() - 2) + "}";
		arrStr = arrStr.substring(0, arrStr.length() - 2) + "}";
		
		System.out.println(indexStr);
		System.out.println(arrStr);
	}
}

class Graph{
	private HashMap<Integer, ArrayList<Integer>> graph;
	
	public Graph(ArrayList<Vertex> vertices) {
		graph = new HashMap<Integer, ArrayList<Integer>>();
		for(Vertex v: vertices)
			addConnection(v);
	}
	public Graph(Vertex[] vertices) {
		graph = new HashMap<Integer, ArrayList<Integer>>();
		for(int i = 0; i < vertices.length; i++)
			addConnection(vertices[i]);
	}
	public Graph() {
		graph = new HashMap<Integer, ArrayList<Integer>>();
	}
	
	public void addConnection(Vertex v) {
		ArrayList<Integer> connections = graph.containsKey(v.getID()) ? graph.get(v.getID()) : new ArrayList<Integer>();
		ArrayList<Integer> neighbors = v.getConnections();
		for(Integer neighbor: neighbors) {
			if(!connections.contains(neighbor))
				connections.add(neighbor);
		}
		
		Collections.sort(connections);
		graph.put(v.getID(), connections);
		
		ArrayList<Integer> neighborConnections;
		for(Integer neighbor: neighbors) {
			neighborConnections = graph.containsKey(neighbor) ? graph.get(neighbor) : new ArrayList<Integer>();
			if(!neighborConnections.contains(v.getID()))
				addConnection(new Vertex(neighbor, new int[] {v.getID()}));
		}
	}
	
	public HashMap<Integer, ArrayList<Integer>> getGraph() {
		return graph;
	}
	public int getNumVertices() {
		return graph.size();
	}
	public String toString() {
		return graph.toString();
	}
}

class Vertex{
	private int id;
	private ArrayList<Integer> connections;
	
	public Vertex(int id, ArrayList<Integer> connections) {
		this.id = id;
		this.connections = connections;
	}
	public Vertex(int id, int[] cons) {
		this.id = id;
		connections = new ArrayList<Integer>();
		for(int i = 0; i < cons.length; i++)
			connections.add(cons[i]);
	}
	
	public void addConnection(int n) {
		if(!connections.contains(n))
			connections.add(n);
		Collections.sort(connections);
		
	}
	
	public int getID() {
		return id;
	}
	public ArrayList<Integer> getConnections() {
		return connections;
	}
	
	public String toString() {
		return id + " -> " + connections;
	}
}


