

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Arrays;
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
		for(int x = 0; x < totalVertex; x++){
			for(int y = 0; y < totalVertex; y++){
				adjMatrix[x][y] = 0;
			}
		}

		for(int i = 0; i < totalVertex; i++){
			for(int j = 0; j < totalVertex; j++){
				for(Integer o: adjList.get(i)){
					if(o == j){
						adjMatrix[i][j] = 1;
					}
				}
			}
		}
		for(int j = 0; j < totalVertex; j++){
			for(int k = 0; k < totalVertex; k++){
				if(k == totalVertex - 1){
					System.out.print(adjMatrix[j][k]);
				}else{
					System.out.print(adjMatrix[j][k] + " ");
				}
			}
			System.out.print("\n");
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

