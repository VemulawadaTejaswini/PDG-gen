import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;

import java.util.LinkedList;
import java.util.Scanner;

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
		for(int i = 0; i < adjMatrix.length; i++) {
			for(int j = 0; j < adjMatrix[0].length; j++) {
				adjMatrix[i][j] = 0;
			}
		}
		int position = 0;
		for( LinkedList<Integer> vertex : adjList) {
				if(!vertex.isEmpty()) {
					for(int edge : vertex) {
						adjMatrix[position][edge] = 1;
					}
				}
				position++;
		}
		for ( int i = 0; i < totalVertex; i++) {
			String num = ""; 
			for(int j = 0; j < totalVertex; j++) {
				num += adjMatrix[i][j];
				if (j < totalVertex - 1) {
					num += " ";
				}
			}
			System.out.println(num);
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
