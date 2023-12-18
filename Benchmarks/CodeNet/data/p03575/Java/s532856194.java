import java.util.Scanner;

public class Main {

	static boolean[][] gragh;
	static boolean[] vis;
	static int n, m;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		int[] a = new int[m];
		int[] b = new int[m];
		for(int i = 0 ; i < m ; i++) {
			a[i] = sc.nextInt() - 1;
			b[i] = sc.nextInt() - 1;
		}
		gragh = new boolean[n][n];
		for(int i = 0 ; i < m ; i++)  gragh[a[i]][b[i]] = gragh[b[i]][a[i]] = true;
		int ans = 0;
		vis = new boolean[n];
		for(int i = 0 ; i < m ; i++) {
			gragh[a[i]][b[i]] = gragh[b[i]][a[i]] = false;
			for(int j = 0 ; j < n ; j++) vis[j] = false;
			dfs(0);
			for(int j = 0 ; j < n ; j++) {
				if(vis[j] == false) {
					ans++;
					System.out.println(a[i] + " " + b[i]);
					break;
				}
			}
			gragh[a[i]][b[i]] = gragh[b[i]][a[i]] = true;
		}
		System.out.println(ans);
	}

	static void dfs(int x) {
		vis[x] = true;
		for(int i = 0 ; i < n ; i++) {
			if(gragh[x][i] == true && vis[i] == false) {
				dfs(i);
			}
		}
	}

}