
import java.io.*;
import java.util.*;

class Graph2{
	private int[] discover;
	private int[] finish;
	private int totalVertex;
	private LinkedList<LinkedList<Integer>> adjList;
	//adjacency list of edges
	public Graph2() { totalVertex = 0; }
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
	public int DFS(int v, int time){
		if (discover[v] == 0) {
			discover[v] = time; 
			time++;
		}
		else {
			return time;
		}
		for (int i: adjList.get(v)) {
			//time++;
			time = DFS(i, time);
		}
		finish[v] = time;
		time++;
		return time;
	}
	public void searchGraph() {
		discover = new int[totalVertex];
		finish = new int[totalVertex];
		int time = 1;
		
		for (int i = 0; i < totalVertex; i++) {
			
			time = DFS(i, time);
			
		}
		for (int j = 0; j < totalVertex; j++ ) {
			System.out.println(j+1 + " " + discover[j] + " " + finish[j]);
		}
	}
}
public class Main {
	public static void main(String argv[]) {
		Graph2 g = new Graph2();
		g.loadAdjList();
		g.searchGraph();
	}
}


