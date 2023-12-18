import java.util.*;
import java.io.*;

public class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		for (int i = 0; i < n; i++) x[i] = sc.nextInt();
		long cost = 0;
		long[] dp = new long[n];
		dp[0] = 0; dp[1] = Math.abs(x[1] - x[0]);
		for (int i = 2; i < n; i++) {
			dp[i] = Math.min(dp[i - 1] + Math.abs(x[i] - x[i - 1]), dp[i - 2] + Math.abs(x[i] - x[i - 2]));
		}
		System.out.println(dp[n-1]);
	}
}
