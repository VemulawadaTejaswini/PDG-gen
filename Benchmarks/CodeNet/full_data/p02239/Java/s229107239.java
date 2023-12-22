import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Queue; 


class Graph {
	private int totalVertex;
	private LinkedList<LinkedList<Integer>> adjList;
	private int[] myDist;
	
	//adjacency list of edges
	public Graph() { totalVertex = 0; }
	public void loadAdjList() {
		Scanner in = new Scanner(System.in);
		totalVertex = in.nextInt();
		adjList = new LinkedList<LinkedList<Integer>>();
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
	
	public void printAdjMatrix() {
		Integer[][] adjMatrix = new Integer[totalVertex][totalVertex];
		LinkedList<Integer> tempNode;
		Iterator<LinkedList<Integer>> outer = adjList.iterator();
		int  rw = 0;
		while (outer.hasNext()) {
			tempNode = outer.next();
			Iterator<Integer> inner = tempNode.iterator();
			while(inner.hasNext()) {
				adjMatrix[rw][inner.next()] = 1;
			}
			rw++;
		}
			
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
	
	public void buildDist() {
		Queue<Integer> toVisit = new LinkedList<>(); 
		myDist = new int[totalVertex];
		for (int i = 1; i < totalVertex; i++) {
			myDist[i] = -1;
		}
		
		// myDist[1] = 0; // set distance to node 1 to be 0
		toVisit.add(0);
		
		while (!toVisit.isEmpty()) {
			int u =  toVisit.remove();
			// int v = 1;
			LinkedList<Integer> tempList = adjList.get(u);

			for (int j = 0; j<tempList.size(); j++) {
				int v = tempList.get(j);
				if (myDist[v] == -1) {
					toVisit.add(v);
					myDist[v]= myDist[u]+1;
				}
			}
		}
	}
	
	public void printDist() {
		for (int i = 1; i<=totalVertex; i ++) {
			System.out.println(i+" "+myDist[i-1]);
		}
	}
}

public class Main {
	public static void main(String argv[]) {
		Graph g = new Graph();
		g.loadAdjList();
		// g.printAdjMatrix();
		g.buildDist();
		g.printDist();
	}
}
