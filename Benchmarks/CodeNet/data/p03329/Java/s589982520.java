import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dp = new int[n + 1];
		for(int i = 1; i <= n; i++) {
			dp[i] = dp[i - 1] + 1;
		}
		for(int i = 1; i <= n; i++) {
			int j = 1;
			while(true) {
				if(i - Math.pow(6, j) >= 0) {
					dp[i] = Math.min(dp[(int) (i - (Math.pow(6, j)))] + 1, dp[i]);
					j++;
				}else {
					break;
				}
			}
		}
		for(int i = 1; i <= n; i++) {
			int j = 1;
			while(true) {
				if(i - Math.pow(9, j) >= 0) {
					dp[i] = Math.min(dp[(int) (i - (Math.pow(9, j)))] + 1, dp[i]);
					j++;
				}else {
					break;
				}
			}
		}
		System.out.println(dp[n]);
	}

}
