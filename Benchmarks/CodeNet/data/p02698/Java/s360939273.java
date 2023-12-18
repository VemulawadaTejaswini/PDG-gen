import java.util.*;
public class Main {
	
	public static boolean[] vis;
	public static ArrayList<Integer>[] adj;
	public static int[] lis;
	public static int[] val;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		adj = new ArrayList[n];
		val = new int[n];
		for (int i = 0; i < n; i++) {
			adj[i] = new ArrayList<Integer>();
			val[i] = in.nextInt();
		}
		for (int i = 0; i < n-1; i++) {
			int u = in.nextInt()-1, v = in.nextInt()-1;
			adj[u].add(v);
			adj[v].add(u);
		}
		for (int i = 0; i < n; i++) System.out.println(i + ": " + adj[i]);
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(val[0]);
		vis = new boolean[n];
		vis[0] = true;
		lis = new int[n];
		lis[0] = 1;
		for (int i = 0; i < adj[0].size(); i++) {
			dfs(adj[0].get(i), arr);
		}
		for (int i = 0; i < n; i++) System.out.println(lis[i]);
	}
	
	public static void dfs(int i, ArrayList<Integer> ls) {
		if (vis[i]) return;
		vis[i] = true;
		if (val[i] > ls.get(ls.size()-1)) {
			ls.add(val[i]);
			lis[i] = ls.size();
			for (int j = 0; j < adj[i].size(); j++) {
				dfs(adj[i].get(j), ls);
			}
			ls.remove(ls.size()-1);
		} else {
			int low = 0, high = ls.size()-1;
			while (low < high) {
				int mid = (low+high)/2;
				if (val[i] > ls.get(mid)) low = mid+1;
				else high = mid;
			}
			int rep = ls.set(high, val[i]);
			lis[i] = ls.size();
			for (int j = 0; j < adj[i].size(); j++) {
				dfs(adj[i].get(j), ls);
			}
			ls.set(high, rep);
		}
	}
}