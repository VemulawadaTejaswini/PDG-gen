import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	final long MOD = (long) 1e9 + 7;

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long[][][] dp = new long[N][N + 1][1 + N * (N + 1)];// curPos, go, sum
		dp[0][0][0] = 1;// 1-1
		dp[0][1][0] = 1;// 1-?
		for (int pos = 0; pos < N - 1; ++pos) {
			for (int go = 0; go <= pos + 1; ++go) {
				for (int sum = 0; sum <= N * (N + 1); ++sum) {
					if (dp[pos][go][sum] == 0)
						continue;
					for (int pre_go = 0; pre_go <= 1; ++pre_go) {
						for (int cur_go = 0; cur_go <= 1; ++cur_go) {
							int npos = pos + 1;
							int ngo = go + 1 - pre_go - cur_go;
							int nsum = sum + 2 * go;
							if (ngo < 0)
								continue;
							long coe = (pre_go == 1 ? go  : 1) * (cur_go == 1 ? go : 1) % MOD;
							dp[npos][ngo][nsum] = (dp[npos][ngo][nsum] + dp[pos][go][sum] * coe % MOD) % MOD;
						}
					}
					dp[pos + 1][go][sum + 2 * go] = (dp[pos + 1][go][sum + 2 * go] + dp[pos][go][sum]) % MOD;
				}
			}
		}
		
		System.out.println(dp[N - 1][0][K]);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}