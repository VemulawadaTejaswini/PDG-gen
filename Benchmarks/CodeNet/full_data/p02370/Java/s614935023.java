import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		V = sc.nextInt();
		E = sc.nextInt();
		g = new ArrayList[V];
		for (int i = 0; i < V; ++i)
			g[i] = new ArrayList<>();

		for (int i = 0; i < E; ++i) {
			int s = sc.nextInt();
			int t = sc.nextInt();
			g[s].add(t);
		}

		vis = new boolean[V];
		ord = new int[V];
		pending = new boolean[V];

		topologialSort();

		for (int i = V - 1; i >= 0; --i) {
			System.out.println(ord[i]);
		}

	}

	static ArrayList<Integer>[] g;
	static boolean[] vis;
	static boolean[] pending;
	static int V, E;
	static int[] ord;
	static int now = 0;

	static void topologialSort() {
		for (int i = 0; i < V; ++i) {
			if (!vis[i])
				dfs(i, -1);
		}
	}

	static void dfs(int cur, int pre) {
		pending[cur]=true;
		for (int to : g[cur]) {
			if (!vis[to] && pre != cur){
				if(pending[to])throw new AssertionError();
				dfs(to, cur);
			}
		}
		vis[cur] = true;
		ord[now++] = cur;
	}
}