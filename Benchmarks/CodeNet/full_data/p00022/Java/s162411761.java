import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			int n = sc.nextInt();
			if(n == 0) break;
			int[] a = new int[n+1];
			int[] dp = new int[n+1];
			for(int i = 1; i <= n; i++) {
				a[i] = sc.nextInt();
			}
			int max = 0;
			for(int i = 1; i <= n; i++) {
				dp[i] = Math.max(a[i], a[i] + dp[i-1]);
				max = Math.max(dp[i], max);
			}
			System.out.println(max);
		}
	}
}