import java.util.LinkedList;
import java.util.Scanner;
import java.util.ArrayList;
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
	public int[] Dijkstra(int s) {
		int[] distance = new int[totalVertex]; 
        int[] previous = new int[totalVertex]; 
         
        for(int i = 0; i < totalVertex; i ++) {
            distance[i] = Integer.MAX_VALUE;
            previous[i] = -1; 
        }
       
        distance[s] = 0; 
        ArrayList<Integer> unsettled = new ArrayList<Integer>(totalVertex);
        for(int i = 0; i < totalVertex; i ++) unsettled.add(i);
         
        while(unsettled.isEmpty() == false) {
            int u = getNearest(unsettled, distance); 
            unsettled.remove(unsettled.indexOf(u));
            if(distance[u] == Double.MAX_VALUE) break; 
             
            LinkedList<Integer> neighbors = this.getNeighbors(u);
            for(int j = 0; j < neighbors.size(); j ++) {
                int v = neighbors.get(j);
                if(unsettled.contains(v) == true) {
                    if(distance[u] +this.getWeight(u, v) < distance[v]) { 
                        distance[v] = distance[u] +this.getWeight(u, v);
                        previous[v] = u;
                    }
                }
            }
        }
//        
//        System.out.println("Adj matrix:");
//        for(int i=0; i< totalVertex; i++) {
//        	for(int j=0; j< totalVertex; j++) {
//        		System.out.print(adjMatrix[i][j] + " ");
//        	}
//        	System.out.println();
//        }
//        System.out.println("Adj weight:");
//        for(int i=0; i< totalVertex; i++) {
//        	for(int j=0; j< totalVertex; j++) {
//        		System.out.print(adjWeight[i][j] + " ");
//        	}
//        	System.out.println();
//        }
        return distance;
	}

	int length() {
		return totalVertex;
	}	
    public int getNearest(ArrayList<Integer> vlist, int[] dist) {
        int v = vlist.get(0);
        double minDis = dist[v];
        for(int i = 1; i < vlist.size(); i ++) {
            if(dist[vlist.get(i)] < minDis) {
                v = vlist.get(i);
                minDis = dist[v];
            }
        }
        return v;
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
