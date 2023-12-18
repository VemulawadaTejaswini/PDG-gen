import java.io.*;
import java.util.*;
public class Main{
  	/*public int minRec(int a[],int dp[],int i,int j)
    {
      if(i==n && j==n)
        	return dp[n][n];
      if(
        return Math.min( Math.abs(a[]
    }*/
	public static void main(String args[]) throws IOException{
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
      
      int dp[] =  new int[n];
      Arrays.fill(dp, Integer.MAX_VALUE);
      
      System.out.println(minCost(arr, 0, dp, k));
      
    }
  
  public static int minCost(int arr[], int pos, int dp[], int k){
  	if(pos >= arr.length)
      return Integer.MAX_VALUE;
    
     if(pos == arr.length -1)
      return 0;
    
    if(dp[pos] != Integer.MAX_VALUE)
      	return dp[pos];
    
    for(int i = pos+1; i<=pos+k; i++){
    if(i < arr.length)
      dp[pos] = Math.min(dp[pos], Math.abs(arr[pos] - arr[i]) + minCost(arr, i,dp, k));
    }
   
      return dp[pos];
    
  }
}
