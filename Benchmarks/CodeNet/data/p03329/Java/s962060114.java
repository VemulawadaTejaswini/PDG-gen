import java.util.Arrays;
import java.util.Scanner;

class Main{
	static int N;

	static int[] memo;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();

		memo = new int[N + 1];
		Arrays.fill(memo, -1);
		memo[0] = 0;

		System.out.println(dp(N));
		sc.close();
	}

	static int dp(int n){
		if(memo[n] == -1) {
			int min = Integer.MAX_VALUE;
			for(int i = 9; i <= n; i *= 9) {
				if(dp(n - i) < min)
					min = dp(n - i);
			}
			for(int i = 6; i <= n; i *= 6) {
				if(dp(n - i) < min)
					min = dp(n - i);
			}
			if(min == Integer.MAX_VALUE)
				min = dp(n - 1);
			memo[n] = min + 1;
		}
		return memo[n];
	}
}