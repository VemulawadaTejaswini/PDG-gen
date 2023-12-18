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
		int [] array = new int[N+1];
		for(int i=1;i<=N;i++) {
			array[i] = sc.nextInt();
		}

		long [][] dp = new long[N+2][K+2];
		for(int i=0;i<=K;i++) {
			dp[1][i] = ((i<=array[1]) ? 1 : 0);
		}
		long MOD = (long)(1e9+7);

		for(int i=2;i<=N;i++){
			for(int j=0;j<=K;j++) {
				dp[i][j] = (MOD+ dp[i-1][j] + ((j==0) ? 0 :dp[i][j-1]) - (((j-1-array[i])>=0) ? dp[i-1][j-1-array[i]] : 0))%MOD;				
			}
		}
		return dp[N][K];
	}

 
}