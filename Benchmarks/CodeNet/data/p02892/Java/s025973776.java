import java.util.*;
public class Main {

	static int N;
	static int[] color;
	static List<Integer>[] e;
	
	static boolean dfs(int v, int c) {
		color[v] = c;
		for(int i : e[v]) {
			if(color[i] == c)
				return false;
			if(color[i] == 0 && !dfs(i, -c))
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int INF  = Integer.MAX_VALUE / 2;
		N = sc.nextInt();
		color = new int[N];
		e = new ArrayList[N];
		int[][] d = new int[N][N];
		for(int i = 0; i < N; i++) {
			e[i] = new ArrayList<>();
			String S = sc.next();
			for(int j = 0; j < N; j++) {
				if(i == j)
					continue;
				if(S.charAt(j) == '1') {
					e[i].add(j);
					d[i][j] = 1;
				}
				else
					d[i][j] = INF;
			}
		}
		if(!dfs(0, 1)) {
			System.out.println(-1);
			return;
		}
		int dmax = 0;
		for(int k = 0; k < N; k++)
			for(int i = 0; i < N; i++)
				for(int j = 0; j < N; j++)
					d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
		for(int i = 0; i < N; i++)
			for(int j = 0; j < N; j++)
				if(d[i][j] != INF)
					dmax = Math.max(dmax, d[i][j]);
		System.out.println(dmax + 1);
	}

}