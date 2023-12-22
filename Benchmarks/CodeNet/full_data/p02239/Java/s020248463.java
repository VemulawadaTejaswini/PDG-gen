
//template code, C343, 2019
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

class Graph {
	private int totalVertex;
	private LinkedList<LinkedList<Integer>> adjList;
	private int[] discoverTimes;
	private int[] finishTimes;

	// adjacency list of edges
	public Graph() {
		totalVertex = 0;
	}

	public void loadAdjList() {
		Scanner in = new Scanner(System.in);
		totalVertex = in.nextInt();
		adjList = new LinkedList<LinkedList<Integer>>();
		discoverTimes = new int[totalVertex];
		finishTimes = new int[totalVertex];
		for (int i = 0; i < totalVertex; i++) {
			LinkedList<Integer> tmp = new LinkedList<Integer>();
			int idx1 = in.nextInt() - 1;
			int degree = in.nextInt();
			// System.out.println("mark idx1 = " + idx1 + " degree = " + degree);
			for (int j = 0; j < degree; j++) {
				int idx2 = in.nextInt() - 1;
				tmp.add(idx2);
			}
			adjList.add(tmp);
		}
		in.close();
	}

	public void printTimeStamps() {
		for (int v = 0; v < totalVertex; v++) {
			System.out.println((v + 1) + " " + discoverTimes[v] + " " + finishTimes[v]);
		}
	}

	/**
	 * public int DFSHelp(int start, int startTime) { discoverTimes[start] =
	 * startTime; LinkedList<Integer> neighbors = adjList.get(start);
	 * 
	 * Iterator<Integer> neighIt = neighbors.iterator(); while (neighIt.hasNext()) {
	 * int cur = neighIt.next(); if (discoverTimes[cur] == -1) { startTime =
	 * DFSHelp(cur, ++startTime); } } finishTimes[start] = startTime + 1; return
	 * startTime + 1; }
	 **/

	public int DFSHelp(int start, int startTime) {
		discoverTimes[start] = startTime;
		LinkedList<Integer> neighbors = adjList.get(start);

		int timeAfter = dealWithNeighbors(neighbors, startTime);

		finishTimes[start] = timeAfter + 1;
		return timeAfter + 1;
	}

	public int dealWithNeighbors(LinkedList<Integer> neighbors, int startTime) {
		Iterator<Integer> neighIt = neighbors.iterator();
		while (neighIt.hasNext()) {
			int curNeighbor = neighIt.next();
			if (discoverTimes[curNeighbor] == -1) {
				startTime = DFSHelp(curNeighbor, startTime + 1);
			}
		}

		return startTime;
	}

	public void updateTimes() {
		for (int i = 0; i < discoverTimes.length; i++) {
			discoverTimes[i] = -1;
		}
		int time = 0;
		for (int i = 0; i < totalVertex; i++) {
			if (discoverTimes[i] == -1) {
				time = DFSHelp(i, time + 1);
			}
		}
	}

	public void printAdjMatrix() {
		Integer[][] adjMatrix = new Integer[totalVertex][totalVertex];
		for (int i = 0; i < totalVertex; i++) {
			for (int j = 0; j < totalVertex; j++) {
				adjMatrix[i][j] = adjList.get(i).contains(j) ? 1 : 0;
			}
		}

		for (int i = 0; i < totalVertex; i++) {
			for (int j = 0; j < totalVertex; j++) {
				if (j == totalVertex - 1) {
					System.out.print(adjMatrix[i][j]);
				} else {
					System.out.print(adjMatrix[i][j] + " ");
				}
			}
			System.out.println();
		}
	}

	/**
	// returns the shortest path between from and to without visiting nodes already
	// seen on that path or -1 if no path exists. Doesn't save the new seen nodes.
	public int shortestPath(int from, int to, boolean[] seen) {
		if (from == to) {
			return 0;
		}

		int min = -1;
		LinkedList<Integer> neighbors = adjList.get(from);
		Iterator<Integer> it = neighbors.iterator();
		
		while (it.hasNext()) {
			seen[from] = true;
			int curNeighbor = it.next();

			if (!seen[curNeighbor]) {
				
				int neighTo = shortestPath(curNeighbor, to, seen);
				seen[from] = false;
				
				if (neighTo != -1) {
					if (min == -1) {
						min = neighTo + 1;
					} else {
						min = Math.min(min, neighTo + 1);
					}
				}
			}
		}

		return min;
	}

	public void printShortestPaths() {
		for (int i = 0; i < totalVertex; i++) {
			System.out.println((i + 1) + " " + shortestPath(0, i, new boolean[totalVertex]));
		}
	}
	**/
	
	public void BFSShortestPath() {
		int[] paths = new int[totalVertex];
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(0);
		paths[0] = 0;
		
		for(int i = 1; i < paths.length; i++) {
			paths[i] = -1;
		}
		
		while(!q.isEmpty()) {
			int cur = q.poll();
			LinkedList<Integer> neighbors = adjList.get(cur);
			for(Integer n : neighbors) {
				if(paths[n] == -1) {
				q.add(n);
				paths[n] = paths[cur] + 1;
				}
			}
		}
		
		for(int i = 0; i < paths.length; i++) {
			System.out.println((i + 1) + " " + paths[i]);
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
		g.BFSShortestPath();
	}
}
