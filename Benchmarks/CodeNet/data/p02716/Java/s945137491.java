import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int a[] = new int[N];
		for (int i=0;i<N;i++) {
			a[i] =sc.nextInt();
		}
		long sum =0;
		long dp[][] = new long[3][N];
		dp[0][0] = 0;
		dp[1][0] = a[0];
		dp[0][1] = 0;
		dp[1][1] = a[1];
		dp[0][2] = 0;
		dp[1][2] = Math.max(a[0], Math.max(a[1], a[2]));
		dp[2][2] = a[0]+a[2];
		for (int i=3;i<N;i++) {
			if (i%2==0) {
				dp[0][i] = dp[0][i-2];
				dp[1][i] = Math.max(dp[1][i-2], dp[2][i-2]);
				dp[1][i] = Math.max(dp[1][i], dp[0][i-2]+a[i]);
				dp[2][i] = Math.max(dp[2][i-2]+a[i], dp[1][i-2]+a[i]);
			} else {
				dp[0][i] = dp[0][i-2]+a[i];
				dp[1][i] = Math.max(dp[2][i-2], dp[1][i-2]+a[i]);
				dp[2][i] = Math.max(dp[2][i-2], dp[1][i-2]+a[i]);
			}
		}
		if (N%2==1) {
			System.out.println(dp[2][N-1]);
		} else {
			System.out.println(Math.max(dp[2][N-1], dp[1][N-1]));
		}
	}
}