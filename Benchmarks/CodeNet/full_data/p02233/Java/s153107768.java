import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] dp = new int[n+1];

		Arrays.fill(dp, -1);

		/*メモ化!!!
		int ans = fib(n,dp);

		System.out.println(ans);
		 */

		dp[0] = 1;

		dp[1] = 1;

		for(int i=2;i<=n;i++) {

			dp[i] = dp[i-1] + dp[i-2];
		}

		System.out.println(dp[n]);
	}

	/*メモ化!!!
	static int fib(int n, int[] dp) {

		if(n==0 || n==1) {

			dp[n] = 1;

			return dp[n];

		}else if(dp[n] != -1){

			return dp[n];
		}

		return fib(n-1,dp) + fib(n-2,dp);

	}*/

}

