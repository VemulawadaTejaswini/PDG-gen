import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; ++i)arr[i] = scan.nextInt();
		int[] dp = new int[n];
		dp[0] = 0;
		for(int i = 1 ; i < n ; ++i) {
			int min = Integer.MAX_VALUE;
			for(int j = i - 1 ; j >= Math.max(0,i - k); j--) {
				min = Math.min(min, Math.abs(arr[i]-arr[j])+dp[j]);
			}
			dp[i] = min;
		}
		
		System.out.println(dp[n-1]);
	}
}
