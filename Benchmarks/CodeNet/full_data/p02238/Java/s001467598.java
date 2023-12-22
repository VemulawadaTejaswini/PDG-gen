import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

class Graph {
	private int totalVertex;
	private LinkedList<LinkedList<Integer>> adjList;
	private Integer[][] adjMatrix;
	private int[] disTime;
	public int[] finTime;
	private static int time =1;
	
	//adjacency list of edges
	public Graph() { totalVertex = 0; }
	public void loadAdjList() {
		Scanner in = new Scanner(System.in);
		totalVertex = in.nextInt();
		adjList = new LinkedList<LinkedList<Integer>>();
		
		disTime = new int[totalVertex]; // set length of disTime and fill in with -1
		finTime = new int[totalVertex];
		// Arrays.fill(disTime,-1); 
		// Arrays.fill(finTime,-1); 
		
		for(int i = 0; i < totalVertex; i ++) {
			LinkedList<Integer> tmp = new LinkedList<Integer>();
			in.nextInt();
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
	
	public void buildAdjMatrix() {
		adjMatrix = new Integer[totalVertex][totalVertex];
		LinkedList<Integer> tempNode;
		
		for (int i = 0; i < totalVertex; i++) {
			tempNode = adjList.remove();
			Iterator<Integer> inner = tempNode.iterator();
			while(inner.hasNext()) {
				adjMatrix[i][inner.next()] = 1;
			}
		}
	}
	
	public void printAdjMatrix() {
		
		for(int i = 0; i<totalVertex;i++) {
			for (int j = 0; j < totalVertex; j++) {
				if (adjMatrix[i][j] != null) {
					System.out.print(adjMatrix[i][j]);
				} else {
					System.out.print(0);
				}
				if (j != totalVertex-1) {
					System.out.print(" ");					
				}				
			}
			System.out.println(); 
		}
	}
	
	public ArrayList<Integer> getNeighbors(int row) {
		ArrayList<Integer> myNeighbor = new ArrayList<Integer>();
		for (int i = 0; i<totalVertex;i++) {
			if (adjMatrix[row][i] != null) {
				myNeighbor.add(i);
			}
		}
		return myNeighbor;
	}
	
	public void DFS(int row) {
		if (disTime[row] == 0) {
			// when the node never been visited
			disTime[row] = time++;
		}
		ArrayList<Integer> neighbors = getNeighbors(row);
		for(int i = 0; i < neighbors.size(); i ++) {
			int v1 = neighbors.get(i);
			if(disTime[v1] == 0) {
				DFS(v1);
				if (finTime[v1] == 0) {
					finTime[v1] = time++;
				}
			}
		}
	}
	/*
	public void traversal(int row) {
		if (disTime[row] < 0) {
			// when the node never been visited
			disTime[row] = time++;
			
			for (int col =0; col < totalVertex; col++) {
				if (adjMatrix[row][col] == 1) {
					// found a new connected node
					this.traversal(col);
				}
			}
		} else if (finTime[row]<0) {
			// when the node has been visited but not finished
			finTime[row] = time++;
		}
		
	}
	*/

	public void printDFS() {
		for (int i =0; i<totalVertex; i++) {
			System.out.println(i+1+" "+disTime[i]+" "+finTime[i]);
		}
	}
	public static int getTime() {
		return time++;
	}
	
	public int getVertex() {
		return totalVertex;
	}
}

public class Main {
	
	public static void main(String argv[]) {
		Graph g = new Graph();
		g.loadAdjList();
		g.buildAdjMatrix();
		for (int i = 0; i < g.getVertex(); i++) {
			g.DFS(i); // traversal starting at the very first node
			if (g.finTime[i] == 0) {
				g.finTime[i]=Graph.getTime();
			}
		}
		
		g.printDFS();
		// g.printAdjMatrix();
	}
}
