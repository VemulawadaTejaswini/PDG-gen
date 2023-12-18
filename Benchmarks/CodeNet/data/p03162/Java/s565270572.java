import java.util.*;

public class Main{ 

   public static void main(String args[]) {
	 
    Scanner s=new Scanner(System.in);
    
    	int n=s.nextInt();
    	
    	long arr[][]=new long[n+1][4];
    	for(int i=1;i<=n;i++) {
    		for(int j=1;j<=3;j++) {
    		arr[i][j]=s.nextLong();
    		}
    	}
    	long dp[][]=new long[n+1][4];
    	
    	
    	for(int i=1;i<=n;i++) {
    		
    			dp[i][1]=arr[i][1] + Math.max(dp[i-1][2], dp[i-1][3]);
    		    dp[i][2]=arr[i][2] + Math.max(dp[i-1][1], dp[i-1][3]);
    			dp[i][3]=arr[i][3] + Math.max(dp[i-1][2], dp[i-1][1]);
    		
    	 }
    	System.out.println(Math.max(dp[n][1], Math.max(dp[n][2], dp[n][3])));
    	
    	
    }

}