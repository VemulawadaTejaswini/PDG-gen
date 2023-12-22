
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;

class Graph {
	private int[] dist;
	private int[] visited;
	private int totalVertex;
	private LinkedList<LinkedList<Integer>> adjList;
	//adjacency list of edges
	public Graph() { totalVertex = 0; }
	public void loadAdjList() {
		Scanner in = new Scanner(System.in);
		totalVertex = in.nextInt();
		adjList = new LinkedList<LinkedList<Integer>>();
		dist = new int[totalVertex];
		for (int i = 0; i < dist.length; i++) {
			dist[i] = -1;
		}
		visited = new int[totalVertex];
		for (int j = 0; j < visited.length; j++) {
			visited[j] = 0;
		}
		for(int i = 0; i < totalVertex; i ++) {
			LinkedList<Integer> tmp = new LinkedList<Integer>();
			int idx1 = in.nextInt() - 1;
			int degree = in.nextInt();
			//System.out.println("mark idx1 = " + idx1 + " degree = " + degree);
			for(int j = 0; j < degree; j ++) {
				int idx2 = in.nextInt() - 1;
				tmp.add(idx2);
			}	
			adjList.add(tmp);
		}
		in.close();
	}
	public int[] BFS(int v) {
		LinkedList<Integer> toVisit = new LinkedList<Integer>();
		toVisit.add(v);
		visited[v] = 1;
		dist[v] = 0;
		while(!toVisit.isEmpty()) {
			int u = toVisit.remove();
		    for(int i = 0; i < adjList.get(u).size(); ++i) {
		    	int k = adjList.get(u).get(i);
		    	if (visited[k] == 0) {
		    		visited[k] = 1;
		    		toVisit.add(k);
		    		dist[k] = dist[u] + 1;
		    	}
		   
		    }
		   
		}
		for (int k = 0; k < dist.length; k++) {
		System.out.println(k+1 + " " + dist[k]);
		
	}
		return dist;
}
}
//change class name GraphRepresentation to Main() for submission to AIZU
public class Main {
	public static void main(String argv[]) {
		Graph g = new Graph();
		g.loadAdjList();
		int[] dist = g.BFS(0);
	}
}
