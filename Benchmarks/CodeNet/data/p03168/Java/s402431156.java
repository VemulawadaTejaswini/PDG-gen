import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Main answer = new Main();
		System.out.printf("%.10f",answer.solve());
	}

	private double solve() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double [] array = new double[N+1];
		for(int i=1;i<=N;i++) {
			array[i] = sc.nextDouble();
		}

		double [][] dp = new double[3001][3001];
		for(int i=0;i<3001;i++) {
			Arrays.fill(dp[i], -1.0);
		}

		return solve(dp, N, (N+1)/2, array);
	}

	private double solve(double[][] dp, int coins, int headCount, double[] array) {

		if(headCount==0) return 1;
		if (coins==0) return 0;

		if (dp[coins][headCount] > -0.9) return dp[coins][headCount];

		double left = array[coins] * solve(dp, coins-1, headCount-1, array);
		double right = (1-array[coins]) * solve(dp, coins-1, headCount, array);

		dp[coins][headCount] = left+right;
		return dp[coins][headCount];
	}

}