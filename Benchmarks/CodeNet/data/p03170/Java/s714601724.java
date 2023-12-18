
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] c = new int[n];
		boolean[] dp = new boolean[k+1];
//		dp[0] = false;
		for(int i = 0; i < n; i++) {
			c[i] = sc.nextInt();
		}
		
		for(int i = 0; i <= k; i ++) {
			for(int j = 0; j < n; j++) {
				if(i-c[j] >= 0)dp[i] = (dp[i]) | !dp[i-c[j]];
			}
		}
		System.out.println(dp[k]?"First":"Second");
	}
}
