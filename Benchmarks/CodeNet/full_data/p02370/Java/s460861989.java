import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Graph {
	private int totalVertex;
	private int totalEdge;
	private LinkedList<LinkedList<Integer>> adjList;
	private int[] degree;

	public Graph() {
		totalVertex = 0;
		totalEdge = 0;
	}

	public void loadAdjList() {
		Scanner sc = new Scanner(System.in);
		totalVertex = sc.nextInt();
		totalEdge = sc.nextInt();
		degree = new int[totalVertex];
		adjList = new LinkedList<LinkedList<Integer>>();
		
		for(int i = 0; i < totalVertex ; i++) {
			LinkedList<Integer> vert = new LinkedList<Integer>();
			adjList.add(vert);
			degree[i] = 0;
		}
		
		int row;
		int col;
		for (int i = 0; i < totalEdge; i++) {
			row = sc.nextInt();
			col = sc.nextInt();
			adjList.get(row).add(col);
			degree[col] += 1;
		}
		sc.close();
	}
	
	public void eligible() {
		Queue<Integer> eligibleQ = new LinkedList<Integer>();
		for(int i = 0; i < totalVertex; i++) {
			if(degree[i] == 0) {
				eligibleQ.add(i);
			}
		}
		while(!eligibleQ.isEmpty()) {
			int num = eligibleQ.poll();
			System.out.println(num);
			for(Integer n : adjList.get(num)) {
				degree[n] -= 1;
				if(degree[n] == 0) {
					eligibleQ.add(n);
				}
			}
		}
	}
}

public class Main {
	public static void main(String argv[]) {
		Graph g = new Graph();
		g.loadAdjList();
		g.eligible();
	}
}
