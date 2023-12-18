import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static final long MOD = 998244353;
	static int N, M;

	public static void main(String[] args) {
		N = sc.nextInt();
		M = sc.nextInt();
		int[][] mat = new int[N][M];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		int dim = 0;
		int col = 0;
		boolean[] fix = new boolean[N];
		for (int i = 0; i < N && col < M; i++) {
			for (int j = 0; j < N; j++) {
				if (!fix[j] && mat[j][col] == 1) {
					for (int k = 0; k < N; k++) {
						if (k == j || mat[k][col] == 0) continue;
						for (int l = 0; l < M; l++) {
							mat[k][l] ^= mat[j][l];
						}
					}
					++dim;
					fix[j] = true;
					break;
				}
			}
			++col;
		}
//		for (int i = 0; i < N; i++) {
//			for (int j = 0; j < M; j++) {
//				System.err.print(mat[i][j] + " ");
//			}
//			System.err.println();
//		}

		long[] pow2 = new long[301];
		pow2[0] = 1;
		for (int i = 1; i < pow2.length; i++) {
			pow2[i] = pow2[i - 1] * 2 % MOD;
		}
		long[][] comb = new long[301][301];
		for (int i = 0; i < comb.length; i++) {
			comb[i][0] = comb[i][i] = 1;
		}
		for (int i = 0; i < comb.length; i++) {
			for (int j = 1; j < i; j++) {
				comb[i][j] = (comb[i - 1][j] + comb[i - 1][j - 1]) % MOD;
			}
		}
		long ans = 0;
		for (int i = 1; i <= dim; i++) {
			long here = 0;
			for (int j = 1; j <= i; j += 2) {
				here += comb[i][j];
				here %= MOD;
			}
			here *= comb[dim][i];
			here %= MOD;
			here *= pow2[M - i];
			here %= MOD;
			ans += here;
		}
		ans *= pow2[N - dim];
		ans %= MOD;
		System.out.println(ans);
	}

}
