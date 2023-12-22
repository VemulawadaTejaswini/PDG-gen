import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	
	private int totalVertex;
	private LinkedList<LinkedList<Integer>> adjList;
	private Integer[] distance;
	private LinkedList<Integer> visited;
	//adjacency list of edges
	public Main() { totalVertex = 0; }
	public void loadAdjList() {
		Scanner in = new Scanner(System.in);
		totalVertex = in.nextInt();
		distance = new Integer[totalVertex];
		for (int i = 0; i < totalVertex; i++) {
			distance[i] = -1;
		}
		adjList = new LinkedList<LinkedList<Integer>>();
		for(int i = 0; i < totalVertex; i ++) {
			LinkedList<Integer> tmp = new LinkedList<Integer>();
			int idx1 = in.nextInt() - 1;
			int degree = in.nextInt();
			for(int j = 0; j < degree; j ++) {
				int idx2 = in.nextInt();
				tmp.add(idx2);
			}	
			adjList.add(tmp);
		}
		in.close();
	}
	
	public void getBFS(int s) {
		visited = new LinkedList<Integer>();
		distance[s-1] = 0;
		LinkedList<Integer> toVisit = new LinkedList<Integer>();
		toVisit.add(s);
		while (toVisit.size() > 0) {
			int v = toVisit.remove(0);
			visited.add(v);
			LinkedList<Integer> neighbors = adjList.get(v-1);
			for (int i = 0; i < neighbors.size(); i++) {
				int v1 = neighbors.get(i);
				if (visited.contains(v1) == false && toVisit.contains(v1) == false) {
					distance[v1-1] = distance[v-1] + 1;
					toVisit.add(v1);
				}
			}
		}
	}
	
	public static void main(String args[]) {
		Main b = new Main();
		b.loadAdjList();
		b.getBFS(1);
		for (int i = 0; i < b.distance.length; i++) {
			System.out.println(i+1 + " " + b.distance[i]);
		}
	}
}

