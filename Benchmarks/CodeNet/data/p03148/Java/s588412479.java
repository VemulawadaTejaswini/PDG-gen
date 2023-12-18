import java.util.*;
import java.lang.*;

public class Main {
	static int n;
	static int k;
	static int[] t;
	static int[] d;
	static boolean[][][] used;
	static long[][][] dp;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		t = new int[n + 1];
		d = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			t[i] = sc.nextInt();
			d[i] = sc.nextInt();
		}
		used = new boolean[n + 1][k + 1][n + 1];
		dp = new long[n + 1][k + 1][n + 1];
		for (int syori = 1; syori <= n; syori++) {
			for (int eat = 1; eat <= syori && eat <= k; eat++) {
				for (int kind = 1; kind <= eat; kind++) {
					if (used[syori - 1][eat - 1][t[syori]]) {
						if (dp[syori - 1][eat][kind] >= dp[syori - 1][eat - 1][kind] + d[syori]) {
							dp[syori][eat][kind] = dp[syori - 1][eat][kind];
							System.arraycopy(used[syori - 1][eat], 0, used[syori][eat], 0, n + 1);
						} else {
							dp[syori][eat][kind] = dp[syori - 1][eat - 1][kind] + d[syori];
							System.arraycopy(used[syori - 1][eat - 1], 0, used[syori][eat], 0, n + 1);
						}
						dp[syori][eat][kind] = Math.max(dp[syori - 1][eat][kind], dp[syori - 1][eat - 1][kind] + d[syori]);
						System.arraycopy(used[syori - 1][eat - 1], 0, used[syori][eat], 0, n + 1);
					} else {
						if (dp[syori - 1][eat][kind] >= dp[syori - 1][eat - 1][kind - 1] + 2 * kind - 1 + d[syori]) {
							dp[syori][eat][kind] = dp[syori - 1][eat][kind];
							System.arraycopy(used[syori - 1][eat], 0, used[syori][eat], 0, n + 1);
						} else {
							dp[syori][eat][kind] = dp[syori - 1][eat - 1][kind - 1] + 2 * kind - 1 + d[syori];
							System.arraycopy(used[syori - 1][eat - 1], 0, used[syori][eat], 0, n + 1);
							used[syori][eat][t[syori]] = true;
						}
					}
				}
			}
		}
		long max = 0;
		for (int i = 0; i <= k; i++) {
			for (int j = 0; j <= k; j++) {
				max = Math.max(dp[n][i][j], max);
			}
		}
		System.out.println(max);
	}
}