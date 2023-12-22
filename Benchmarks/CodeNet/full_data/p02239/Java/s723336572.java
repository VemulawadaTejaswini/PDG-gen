
//template code, C343, 2019
import java.util.LinkedList;
import java.util.Scanner;
import java.util.*;

class Graph {
	private int totalVertex;
	private LinkedList<LinkedList<Integer>> adjList;
	//adjacency list of edges
	public Graph() { totalVertex = 0; }
	public void loadAdjList() {
		Scanner in = new Scanner(System.in);
		totalVertex = in.nextInt();
		adjList = new LinkedList<LinkedList<Integer>>();
		for(int i = 0; i < totalVertex; i ++) {
			LinkedList<Integer> tmp = new LinkedList<Integer>();
			int idx1 = in.nextInt() - 1;
			int degree = in.nextInt();
			for(int j = 0; j < degree; j ++) {
				int idx2 = in.nextInt() - 1;
				tmp.add(idx2);
			}	
			adjList.add(tmp);
		}
		in.close();
	}
	
	public void bfs(Graph g, int source) {
        int[] dist = new int[g.length()]; //shortest path from source to v
        int[] previous = new int[g.length()]; //predecessor of v on the path
         
        //initializations
        for(int i = 0; i < g.length(); i ++) {
            dist[i] = Integer.MAX_VALUE;
            previous[i] = -1; //undefined
        }
        dist[source] = 0; //to itself
        ArrayList<Integer> unsettled = new ArrayList<Integer>(g.length());
        for(int i = 0; i < g.length(); i ++) unsettled.add(i);
         
        //iterate until all vertices "settled" or no more vertices can be reachable from the source
        while(unsettled.isEmpty() == false) {
            int u = getNearest(unsettled, dist); //u: vertex with minimal dist
            unsettled.remove(unsettled.indexOf(u)); //remove u from unsettled
            if(dist[u] == Double.MAX_VALUE) break; //remaining vertices not reachable from source
             
            LinkedList<Integer> neighbors = g.getNeighbors(u);
            for(int j = 0; j < neighbors.size(); j ++) {
                int v = neighbors.get(j);
                if(unsettled.contains(v) == true) {
                	//int weight = g.getWeight(u, v);
                    if(dist[u] + 1 < dist[v]) { //relax along u-v
                        dist[v] = dist[u] + 1;
                        previous[v] = u;
                    }
                }
            }
        }
        for(int i = 0; i < g.length(); i ++) {
            System.out.print(g.getVertex(i) + " ");
            if(dist[i] >= 2147483646 || dist[i] < 0) {
            	System.out.println("-1");
            }else {
            	System.out.println(dist[i]);
            }
        }
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
	int length() { //int length(int index_of_node) {
//		int list_length = adjList.size();
//		if(index_of_node < list_length) {
//			return(adjList.get(index_of_node).size());
//		}else {
//			return -1;
//		}
		return adjList.size();
	}	
	
	LinkedList<Integer> getNeighbors(int index_of_node){
		LinkedList<Integer> neighbors = adjList.get(index_of_node);
		return neighbors;
	}
	int getVertex(int index_of_vertex) { //int getVertex(int index_of_node, int index_of_vertex) {
//		LinkedList<Integer> neighbors = getNeighbors(index_of_node);
//		int vertex = neighbors.get(index_of_vertex);
//		return vertex;
		return index_of_vertex + 1;
	}
}

//change class name GraphRepresentation to Main() for submission to AIZU
public class Main {
	public static void main(String argv[]) {
		Graph g = new Graph();
		g.loadAdjList();
		g.bfs(g, 0);
	}
}

