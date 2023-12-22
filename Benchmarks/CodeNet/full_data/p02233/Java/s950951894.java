import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] dp = new int[n+1];

		Arrays.fill(dp, -1);

		int ans = fib(n,dp);

		System.out.println(ans);

	}

	static int fib(int n, int[] dp) {

		if(n==0 || n==1) {

			dp[n] = 1;

			return dp[n];

		}else if(dp[n] != -1){

			return dp[n];
		}

		return fib(n-1,dp) + fib(n-2,dp);

	}

}

