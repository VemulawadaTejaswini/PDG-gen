import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int M = scn.nextInt();
		long[][] DP = new long[M + 1][3];
		for (int i = 0; i < M + 1; i++) {
			DP[i] = new long[3];
		}

		for (int i = 1; i <= N; i++) {
			long b = scn.nextLong(), d = scn.nextLong(), p = scn.nextLong();
			for (int j = M; j > 0; j--) {
				if (i > j) {
					if (Math.abs(DP[j - 1][0] + b) + Math.abs(DP[j - 1][1] + d)
							+ Math.abs(DP[j - 1][2] + p) > Math.abs(DP[j][0]) + Math.abs(DP[j][1]) +  Math.abs(DP[j][2])) {
						DP[j][0] = DP[j-1][0] + b;
						DP[j][1] = DP[j-1][1] + d;
						DP[j][2] = DP[j-1][2] + p;
					}
				} else {
					DP[j][0] += b;
					DP[j][1] += d;
					DP[j][2] += p;
				}

			}
		}

		scn.close();
		long ans = Math.abs(DP[M][0]) + Math.abs(DP[M][1]) + Math.abs(DP[M][2]);
		System.out.println(ans);
	}
}
