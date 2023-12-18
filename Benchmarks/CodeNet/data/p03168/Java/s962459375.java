
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String arg[]) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double[] p = new double[n + 1];

		for (int i = 1; i <= n; i++) {
			p[i] = scan.nextDouble();
		}

		double dp[][] = new double[n + 1][n + 1];
		
		
	    for(double[] arr : dp){
	        Arrays.fill(dp,-1);
	    }
		System.out.println(String.format("%.9f",probability(n, (n +1)/2, p, dp)));
	}

	public static double probability(int n, int x, double[] p, double[][] dp) {
		//System.out.println(n + "  " + x);
		if(x == 0)return 1;
		if (n == 0)
			return 0;
		
		if (dp[n][x] != 0.0) {
			return dp[n][x];
		}
		double withHead = p[n] * probability(n - 1, x - 1, p, dp);
		double withTail = (1 - p[n]) * probability(n - 1, x, p, dp);

		dp[n][x] = withHead + withTail;
		return dp[n][x];

	}
}
