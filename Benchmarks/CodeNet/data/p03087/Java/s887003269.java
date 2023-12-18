import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int Q = sc.nextInt();
		String S = sc.next();

		int dp[] = new int[N];
		int cnt = 0;
		for (int i = 1; i < N; i++) {
			if (S.charAt(i - 1) == 'A' && S.charAt(i) == 'C') {
				cnt++;
			}
			dp[i] = cnt;
		}
		for (int i = 0; i < Q; i++) {
			int l = sc.nextInt() - 1;
			int r = sc.nextInt() - 1;
			System.out.println(dp[r] - dp[l]);
		}
	}
}
