import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] dp = new int[N + 1];
		long res = 0;
		for (int i = 1; i <= N; i++) {
			long pos = i;
			dp[(int) pos] += 1;
			while (pos + i <= N) {
				pos += i;
				dp[(int) pos] += 1;
			}
			if (dp[i] < 0) {
				System.out.println(dp[i]);
			}
			res += i * (long) dp[i];
		}
		System.out.println(res);
	}
}