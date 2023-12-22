

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static final void main(String[] args) {
		new Main();
	}

	int n;
	int m;
	int[] c;
	int[] x;
	
	public Main() {
		Scanner sc = new Scanner(System.in);
		while(true){
			n = sc.nextInt();
			m = sc.nextInt();
		
			if(n==0 && m==0)
				break;
			
			c = new int[m];
			x = new int[n];
			for(int i=0;i<m;i++)
				c[i] = sc.nextInt();
			for(int i=0;i<n;i++)
				x[i] = sc.nextInt();
			
			solve();
		}
		
	}

	private void solve() {
		int[][] dp = new int[n+1][255+1];
		for(int i=0;i<dp.length;i++)
			Arrays.fill(dp[i], Integer.MAX_VALUE);
		
		dp[0][128] = 0;
		int ny = 0;
		for(int i=0;i<dp.length-1;i++){
			for(int j=0;j<dp[i].length;j++){
				if(dp[i][j]==Integer.MAX_VALUE)
					continue;
				for(int k=0;k<c.length;k++){
					ny = Math.max(0, j + c[k]);
					ny = Math.min(ny, 255);
					dp[i+1][ny] = Math.min(dp[i+1][ny], dp[i][j] + (x[i]-ny)*(x[i]-ny));
				}
			}
		}
		int res = Integer.MAX_VALUE;
		for(int i=0;i<dp[n].length;i++)
			res = Math.min(res, dp[n][i]);
		System.out.println(res);
	}
}