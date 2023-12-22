
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int s = Integer.parseInt(sc.next());
		
		int mod = 998244353;
		
		int []a = new int [n];
		
		for(int i = 0 ; i < n ;i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		
		int dp[][] = new int [n+1][3001];
		
		dp[0][0] = 1;
	
		
		for(int i = 0 ; i < n; i++) {
			for(int j = 3000; j >= 0 ;j--) {
				if(j - a[i] < 0) {
					dp[i+1][j] = (dp[i][j]*2)%mod;
				}
				else {
				dp[i+1][j] = (2*dp[i][j])%mod;
				dp[i+1][j] = (dp[i][j-a[i]] + dp[i+1][j])%mod;
				}
			}
		}
		
		System.out.println(dp[n][s]);

	}

}
