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
		long sum=0;
		for(int i=1;i<=N;i++) {
			array[i] = sc.nextLong();
			sum += array[i];
		}

		long [][] dp = new long[3002][3002];

		long X = solve(dp, array, 1, N, 1);
		long Y = sum-X;
		return X-Y;
	}

	private long solve(long [][] dp, long []array, int i, int j, int turn) {

		if(i>j) return 0;
		if (dp[i][j]!=0) return dp[i][j];
		if (turn==1) {
			long selectLeft = array[i] + solve(dp, array, i+1, j, 0);
			long selectRight = array[j] + solve(dp, array, i, j-1, 0);
			dp[i][j] = Math.max(selectLeft, selectRight);
		} else {
			long selectLeft = solve(dp, array, i+1, j, 1);
			long selectRight = solve(dp, array, i, j-1, 1);
			dp[i][j] = Math.min(selectLeft, selectRight);
		}
		return dp[i][j];

	}

}