import java.util.*;
import java.io.*;
 
class Main
{
    public static void main(String[] args) throws Exception
    {
    	Scanner in = new Scanner(System.in);
    	int n= in.nextInt();
    	int k = in.nextInt();
    	int[] arr = new int[n];

    	for(int i =0; i< n; i++)
    		arr[i] = in.nextInt();

    	double[][] dp = new double[n+1][n+1];

    	double mod = 1000000007;
    	for(int j =0; j<=k; j++){
    		dp[1][j]=(arr[0]>=j) 1:0;
    	}

    	for(int i =2; i<=n; i++){
    		for(int j =0; j<=k; j++){
    			if(j==0){
    				dp[i][j] = dp[i-1][j];
    			} else{
    				dp[i][j] =(dp[i-1][j]+ dp[i][j-1])%mod;
    				if(j-arr[i-1]>0){
    					dp[i][j] = (dp[i][j] -dp[i-1][j-arr[i-1]-1]+mod)%mod;
    				}
    			}
    		}
    	}

    	System.out.println((int)dp[n][k]);
    }
}