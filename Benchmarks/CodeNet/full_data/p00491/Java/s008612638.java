
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		k = scanner.nextInt();
		plan = new int[n + 1];
		for (int i = 0; i < k; i++)
			plan[scanner.nextInt()] = scanner.nextInt();
		dp = new int[n + 1][4][4];
		for (int[][] dpp : dp)
			for (int[] dppp : dpp)
				Arrays.fill(dppp, -1);
		System.out.println(slove(1, 0, 0));

	}

	private int slove(int day, int pre1, int pre2) {
		if (day == n + 1)
			return 1;
		if (dp[day][pre1][pre2] != -1)
			return dp[day][pre1][pre2];
		if (plan[day] != 0)
			if (pre2 == pre1 && pre1 == plan[day])
				return 0;
			else
				return slove(day + 1, plan[day], pre1) % mod;
		int ret = 0;
		for (int i = 1; i < 4; i++) {
			if (i == pre1 && pre1 == pre2)
				continue;
			ret += slove(day + 1, i, pre1) % mod;
		}
		return dp[day][pre1][pre2] = ret % mod;
	}

	int n, k;
	int[] plan;
	int[][][] dp;
	int mod = 10000;
}