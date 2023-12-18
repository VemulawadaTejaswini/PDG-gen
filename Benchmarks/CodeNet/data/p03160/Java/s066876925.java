import java.util.*;
import java.lang.*;

public class Main {
  
    public int dp(int[] arr,int[] dp,int n,int index) {
    	if(index==n-1) {
    		dp[n-1]=0;
    		return 0;
    	}
    	if(index==n-2) {
    		dp[n-2]=Math.abs(arr[n-1]-arr[n-2]);
    		return dp[n-2];
    	}
    	int temp1=0;
    	int temp2=0;
    	if(dp[index+1]!=-1) {
    		temp1=dp[index+1];
    	}
    	else {
    		temp1=this.dp(arr, dp, n, index+1);
    	}
    	if(dp[index+2]!=-1) {
    		temp2=dp[index+2];
    	}
    	else {
    		temp2=this.dp(arr, dp, n, index+2);
    	}
    	dp[index]=Math.min(Math.abs(arr[index]-arr[index+1])+temp1, Math.abs(arr[index]-arr[index+2])+temp2);
    	return dp[index];
    }
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] dp=new int[n];
        for(int i=0;i<n;i++) {
        	arr[i]=sc.nextInt();
        	
        }
        Main mm=new Main();
        for(int i=0;i<n;i++) {
        	dp[i]=-1;
        }
        System.out.println(mm.dp(arr, dp, n, 0));
        
       }
    
    
}

