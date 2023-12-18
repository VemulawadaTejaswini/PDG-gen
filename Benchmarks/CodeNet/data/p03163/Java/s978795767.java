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
	  int W = sc.nextInt();
      int w[]=new int[n];
      int v[] = new int[n];
      
      for(int i=0; i<n; i++){
         w[i] = sc.nextInt();
         v[i] = sc.nextInt();
      }
      
      int dp[][] =  new int[n][3];
       
      for(int i=0; i<n; i++)
      Arrays.fill(dp[i], Integer.MIN_VALUE);
      
      System.out.println(maxSum(w, v, W, 0));
      
    }
  
  public static int maxSum(int wt[], int v[], int W, int pos){
    
  	if(pos >= wt.length)
      return 0;
    
  //  if(prevSelected!=-1 && dp[pos][prevSelected] != Integer.MIN_VALUE)
    //  return dp[pos][prevSelected];
    
    int sum = 0;
    if(wt[pos] > W)
      return maxSum(wt, v, W, pos+1);
    
    return Math.max(v[pos]+ maxSum(wt, v, W-wr[pos], pos+1), maxSum(wt, v, W, pos+1));
    
  }
}
