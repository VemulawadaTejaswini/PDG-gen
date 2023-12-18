import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int w = sc.nextInt();
		
		int[] weight = new int[n + 1];
		int[] value = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			weight[i] = sc.nextInt();
			value[i] = sc.nextInt();
		}
		
		long[][] dp = new long[n + 1][w + 1];
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= w; j++) {
				dp[i][j] = dp[i - 1][j];
				if (j - weight[i] >= 0)
					dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - weight[i]] + value[i]);
			}
		}
		
		System.out.println(dp[n][w]);
		
//		for (long[] arr : dp)
//			System.out.println(Arrays.toString(arr));
 		
		sc.close();
	}
}

