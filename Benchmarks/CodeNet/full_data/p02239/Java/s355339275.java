import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		Graph gph = new Graph();
		gph.loadAdjList();
		gph.breadthFirstSearch();
	}

}

class Graph {
	private int totalVertex;
	private LinkedList<LinkedList<Integer>> adjList;
	private ArrayList<Integer> visited = new ArrayList<Integer>();
	//adjacency list of edges	
	public Graph() { totalVertex = 0; }
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
	
	public void breadthFirstSearch() {
		boolean[] vis = new boolean[totalVertex];
		int[] dist = new int[adjList.size()];
		for (int i = 1; i < dist.length; i++) {
			dist[i] = 999999999;
		}
		
		//Queue<LinkedList<Integer>> toVisit = new LinkedList<LinkedList<Integer>>();
		ArrayList<Integer> toVisit = new ArrayList<Integer>();
		//toVisit.add(adjList.get(0));
		toVisit.add(0);
		while(toVisit.size() > 0) {
			//LinkedList<Integer> u = toVisit.remove();
			int v = toVisit.remove(0);
			//int num = adjList.indexOf(u);
			//visited.add(num);
			//vis[num] = true;
			vis[v] = true;
			//System.out.println();
			LinkedList<Integer> neighbors = adjList.get(v);
			for (int i = 0; i < neighbors.size(); i++) {
				int v1 = neighbors.get(i);
				if(!vis[v1] && !toVisit.contains(v1)) {
					toVisit.add(v1);
					//dist[v] = Math.min(dist[v1], dist[v] + 1);
				}
				dist[v1] = Math.min(dist[v1], dist[v] + 1);
			}
//			for (int i = 0; i < u.size(); i++) {
//				int v = u.get(i);
//				if (!vis[v] && !visited(v, toVisit)) {
//					toVisit.add(adjList.get(v));
//					//dist[v] = Math.min(dist[v], dist[num] + 1);
//				}
//				dist[v] = Math.min(dist[v], dist[num] + 1);
//			}	
		}
		
		for (int i = 0; i < dist.length; i++) {
			if (dist[i] == 999999999) {
				dist[i] = -1;
			}
			System.out.println((i + 1) + " " + dist[i]);
		}
	}
	
	public boolean visited(int v, Queue<LinkedList<Integer>> q) {
		LinkedList<LinkedList<Integer>> temp = (LinkedList<LinkedList<Integer>>) q;
		for (int i = 0; i < temp.size(); i++) { 
			LinkedList<Integer> curr = temp.get(i);
			if (curr.size() > 0 && curr.get(0) == v) {
				//temp.remove(curr);
				return true;
			}
		}
		
//		while (q.size() > 0) {
//			LinkedList<Integer> curr = q.remove();
//			if (curr.size() > 0 && curr.getFirst() == v) {
//				return true;
//			}
//		}

		return false;
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
