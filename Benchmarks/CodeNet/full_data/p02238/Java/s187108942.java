
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	ArrayList<Vertex> undiscovered = new ArrayList<>(); // What we haven't searched yet. 
	ArrayList<Vertex> vertices = new ArrayList<>(); // We will use this to access the time values at the end
	int time = 1;	
	
	public static void main(String[] args) {
			
		Main test = new Main();
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		// Initialize the vertices for the specified number of vertices. (Neighbors are not set yet)
		for (int i = 0; i < n; i++) {
			Vertex v = new Vertex(i + 1);
			test.undiscovered.add(v);
			test.vertices.add(v);
		}
		
		// Now we will initialize the neighbors by reading through our input lines
		for (int i = 0; i < n; i++) {
			String[] holder = in.nextLine().split(" ");
			Vertex v = test.undiscovered.get(Integer.parseInt(holder[0]) - 1);
			for (int j = 2; j < holder.length; j++) {
				Vertex neighbor = test.undiscovered.get(Integer.parseInt(holder[j]) - 1);
				v.addNeighbor(neighbor);
			}
		}
		for (Vertex v : test.vertices) {
			test.depthFS(v);
		}		
		for (Vertex v : test.vertices) {
			System.out.println(v.value + " " + v.dv + " " + v.df);
		}
		
		
	}
	
	public void depthFS(Vertex curr) {
		
		// We start by making sure that we still have undiscovered nodes
		if (undiscovered.isEmpty()) {
			return; // If it's empty, then we are done
		}
		
		// Now we check to make sure we haven't already seen the current node. ie. If it's not in undiscovered, we break
		if (curr.disc) {
			return; // We've already seen the node, so we break
		}

		// This node has been discovered now
		this.undiscovered.remove(curr);
		curr.disc = true;
		
		// Now we set the discovery value of the current node to our current time
		curr.dv = time;
		time += 1;
		// Now we are going to expand curr and go through its children
		for (Vertex child : curr.neighbors) {
			this.depthFS(child);
		}		
		curr.df = time;
		time += 1;
	}
	
	
}

class Vertex {
	public ArrayList<Vertex> neighbors = new ArrayList<>();
	public int value;
	public int dv;
	public int df;
	public boolean disc;
	
	public Vertex(int val) {
		value = val;
		disc = false;
	}
	
	public void addNeighbor (Vertex n) {
		neighbors.add(n);
	}
	
	public String toString() {
		return "" + this.value + " " + this.dv + " " + this.df;
	}
}

