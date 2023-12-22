
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;

class SearchGraph {
	private int totalVertex;
	private LinkedList<LinkedList<Integer>> adjList;
	//adjacency list of edges
	public SearchGraph() { totalVertex = 0; }
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
		discoverTime = new int[totalVertex];
		finishTime = new int[totalVertex];
	}
	
	int[] discoverTime = new int[totalVertex];
	int[] finishTime = new int[totalVertex];
	
	public void DFS() {
		
		for(int i = 0; i < discoverTime.length; i++) {
			if (discoverTime[i] == 0) {
				stepTimeCounter += 1;
				performDFS(i);
				
			}
		}
		
		for(int i = 0; i < discoverTime.length; i++) {
			System.out.println((i + 1) + " " + discoverTime[i] + " " + finishTime[i]);
		}
	}
	
	private int stepTimeCounter = 0;
	
	private void performDFS(int vertex) {
		if (discoverTime[vertex] > 0) {
			return;
		}
		discoverTime[vertex] = stepTimeCounter; 
		for(int i = 0; i < adjList.get(vertex).size(); i++) {
			if (discoverTime[adjList.get(vertex).get(i)] == 0) {
				stepTimeCounter += 1;
				performDFS(adjList.get(vertex).get(i));
			}
		}
		stepTimeCounter += 1;
		finishTime[vertex] = stepTimeCounter;
	}
}

public class Main {
	public static void main(String argv[]) {
		SearchGraph g = new SearchGraph();
		g.loadAdjList();
		g.DFS();
	}
}


