
/*
 * Blake Miller
 * Implementation of Graph
 * Returns a graph visualization with 1s and 0s in positions where there is a connection
 * From AIZU and yye
 * 
 * 
 * 
 * NOW implements an inefficient connection system!
 * Works for smaller numbers
 */
/*
 * 
 */
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class Main {
	static TreeSet<Integer> visited = new TreeSet<Integer>();
	static int[] visitTimes = new int[101];
	static int[] finishTimes = new int[101];
	int[][] graph;
	Stack<Integer> toVisit;
	int verts;
	static int time;
	public Main(int[][] graph) {
		this.graph = graph;
		
		time = 0;
		toVisit = new Stack<Integer>();
		verts = Array.getLength(this.graph[0]);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); //number of nodes
		int[][] myGraph = new int[n][n]; //assume n x n graph
		int m = in.nextInt(); //number of connections
		for (int i = 0; i < m; i++) {
			int j = in.nextInt();
			int k = in.nextInt();
			myGraph[j][k] = 1;
			myGraph[k][j] = 1;
		}
		m = in.nextInt();
		Main newGraph = new Main(myGraph);
		
		for (int i = 0; i < m; i++) {
			int j = in.nextInt();
			int k = in.nextInt();
			if (newGraph.binSearch(j,k) || newGraph.binSearch(k,j)) {System.out.println("yes");}
			else {System.out.println("no");}
			
		}
		
		
		
		/*for (int j = 0; j < n; j++) {
			currentVertex = in.nextInt(); // The vertex we are working with; could just be j+1
			degree = in.nextInt(); //Number of connections
			for (int i = 0; i < degree; i++) { // For every connection:
				myGraph[currentVertex-1][in.nextInt()-1] = 1;
				// the position at currentVertex - 1 and the input of the array is 1 since there IS a connection
			}
		}*/
		/*
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j != 0) System.out.print(" "); // Don't front a space for first element in a row
				System.out.print(myGraph[i][j]);
				
			}
			System.out.println(); // new row
		}*/
		
	}
	
	public void printSearch() {
		for (int i = 0; i < verts; i++) {
			System.out.println(i+1 + " " + visitTimes[i] + " " + finishTimes[i]);
		}
	}
	
	public void depthSearch(int row) {
		Stack<Integer> vertices = new Stack<Integer>();
		if (!visited.contains(row)) {
			
			visited.add(row);
			
			for (int i = 0; i < verts ; i++) {
				if (this.graph[row][i] == 1) {
					depthSearch(i);
				}
			}
			time+=1;
			
			
		}
	}
	public boolean binSearch(int row, int goal) {
		visited = new TreeSet<Integer>();
		depthSearch(row);
		return (visited.contains(goal));
	}
	
	/*public static int[][] DFS(int[][] graph, int n) {
		int[][] results = new int[n][3];
		
		
		return results;
	}
	public static int DFS(int numVerts, int[][] graph) {
		/*
		Set<Integer> visited = new TreeSet<Integer>();
		
		for (int i = 0; i < numVerts; i++) {
			int[] thisRow = graph[i];
			for (int j = 0; j<numVerts; j++) {
				if (thisRow[j] == 1) {
					if (!visited.contains(j+1)) {
						visited.add(j+1);
					}
									}
			}
		} 
		return 0;
	}
	
	ArrayList<Integer> topSort() {
		ArrayList<Integer> L = new ArrayList<Integer>();
		int[] C = new int[graph[0].length];
		int j = 0;
		
		LinkedList<Integer> Q = new LinkedList<Integer>();
		for (int i = 0; i < C.length; i++) {
			j = 0;
			for (int k = 0; k <C.length; k++) {
				j+=graph[i][k];
			}
			if (j == 0) {
				Q.add(i); // i has no incoming edges
			}
			C[i] = j;
		}
		
		while (!Q.isEmpty()) {
			Integer u = Q.poll();
			L.add(u);
			for (int i = 0; i < graph[u].length; i++) {
				if (graph[u][i] == 1) {
					C[i]--;
					if (C[i] == 0) {
						Q.push(i);
					}
				}
			}
		}
		if (L.size() == graph[0].length) {
			return L;
		}
		else return null;
	}*/
	
	
	
}

