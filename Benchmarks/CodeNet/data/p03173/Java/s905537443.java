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
		int [] array = new int[N+1];

		for(int i=1;i<=N;i++){
			array[i] = sc.nextInt();
		}		 
		long [][] dp = new long[N+1][N+1];
 		long [][] sum = preProcess(array, N);
 		return solve(sum, 1, N, dp);
	}

	private long solve(long [][]sum, int i, int j, long[][] dp) {
		if (i==j) return 0;
		if (dp[i][j] != 0) return dp[i][j];

		long bestCost = (long) (1e15);
		for(int k=i;k<=j-1;k++) {
			long cost = sum[i][j] + solve(sum, i, k, dp) + solve(sum, k+1, j, dp);
			bestCost = Math.min(bestCost, cost);
		}
		dp[i][j] = bestCost;
		return bestCost;
	}

	private long [][] preProcess(int[]array, int N) {		 
		long [][] sum = new long[N+1][N+1];
		for(int i=1;i<=N;i++){
			for(int j=i;j<=N;j++){
				sum[i][j] = array[j] + ((i==j) ? 0 : sum[i][j-1]);
			}
		}
		return sum;
	}
}