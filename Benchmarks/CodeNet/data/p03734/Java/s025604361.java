import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int maxw = sc.nextInt();

		int[] ws = new int[N];
		int[] ps = new int[N];

		for (int i = 0; i < N; i++) {
			ws[i] = sc.nextInt();
			ps[i] = sc.nextInt();
		}

		int[][] dp = new int[ws.length + 1][maxw + 1];
		int ret = 0;

		for (int i = 0; i < ws.length; i++) {
		    for (int j = 0; j <= maxw; j++) {
		        dp[i + 1][j] = Math.max(dp[i + 1][j], dp[i][j]);
		        if (j + ws[i] <= maxw) {
		            dp[i + 1][j + ws[i]] = Math.max(dp[i + 1][j + ws[i]], dp[i][j] + ps[i]);
		            ret = Math.max(ret, dp[i + 1][j + ws[i]]);
		        }
		    }
		}

		System.out.println(ret);
	}

}