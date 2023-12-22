import java.util.LinkedList;
import java.util.Scanner;
import java.util.ArrayList;


class Graph {
	private int totalVertex;
	private LinkedList<LinkedList<Integer>> adjList;
	private int[] visited;
	private int[] distance;
	
	//adjacency list of edges
	public Graph() { totalVertex = 0; }
	public void loadAdjList() {
		Scanner in = new Scanner(System.in);
		totalVertex = in.nextInt();
		adjList = new LinkedList<LinkedList<Integer>>();
		visited = new int[totalVertex];
		distance = new int[totalVertex];
		for(int i = 0; i< totalVertex; i++) {
			distance[i] = -1;
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
	public void printAdjMatrix() {
		for(int k = 0; k < totalVertex; k++ ) {
			System.out.println(k + 1 + " " + distance[k]);
		}
	}
	
	public void BFS() {
		ArrayList<Integer> toVisit = new ArrayList<Integer>();
	    toVisit.add(0);
	    distance[0] = 0;
	    while(toVisit.size() > 0) {
	        //first-in, first-visit; if queue is used, use its dequeue() function
	        int v = toVisit.remove(0); 
	        visited[v] = 1;
	        LinkedList<Integer> neighbors = adjList.get(v);
	        for(int i = 0; i < neighbors.size(); i ++) {
	            int v1 = neighbors.get(i);
	            if((visited[v1] == 0) && (toVisit.contains(v1) == false)) {
	                toVisit.add(v1);
	                distance[v1] = distance[v] + 1;
	                visited[v1] = 1;
	            }
	        }
	    }
		
		
	}
}

//change class name GraphRepresentation to Main() for submission to AIZU
public class Main {
	public static void main(String argv[]) {
		Graph g = new Graph();
		g.loadAdjList();
		g.BFS();
		g.printAdjMatrix();
	}
}
