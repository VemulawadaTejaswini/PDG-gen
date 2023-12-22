
import java.util.ArrayList;
import java.util.Scanner;
import java.util.LinkedList;

public class Main {
	ArrayList<Vertex> nodes = new ArrayList<>();
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] holder = in.nextLine().split(" ");
		int n = Integer.parseInt(holder[0]);
		int m = Integer.parseInt(holder[1]);
		Main graph = new Main();
		for (int i = 0; i < n; i++) {
			Vertex v = new Vertex(i);
			graph.addVertex(v);
		}
		for (int i = m; i > 0; i--) {
			String[] relation = in.nextLine().split(" ");
			int s = Integer.parseInt(relation[0]);
			int t = Integer.parseInt(relation[1]);
			Vertex sv = graph.getVertex(s);
			Vertex tv = graph.getVertex(t);
			sv.addNeighbor(tv);
			tv.addNeighbor(sv);
		}
		
		int q = Integer.parseInt(in.nextLine());
		for (int i = q; i > 0; i--) {
			String[] query = in.nextLine().split(" ");
			int s = Integer.parseInt(query[0]);
			int t = Integer.parseInt(query[1]);
			Vertex start = graph.getVertex(s);
			Vertex end = graph.getVertex(t);
			LinkedList<Vertex> fringe = new LinkedList<>();
			ArrayList<Vertex> searched = new ArrayList<>();
			fringe.add(start);
			boolean found = graph.BFS(start, end, fringe, searched);
			if (found) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
		}
		
		
	}	
		
	public void addVertex(Vertex v) {
		nodes.add(v);
	}
	
	public Vertex getVertex(int index) {
		return nodes.get(index);
	}
	
	// Performs DFS from a specified starting node and returns true if the end can be reached from it
	// False otherwise
	public boolean BFS(Vertex start, Vertex end, LinkedList<Vertex> fringe, ArrayList<Vertex> searched) {	
		if (fringe.isEmpty()) {
			return false;
		}
		else if (start.equals(end)) {
			return true;
		}
		else {
			
			Vertex pull = fringe.poll();
			searched.add(pull);
			for (Vertex neigh : pull.neighbors) {
				if (neigh.equals(end)) {
					return true;
				} else if (searched.contains(neigh)) {
					
				}
				else {
					fringe.add(neigh);
				}
			}
			return BFS(pull, end, fringe, searched);
		}
	}
	
}

class Vertex {
	public ArrayList<Vertex> neighbors = new ArrayList<>();
	public int value;
	public boolean disc;
	
	public Vertex(int val) {
		value = val;
		disc = false;
	}
	
	public void addNeighbor (Vertex n) {
		neighbors.add(n);
	}
	
	public String toString() {
		return "" + this.value + " ";
	}
	
	public boolean equals(Vertex v) {
		if (this.value == v.value) {
			return true;
		}
		else {
			return false;
		}
	}
}


