import java.util.*;

public class Main {
	static int t[] = new int[100];
	static int low[] = new int[100];
	
	static int cnt = 0, n, m;
	static boolean adj[][] = new boolean[100][100];
	
	static int bridge = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		
		for(int i=0;i<m;i++){
			int u = sc.nextInt(), v = sc.nextInt();
			adj[u][v] = true;
			adj[v][u] = true;
		}
		
		dfs(0, 1);
		
		System.out.println(bridge);
	}
	
	static void dfs(int p, int u){
		t[u] = ++cnt;
		low[u] = t[u];
		
		for(int i=1;i<=n;i++){
			if(adj[u][i]){
				if(t[i] != 0 && i!=p){
					low[u] = Math.min(t[i], low[u]);
				}
				else if(t[i] == 0){
					dfs(u, i);
					low[u] = Math.min(low[i], low[u]);
					if(low[i] > t[u]){
						bridge++;
					}
				}
			}
		}
	}
}
