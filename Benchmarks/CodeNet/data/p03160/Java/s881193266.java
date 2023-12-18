import java.util.*;

public class Main{ 

   public static void main(String args[]) {
	 
    Scanner s=new Scanner(System.in);
    
    	int n=s.nextInt();
    	long h[]=new long[n];
    	for(int i=0;i<n;i++) {
    		h[i]=s.nextLong();
    	}
    	long dp[]=new long[n];
    	dp[0]=0;
    	dp[1]=Math.abs(h[1]-h[0]);
    	
    	for(int i=2;i<n;i++) {
    		long op1=dp[i-1] + Math.abs(h[i]-h[i-1]);
    		long op2=dp[i-2] + Math.abs(h[i]-h[i-2]);
    		dp[i]=Math.min(op1, op2);
    	}
    	System.out.println(dp[n-1]);
    	
    }

}