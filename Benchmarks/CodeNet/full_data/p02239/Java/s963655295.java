import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Graph g = new Graph();
		g.loadAdjList();
		g.BFS(0);

	}

}

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
			//System.out.println("mark idx1 = " + idx1 + " degree = " + degree);
			for(int j = 0; j < degree; j ++) {
				int idx2 = in.nextInt() - 1;
				tmp.add(idx2);
			}	
			adjList.add(tmp);
		}
		in.close();
}
	int[] distances;
	int[] visited;
public void printAdjMatrix() {
	Integer[][] adjMatrix = new Integer[totalVertex][totalVertex];
	//complete the following
	for(int i = 0; i < totalVertex; i++) {
		for(int j = 0; j < totalVertex; j++) {
			adjMatrix[i][j] = 0;
		}
	}
	for(int i = 0; i < totalVertex; i++) {
		for(int j = 0; j < adjList.get(i).size(); j++) {
				adjMatrix[i][adjList.get(i).get(j)] = 1;
		}
	}
	for(int i = 0; i < totalVertex; i++) {
		for(int j = 0; j < totalVertex - 1; j++) {
			System.out.print(adjMatrix[i][j] + " ");
		}
		System.out.println(adjMatrix[i][totalVertex - 1]);
	}
}

public void BFS(int v) {
	int[] distances = new int[adjList.size()];
	int[] visited = new int[adjList.size()];
	//LinkedList<Integer> nb = adjList.get(v);
	Queue<Integer> vertexes = new LinkedList<Integer>();
	vertexes.add(v);
	visited[v] = 1;
	while(true) {
		int next = vertexes.poll();
		for(int j = 0; j < adjList.get(next).size(); j++) {
			if(visited[adjList.get(next).get(j)] == 0) {
				vertexes.add(adjList.get(next).get(j));
				distances[adjList.get(next).get(j)] = distances[next] + 1;
				visited[adjList.get(next).get(j)] = 1;
			}
		}
		if(vertexes.isEmpty()) {
			break;
		}
	
	}
	for(int i = 0; i < distances.length; i++) {
		if(visited[i] == 0) {
			distances[i] = -1;
		}
		System.out.println(i+1 +  " " + Integer.toString(distances[i]));
	}

}


/*public void BFS(int v, int d0) {
	distances = new int[adjList.size()];
	visited = new int[adjList.size()];
	
	int d = d0;
	Queue<Integer> nb = adjList.get(v);
	while(!nb.isEmpty()) {
		int w = nb.poll();
		if(visited[w] == 0) {
			visited[w] = 1;
			distances[w] = d + 1;
			d++;
		}
	}
	for(int i = 0; i < distances.length; i++) {
		System.out.println(distances[i]);
	}
	//distances[v] = d;
	//return distances[v];
}*/


}

