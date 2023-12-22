import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			int[][] t = new int[n][n+1];
			for(int i=0;i<n;i++) {
				for(int j=0;j<=n;j++) {
					t[i][j] = sc.nextInt();
				}
			}
			int[] dp = new int[1<<n];
			Arrays.fill(dp, 1 << 29);
			dp[0] = 0;
			for(int i=0;i<1<<n;i++) {
				for(int j=0;j<n;j++) {
					if ((i >> j & 1) == 1) {
						continue;
					}
					int to = i | (1 << j);
					int min = t[j][0];
					for(int k=0;k<n;k++) {
						if ((i >> k & 1) == 1) {
							min = Math.min(min,t[j][k+1]);
						}
					}
					dp[to] = Math.min(dp[to], dp[i] + min);
				}
			}
			System.out.println(dp[(1<<n)-1]);
		}
	}

}