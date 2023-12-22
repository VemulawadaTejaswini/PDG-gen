

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		int E = sc.nextInt();
			
		int[][] matrix = new int[V][V];
		for (int i = 0; i < V; i++) {
			Arrays.fill(matrix[i], -1);
		}
		for (int i = 0; i < E; i++) {
			int s = sc.nextInt();
			int t = sc.nextInt();
			int w = sc.nextInt();
			matrix[s][t] = w;
			matrix[t][s] = w;
		}
		solve(V, E, matrix);
	}
	
	public static void solve(int V, int E, int[][] matrix) {
		boolean[] visited = new boolean[V];
		PriorityQueue<Edge> que = new PriorityQueue<Edge>(10000, new Comparator<Edge>() {
			@Override
			public int compare(Edge o1, Edge o2) {
				return o1.w - o2.w;
			}
		});
		
		int node = 0;
		visited[node] = true;
		int d = 0;
		int count = 0;
		for (int i = 0; i < V; i++) {
			if (matrix[node][i] >= 0) {
				que.add(new Edge(node, i, matrix[node][i]));
			}
		}
		while(que.isEmpty() == false) {
			Edge edge = que.poll();
			if (visited[edge.t]) 
				continue;
			
			visited[edge.t] = true;
			node = edge.t;
			d += edge.w;
					
			for (int i = 0; i < V; i++) {
				if (matrix[node][i] >= 0 && !visited[i]) {
					que.add(new Edge(node, i, matrix[node][i]));
				}
			}
			count++;
			if (count >= V-1)
				break;
		}
		System.out.println(d);
	}
}

class Edge {
	int s;
	int t;
	int w;
	public Edge(int s, int t, int w) {
		this.s = s;
		this.t = t;
		this.w = w;
	}
}