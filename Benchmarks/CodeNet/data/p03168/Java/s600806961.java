import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		double[] p = new double[n];
		
		for(int l=0;l<n;l++) {
			p[l] = in.nextDouble();
		}
		
		double[][] dp = new double[n+1][n+1];
		dp[0][0]=1;
		
		for(int i=1;i<=n;i++) {
			for(int j=0;j<=i;j++) {
				if(j==0) dp[i][j] = dp[i-1][j]*(1-p[i-1]);
				else {
					dp[i][j] = dp[i-1][j-1]*p[i-1] + dp[i-1][j]*(1-p[i-1]);
				}
			}
				
		}
//		print2d(dp);
		double ans=0;
		for(int i=(n+1)/2 ; i<=n;i++) {
			ans+=dp[n][i];
		}
		System.out.println(ans);

	}
		
	private static int ch(int j) {
		if(j==1) return 0;
		if(j==0) return 1;
		return 0;
	}

	public static void print2d(double[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}
}