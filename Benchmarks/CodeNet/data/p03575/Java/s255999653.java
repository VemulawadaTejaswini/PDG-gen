import java.util.Scanner;

public class Main {

	static int n, m;
	static int[] a, b;
	static boolean[][] gragh;
	static boolean[] vis;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		a = new int[m];
		b = new int[m];
		gragh = new boolean[n][n];
		vis = new boolean[n];
		for(int i = 0 ; i < m ; i++) {
			a[i] = sc.nextInt() - 1;
			b[i] = sc.nextInt() - 1;
			gragh[a[i]][b[i]] = gragh[b[i]][a[i]] = true;
		}
		long ans = 0;
		for(int i = 0 ; i < m ; i++) {
			for(int j = 0 ; j < n ; j++) {
				vis[j] = false;
			}
			gragh[a[i]][b[i]] = gragh[b[i]][a[i]] = false;
			dfs(0);
			boolean bridge = false;
			for(int j = 0 ; j < n ; j++) {
				if(!vis[j]) {
					bridge = true;
				}
			}
			if(bridge) ans++;
			gragh[a[i]][b[i]] = gragh[b[i]][a[i]] = true;
		}
		System.out.println(ans);
	}

	public static void dfs(int x) {
		if(vis[x]) return;
		vis[x] = true;
		for(int i = 0 ; i < n ; i++) {
			if(gragh[x][i] == false) continue;
			dfs(i);
		}
	}

}