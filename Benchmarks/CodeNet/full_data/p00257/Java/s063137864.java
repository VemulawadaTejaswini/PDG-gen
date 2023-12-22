import java.util.Scanner;

public class Main {
	static int max;
	static int n;
	static int a[];
	static int edge[][];
	static int dp[];

	public static boolean dp(int k) {
		if (dp[k] == 1 || k == n + 1) {
			return true;
		}
		
		boolean f = false;
		for (int i = 0; i < n + 2; i++) {
			if (i != k && edge[k][i] == 1) {
				if (!dp(i)) {
					return false;
				} else {
					f = true;
				}
			}
		}
		
		dp[k] = 1;
		return f;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		L: while (true) {
			max = sc.nextInt();
			if (max == 0) {
				break;
			}

			n = sc.nextInt();
			a = new int[n + 2];
			edge = new int[n + 2][n + 2];
			for (int i = 0; i < n; i++) {
				a[i + 1] = sc.nextInt();
			}
			dp = new int[n + 2];

			for (int i = 0; i < n + 2; i++) {
				for (int j = 1; j <= max; j++) {
					int next = i + j;
					if (next < n + 2) {
						next += a[next];
					}
					next = Math.min(next, n + 1);
					next = Math.max(next, 0);
					edge[i][next] = 1;
				}
			}
			
			if (dp(0)) {
				System.out.println("OK");
			} else {
				System.out.println("NG");
			}
		}
	}
}