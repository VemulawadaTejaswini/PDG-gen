
//template code, C343, 2019
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

class Graph {
	private int totalVertex;
	private LinkedList<LinkedList<Integer>> adjList;
	private int[] completion;
	private boolean[] seen;
	private int[] indegree;

	// adjacency list of edges
	public Graph() {
		totalVertex = 0;
	}

	public void loadAdjList() {
		Scanner in = new Scanner(System.in);
		totalVertex = in.nextInt();
		completion = new int[totalVertex];
		seen = new boolean[totalVertex];
		indegree = new int[totalVertex];
		
		int totalEdges = in.nextInt();
		adjList = new LinkedList<LinkedList<Integer>>();
		
		for(int i = 0; i < totalVertex ; i++) {
			LinkedList<Integer> tmp = new LinkedList<Integer>();
			adjList.add(tmp);
		}
		
		for (int i = 0; i < totalEdges; i++) {
			int vert = in.nextInt();
			int out = in.nextInt();
			adjList.get(vert).add(out);
			indegree[out]++;
		}
		
		in.close();
	}
	
	/**
	 * performs DFS on the graph, populating completion starting with 
	 * pos by order of completion and returns the next available pos
	 */
	public int topSortDFS(int start, int pos) {
		LinkedList<Integer> neighbors = adjList.get(start);
		seen[start] = true;
		
		for(Integer n : neighbors) {
			if(!seen[n]) {
			pos = topSortDFS(n, pos);
			}
		}
		
		completion[pos] = start;
		return pos + 1;
	}

	public void printTopological() {
		int pos = 0;
		for(int i = 0; i<totalVertex; i++) {
			if(!seen[i]) {
				pos = topSortDFS(i, pos);
			}
		}
		
		for(int i = totalVertex - 1; i >= 0; i--) {
			System.out.println(completion[i]);
		}
	}
	
	public void eligibleMethod() {
		Queue<Integer> eligible = new LinkedList<Integer>();
		for(int i = 0; i < totalVertex; i++) {
			if(indegree[i] == 0) {
				eligible.add(i);
			}
		}
		
		while(!eligible.isEmpty()) {
			int cur = eligible.poll();
			System.out.println(cur);
			for(Integer n : adjList.get(cur)) {
				indegree[n]--;
				if(indegree[n] == 0) {
					eligible.add(n);
				}
			}
		}
	}
}
//change class name GraphRepresentation to Main() for submission to AIZU
public class Main {
	public static void main(String argv[]) {
		Graph g = new Graph();
		g.loadAdjList();
		// g.updateTimes();
		// g.printTimeStamps();
		// g.printAdjMatrix();
		//g.printShortestPaths();
		g.eligibleMethod();
	}
}
