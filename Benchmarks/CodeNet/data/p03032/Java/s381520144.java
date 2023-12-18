import java.util.*;

public class Main {
	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println();
	}

	static int dp(int left, int right, int step, int[] V, int[][][] DP) {
		assert 0 <= left;
		assert left <= right;
		assert right < V.length;

		if (step == 0) {
			return 0;
		}
		if (DP[left][right][step - 1] >= 0) {
			return DP[left][right][step - 1];
		}
		if (left == right) {
			return 0;
		}

		int max = Math.max(
			dp(left + 1, right, step - 1, V, DP) + V[left],
			dp(left, right - 1, step - 1, V, DP) + V[right]
		);
		max = Math.max(max, 0);
		if (step >= 2) {
			int v2 = Math.max(
				dp(left + 1, right, step - 2, V, DP),
				dp(left, right - 1, step - 2, V, DP)
			);
			max = Math.max(max, v2);
		}
		DP[left][right][step - 1] = max;
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 50
		int K = sc.nextInt(); // 100
		int[] V = new int[N];
		for (int i = 0; i < N; i++) {
			V[i] = sc.nextInt();
		}
		int[][][] DP = new int[N][N][K];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < K; k++) {
					DP[i][j][k] = -1;
				}
			}
		}

		int result = dp(0, N-1, K, V, DP);

		System.out.println(result);
	}
}
