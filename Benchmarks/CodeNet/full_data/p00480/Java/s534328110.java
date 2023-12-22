import java.util.*;
public class Main{
	public static void main(String[]agrs){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] list = new int[n];
		for(int i = 0; i < n; i++) {
			list[i] = sc.nextInt();
		}
		
		long[][] dp = new long[n-1][21];
		dp[0][list[0]] = 1;
		for(int i = 1; i < n-1; i++ ) {
			for(int j = 0; j < 21; j++) {
				if(j + list[i] >= 0 && j + list[i] <= 20) {
					dp[i][j + list[i]] += dp[i-1][j];
				}
				if(j - list[i] >= 0 && j - list[i] <= 20) {
					dp[i][j - list[i]] += dp[i-1][j];
				}
			}
		}
		System.out.println(dp[n-2][list[n-1]]);
		
	}
}