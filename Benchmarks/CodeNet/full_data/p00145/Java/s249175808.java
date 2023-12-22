import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		
		long[][] dp = new long[n][n];
		for(int i = 0; i < n; i++) {
			Arrays.fill(dp[i], Integer.MAX_VALUE/2);
			dp[i][i] = 0;
		}
		for(int i = 1; i < n; i++) {
			for(int j = 0; j + i < n; j++) {
				for(int k = j; k < j+i; k++) {
					dp[j][j + i] = Math.min(dp[j][j + i], dp[j][k] + dp[k + 1][j + i] + a[j] * b[k] * a[k + 1] * b[j + i]);
				}
			}
		}
		System.out.println(dp[0][n-1]);
	}
	

}