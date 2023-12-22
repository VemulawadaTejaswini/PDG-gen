import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int[][] map;
	static int[][] directions8 = { { -1, -1 }, { -1, 0 }, { -1, 1 }, { 0, -1 }, { 0, 1 }, { 1, -1 }, { 1, 0 },
			{ 1, 1 } };
	static int[][] directions4 = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
	static long ans;
	static int N;
	static int M;
	static int[] C;
	static int[] x;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {

			N = sc.nextInt();
			M = sc.nextInt();

			if ((N | M) == 0) {
				break;
			}

			C = new int[M];
			x = new int[N];
			ans = Long.MAX_VALUE;

			for (int i = 0; i < M; i++) {
				C[i] = sc.nextInt();
			}

			for (int i = 0; i < N; i++) {
				x[i] = sc.nextInt();
			}

			// solve(128, 0, 0);

			long[][] dp = new long[20001][256];
			for (int j = 0; j < 20001; j++) {
				Arrays.fill(dp[j], Long.MAX_VALUE);
			}

			dp[0][128] = 0;

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < 256; j++) {
					if (dp[i][j] == Long.MAX_VALUE) {
						continue;
					}
					for (int k = 0; k < M; k++) {
						int nextPulse = j + C[k];
						if (nextPulse > 255) {
							nextPulse = 255;
						} else if (nextPulse < 0) {
							nextPulse = 0;
						}
						int plus = (nextPulse - x[i]) * (nextPulse - x[i]);
						dp[i + 1][nextPulse] = Long.min(dp[i + 1][nextPulse], dp[i][j] + plus);
					}
				}
			}

			ans = Long.MAX_VALUE;
			for (int j = 0; j < 256; j++) {
				if (dp[N][j] < ans) {
					ans = dp[N][j];
				}
			}

			System.out.println(ans);
		}
	}

	// static void solve(int preNum, int idx, long tmpAns) {
	// if (tmpAns >= ans) {
	// return;
	// }

	// if (idx == N) {
	// ans = tmpAns;
	// return;
	// } else {
	// for (int i = 0; i < M; i++) {
	// if (idx == 0) {
	// tmpAns = 0;
	// }
	// int thisNum = (preNum + C[i]);
	// if (thisNum > 255) {
	// thisNum = 255;
	// } else if (thisNum < 0) {
	// thisNum = 0;
	// }
	// solve(thisNum, idx + 1, tmpAns + (thisNum - x[idx]) * (thisNum - x[idx]));
	// }
	// }
	// }

	// BFS用に二つの配列を足し算する
	static int[] addArrayElms(int[] a, int[] b) {
		int[] c = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i] + b[i];
		}
		return c;
	}

	// //二分探索
	// k <= num となる最小の配列要素kのインデックスを返す
	static private int binarySearch(long num, long[] orderedArray) {
		int lowerBorder = -1;
		int upperBorder = orderedArray.length;
		int mid;

		while (upperBorder - lowerBorder > 1) {
			mid = (upperBorder + lowerBorder) / 2;
			if (orderedArray[mid] <= num) {
				lowerBorder = mid;
			} else {
				upperBorder = mid;
			}
		}
		return lowerBorder;
	}

	// 二分探索
	// k <= num となる最小のList要素kのインデックスを返す
	static private int binarySearch(long num, ArrayList<Long> orderedList) {
		int lowerBorder = -1;
		int upperBorder = orderedList.size();
		int mid;

		while (upperBorder - lowerBorder > 1) {
			mid = (upperBorder + lowerBorder) / 2;
			if (orderedList.get(mid) <= num) {
				lowerBorder = mid;
			} else {
				upperBorder = mid;
			}
		}
		return lowerBorder;
	}

	// aとbの最小公倍数を求める
	public static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}

	public static long gcd(long a, long b) {
		return b == 0 ? a : gcd(b, a % b);
	}
}

