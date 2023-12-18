
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		long a[] = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = scn.nextInt();

		}
		long sum[][]=new long[n][n];
		for(int i=0;i<n;i++){
			long s=0;
			for(int j=i;j<n;j++){
				sum[i][j]=a[j]+s;
				s+=a[j];
			}
		}
		
		long dp[][] = new long[n][n];
		for (int g = 0; g < n; g++) {
			for (int i = 0, j = i + g; j < n; j++, i++) {
				if (g == 0) {
					dp[i][j] = 0;
				} else if (g == 1) {
					dp[i][j] = a[i] + a[j];
				} else {
					long ans = Long.MAX_VALUE;
					
					for (int k = i; k <= j; k++) {
						if(k==i){
						ans=Math.min(ans, dp[k+1][j]+sum[k][j]);	
						}
						else  if(k==j){
							ans=Math.min(ans, dp[i][k-1]+sum[i][k]);	
						}
						else{
						ans = Math.min(ans,dp[i][k-1]+dp[k][j]+sum[i][j]);
						}
					}
					dp[i][j] = ans;
				}

			}
		}
		System.out.println(dp[0][n - 1]);

	}
}