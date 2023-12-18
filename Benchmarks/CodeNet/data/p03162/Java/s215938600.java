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

      int arr[][]=new int[n][3];
      
      for(int i=0; i<n; i++)
        for(int j=0; j<3; j++)
        	arr[i][j]=sc.nextInt();
      
      int dp[][] =  new int[n][3];
      Arrays.fill(dp, Integer.MIN_VALUE);
      
      System.out.println(maxHappiness(arr, 0, -1, dp));
      
    }
  
  public static int maxHappiness(int arr[][], int pos, int prevSelected, int dp[][]){
  	if(pos >= arr.length)
      return 0;
    
    if(dp[pos][prevSelected] != Integer.MIN_VALUE)
      return dp[pos][prevSelected];
    
    int max = Integer.MIN_VALUE;
    
    for(int i=0;i<3; i++){
         if(i != prevSelected && max < arr[pos][i])
           max = Math.max(max,arr[pos][i] + maxHappiness(arr, pos+1,i,dp ));
    }
    
    if(prevSelected != -1)
       	dp[pos][prevSelected] = max;
    
    return max;
    
  }
}
