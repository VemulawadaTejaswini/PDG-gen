import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] abc = new int[n][3];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < 3; j++)
				abc[i][j] = sc.nextInt();
		
		long[][] dp = new long[n][3];
		for (int i = 0; i < 3; i++)
			dp[0][i] = abc[0][i];
		
		for (int i = 1; i < n; i++)
			for (int j = 0; j < 3; j++)
				for (int k = 0; k < 3; k++) {
					if (k == j) continue;
					dp[i][j] = Math.max(dp[i][j], dp[i - 1][k] + abc[i][j]);
				}
		
//		for (int i = 0; i < n; i++)
//			System.out.println(Arrays.toString(dp[i]));
		
		long max = 0;
		for (int i = 0; i < 3; i++)
			max = Math.max(max, dp[n - 1][i]);
		
		System.out.println(max);
 		
		sc.close();
	}
}

