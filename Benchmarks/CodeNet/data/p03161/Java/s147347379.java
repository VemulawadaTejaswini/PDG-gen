import java.util.*;
import java.lang.*;

public class Main {
  
    public int dp(int[] arr,int[] dp,int n,int k,int index) {
    	if(index==n-1) {
    		dp[n-1]=0;
    		return 0;
    	}
    	if(index==n-2) {
    		dp[n-2]=Math.abs(arr[n-1]-arr[n-2]);
    		return dp[n-2];
    	}
    	int min=Integer.MAX_VALUE;
    	for(int i=1;i<=k && index+i<n;i++) {
    		int temp=this.dp(arr, dp, n, k, index+i);
    		if(min>temp+Math.abs(arr[index]-arr[index+i])) {
    			min=temp+Math.abs(arr[index]-arr[index+i]);
    		}
    	}
    	dp[index]=min;
    	return dp[index];
    }
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        int[] dp=new int[n];
        for(int i=0;i<n;i++) {
        	arr[i]=sc.nextInt();
        	
        }
        Main mm=new Main();
        for(int i=0;i<n;i++) {
        	dp[i]=-1;
        }
        System.out.println(mm.dp(arr, dp, n,k, 0));
        
       }
    
    
}