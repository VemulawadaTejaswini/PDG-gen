import java.util.Scanner;

public class Main {
	static int[][]G;
	static int[]c;
	static int cnt = 0;
	static int N;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		G = new int[N][N];
		c = new int[N];
		int M = sc.nextInt();
		for(int i = 0; i < M; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			G[a][b] = 1;
			G[b][a] = 1;
		}
		sc.close();
		dfs(0, 0);
		System.out.println(cnt);
	}
	static void dfs(int n, int v) {
		if(n == N - 1) {
			for(int i = 1; i < N; i++) {
				if(c[i] != 1) {
					return;
				}
			}
			cnt++;
			return;
		}
		for(int i = 1; i < N; i++) {
			if(c[i] == 0 && G[v][i] == 1) {
				n++;
				c[i] = 1;
				dfs(n, i);
				c[i] = 0;
				n--;
			}
		}
	}
}