 
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	
	static int n;
	static int p;
	static int[] arr;
	
	static Long[][] dp;
	
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);

		n = in.nextInt();
		p = in.nextInt();
		
		arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = in.nextInt();
		}
		
		dp = new Long[n][2];
		
		System.out.println(rec(0, 0));
	}

	private static long rec(int i, int m) {
		if(i == n) {
			if(m == p) {
				return 1;
			}
			
			return 0;
		}
		else if(dp[i][m] != null ) {
			return dp[i][m];
		}
		else {
			
			return dp[i][m] = rec(i+1, (m + arr[i]) % 2) + rec(i+1, m);
		}
		
	}
}
