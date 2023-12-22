import java.util.Scanner;


public class Main {

	static int[] memo=new int[100];
	static int fib(int n) {
		if (memo[n]!=0) return memo[n];
		if (n==0||n==1) return memo[n]=1;
		return (memo[n-1]=fib(n-1))+(memo[n-2]=fib(n-2));
	}

	static int fibDp(int n) {
		int[] dp=new int[n+1];
		dp[0]=1;
		dp[1]=1;
		for (int i=2;i<=n;i++) {
			dp[i]=dp[i-1]+dp[i-2];
		}
		return dp[n];
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(fibDp(scan.nextInt()));
	}

}