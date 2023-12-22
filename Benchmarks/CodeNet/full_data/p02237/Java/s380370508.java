
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Iterator;

class Graph {
	private int totalVertex;
	LinkedList<LinkedList<Integer>> adjList;
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
		for (int i = 0; i < adjMatrix.length; i++) {
		    for (int j = 0; j < adjMatrix[i].length; j++) {
		        LinkedList<Integer> edges = adjList.get(i);
		        if(edges.contains(j)) {
		        	adjMatrix[i][j] = 1;
		        }
		        else {
		        	adjMatrix[i][j] = 0;
		        }
		    }
		}
		
		
		for (int i = 0; i < adjMatrix.length; i++) {
		    for (int j = 0; j < adjMatrix[i].length; j++) {
		    	if(j == adjMatrix[i].length - 1) {
		    		System.out.print(adjMatrix[i][j]);
		    	}
		    	else {
		        System.out.print(adjMatrix[i][j] + " ");
		    	}
		    }
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

