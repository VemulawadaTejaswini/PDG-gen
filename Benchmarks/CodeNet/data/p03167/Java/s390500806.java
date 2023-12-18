import java.util.Arrays;
import java.util.Scanner;

public class Grid1 {
	final static int MOD = (int)1e9 + 7;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt() , m = scan.nextInt();
		char[][] arr = new char[n][m];
		int[][] dp = new int[n][m];
	
		for(int i = 0 ; i < n ; ++i) {
			arr[i] = scan.next().toCharArray();
		}
		for(int i = 0 ; i < n ; i++) {
			if(arr[i][0] == '#')break;
			else dp[i][0] = 1;
		}
		
		for(int j = 0 ; j < m ; j++) {
			if(arr[0][j] == '#')break;
			else dp[0][j] = 1;
		}
		for(int i = 1 ; i < n ; ++i) {
			for(int j = 1; j < m ; ++j) {
				if(arr[i][j] == '#')
					continue;
				if(arr[i-1][j] == '#' && arr[i][j-1] == '#')
					continue;
				else if(arr[i-1][j] == '#')
					dp[i][j] = dp[i][j-1];
				else if(arr[i][j-1] == '#')
					dp[i][j] = dp[i-1][j];
				else dp[i][j] = (dp[i-1][j] + dp[i][j-1])%MOD;
			}
		}
		
		System.out.println(dp[n-1][m-1]);
	}
}
