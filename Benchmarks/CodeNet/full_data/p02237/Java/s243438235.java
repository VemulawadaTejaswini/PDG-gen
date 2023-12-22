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
	public void printAdjMatrix(){
		Integer[][] adjMatrix = new Integer[totalVertex][totalVertex];
		for (int i = 0; i < totalVertex; i++) {
			for (int j = 0; j < totalVertex; j++) { 
				adjMatrix[i][j] = 0;
			}
		}
		Iterator<LinkedList<Integer>> it = adjList.iterator();
		int n = 0;
		while (it.hasNext()) {
			LinkedList<Integer> Lk = it.next();
			Iterator<Integer> itt = Lk.iterator();
			while (itt.hasNext()) {
				adjMatrix[n][itt.next()] = 1;
			}
		    n++;
		}
		for (int k = 0; k < totalVertex; k++) {
			for (int l = 0; l < totalVertex -1; l++) {
				System.out.print(adjMatrix[k][l] + " ");
			}
			System.out.println(adjMatrix[k][totalVertex-1]);
		}
		//complete the following
		
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
