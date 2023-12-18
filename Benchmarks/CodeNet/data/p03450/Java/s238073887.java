import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	static int n, m;
	static int[] l, r, d;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		l = new int[m];
		r = new int[m];
		d = new int[m];
		List<Edge>[] edges = new ArrayList[n];
		for(int i = 0 ; i < n ; i++) edges[i] = new ArrayList<>();
		for(int i = 0 ; i < m ; i++) {
			l[i] = sc.nextInt() - 1;
			r[i] = sc.nextInt() - 1;
			d[i] = sc.nextInt();
			edges[l[i]].add(new Edge(r[i], d[i]));
			edges[r[i]].add(new Edge(l[i], -d[i]));
		}
		boolean ok = true;
		int[] x = new int[n];
		Arrays.fill(x, -Integer.MAX_VALUE);
		for(int i = 0 ; i < n ; i++) {
			if(x[i] == -Integer.MAX_VALUE) {
				x[i] = 0;
				ok &= dfs(i, x, edges);
			}
		}
		System.out.println(ok ? "Yes" : "No");
	}

	static boolean dfs(int i, int[] x, List<Edge>[] edges) {
		List<Edge> edge = edges[i];
		for(int j = 0 ; j < edge.size() ; j++) {
			int to = edge.get(j).to;
			int cost = edge.get(j).cost;
			if(x[to] == -Integer.MAX_VALUE) {
				x[to] = x[i] + cost;
				if(!dfs(to, x, edges)) return false;
			} else {
				if(x[i] + cost != x[to]) return false;
			}
		}
		return true;
	}

	static class Edge {
		int to, cost;
		Edge(int to, int cost) {
			this.to = to;
			this.cost = cost;
		}
	}
}
