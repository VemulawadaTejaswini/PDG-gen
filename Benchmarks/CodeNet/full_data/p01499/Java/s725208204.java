import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] arg) {
		int MOD = 1000000007;
		int N = sc.nextInt();
		int T = sc.nextInt();
		int[] D = new int[10001];
		for (int i = 0; i < N; ++i) {
			D[sc.nextInt()]++;
		}
		int[] sum = new int[10001];
		long ans = 1;
		for (int i = 1; i <= 10000; ++i) {
			sum[i] = sum[i - 1] + D[i];
			int pos = 1 + sum[i - 1] - (i > T ? sum[i - T - 1] : 0);
			for (int j = 0; j < D[i]; ++j) {
				ans *= pos + j;
				ans %= MOD;
			}
		}
		System.out.println(ans);
	}

}