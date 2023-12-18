import java.util.*;
import java.lang.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int w = sc.nextInt();
		int wt[] = new int[n];
		int val[] = new int[n];
		for(int i=0;i<n;i++){
		    wt[i] = sc.nextInt();
		    val[i]=sc.nextInt();
		}
		int dp[][]=new int[w+1][n];
		int maxv = Integer.MIN_VALUE;
		for(int i=0;i<=w;i++){
		    for(int j=0;j<n;j++){
		        if (i==0){
		            dp[i][j]=0;
		        }
		        else {
		            if (j>0) {
		                dp[i][j] = dp[i][j-1];
		            }
		            if (i-wt[j]>=0){
		                if (i-wt[j]==0){
		                    if (j>0){
		                        dp[i][j]=Math.max(dp[i][j], dp[i-wt[j]][j-1]+val[j]); 
		                    }
		                  else {
		                      dp[i][j]=Math.max(dp[i][j], dp[i-wt[j]][j]+val[j]); 
		                  }
		                }
		                else {
		                    if (dp[i-wt[j]][j]>0){
		                        if (j>0){
		                        dp[i][j]=Math.max(dp[i][j], dp[i-wt[j]][j-1]+val[j]); 
		                    }
		                    else {
		                        dp[i][j]=Math.max(dp[i][j], dp[i-wt[j]][j]+val[j]);
		                    }
		                 
		                      
		                        
		                    }
		                  //  else {
		                  //      if(j>0){
		                  //           dp[i][j] = dp[i][j-1];
		                  //        //    if (i==14){
		                  //        //  System.out.print(j+" aaaa2 "+dp[i][j]);
		                  //        //  System.out.println();
		                  //        //   }
		                  //      }
		                       
		                  //  }
		                }
		                
		            }
		        }
		    }
		    System.out.print(dp[i][n-1]+" "+i);
		    System.out.println();
		   maxv = Math.max(maxv, dp[i][n-1]);
		}
	    System.out.println(maxv);
		
	}
}