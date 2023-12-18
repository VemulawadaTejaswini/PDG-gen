import java.io.*;
import java.util.*;

class Main {
  
  	public static long maxVal(int n, int w, int wi[], int vi[]) {
      	long dp[][] = new long[n+1][w+1];
      	for (int i = 0 ; i <= w ; ++i) {
         	dp[0][i] = 0;
        }
      
      	for (int i = 1 ; i <= n ; ++i) {
         	dp[i][0] = 0;
        }
      
      	for (int i = 1 ; i <= n ; ++i) {
         	for (int j = 1 ; j <= w ; ++j) {
             	if (wi[i-1] <= j) {
                 	dp[i][j] = Math.max(vi[i-1] + dp[i-1][j-wi[i-1]], dp[i-1][j]); 
                } else {
                	dp[i][j] = dp[i-1][j];
                }
            }
        }
      	return dp[n+1][w+1];
    }
      
	public static void main(String args[]) {
     	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      	String nw[] = br.readLine().split(" ");
      	int n = Integer.parseInt(nw[0]);
      	int w = Integer.parseInt(nw[1]);
      	int wi[] = new int[n];
      	int vi[] = new int[n];
      	int i = 0;
        for (int i = 0 ; i < n ; ++i) {
         	String in[] = br.readLine().split(" ");
          	wi[i] = Integer.parseInt(in[0]);
          	vi[i] = Integer.parseInt(in[1]);
        }
      	
      	long val = maxVal(n, w, wi, vi);
      	System.out.println(val);
    }
}