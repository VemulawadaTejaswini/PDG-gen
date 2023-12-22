import java.math.BigInteger;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.ArrayList;
public class Main{	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		int E = sc.nextInt();
		ArrayList<Integer>[] g = new ArrayList[V];
		for (int i = 0; i < V; ++i) {
			g[i] = new ArrayList<>();
		}
		for (int i = 0; i < E; ++i) {
			int s = sc.nextInt();
			int t = sc.nextInt();
			g[s].add(t);
		}
		vis = new boolean[V];
		sort(g);
		for(int i=lis.size()-1;i>=0;--i){
			System.out.println(lis.get(i));
		}
	}

	static boolean[] vis;
	static ArrayList<Integer> lis = new ArrayList<>();

	static void sort(ArrayList<Integer>[] g) {
		int n = g.length;
		for (int i = 0; i < n; ++i) {
			if (!vis[i]) {
				dfs(i, -1, g);
			}
		}
	}

	static void dfs(int cur,int pre, ArrayList<Integer>[] g) {
		vis[cur] = true;
		for (int to : g[cur]) {
			if (!vis[to]) {
				dfs(to, cur, g);
			}
		}
		lis.add(cur);
	}
}