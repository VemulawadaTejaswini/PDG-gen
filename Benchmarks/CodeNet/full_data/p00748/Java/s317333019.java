

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main p = new Main();
	}

	public Main() {
		
		solve();
		
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			
			System.out.println(dp[0][n] +" " +dp[1][n]);
		}
	}

	int[][] dp = new int[2][100001];
	public void solve() {
		int[] tetra = new int[200];
		for(int i=1;i<tetra.length;i++){
			tetra[i] = i*(i+1)*(i+2)/6;
		}
		
		
		Arrays.fill(dp[0], 10000);
		Arrays.fill(dp[1], 10000);
		dp[0][0] = dp[1][0] =0;
		for(int i=1;i<tetra.length;i++){
			int t = tetra[i];
			for(int j=0;j<dp[0].length-t;j++){
				dp[0][j+t] = Math.min(dp[0][j+t], dp[0][j]+1);
				if(t%2==0)
					continue;
				dp[1][j+t] = Math.min(dp[1][j+t], dp[1][j]+1);
			}
		}
	}

}