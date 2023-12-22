import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;

class Graph {
	private int totalVertex;
	//adjMatrix[u][v] = 1 if there is an edge from u to v, otherwise 0
	private int[][] adjMatrix;
	//adjWeight[u][v] -- the weight of the edge from u to v if there is one
	private int[][] adjWeight;
	//if a node is settled (e.g., processed in the Dijkstra's algorithm)
	private Boolean[] ifSettled;
	public Graph() { totalVertex = 0; }
	public int getTotalVertex() { return totalVertex; }
	//load graph from standard input
	public void loadAdjMatrix() {
		Scanner in = new Scanner(System.in);
		totalVertex = in.nextInt();
		adjMatrix = new int[totalVertex][totalVertex];
		adjWeight = new int[totalVertex][totalVertex];
		ifSettled = new Boolean[totalVertex];
		int i, j;
		for(i = 0; i < totalVertex; i ++) {
			ifSettled[i] = false;
			for(j = 0; j < totalVertex; j ++) {
				adjMatrix[i][j] = adjWeight[i][j] = 0;
			}
		}
		int u, v;
		for(i = 0; i < totalVertex; i ++) {
			u = in.nextInt();
			int degree = in.nextInt();
			for(j = 0; j < degree; j ++) {
				v = in.nextInt(); 
				adjMatrix[u][v] = 1;
				adjWeight[u][v] = in.nextInt();
			}	
		}
		in.close();
	}
	
	public void printGraph() {
		for (int i = 0; i < this.adjWeight.length; i++) {
			for (int j = 0; j < this.adjWeight.length; j++) {
				System.out.print(this.getWeight(i, j) + " ");
			}
			System.out.println();
		}
	}
	
	//return weight of the edge from u to v if there is one
	public int getWeight(int u, int v) {
		return this.adjWeight[u][v];
	}
	
	//return neighbors of u as a LinkedList
	public LinkedList<Integer> getNeighbors(int u) {
		LinkedList<Integer> tmp = new LinkedList<Integer>();
		for(int v = 0; v < totalVertex; v ++) {
			if(adjMatrix[u][v] == 1) tmp.add(v);
		}
		return tmp;
	}
	
	//return unsettled neighbors of u as a LinkedList
	public LinkedList<Integer> getUnsettledNeighbors(int u) {
		LinkedList<Integer> tmp = new LinkedList<Integer>();
		for(int v = 0; v < totalVertex; v ++) {
			if((adjMatrix[u][v] == 1) && (ifSettled[v] == false)) tmp.add(v);
		}
		return tmp;
	}
	
	//return the unsettled node that has the smallest dist
	public int getUnsettledNearest(int[] dist) {
		int md = Integer.MAX_VALUE;
		int mv = -1;
		int v;
		for(v = 0; v < totalVertex; v ++) {
			if((ifSettled[v] == false) && (dist[v] < md)) {
				md = dist[v];
				mv = v;
			}
		}
		return mv;
	}
	
	public int findNextItem(int[] inQueue) {
		int min = -10;
		int index = -1;
		for (int i = 0; i < inQueue.length; i++) {
			if ((inQueue[i] < min || min == -10) && inQueue[i] >= 0) {
				min = inQueue[i];
				index = i;
			}
		}
		return index;
	}
	
	//implement the following	
	public int[] Dijkstra(int start) {
		int[] distance = new int[this.adjWeight.length];
		int[] inQueue = new int[this.adjWeight.length];
		boolean[] storage = new boolean[this.adjWeight.length];
		for (int i = 0; i < this.adjWeight.length; i++) {
			inQueue[i] = -1;
			distance[i] = -1;
			storage[i] = false;
		}
		inQueue[0] = 0;
		distance[0] = 0;
		int nextItem = findNextItem(inQueue);
		while (nextItem != -1) {
			for (int i = 0; i < this.adjWeight.length; i++) {
				if (this.adjWeight[nextItem][i] != 0) {
					if (distance[i] == -1 || distance[i] > (distance[nextItem] + this.adjWeight[nextItem][i])) {
						distance[i] = distance[nextItem] + this.adjWeight[nextItem][i];
						if (!storage[i]) {
							inQueue[i] = distance[i];
						}
					}
				}
			}
			storage[nextItem] = true;
			inQueue[nextItem] = -1;
			nextItem = findNextItem(inQueue);
		}
		return distance;
	}
}

public class Main {
	public static void main(String[] argv) {
		Graph g = new Graph();
		g.loadAdjMatrix();
		int[] dist = g.Dijkstra(0);
		for(int i = 0; i < g.getTotalVertex(); i ++) {
			System.out.println(i + " " + dist[i]);
		}
	}
}

