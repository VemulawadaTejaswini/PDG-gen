import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int h[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			h[i] = sc.nextInt();
		}
		long dp[] = new long[n];
		Arrays.fill(dp, Integer.MAX_VALUE);

		for(int i = 0 ; i < n ; i++) {
			if(i == 0)
				dp[i] = 0;
			for(int j = k ; j > 0 ; j--) {
              if(i + j >= n)
                continue;
				dp[i + j] = Math.min(dp[i] + Math.abs(h[i + j] - h[i]), dp[i + j]);
			}
		}
		System.out.println(dp[n - 1]);

	}


}

