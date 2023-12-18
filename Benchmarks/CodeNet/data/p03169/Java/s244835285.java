
import java.util.*;

public class Main {
	static double dp[][][];

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		dp = new double[301][301][301];
		for (int i = 0; i <= 300; i++) {
			for (int j = 0; j <= 300; j++) {
				for (int z = 0; z <= 300; z++) {
					dp[i][j][z] = -1;
				}
			}
		}

		int x = 0;
		int y = 0;
		int z = 0;

		for (int i = 0; i < n; i++) {
			int val = scn.nextInt();
			if (val == 1) {
				x++;
			} else if (val == 2) {
				y++;
			} else {
				z++;
			}
		}
		dp[0][0][0] = 0;
		solve(x, y, z, n);
		System.out.println(dp[x][y][z]);
	}

	private static double solve(int x, int y, int z, int n) {
		if (x < 0 || y < 0 || z < 0) {
			return 0;
		}
		if (dp[x][y][z] > -1) {
			return dp[x][y][z];
		}
		double exp = n + x * solve(x - 1, y, z, n) + y * solve(x + 1, y - 1, z, n) + z * solve(x, y + 1, z - 1, n);
		dp[x][y][z] = exp / (x + y + z);

		return dp[x][y][z];
	}
}