import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		Long[] v = new Long[n];
		for (int i = 0; i < n; i++) {
			v[i] = sc.nextLong();
		}
		Arrays.sort(v, Comparator.reverseOrder());
		double ave = 0.0;
		for (int i = 0; i < a; i++) {
			ave += v[i];
		}
		ave /= a;
		System.out.println(ave);

		long[][] dp = new long[51][51];
		dp[0][0] = 1;
		for (int i = 1; i < 51; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					dp[i][j] = 1;
				} else {
					dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
				}
			}
		}
		long sum = 0;
		if (v[0] == v[a - 1]) {
			int idx = a - 1;
			while (idx < n && v[idx] == v[0]) {
				idx++;
			}
			for (int i = a; i <= b; i++) {
				sum += dp[idx][i];
			}
		} else {
			int cnt = 0;
			int idx = 100;
			for (int i = 0; i < n; i++) {
				if (v[i] == v[a - 1]) {
					cnt++;
					idx = Math.min(idx, i);
				}
			}
			sum += dp[cnt][a - idx];
		}
		System.out.println(sum);
	}
}