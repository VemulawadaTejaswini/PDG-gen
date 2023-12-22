import java.io.*;
import java.util.*;
class Graph2 {
	private int[] dist;
	private int[] visited;
	private int[] indgree;
	LinkedList<Integer> sorting = new LinkedList<Integer>();
	private int totalVertex;
	private LinkedList<LinkedList<Integer>> adjList;
	//adjacency list of edges
	/*public void addEdges(int i, int j) {
		adjList.get(i).add(j);
	}*/
	public Graph2() { totalVertex = 0; }
	public void loadAdjList() {
		Scanner in = new Scanner(System.in);
		totalVertex = in.nextInt();
		adjList = new LinkedList<LinkedList<Integer>>();
		dist = new int[totalVertex];
		indgree = new int[totalVertex];
		/*for (int i = 0; i < dist.length; i++) {
			dist[i] = -1;
		}*/
		visited = new int[totalVertex];
		for (int j = 0; j < visited.length; j++) {
			visited[j] = 0;
		}
		for(int i = 0; i < totalVertex; i ++) {
			LinkedList<Integer> tmp = new LinkedList<Integer>();
			adjList.add(tmp);
		}
		int totalEdges = in.nextInt(); 
		for (int k = 0; k < totalEdges; k++) {
			int source = in.nextInt();
			int target = in.nextInt();
			adjList.get(source).add(target);
			indgree[target]++;
		}
		in.close();
	}
	public void DFS(int v) {
		for(int k : adjList.get(v)) {
			if (visited[k] == 0) {
				visited[k] = 1;
				DFS(k);
			}
		}
		sorting.addFirst(v);
	}
	public void ST() {
		for(int i = 0; i < totalVertex; i++) {
			if (indgree[i] == 0) {
				DFS(i);
			}	
		}
		while(!sorting.isEmpty()) {
			 System.out.println(sorting.remove());	
	}
	}
}
public class Main {
	public static void main(String argv[]) {
		Graph2 g = new Graph2();
		g.loadAdjList();
		g.ST();
	}
}
