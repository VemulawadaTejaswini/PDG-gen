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
		for(int i = 0; i < n; i++) {
			for(int j = 1; j < n; j++) {
				if(i == j) continue;
				dp[i][j] = Math.min(dp[i][j-1]+ a[j] * b[j] * a[j-1]*b[0],dp[i][j]);
			}
		}
		System.out.println(dp[0][n-1]);
	}
	

}