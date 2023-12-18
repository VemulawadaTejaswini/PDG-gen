import java.util.*;
import java.io.*;
public class Main {
	static long mod = 1000000007; 
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr1 = new int[n];
		int[] arr2 = new int[m];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++){
			arr1[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++){
			arr2[i] = Integer.parseInt(st.nextToken());
		}
		System.out.println((count(arr1, n, arr2, m)+1)%mod);
	}
	static long count(int[] s, int n,  int[] t, int m) 
	{ 
		long[][] dp = new long[n+1][m+1]; 
		for (int i = 1; i <= n; i++) { 
			for (int j = 1; j <= m; j++) {
				if (s[i-1] == t[j-1]){
					dp[i][j] = (1 + dp[i][j-1] + dp[i-1][j])%mod;
				}
				else{
					dp[i][j] = (dp[i][j-1] + dp[i-1][j] - dp[i-1][j-1])%mod;
				}
			} 
		} 
		return dp[n][m]; 
	}

}
