import java.util.*;

public class Main {
	
	static final int INF = Integer.MAX_VALUE/2;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), l = sc.nextInt();
		int to[][] = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j)to[i][j] = 0;
				else to[i][j] = INF;
			}
		}
		for(int i=0;i<m;i++) {
			int a = sc.nextInt()-1, b = sc.nextInt()-1, c = sc.nextInt();
			to[a][b] = c; to[b][a] = c;
		}
		for(int k = 0;k<n;k++) {
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					to[i][j] = Math.min(to[i][j], to[i][k] + to[k][j]);
				}
			}
		}
		
		for(int i=0;i<n;i++) for(int j=0;j<n;j++) {
			if(to[i][j]==0)continue;
			if(to[i][j]<=l)to[i][j] = 1;
			else to[i][j] = INF;
		}
		
		for(int k = 0;k<n;k++) {
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					to[i][j] = Math.min(to[i][j], to[i][k] + to[k][j]);
				}
			}
		}
		
		int q = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<q;i++) {
			int s = sc.nextInt()-1, t = sc.nextInt()-1;
			if(to[s][t] == INF) sb.append(-1 + "\n");
			else {
				sb.append((to[s][t] - 1) + "\n");
			}
		}
		System.out.println(sb.toString());
	}
}

