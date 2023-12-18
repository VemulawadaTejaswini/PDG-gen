import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int type = 3;
		long happiness[][] = new long[type][num];
		for(int i = 0; i < num; i ++) {
			for(int j = 0; j < type; j ++) {
				happiness[j][i] = sc.nextLong();
			}
		}

		long dp[][] = new long[3][num];
		for(int j = 0; j < type; j ++) {
			dp[j][0] = happiness[j][0];
		}
		for(int i = 1; i < num; i ++) {
			for(int j = 0; j < type; j ++) {
				dp[j][i] = happiness[j][i]
					+ Math.max(dp[(j + 1) % 3][i - 1], dp[(j + 2) % 3][i - 1]);
			}
		}

		long max = 0;
		for(int j = 0; j < type; j ++) {
			max = Math.max(max, dp[j][num - 1]);
		}
		System.out.println(max);
	}
}