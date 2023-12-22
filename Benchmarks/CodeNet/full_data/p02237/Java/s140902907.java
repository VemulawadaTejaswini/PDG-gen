import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;

class Graph {
	private int totalVertex;
	private LinkedList<LinkedList<Integer>> adjList;

	public Graph() {
		totalVertex = 0;
	}

	public void loadAdjList() {
		Scanner in = new Scanner(System.in);
		totalVertex = in.nextInt();
		adjList = new LinkedList<LinkedList<Integer>>();
		for (int i = 0; i < totalVertex; i++) {
			LinkedList<Integer> tmp = new LinkedList<Integer>();
			int idx1 = in.nextInt() - 1;
			int degree = in.nextInt();
			for (int j = 0; j < degree; j++) {
				int idx2 = in.nextInt() - 1;
				tmp.add(idx2);
			}
			adjList.add(tmp);
		}
		in.close();
	}

	public void printAdjMatrix() {
		Integer[][] adjMatrix = new Integer[totalVertex][totalVertex];
		for (int i = 0; i < adjList.size(); i++) {
			for (int j = 0; j < totalVertex; j++) {
				int value = 0;
				if (!adjList.get(i).isEmpty())
					if (adjList.get(i).contains(j))
						value = 1;
				System.out.print(value);
				if (j < totalVertex - 1)
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}

public class Main {
	public static void main(String argv[]) {
		Graph g = new Graph();
		g.loadAdjList();
		g.printAdjMatrix();
	}
}

