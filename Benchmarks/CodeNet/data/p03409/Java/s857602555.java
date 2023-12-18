import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	static class Edge {
		int to, weight,size;
		Edge(int to, int weight, int size) {
			this.to = to;
			this.weight = weight;
			this.size = size;
		}
	}

	static List<Edge> G[];
	static void addEdge(int from, int to, int weight) {
		G[from].add(new Edge(to, weight, G[to].size()));
		G[to].add(new Edge(from, 0, G[from].size() - 1));
	}

	static boolean[] used = new boolean[10000];
	static int maxFlow(int s, int t) {
		int flow = 0;
		while(true) {
			Arrays.fill(used, false);
			int f = dfs(s, t, 10000);
			if(f == 0) return flow;
			flow += f;
		}
	}

	static int dfs(int s, int t, int f) {
		if(s == t) return f;
		used[s] = true;
		for(int i = 0 ; i < G[s].size() ; i++) {
			Edge edge = G[s].get(i);
			if(!used[edge.to] && edge.weight > 0) {
				int d = dfs(edge.to, t, Math.min(f, edge.weight));
				if(d > 0) {
					edge.weight -= d;
					G[edge.to].get(edge.size).weight += d;
					return d;
				}
			}
		}
		return 0;
	}

	static class Point {
		int x, y;
		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		int[] d = new int[n];
		Point[] red = new Point[n];
		Point[] blue = new Point[n];
		G = new ArrayList[2 * n + 2];
		for(int i = 0 ; i < 2 * n + 2 ; i++) G[i] = new ArrayList<>();
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		for(int i = 0 ; i < n ; i++) {
			c[i] = sc.nextInt();
			d[i] = sc.nextInt();
		}
		for(int i = 0 ; i < n ; i++) {
			red[i] = new Point(a[i], b[i]);
			blue[i] = new Point(c[i], d[i]);
		}
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				if(red[i].x < blue[j].x && red[i].y < blue[j].y) addEdge(j + 1, i + n + 1, 1);
			}
		}
		for(int i = 0 ; i < n ; i++) addEdge(0, i + 1, 1);
		for(int i = 0 ; i < n ; i++) addEdge(i + n + 1, 2 * n + 1, 1);
		System.out.println(maxFlow(0, 2 * n + 1));
	}
}
