import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int K = sc.nextInt();
		int[] map = new int[H];
		for (int i = 0; i < H; i++) {
			String s = sc.next();
			for (int j = 0; j < W; j++) {
				map[i] = map[i] * 2 + (s.charAt(j) == '#' ? 1 : 0);
			}
		}
		int ans = 0;
		for (int S = 0; S < 1 << W; S++) {
			int[] dp = new int[K + 1];
			dp[0] = 1;
			for (int i = 0; i < H; i++) {
				int[] ndp = new int[K + 1];
				int off = Integer.bitCount(~S & map[i]);
				int on = 0;
				for (int j = 0; j <= K; j++) {
					if (j + off <= K) {
						ndp[j + off] += dp[j];
					}
					ndp[j + on] += dp[j];
				}
				dp = ndp;
			}
			ans += dp[K];
		}
		System.out.println(ans);
	}
}
