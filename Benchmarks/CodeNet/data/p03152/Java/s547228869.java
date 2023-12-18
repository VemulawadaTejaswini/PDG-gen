package keyence2019.d;

import java.util.Arrays;
import java.util.Scanner;

// 参考:KEYENCE Programming Contest 2019 参加記録＆解説（A～E） - ARMERIA https://betrue12.hateblo.jp/entry/2019/01/14/023707
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N = sc.nextInt();
	static int M = sc.nextInt();
	static int[] A = new int[N+1];
	static int[] B = new int[M+1];
	static final int MOD = 1_000_000_007;
	public static void main(String[] args) {
		A[0] = -1;
		B[0] = -1;
		for (int i = 1; i <= N; i++) {
			A[i] = sc.nextInt();
		}
		for (int i = 1; i <= M; i++) {
			B[i] = sc.nextInt();
		}
		// グリッド内で重複があったらアウト
		if (Arrays.stream(A).distinct().count() < A.length
				|| Arrays.stream(B).distinct().count() < B.length) {
			System.out.println(0);
			return;
		}
		Arrays.sort(A);
		Arrays.sort(B);
		long ans = 1;
		int a_placed = 0;
		int b_placed = 0;
		for (int i = N*M; i >= 1; i--) {
			if (A[N-a_placed] == i && B[M-b_placed] == i) {
				a_placed++;
				b_placed++;
			} else if (A[N-a_placed] == i) {
				a_placed++;
				ans = mul(ans, b_placed);
			} else if (B[M-b_placed] == i) {
				b_placed++;
				ans = mul(ans, a_placed);
			} else {
				ans = mul(ans, a_placed*b_placed - (N*M-i));
			}
			if (ans == 0) {
				break;
			}
		}
		System.out.println(ans);
	}
	static long mul(long a, long b) {
		return a*b%MOD;
	}
}
