import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Graph {
	private int totalVertex;
	Queue<Integer> q1,q2;
	int[] distance;
	boolean[] visited;
	boolean[][] connected;
	
	Graph() {
		totalVertex = 0;
	}
	
	int getTotalVertex() {
		return totalVertex;
	}
	
	public void loadAdjList() {
		Scanner sc = new Scanner(System.in);
		totalVertex = sc.nextInt();
		distance=new int[totalVertex];
		visited=new boolean[totalVertex];
		connected=new boolean[totalVertex][totalVertex];
		q1=new LinkedList<Integer>();
		q2=new LinkedList<Integer>();
		
		q1.add(0);
		for(int i = 0; i < totalVertex; i++) {
			int u = sc.nextInt() - 1;
			int k = sc.nextInt();
			for(int j = 0; j < k; j++) {
				int v=sc.nextInt() - 1;
				connected[u][v]=true;
			}
			distance[i] = -1;
		}
		sc.close();
	}
	
	public void BFS() {
		for(int i = 0; i < totalVertex; i++) {
			while(!q1.isEmpty()) {
				int node = q1.poll();
				if(visited[node] == true) {
					continue;
				}
				else {
					visited[node] = true;
					distance[node] = i;
				}
				for(int j = 0; j < totalVertex; j++) {
					if(connected[node][j] == true) {
						q2.add(j);
					}
				}
			}
			q1 = q2;
			q2 = new LinkedList<Integer>();
		}
	}
	
	public void print() {
		for(int i = 1; i <= totalVertex; i++) {
			System.out.println(i + " " + distance[i-1]);
		}
	}
}

public class Main {
	public static void main(String argv[]) {
		Graph g = new Graph();
		g.loadAdjList();
		g.BFS();
		g.print();
	}
}
