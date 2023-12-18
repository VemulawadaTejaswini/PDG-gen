import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] dp = new int[100001];

		dp[0] = 0;

		for (int i = 1; i <= 100000; i++) {
			// 1円単位
			dp[i] = i;

			// 6円 36円 216円 1296円 7776円 46656円単位
			int cost = 1;
			while (cost <= i && 6 <= i) {
				dp[i] = Math.min(dp[i], dp[i - cost] + 1);
				cost *= 6;
			}

			// 9円 81円 729円 6561円 59049円単位
			cost = 1;
			while (cost <= i && 9 <= i) {
				dp[i] = Math.min(dp[i], dp[i - cost] + 1);
				cost *= 9;
			}

		}

		System.out.println(dp[N]);
		sc.close();
	}

}
