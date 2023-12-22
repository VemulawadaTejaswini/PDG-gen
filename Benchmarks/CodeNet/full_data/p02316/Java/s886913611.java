import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N = Integer.parseInt(sc.next());
	static int W = Integer.parseInt(sc.next());
	static int[] v = new int[N];
	static int[] w = new int[N];
	static int[] dp = new int[W+1];
	public static void main(String[] args) {
		for (int i = 0; i < N; i++) {
			v[i] = Integer.parseInt(sc.next());
			w[i] = Integer.parseInt(sc.next());
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j <= W; j++) {
				if (j >= w[i]) {
					dp[j] = Math.max(dp[j], dp[j-w[i]]+v[i]);
				}
			}
		}
		System.out.println(dp[W]);
	}
}
