import java.util.Scanner;

public class Main {
	static int[][] a = new int [100010][3];
	static long[][]dp= new long [100010][3];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j]=Integer.parseInt(sc.next());
			}
		}
		sc.close();

		for (int i = 0; i < n; i++) {
	        for (int j = 0; j < 3; j++) {
	            for (int k = 0; k < 3; k++) {
	                if (j == k) continue;
	                dp[i + 1][k] = Math.max(dp[i + 1][k], dp[i][j] + a[i][k]);
	            }
	        }
	    }
		long res = 0;
	    for (int j = 0; j < 3; ++j) res = Math.max(res, dp[n][j]);

	    System.out.println(res);
	}

}
