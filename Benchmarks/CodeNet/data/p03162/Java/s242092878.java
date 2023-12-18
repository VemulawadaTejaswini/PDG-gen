import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
  
	static int dp[][] = new int[100000][3];
	
  	public static int helper(int a[][], int i, int j) {
  		if (i < 0) {
  			return 0;
  		} else if (dp[i][j] > -1) {
  			return dp[i][j];
  		} else if (j == 0) {
  			dp[i][j] = Math.max(a[i][j] + helper(a, i-1, 1), a[i][j] + helper(a, i-1, 2));
  		} else if (j == 1) {
  			dp[i][j] = Math.max(a[i][j] + helper(a, i-1, 0), a[i][j] + helper(a, i-1, 2));
  		} else {
  			dp[i][j] = Math.max(a[i][j] + helper(a, i-1, 0), a[i][j] + helper(a, i-1, 1));
  		}
  		
      	return dp[i][j];
    }
      
	public static void main(String args[]) throws IOException {
     	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      	int n = Integer.parseInt(br.readLine());
      	int a[][] = new int[n][3];
        for (int i = 0 ; i < n ; ++i) {
         	String in[] = br.readLine().split(" ");
          	a[i][0] = Integer.parseInt(in[0]);
          	a[i][1] = Integer.parseInt(in[1]);
          	a[i][2] = Integer.parseInt(in[2]);
        }
      	
      	for (int i = 0 ; i < 100000 ; ++i) {
      		dp[i][0] = dp[i][1] = dp[i][2] = -1;
      	}
      	int max = Integer.MIN_VALUE;
      	max = Math.max(max, helper(a, n-1, 0));
      	max = Math.max(max, helper(a, n-1, 1));
      	max = Math.max(max, helper(a, n-1, 2));
      	System.out.println(max);
    }
}