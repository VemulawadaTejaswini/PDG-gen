import java.util.*;

public class Main {
	static final long MOD = 1000000007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int C = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		for(int i=0; i<N; i++)
			A[i] = sc.nextInt();
		for(int i=0; i<N; i++)
			B[i] = sc.nextInt();
		
		long[][] dp = new long[N+1][C+1];
		dp[0][0] = 1;
		for(int i=0; i<N; i++) {
			for(int j=0; j<=C; j++) {
				long mul = 1;
				for(int k=j; k<=C; k++) {
					dp[i+1][k] = (dp[i+1][k] + dp[i][j]*mul)%MOD;
					mul = (mul * A[i])%MOD;
				}
			}
		}
		
		System.out.println(dp[N][C]);
		sc.close();
	}
	
}
