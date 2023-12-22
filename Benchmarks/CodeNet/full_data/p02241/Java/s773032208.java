
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Arrays;
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
		int w;
		for(i = 0; i < totalVertex; i ++) {
			for(j = 0; j < totalVertex; j ++) {
				w = in.nextInt();
				if(w > -1) {
					adjMatrix[i][j] = 1;
				}
				adjWeight[i][j] = w;
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
	public int MinSpan(int s) {
		// create array to store distances
		// initialize source node to 0 and rest to max value
		int[] dist = new int[totalVertex];
		int[] prev = new int[totalVertex];
		

		for(int i = 0; i < totalVertex; i++) {
			dist[i] = Integer.MAX_VALUE;
			prev[i] = -1;
		}
		
		dist[s] = 0;
		LinkedList<Integer> q = new LinkedList<Integer>();
		while(q.size()!=totalVertex) {
			int nearest = getUnsettledNearest(dist);
			if(dist[nearest] == Integer.MAX_VALUE) break;
			ifSettled[nearest] = true;
			q.add(nearest);
			for(int neighbor : getUnsettledNeighbors(nearest)) {
				if(getWeight(nearest, neighbor) < dist[neighbor]) {
					dist[neighbor] = getWeight(nearest, neighbor);
					//prev[neighbor] = nearest;
				}
			}
		}
		

        int totalWeight = 0;
        for(int i = 0; i < totalVertex; i ++) {
            
               if(dist[i]!=Integer.MAX_VALUE) totalWeight += dist[i];
            
        }
        return totalWeight;
	}
}

public class Main {
	public static void main(String[] argv) {
		Graph2 g = new Graph2();
		g.loadAdjMatrix();
		System.out.println(g.MinSpan(0));
		
	}
}


