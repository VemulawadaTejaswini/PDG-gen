import java.util.*;

public class Main {
	static int maxCost = 4001;
	static int maxWeight = 400;
	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ma = sc.nextInt();
		int mb = sc.nextInt();
		int[] arrA = new int[n + 1];
		int[] arrB = new int[n + 1];
		int[] arrC = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			arrA[i] = sc.nextInt();
			arrB[i] = sc.nextInt();
			arrC[i] = sc.nextInt();
		}
		int[][][] dp = new int[n + 1][maxWeight + 1][maxWeight + 1];
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= maxWeight; j++) {
				for (int k = 0; k <= maxWeight; k++) {
					dp[i][j][k] = maxCost;
				}
			}
		}
		dp[0][0][0] = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= maxWeight; j++) {
				for (int k = 0; k <= maxWeight; k++) {
					dp[i][j][k] = Math.min(dp[i][j][k], dp[i - 1][j][k]);
					if (j + arrA[i] <= maxWeight && k + arrB[i] <= maxWeight) {
						dp[i][j + arrA[i]][k + arrB[i]] = Math.min(dp[i - 1][j][k] + arrC[i], dp[i][j + arrA[i]][k + arrB[i]]);
					}
				}
			}
		}
		int min = maxCost;
		for (int i = 1; ma * i <= maxWeight && mb * i <= maxWeight; i++) {
			min = Math.min(dp[n][ma * i][mb * i], min);
		}
		if (min >= maxCost) {
			min = -1;
		}
		System.out.println(min);
	}
}
