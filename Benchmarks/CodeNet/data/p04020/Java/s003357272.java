import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n+1];
		long ans = 0;
		for(int i=0;i<n;i++) {
			a[i] =sc.nextInt();
		}
		a[n] =0;
		
		
		long dp[][] = new long[n+2][2];
		dp[1][0] = a[0]/2;
		if(a[0]>=1) {
			dp[1][1] = (a[0]-1)/2;
		}
		for(int i=2;i<n+2;i++) {
			for(int j=0;j<2;j++) {
				for(int k=0;k<2;k++) {
					
					if(j+k >a[i-1] || j>a[i-2]) {
						continue;
					}
					
					
					dp[i][k] = Math.max(dp[i][k],k+(a[i-1]-k-j)/2+dp[i-1][j]);
				}
			}
		}
		

		System.out.println(dp[n+1][0]);
	}
}
