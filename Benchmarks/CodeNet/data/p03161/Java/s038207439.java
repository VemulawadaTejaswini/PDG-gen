package atcoder;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] h = new int[n];
		int[] dp = new int[100200];
		for(int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}
		for(int i = 0; i < 100200; i++) {
			dp[i] = 100000;
		}
		dp[0] = 0;
		for(int i = 1; i < n; i++) {
			for(int j = i; j < i+k; j++) {
				if(j < n) {
					dp[j] = Math.min(dp[j], (dp[i-1] + Math.abs(h[j] - h[i-1])));
				}
			}
		}
		System.out.println(dp[n-1]);
	}
}
