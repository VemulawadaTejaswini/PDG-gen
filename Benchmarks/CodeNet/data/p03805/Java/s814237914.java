import java.util.Scanner;

public class Main {

	static boolean[][] g;
	static boolean[] vis;
	static int n, m, ans = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		int[] a = new int[m];
		int[] b = new int[m];
		g = new boolean[n][n];
		vis = new boolean[n];
		for(int i = 0 ; i < m ; i++) {
			a[i] = sc.nextInt() - 1;
			b[i] = sc.nextInt() - 1;
			g[a[i]][b[i]] = g[b[i]][a[i]] = true;
		}
		vis[0] = true;
		dfs(0, 0);
		System.out.println(ans);
	}

	static void dfs(int x, int pos) {
		if(pos == n - 1) {
			boolean ok = true;
			for(int i = 0 ; i < n ; i++) {
				if(!vis[i]) ok = false;
			}
			if(ok) ans++;
			return;
		}
		for(int i = 0 ; i < n ; i++) {
			if(!vis[i] && g[x][i]) {
				vis[i] = true;
				dfs(i, pos + 1);
				vis[i] = false;
			}
		}
	}

}
