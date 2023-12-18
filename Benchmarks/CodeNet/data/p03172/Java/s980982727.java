import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Main ans = new Main();
		System.out.println(ans.solve());
	}

	private long solve() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long [] array = new long[N+1];
		for(int i=1;i<=N;i++){
			array[i] = sc.nextLong();
		}

		long [][] dp = new long[N+1][K+1];
		long MOD = (long) 1e9+7;

		for(int i=0;i<=K;i++){
			dp[1][i] = (i<=array[1]) ? 1 : 0;
		}

		for(int i=2;i<=N;i++){
			for(int j=0;j<=K;j++){
				if (j==0) {
					dp[i][j] = dp[i-1][j];
				} else {
					dp[i][j] = (dp[i-1][j] + dp[i][j-1] - (((j-1-array[i]) >=0) ? dp[i-1][(int)(j-1-array[i])] : 0))%MOD;
				}
			}
		}

		return dp[N][K];
	}

}