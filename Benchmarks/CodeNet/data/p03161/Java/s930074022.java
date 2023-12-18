
import java.util.Scanner;

public class Main {
	
	public static void A() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if(n == 0) {
			System.out.println(0);
			return;
		}
		int[] height = new int[n];
		for(int i = 0; i < n; i++) {
			height[i] = s.nextInt();
		}
		int[] dp = new int[n];
		dp[dp.length - 1] = 0;
		for(int i = dp.length - 2; i >= 0; i--) {
			dp[i] = Integer.MAX_VALUE;
			for(int j = 1; j <= 2; j++) {
				if(j + i < n) {
					dp[i] = Math.min(dp[i + j] + Math.abs(height[i] - height[i + j]), dp[i]);
				}
			}
		}
		System.out.println(dp[0]);
	}
	
	public static void B() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if(n == 0) {
			System.out.println(0);
			return;
		}
		int k = s.nextInt();
		int[] height = new int[n];
		for(int i = 0; i < n; i++) {
			height[i] = s.nextInt();
		}
		int[] dp = new int[n];
		dp[dp.length - 1] = 0;
		for(int i = dp.length - 2; i >= 0; i--) {
			dp[i] = Integer.MAX_VALUE;
			for(int j = 1; j <= k; j++) {
				if(j + i < n) {
					dp[i] = Math.min(dp[i + j] + Math.abs(height[i] - height[i + j]), dp[i]);
				}
			}
		}
		System.out.println(dp[0]);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B();
	}

}
