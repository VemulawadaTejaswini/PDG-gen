import java.util.LinkedList;
import java.util.Scanner;
import java.util.ArrayList;


class Graph {
	private int totalVertex;
	private LinkedList<LinkedList<Integer>> adjList;
	private int[] visited;
	private int[] dist;
	
	//adjacency list of edges
	public Graph() { totalVertex = 0; }
	public void loadAdjList() {
		Scanner in = new Scanner(System.in);
		totalVertex = in.nextInt();
		adjList = new LinkedList<LinkedList<Integer>>();
		visited = new int[totalVertex];
		dist = new int[totalVertex];
		for(int i = 0; i< totalVertex; i++) {
			dist[i] = -1;
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
		for(int i = 0; i < totalVertex; i++) {
			System.out.println(i + 1 + " " + dist[i]);
		}
	}
	
	public void BFS() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(0);
	    dist[0] = 0;
	    while(arr.size() > 0) {
	        //first-in, first-visit; if queue is used, use its dequeue() function
	        int v = arr.remove(0); 
	        visited[v] = 1;
	        LinkedList<Integer> nextTo = adjList.get(v);
	        for(int i = 0; i < nextTo.size(); i ++) {
	            int v1 = nextTo.get(i);
	            if((visited[v1] == 0) && (arr.contains(v1) == false)) {
	            	arr.add(v1);
	                dist[v1] = dist[v] + 1;
	                visited[v1] = 1;
	            }
	        }
	    }
		
		
	}
}

public class Main {
	public static void main(String argv[]) {
		Graph g = new Graph();
		g.loadAdjList();
		g.BFS();
		g.printAdjMatrix();
	}
}
