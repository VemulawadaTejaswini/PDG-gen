
import java.util.*;


public class Main{ 


    public static void main(String args[]) {
    Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	
	int arr[]=new int[n];
	long sum=0;
	for(int i=0;i<n;i++) {
		arr[i]=s.nextInt();
		sum+=arr[i];
	}
	long dp[][]=new long[n+1][n+1];
	for(int i=0;i<=n;i++) {
		for(int j=0;j<=n;j++) {
			dp[i][j]=-1;
		}
	}
	long Xans=f(0,n-1,n,arr,dp);
	long Yans=sum-Xans;
	 System.out.print(Xans-Yans);
	 
   }
    public static long f(int start,int end,int n,int arr[],long dp[][]) {
    	if(start>end) {
    		return 0;
    	}
    	if(dp[start][end]!=-1) {
    		return dp[start][end];
    	}
    	long a=arr[start]+ Math.min(f(start+2,end,n,arr,dp),
    			f(start+1,end-1,n,arr,dp));
    	long b=arr[end]+ Math.min(f(start,end-2,n,arr,dp),
    			f(start+1,end-1,n,arr,dp));
    	return dp[start][end]=(a>b)?a:b;
    }
}