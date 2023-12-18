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
		for(int i=1;i<=N;i++){
			array[i] = sc.nextLong();
			sum += array[i];
		}

		long [][]dp = new long[3002][3002];

		long X = solve(array, 1, N, 1, dp);
		long Y = sum-X;
		return X-Y;
	}


	private long solve(long[]array, int left, int right, int turn, long[][] dp) {

		if(left>right) return 0;
		if (dp[left][right] != 0) return dp[left][right];

		long answer =0;
		if (turn==1) {
			long leftVal = array[left] + solve(array, left+1, right, 0, dp);
			long rightVal = array[right] + solve(array, left, right-1, 0, dp);
			answer = Math.max(leftVal, rightVal);
		} else {
			long leftVal = solve(array, left+1, right, 1, dp);
			long rightVal = solve(array, left, right-1, 1, dp);
			answer = Math.min(leftVal, rightVal);
		}

		dp[left][right] = answer;

		return answer;
	}

}