
//template code, C343, 2019
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

class GraphRe {
	private int totalVertex;
	private LinkedList<LinkedList<Integer>> adjList;

	// adjacency list of edges
	public GraphRe() {
		totalVertex = 0;
	}

	public void loadAdjList() {
		Scanner in = new Scanner(System.in);
		totalVertex = in.nextInt();
		adjList = new LinkedList<LinkedList<Integer>>();
		for (int i = 0; i < totalVertex; i++) {
			LinkedList<Integer> tmp = new LinkedList<Integer>();
			// System.out.println("mark idx1 = " + idx1 + " degree = " + degree);
			for (int j = 0; j < totalVertex; j++) {
				int weight = in.nextInt();
				if (weight != -1) {
					tmp.add(j);
					tmp.add(weight);
				}
			}
			adjList.add(tmp);
		}
		in.close();
	}

	public void runDijkstra() {
		Pair[] paths = new Pair[totalVertex];
		paths[0] = new Pair(0);

		for (int i = 1; i < totalVertex; i++) {
			paths[i] = new Pair(Integer.MAX_VALUE);
		}

		int min = 0;

		while (min != -1) {
			Pair minPair = paths[min];
			minPair.setDone(true);
			LinkedList<Integer> neighbors = adjList.get(min);
			Iterator<Integer> it = neighbors.iterator();

			while (it.hasNext()) {
				int n = it.next();
				int w = it.next();
				Pair neighbor = paths[n];
				if(!neighbor.isDone()) {
				neighbor.setDistFromStart(Math.min(neighbor.getDistFromStart(), w));
				}
			}

			min = findMinVertex(paths);
		}

		int sum = 0; 
		
		for (int i = 0; i < totalVertex; i++) {
			sum+=paths[i].getDistFromStart();
		}
		
		System.out.println(sum);
	}

	private int findMinVertex(Pair[] paths) {
		int min = -1;
		int minDist = Integer.MAX_VALUE;

		for (int i = 0; i < totalVertex; i++) {
			Pair p = paths[i];
			if (p.getDistFromStart() < minDist && !p.isDone()) {
				minDist = p.getDistFromStart();
				min = i;
			}
		}

		return min;
	}
}

class Pair implements Comparable<Pair> {
	private int distFromStart;
	private boolean isDone;

	public Pair(int distFromStart) {
		this.distFromStart = distFromStart;
		this.isDone = false;
	}

	public boolean isDone() {
		return isDone;
	}

	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}

	public int getDistFromStart() {
		return distFromStart;
	}

	public void setDistFromStart(int distFromStart) {
		this.distFromStart = distFromStart;
	}

	public int compareTo(Pair other) {
		return this.distFromStart - other.distFromStart;
	}
}

//change class name GraphRepresentation to Main() for submission to AIZU
public class Main {
	public static void main(String argv[]) {
		GraphRe g = new GraphRe();
		g.loadAdjList();
		// g.updateTimes();
		// g.printTimeStamps();
		// g.printAdjMatrix();
		// g.printShortestPaths();
		g.runDijkstra();
	}
}
