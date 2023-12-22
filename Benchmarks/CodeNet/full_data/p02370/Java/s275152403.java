import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;

class Graph {
	private int totalVertex;
	private int totalEdge;
	private int[][] adjList;
	private int[] degree1;
	private int[] degree2;
	private int[] visited;
	private LinkedList<Integer> previsit = new LinkedList<Integer>();
	private LinkedList<Integer> postvisit = new LinkedList<Integer>();
	public Graph() {
		degree1 = null;
		degree2 = null;
		totalVertex = 0;
		totalEdge = 0;
		totalVertex = 0;
		adjList = null;
	}

	public void loadList() {
		Scanner in = new Scanner(System.in);
		totalVertex = in.nextInt();
		totalEdge = in.nextInt();
		degree1 = new int[totalVertex];
		degree2 = new int[totalVertex];
		adjList = new int[totalVertex][totalVertex];
		for (int i = 0; i < totalVertex; i++) {
			degree1[i] = 0;
			degree2[i] = 0;
		}
		for (int i = 0; i < totalEdge; i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			adjList[x][degree2[x]] = y;
			degree1[y]++;
			degree2[x]++;
		}
		in.close();
		visited = new int[totalVertex];
		for (int i = 0; i < totalVertex; i++)
			visited[i] = 0;
	}
	
	public void DFS(int vertex) {
		previsit.add(vertex);
		visited[vertex] = 1;
		for (int i = 0; i < degree2[vertex]; i++)
			if (visited[adjList[vertex][i]] == 0)
				DFS(adjList[vertex][i]);
		postvisit.add(vertex);
	}
	public void DFStopological() {
		for (int i = 0; i < totalVertex; i++)
			if (degree1[i] == 0)
				DFS(i);
		LinkedList<Integer> list = new LinkedList<Integer>();
		Iterator<Integer> iterator = postvisit.iterator();
		while (iterator.hasNext())
			list.add(0, iterator.next());
		display(list);
	}
	public void display (LinkedList<Integer> list) {
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
	}
}

public class Main {
	public static void main(String argv[]) {
		Graph g = new Graph();
		g.loadList();
		g.DFStopological();
	}
}

