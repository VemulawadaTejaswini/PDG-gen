import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws Exception {
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		Scanner s = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		int n = Integer.parseInt(f.readLine().trim());
		long[] vals = new long[n];
		for(int i = 0; i < n; i++) 
			vals[i] = Integer.parseInt(f.readLine().trim());
		long[][] dp = new long[2][n];
		for(int i = 1; i < n; i++) {
//			System.out.println(i);
			dp[0][i] = Math.max(dp[0][i-1], i-2 >= 0 ? dp[1][i-2] : Integer.MIN_VALUE) + vals[i-1]/2;
			dp[1][i] = dp[0][i-1] + Math.min(vals[i-1], vals[i]); 
			dp[1][i] = Math.max(dp[1][i], (i - 2 >= 0 ? dp[1][i-2] : 0) + Math.min(Math.max(0,vals[i-1]-dp[1][i-1]), vals[i]));
		}
//		for(int i = 0; i < 2; i++) System.out.println(Arrays.toString(dp[i]));
		if(n == 1) System.out.println(vals[0]/2);
		else System.out.println(Math.max(dp[0][n-1], dp[1][n-1]));
	}
}