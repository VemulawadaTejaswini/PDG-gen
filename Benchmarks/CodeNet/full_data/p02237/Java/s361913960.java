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
				//System.out.print(idx2 + " ");
				tmp.add(idx2);
			}	
			//System.out.println();
			adjList.add(tmp);
		}
		
		
		in.close();
	}
	public void printAdjMatrix() {
		int[][] adjMatrix = new int[totalVertex][totalVertex];
		//complete the following
		for (int i = 0; i < totalVertex; i++) {
			LinkedList<Integer> currElement = adjList.get(i);
			Iterator<Integer> it = currElement.iterator();
			for (int j = 0; j < currElement.size(); j++) {
				adjMatrix[i][it.next()] = 1;
			}
		}
		
		for (int i = 0; i < totalVertex; i++) {
			for (int j = 0; j < totalVertex; j++) {
				System.out.print(adjMatrix[i][j]);
				if (j < totalVertex - 1) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}

//change class name GraphRepresentation to Main() for submission to AIZU
public class Main{
	public static void main(String argv[]) {
		Graph g = new Graph();
		g.loadAdjList();
		g.printAdjMatrix();
	}
}

