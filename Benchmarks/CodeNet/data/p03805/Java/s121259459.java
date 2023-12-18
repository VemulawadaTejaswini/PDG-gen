import java.util.Scanner;

public class Main {

	static boolean[][] graph;
	static boolean[] vis;
	static int n, m, count;
	static int[] a, b;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		a = new int[m];
		b = new int[m];
		vis = new boolean[n];
		graph = new boolean[n][n];
		for(int i = 0 ; i < m ; i++) {
			a[i] = sc.nextInt() - 1;
			b[i] = sc.nextInt() - 1;
			graph[a[i]][b[i]] = graph[b[i]][a[i]] = true;
		}
		for(int i = 0 ; i < n ; i++) vis[i] = false;
		vis[0] = true;
		dfs(0);
		System.out.println(count);
	}

	public static void dfs(int v) {
		boolean all_ok = true;
		for(int i = 0 ; i < n ; i++) {
			if(vis[i] == false) all_ok = false;
		}
		if(all_ok) count++;
		for(int i = 0 ; i < n ; i++) {
			if(graph[v][i] == false) continue;
			if(vis[i] == true) continue;
			vis[i] = true;
			dfs(i);
			vis[i] = false;
		}
		return;
	}

}
