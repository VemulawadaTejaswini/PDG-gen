import java.util.LinkedList;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

class Grph {
	
	private int totalVertex;
	private LinkedList<LinkedList<Integer>> adjList;
	private int time;
	private ArrayList<Integer> visited = new ArrayList<Integer>();
	//adjacency list of edges
	public Grph() { totalVertex = 0; }
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
		int[][] adjMatrix = new int[totalVertex][totalVertex];
		//complete the following
		for (int i = 0; i < totalVertex; i++) {
			LinkedList<Integer> currElement = adjList.get(i);
			for (int j = 0; j < currElement.size(); j++) {
				adjMatrix[i][currElement.get(j)] = 1;
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
	
	public void DFS() {
		int[] d = new int[totalVertex];
		int[] f = new int[totalVertex];
		for (int i = 0; i < totalVertex; i++) {
			if (!visited(i)) {
				DFS(i, d, f);
			}
		}
		
		for (int i = 0; i < totalVertex; i++) {
			System.out.println((i + 1) + " " + d[i] + " " + f[i]);
		}
		
	}
	
	public void DFS(int v, int[] d, int[] f) {
		time++;
		d[v] = time;
		visited.add(v);
		LinkedList<Integer> neighbors = adjList.get(v);
		for (int i = 0; i < neighbors.size(); i++) {
			if (!visited(neighbors.get(i))) {
				DFS(neighbors.get(i), d, f);
			}
		}
		time++;
		f[v] = time;
	}
	
	public boolean visited(int v) {
		for (int i = 0; i < visited.size(); i++) {
			if (visited.get(i) == v) {
				return true;
			}
		}
		return false;
	}
	
	
	
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grph g = new Grph();
		g.loadAdjList();
		g.DFS();
	}

}
