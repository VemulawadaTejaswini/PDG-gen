import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int step = sc.nextInt();
		long height[] = new long[num];
		for(int i = 0; i < num; i ++) {
			height[i] = sc.nextLong();
		}
		long dp[] = new long[num];
		dp[0] = 0;
		for(int i = 1; i < num; i ++) {
			dp[i] = Long.MAX_VALUE;
			for(int j = Math.max(i - step, 0); j < i; j ++) {
				dp[i] = Math.min(dp[i], dp[j] + Math.abs(height[i] - height[j]));
			}
		}
		System.out.println(dp[num - 1]);
	}
}