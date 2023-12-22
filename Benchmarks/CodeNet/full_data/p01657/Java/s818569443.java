import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N, X, M;
	static int[] L, R, S;
	static int[] ans;
	static int max = -1;

	public static void main(String[] args) {
		N = sc.nextInt();
		X = sc.nextInt();
		M = sc.nextInt();
		L = new int[M];
		R = new int[M];
		S = new int[M];
		for (int i = 0; i < M; ++i) {
			L[i] = sc.nextInt();
			R[i] = sc.nextInt();
			S[i] = sc.nextInt();
		}
		int[] c = new int[N];
		rec(0, c);
		if (max == -1) {
			System.out.println(-1);
		} else {
			System.out.print(ans[0]);
			for (int i = 1; i < N; ++i) {
				System.out.print(" " + ans[i]);
			}
			System.out.println();
		}
	}

	static void rec(int idx, int[] c) {
		if (idx == N) {
			int[] sum = new int[N + 1];
			for (int i = 1; i <= N; ++i) {
				sum[i] = sum[i - 1] + c[i-1];
			}
			if (sum[N] > max) {
				for (int i = 0; i < M; ++i) {
					if (sum[R[i]] - sum[L[i] - 1] != S[i]) {
						return;
					}
				}
				max = sum[N];
				ans = c.clone();
			}
			return;
		}
		for (int i = 0; i <= X; ++i) {
			c[idx] = i;
			rec(idx + 1, c);
		}
	}
}