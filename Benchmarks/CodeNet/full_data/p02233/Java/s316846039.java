
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	int dp[];
	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		dp = new int[n+1];
		int ans = fib(n);
		System.out.println(ans);
		sc.close();
	}
	
	private int fib(int n) {
		// TODO Auto-generated method stub
		if(n == 0 || n == 1) return dp[n] = 1;
		if(dp[n] != 0) return dp[n];
		return dp[n] = fib(n-1) + fib(n-2);
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}