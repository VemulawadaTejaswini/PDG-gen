import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int p = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(n==0 && m==0 && p==0 && a==0 && b==0) break;
			
			int[] t = new int[n];
			for(int i=0;i<n;i++) t[i] = sc.nextInt();
			
			int[][] d = new int[m+1][m+1];
			for(int i=0;i<=m;i++) Arrays.fill(d[i], Integer.MAX_VALUE);
			
			for(int i=0;i<p;i++){
				int x = sc.nextInt();
				int y = sc.nextInt();
				int z = sc.nextInt();
				d[x][y] = d[y][x] = z;
			}
			
			double[][] dp = new double[1<<n][m+1];
			for(int i=0;i<1<<n;i++) Arrays.fill(dp[i], Integer.MAX_VALUE);
			dp[(1<<n)-1][a] = 0;
			
			
			for(int s=(1<<n)-1;s>=0;s--){
				for(int v=1;v<=m;v++){
					for(int i=0;i<n;i++){
						if((s>>i&1)==1){
							for(int u=1;u<=m;u++){
								if(d[v][u]>=0){
									dp[s&~(1<<i)][u] = Math.min(dp[s&~(1<<i)][u], dp[s][v] + (double)d[v][u]/t[i]);
								}
							}
						}
					}
				}
			}
			
			double res = Integer.MAX_VALUE;
			for(int i=0;i<(1<<n)-1;i++) res = Math.min(res, dp[i][b]);
			
			if(res>10000) System.out.println("Impossible");
			else System.out.printf("%.3f\n", res);
		}	
	}	
}