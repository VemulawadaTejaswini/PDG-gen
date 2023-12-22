import java.io.IOException;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] d = new int[n];
		boolean[] dp = new boolean[n];
		for(int i = 0; i < n; i++) {
			d[i] = sc.nextInt() / 10;
			dp[i] = false;
		}
		dp[0] = true;
		
		boolean ans = true;
		for(int i = 0; i < n; i++) {
			if(dp[i]) {
				for(int j = i + 1; j <= Math.min(i + d[i], n - 1); j++) {
					dp[j] = true;
				}
			}
		}
		ans &= dp[n - 1];
		
		for(int i = 0; i < n; i++) {
			dp[i] = false;
		}
		dp[n - 1] = true;
		
		for(int i = n - 1; i >= 0; i--) {
			if(dp[i]) {
				for(int j = i - 1; j >= Math.max(i - d[i], 0); j--) {
					dp[j] = true;
				}
			}
		}
		ans &= dp[0];
		
		String answer = ans? "yes" : "no";
		System.out.println(answer);
	}
}
