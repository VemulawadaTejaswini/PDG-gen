import java.util.*;
public class Solution01{
	public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      int noOfElements = scan.nextInt();
      int knapsackCapacity = scan.nextInt();
      int[] weight = new int[noOfElements+1];
      int[] value = new int[noOfElements+1];
      // items at i,j defines weight i, value j.
      weight[0]=0;
      value[0]=0;
      for(int i=1; i<noOfElements+1; i++){
        weight[i]=scan.nextInt();
        value[i]=scan.nextInt();
      }
      System.out.println(knapscak01(weight,value,knapsackCapacity));
      
	}
  
  	public static int knapscak01(int[] weight, int[] value ,int knapsackCapacity) {
      int[][] dp= new int[value.length][knapsackCapacity+1];
      for(int i=1; i<weight.length; i++) {
        for(int j=0; j<=knapsackCapacity; j++) {
          if(j-weight[i]>=0) {
            dp[i][j]=Math.max(dp[i-1][j-weight[i]]+value[i],dp[i-1][j]);
          }else {
        	dp[i][j]=dp[i-1][j];
          }
        }
      }
      print(dp);
      return dp[value.length-1][knapsackCapacity];
    }
  	
  	public static void print(int[][] dp) {
  		for(int i=0; i<dp.length; i++) {
  			for(int j=0; j<dp[i].length; j++) {
  				System.out.print(dp[i][j]);
  			}
  			System.out.println();
  		}
  	}
  
}
