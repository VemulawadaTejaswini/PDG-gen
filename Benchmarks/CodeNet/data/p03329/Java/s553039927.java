import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dp = new int[n + 1];

		for(int i = 1; i <= n; i++) {
			dp[i] = 100000000;
		}

		for(int i = 1; i <= n; i++) {
			for(int pow6 = 1; pow6 <= n; pow6 *= 6) {
				if(i - pow6 >= 0) {
					dp[i] = Math.min(dp[i], dp[i - pow6] + 1);
				}
			}

			for(int pow9 = 1; pow9 <= n; pow9 *= 9) {
				if(i - pow9 >= 0) {
					dp[i] = Math.min(dp[i], dp[i - pow9] + 1);
				}
			}
		}

		System.out.println(dp[n]);

		sc.close();
	}
}
