import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int a[][] = new int[2][3];
		for(int i = 0; i < 2; i ++) {
			for(int j = 0; j < 3; j ++) {
				a[i][j] = sc.nextInt();
			}
		}

		int dp[] = new int[num + 1];
		int weight[] = a[0];
		int value[] = a[1];
		dp[0] = 0;
		for(int i = 1; i <= num; i ++) {
			dp[i] = dp[i - 1] + 1;
			for(int j = 0; j < 3; j ++) {
				if(i >= weight[j]) {
					dp[i] = Math.max(dp[i], dp[i - weight[j]] + value[j]);
				}
			}
		}
		long dp2[] = new long[dp[num] + 1];
		weight = a[1];
		value = a[0];
		dp2[0] = 0;
		for(int i = 1; i <= dp[num]; i ++) {
			dp2[i] = dp2[i - 1] + 1;
			for(int j = 0; j < 3; j ++) {
				if(i >= weight[j]) {
					dp2[i] = Math.max(dp2[i], dp2[i - weight[j]] + value[j]);
				}
			}
		}

		System.out.println(dp2[dp[num]]);
	}
}