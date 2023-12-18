import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int H = scanner.nextInt();
		int W = scanner.nextInt();
		int A = scanner.nextInt();
		int B = scanner.nextInt();

		int r = (int)Math.pow(10, 9) + 7;
		int[] dp = new int[W];
		Arrays.fill(dp, 0);

		for(int i = 0 ; i < H - A ; i++) {
			for(int j = 0 ; j < W ; j++) {
				if(i - 1 < 0) {
					dp[j] += 1;
				} else if(j - 1 >= 0) {
					dp[j] = (dp[j] % r) + (dp[j - 1] % r);
				}
			}
		}

		for(int i = H - A ; i < H ; i++) {
			for(int j = B ; j < W ; j++) {
				if(j - (B + 1) >= 0) {
					dp[j] = (dp[j] % r) + (dp[j - 1] % r);
				}
			}
		}

		System.out.println(dp[W - 1]);
		scanner.close();
	}
}
