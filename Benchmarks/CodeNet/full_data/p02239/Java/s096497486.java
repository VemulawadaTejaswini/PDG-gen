import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

class Graph {
	public Integer[][] adjMatrix;
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
	
	public void BFS(int s) {
		int[] level = new int[totalVertex];
		boolean visited[] = new boolean[totalVertex];
		visited[s] = true;
		Queue<Integer> q = new LinkedList<>();
		q.add(s);
		level[0] = 0;
		int count = 0;
		while(!q.isEmpty()) {
			int v = q.poll();
			visited[v] = true;
			count += 1;
			for (int i = 0; i < totalVertex; i++) {
				if (adjMatrix[v][i] == 1 && visited[i] == false) {
					level[i] = level[v] + 1;
					q.add(i);
					visited[i] = true;
				}
			}
		}
		System.out.println(1 + " " + level[0]);
		for (int i = 1; i < totalVertex; i++) {
			if (level[i] == 0) {
				System.out.println(i+1 + " " + -1);
			}
			else {
				System.out.println(i+1 + " " + level[i]);
			}
		}
	}
	
	
	public void printAdjMatrix() {
		adjMatrix = new Integer[totalVertex][totalVertex];
		//complete the following
		for (int i = 0; i < totalVertex; i++) {
			for (int j = 0; j < totalVertex; j++) {
				if (adjList.get(i).contains(j)) {
					adjMatrix[i][j] = 1;
				}
				else {
					adjMatrix[i][j] = 0;
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
		g.BFS(0);
	}
}
