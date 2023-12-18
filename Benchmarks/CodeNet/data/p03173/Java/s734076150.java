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
		long [] array = new long[N+1];
		for(int i=1;i<=N;i++){
			array[i] = sc.nextLong();
		}

		long [][] sum = preProcess(array, N);
		long [][] dp = new long[500][500];
		return solve(sum, 1, N, dp);
	}

	private long[][] preProcess(long[] array, int N) {
		long [][] sum = new long[500][500];
		for(int i=1;i<=N;i++){
			for(int j=i;j<=N;j++) {
				sum[i][j] = array[j] + ((i==j) ? 0 : sum[i][j-1]);
			}
		}
		return sum;
	}

	private long solve(long[][] sum, int i, int j, long[][] dp) {
		if (i==j) return 0;
		if (dp[i][j] != 0) return dp[i][j];
		long answer = (long) 1e14+7;
		for(int k=i;k<j;k++) {
			long currAns = sum[i][j] + solve(sum, i, k, dp) + solve(sum, k+1, j, dp);
			answer = Math.min(currAns, answer);
		}
		dp[i][j] = answer;
		return answer;
	}

}
