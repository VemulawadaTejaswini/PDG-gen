import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = Integer.parseInt(sc.next());
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n+1];
		int[] b = new int[n+1];
		int[][] dp = new int[n+1][h+1];

		for(int i = 1 ; i < n +1 ; i++) {
			a[i] = Integer.parseInt(sc.next());
			b[i] = Integer.parseInt(sc.next());
		}

		for (int i = 0 ; i < n + 1 ; i++) {
			for (int j = 0 ; j < h+1 ; j++) {
				dp[i][j] = 999999999;
			}
		}

		for (int i = 1 ; i < n + 1 ; i++) {
			for (int j = 1 ; j < h+1 ; j++) {

				if(j-a[i] > 0) {
					dp[i][j] = Math.min(dp[i-1][j -a[i]] + b[i],dp[i-1][j]);
					dp[i][j] = Math.min(dp[i][j] ,dp[i][j -a[i]] +  b[i]);
				}else {
					dp[i][j] = Math.min(b[i],dp[i-1][j]);
				}
			}
		}



		System.out.println(dp[n][h]);
	}




}

