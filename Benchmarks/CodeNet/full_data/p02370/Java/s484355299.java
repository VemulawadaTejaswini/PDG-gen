import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Iterator;

class Graph {
	private int totalVertex;
	int[] path;
	private LinkedList<LinkedList<Integer>> adjList;
	//adjacency list of edges
	public Graph() { totalVertex = 0; }
	public void loadAdjList() {
		Scanner in = new Scanner(System.in);
		totalVertex = in.nextInt();
		int edges = in.nextInt();
		path = new int[totalVertex];
		adjList = new LinkedList<LinkedList<Integer>>();
		for(int i = 0; i < totalVertex; i ++) {
			LinkedList<Integer> tmp = new LinkedList<Integer>();
			adjList.add(tmp);
			path[i] = 0;
			}	
			for(int i = 0; i < edges; i++) {
				int vert = in.nextInt();
				int edge = in.nextInt();
				path[edge] += 1;
				adjList.get(vert).add(edge);
				
		}
		in.close();
	}
	public void printAdjMatrix() {
		Queue<Integer> vertices = new LinkedList<Integer>();
		for(int i = 0; i < adjList.size(); i++) {
			if(path[i] == 0) {
				vertices.add(i);
			}
		}
		while(vertices.size() != 0) {
			int vertice = vertices.poll();
			System.out.println(vertice);
			for(Integer v :adjList.get(vertice)) {
				path[v] = path[v] - 1;
				if(path[v] == 0) {
					vertices.add(v);
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
		g.printAdjMatrix();
	}
}
