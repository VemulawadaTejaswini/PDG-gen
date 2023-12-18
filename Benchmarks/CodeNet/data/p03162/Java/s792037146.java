import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		int[] b = new int[N];
		int[] c = new int[N];
		for (int i=0;i<N;i++) {
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
			c[i]=sc.nextInt();
		}

		int[][] dp = new int[N+1][3];
		dp[0][0]=0;
		for (int i=0;i<N;i++) {
			dp[i+1][0]=Math.max(dp[i][1]+a[i],dp[i][2]+a[i]);
			dp[i+1][1]=Math.max(dp[i][0]+b[i],dp[i][2]+b[i]);
			dp[i+1][2]=Math.max(dp[i][0]+c[i],dp[i][1]+c[i]);
		}
		int max=0;
		for (int i=0;i<3;i++) {
			max=Math.max(max,dp[N][i]);
		}
		System.out.println(max);
	}
}