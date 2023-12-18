import java.util.*;
public class Main {
	
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int K = sc.nextInt();
		
		int[] map = new int[N];
		for (int i = 0; i < N; i++) {
			map[i] = sc.nextInt();
		}
		
		int[] dp = new int[N];
		dp[0] = 0;
		dp[1] = Math.abs(map[1] - map[0]);
		for (int i = 2; i < N; i++) {
			
			int tmp = Integer.MAX_VALUE;
			for (int j = 1; j <= K; j++) {
				if (i - j < 0) {
					break;
				}
				
				tmp = Math.min(tmp, dp[i-j] + Math.abs(map[i-j] - map[i]));
			}
			
			dp[i] = tmp;
		}
		
		System.out.println(dp[N-1]);
	}
}