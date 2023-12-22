
import java.util.LinkedList;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

class Graph2 {
	private int totalVertex;
	//adjMatrix[u][v] = 1 if there is an edge from u to v, otherwise 0
	private int[][] adjMatrix;
	//adjWeight[u][v] -- the weight of the edge from u to v if there is one
	private int[][] adjWeight;
	//if a node is settled (e.g., processed in the Dijkstra's algorithm)
	private Boolean[] ifSettled;
	public Graph2() { totalVertex = 0; }
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
		for(i = 0; i < totalVertex; i ++) {
			for(j = 0; j < totalVertex; j ++) {
				int v = in.nextInt();
				if (v != -1) {
					adjMatrix[i][j] = 1;
					adjWeight[i][j] = v;
				}
			}	
		}
		in.close();
	}
	//return weight of the edge from u to v if there is one
	public int getWeight(int u, int v) {
		return adjWeight[u][v];
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
	//implement the following	
	public int Dijkstra(int s) {
		int total = 0;
		int[] dist = new int[totalVertex];
		
		for(int i =0; i < totalVertex; i++) {
			dist[i] = Integer.MAX_VALUE;
		}
		dist[s] = 0;
		ArrayList<Integer> unsettled = new ArrayList<Integer>(totalVertex);
		for(int j = 0; j < totalVertex; j++) {
			unsettled.add(j);
		}
		while(unsettled.isEmpty() == false) {
			int a = getUnsettledNearest(dist);
			unsettled.remove(unsettled.indexOf(a));
			if(dist[a] == Double.MAX_VALUE) {
				break;
			}
			ifSettled[a] = true;
			
			LinkedList<Integer> list = getUnsettledNeighbors(a);
				for(int k = 0; k < list.size(); k++) {
					dist[list.get(k)] = Math.min(getWeight(list.get(k), a), dist[list.get(k)]); 
			}
		}
		for (int p : dist) total += p;
			return total;
		
		
	}
}

public class Main {
	public static void main(String[] argv) {
		Graph2 g = new Graph2();
		g.loadAdjMatrix();
		int dist = g.Dijkstra(0);
		System.out.println(dist);
	
	}
}
