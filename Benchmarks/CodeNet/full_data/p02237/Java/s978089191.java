import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;

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
	public void printAdjMatrix() {
		Integer[][] adjMatrix = new Integer[totalVertex][totalVertex];
		//complete the following
		
		// Populate matrix with 0s first
		for(int r = 0; r < totalVertex; r++) {
			for (int c = 0; c < totalVertex; c++) {
				adjMatrix[r][c] = 0;
			}
		}
		
		// For each LinkedList in adjList, if it contains values, set
		//  adjMatrix in that position to 1
		for (int i = 0; i < totalVertex ; i++) {
			LinkedList<Integer> adj = adjList.pop();
			if(adj != null) {
				int s = adj.size();
				for(int j = 0; j < s; j++) {
					int x = adj.pop();
					adjMatrix[i][x] = 1;
				}
			}
			
			// Print row
			for(int k = 0; k < totalVertex - 1; k++) {
				System.out.print(adjMatrix[i][k] + " ");
			}
			System.out.print(adjMatrix[i][totalVertex - 1]);
			System.out.println();
		}

        }
}

public class Main {
	public static void main(String argv[]) {
		Graph g = new Graph();
		g.loadAdjList();
		g.printAdjMatrix();
	}
}
