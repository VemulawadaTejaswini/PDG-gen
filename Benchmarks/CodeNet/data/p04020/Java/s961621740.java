import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		long ans = 0;
		for(int i=0;i<n;i++) {
			a[i] =sc.nextInt();
		}
		
		
		long dp[][] = new long[n+1][2];
		for(int i=0;i<n+1;i++) {
			for(int j=0;j<2;j++) {
				dp[i][j] = -10000000;
			}
		}
		dp[0][0] = 0;
		for(int i=1;i<n+1;i++) {
			for(int j=0;j<2;j++) {
				for(int k=0;k<2;k++) {
					
					if(j+k >a[i-1]) {
						continue;
					}
					
					
					dp[i][k] = Math.max(dp[i][k],k+(a[i-1]-k-j)/2+dp[i-1][j]);
				}
			}
		}
		

		System.out.println(Math.max(dp[n][0],dp[n][1]));
	}
}
