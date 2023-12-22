import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int r = sc.nextInt();
		long[][] dp = new long[n+1][r+1];
		dp[0][0] = 1;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < r+1; j++) {
				for(int k = m; k < r+1; k++) {
					if(j + k > r) break;
					dp[i+1][j + k] += dp[i][j]; 
				}
			}
		}
		long sum = dp[n][r];
		System.out.println(sum);
	}
}