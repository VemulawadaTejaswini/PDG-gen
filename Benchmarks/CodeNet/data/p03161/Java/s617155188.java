import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		int[] dp = new int[n];
		
		for(int i = 0;i < n;i++)
			arr[i] = sc.nextInt();
		
		Arrays.fill(dp, 0);
		
		if(n == 1) {
			System.out.println(arr[0]);
			return;
		}
		
		
		for(int i = 1;i < n;i++) {
			int min = Integer.MAX_VALUE;
			for(int j = Math.max(0, i - k);j < i;j++) {
				min = Math.min(min, Math.abs(arr[i] - arr[j]) + dp[j]);
			}
			dp[i] = min;
		}
		
		System.out.println(dp[n-1]);
		return;
		
	}
}
