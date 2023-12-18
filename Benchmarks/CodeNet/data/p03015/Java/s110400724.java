import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		int n = s.length();
		long[] dp1 = new long[n];
		dp1[0] = 1;
		long[] dp2 = new long[n];
		dp2[0] = 2;
		for (int i = 1; i < n; i++) {
			if (s.charAt(i) == '1') {
				dp1[i] = dp1[i - 1] * 3 + dp2[i - 1];
				dp1[i] %= 1000000007;
				dp2[i] = dp2[i - 1] * 2;
				dp2[i] %= 1000000007;
			} else {
				dp1[i] = dp1[i - 1] * 3;
				dp1[i] %= 1000000007;
				dp2[i] = dp2[i - 1];
			}
		}
		long ans = dp1[n - 1] + dp2[n - 1];
		ans %= 1000000007;
		System.out.println(ans);
	}
}
