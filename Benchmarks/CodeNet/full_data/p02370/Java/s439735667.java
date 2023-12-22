import java.util.*;

class Graph {
	private int totalVertex, totalEdges;
	private int[] degree;
	private LinkedList<LinkedList<Integer>> adjList;
	public Graph() {
		totalVertex = 0;
		totalEdges = 0;
	}
	public void loadAdjList() {
		Scanner in = new Scanner(System.in);
		totalVertex = in.nextInt();
		totalEdges = in.nextInt();
		degree = new int[totalVertex];
		adjList = new LinkedList<LinkedList<Integer>>();
		
		for(int i = 0; i < totalVertex ; i++) {
			LinkedList<Integer> vert = new LinkedList<Integer>();
			adjList.add(vert);
			degree[i] = 0;
		}
		
		int row, col;
		for (int i = 0; i < totalEdges; i++) {
			row = in.nextInt();
			col = in.nextInt();
			adjList.get(row).add(col);
			degree[col] += 1;
		}
		in.close();
	}
	
	public void print() {
		Queue<Integer> vert = new LinkedList<Integer>();
		for(int i = 0; i < totalVertex; i++) {
			if(degree[i] == 0) {
				vert.add(i);
			}
		}
		while(!vert.isEmpty()) {
			int num = vert.poll();
			System.out.println(num);
			for(Integer n : adjList.get(num)) {
				degree[n] -= 1;
				if(degree[n] == 0) {
					vert.add(n);
				}
			}
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Graph g = new Graph();
		g.loadAdjList();
		g.print();
	}
}
