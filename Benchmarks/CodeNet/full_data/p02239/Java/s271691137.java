//C343, this program implements BFS approach for shortest path problem (unweighted graph)

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;
import java.util.*;

class Graph {
	private int totalVertex;
	private LinkedList<LinkedList<Integer>> adjList;
	//adjacency list of edges
	public Graph() { totalVertex = 0; }
	public int getTotalVertex() { return totalVertex; }
	public void loadAdjList() {
		Scanner in = new Scanner(System.in);
		totalVertex = in.nextInt();
		adjList = new LinkedList<LinkedList<Integer>>();
		for(int i = 0; i < totalVertex; i ++) {
			LinkedList<Integer> tmp = new LinkedList<Integer>();
			int idx1 = in.nextInt() - 1; //-1, index
			int degree = in.nextInt();
			//System.out.println("mark idx1 = " + idx1 + " degree = " + degree);
			for(int j = 0; j < degree; j ++) {
				int idx2 = in.nextInt() - 1; //-1, index
				tmp.add(idx2);
			}	
			adjList.add(tmp);
		}
		in.close();
	}
	
	public int[] computeDistDFS(int vertex) {
		LinkedList<Integer> lList = new LinkedList<Integer>();
		lList.add(vertex);
		int[] yoYouBeenThere = new int[totalVertex];
		int[] distance = new int[totalVertex];
		
		for(int i = 0; i < totalVertex; i ++) {
			yoYouBeenThere[i] = 0; 
			distance[i] = -1; 
		}
		distance[vertex] = 0;
		yoYouBeenThere[vertex] = 1;
		int j;
		while(!lList.isEmpty()) {
			j = lList.remove(0); 
			Iterator<Integer> it = adjList.get(j).iterator();
			int k;
			while(it.hasNext()) {
				k = it.next();
				if(yoYouBeenThere[k] == 0) {
					lList.add(k); 
					distance[k] = distance[j] + 1;
					yoYouBeenThere[k] = 1;
				}
			}
		}
		return distance;
	}
}

public class Main {
	public static void main(String[] argv) {
		Graph g = new Graph();
		g.loadAdjList();
		int[] dist = g.computeDistDFS(0);
		for(int i = 0; i < g.getTotalVertex(); i ++) {
			System.out.println((i+1) + " " + dist[i]);
		}
	}
}

