
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		long MOD = 1000000007;
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		sc.close();

		int N = s.length();

		long[][] dp = new long[N][13];
		int[] pow10mod13 = { 1, 10, 9, 12, 3, 4 };

		int m = pow10mod13[(N - 1) % 6];
		if (s.charAt(0) == '?') {
			for (int p = 0; p <= 9; p++) {
				dp[0][p * m % 13] = 1;
			}
		} else {
			int p = Character.getNumericValue(s.charAt(0));
			dp[0][p * m % 13] = 1;
		}

		for (int i = 1; i < N; i++) {
			m = pow10mod13[(N - i - 1) % 6];
			if (s.charAt(i) == '?') {
				for (int p = 0; p <= 9; p++) {
					int q = p * m % 13;
					for (int j = 0; j <= 12; j++) {
//						System.out.println("i:" + i + "j:" + j + "dp[i-1][j]" + dp[i-1][j]);
						dp[i][(j + q) % 13] += dp[i - 1][j];
						if(dp[i][(j + q) % 13] >= MOD) dp[i][(j + q) % 13] -= MOD;
//						System.out.println("dp[i][(j+q)%13]:" + dp[i][(j+q)%13]);
					}
				}

			} else {
				int p = Character.getNumericValue(s.charAt(i));
				int q = p * m % 13; //i番目の数字によりq余りが増える
				for (int j = 0; j <= 12; j++) {
//					System.out.println("i:" + i);
//					System.out.println("j:" + i);
					dp[i][(j + q) % 13] = dp[i - 1][j];
				}
			}

		}

		System.out.println(dp[N - 1][5]);
//		for (int j = 0; j <= N - 1; j++) {
//			System.out.println("j:" + j);
//			for (int i = 0; i <= 12; i++) {
//				System.out.print(dp[j][i] + " ");
//			}
//			System.out.println();
//		}

	}

}
