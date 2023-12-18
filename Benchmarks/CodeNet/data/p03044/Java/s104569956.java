import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	static class Edge{
		int to;
		int dist;
		public Edge(int to, int dist) {
			this.to = to;
			this.dist = dist;
		}
	}

	static void dfs(List<List<Edge>> graph, int[] color, int dist_from_0, int start) {
		for(Edge next : graph.get(start)) {
			if(color[next.to] != -1) continue;
			dist_from_0 += next.dist;
			if(dist_from_0 % 2 == 0) color[next.to] = 0;
			else color[next.to] = 1;
			dfs(graph, color, dist_from_0, next.to);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] color = new int[n];
		Arrays.fill(color, -1);
		List<Edge> e = new ArrayList<>();
		List<List<Edge>> graph = new ArrayList<>(Collections.nCopies(n, e));
		int dist_from_0 = 0;

		for(int i = 0; i < n - 1; i++) {
			int u = sc.nextInt() - 1;
			int v = sc.nextInt() - 1;
			int w = sc.nextInt();
			graph.get(u).add(new Edge(v, w));
			graph.get(v).add(new Edge(u, w));
		}

		color[0] = 0;
		dfs(graph, color, dist_from_0, 0);
		for(int value : color) {
			System.out.println(value);
		}
		sc.close();
	}
}