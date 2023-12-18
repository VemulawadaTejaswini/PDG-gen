import java.util.*;
public class Main {
	
	static boolean[] used;
	static int[] r;
	static int[][] d;
	static int INF = Integer.MAX_VALUE/2, R;
	static long ans = INF;
	
	static void dfs(int now, long cost, int cnt) {
		if(cnt == R) {
			ans = Math.min(ans, cost);
			return;
		}
		for(int i : r)
			if(!used[i]) {
				used[i] = true;
				dfs(i, cost + d[now][i], cnt + 1);
				used[i] = false;
			}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		R = sc.nextInt();
		r = new int[R];
		used = new boolean[N];
		d = new int[N][N];
		Arrays.setAll(r, i -> sc.nextInt()-1);
		for(int i = 0; i < N; i++)
			for(int j = 0; j < N; j++)
				if(i != j)
					d[i][j] = INF;
		for(int i = 0; i < M; i++) {
			int A = sc.nextInt()-1;
			int B = sc.nextInt()-1;
			int C = sc.nextInt();
			d[A][B] = C;
			d[B][A] = C;
		}
		for(int k = 0; k < N; k++)
			for(int i = 0; i < N; i++)
				for(int j = 0; j < N; j++)
					d[i][j] = Math.min(d[i][j], d[i][k] + d[j][k]);
		for(int i : r) {
			used[i] = true;
			dfs(i, 0, 1);
			used[i] = false;
		}
		System.out.println(ans);
	}

}