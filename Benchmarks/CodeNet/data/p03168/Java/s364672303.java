import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Main ans = new Main();
		System.out.printf("%.10f\n",ans.solve());
	}

	private double solve() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double [] array = new double[N+1];
		for(int i=1;i<=N;i++){
			array[i] = sc.nextDouble();
		}

		double [][] dp = new double[3001][3001];

		dp[0][0]=1.0;
		for(int i=1;i<=N;i++){
			Arrays.fill(dp[i], -1);
		}

		return solve(array, dp, N, (N+1)/2);
 
	}

	private double solve(double[] array, double [][]dp, int i, int x) {

		if (x==0) return 1.0;
		if (N==0) return 0;

		if(dp[i][x]>-0.9) return dp[i][x];
		 
		dp[i][x] = ((1-array[i])* solve(array, dp, i-1, x)) + (array[i]* solve(array, dp, i-1, x-1)); 
		//System.out.printf("dp[%d][%d]: %d\n", i, x, dp[i][x]);
		
		return dp[i][x];
	}

}