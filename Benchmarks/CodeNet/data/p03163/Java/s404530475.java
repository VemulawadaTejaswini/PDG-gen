import java.util.Scanner;

public class Main {

	static int[][] table;
	static int N;
	static int W;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		W = sc.nextInt();
		long max = 0;

		table = new int[N][2];
		for (int i = 0; i < N; i++) {
			table[i][0] =sc.nextInt();
			table[i][1] =sc.nextInt();
		}

		Main main = new Main();

		System.out.println(main.DP(0, W));
	}

	public long DP(int step,int lim) {
		long ans = 0;
		if (step == N) {
			ans = 0;
		}else {
			int target_w = table[step][0];
			int target_v = table[step][1];
			if (lim - target_w < 0 ) {
				ans = DP(step + 1, lim);
			}else {
				long use = DP(step + 1, lim - target_w) + target_v;
				long nouse = DP(step + 1, lim);

				ans = Math.max(use, nouse);
			}
		}
		return ans;
	}
}
