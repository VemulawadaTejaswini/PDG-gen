//Knapsack2
import java.io.*;
import java.util.*;
public class Main{
	static int n,w;
	static int[] weight=new int[101];
	static int[] cost=new int[101];	
	public static long solve(int max_profit,int w){			
		 long[][] dp=new long[n+1][max_profit+1];
		 long inf=(long)1e11;
		 for(int i=1;i<=max_profit;i++){
		 	dp[0][i]=inf;
		 }
		 for(int i=1;i<=n;i++){
		 	for(int j=1;j<=max_profit;j++){
		 		if(cost[i-1]>j){
		 			dp[i][j]=dp[i-1][j];
		 		}
		 		else{
		 			dp[i][j]=Math.min(0+dp[i-1][j],weight[i-1]+dp[i-1][j-cost[i-1]]);
		 		}
		 	}
		 }
		 long ans=0;
		 for(int i=1;i<=max_profit;i++){
		 	if(dp[n][i]<=w){
		 		ans=i;
		 	}
		 }
		 
		 return ans;

	}
	public static void main(String[] args) throws IOException{
    	 BufferedReader br = new BufferedReader( 
                              new InputStreamReader(System.in)); 
        String str[]=br.readLine().split(" ");
		n=Integer.parseInt(str[0]); 
		w=Integer.parseInt(str[1]); 
		int max_profit=0;
		for(int i=0;i<n;i++){	
		str=br.readLine().split(" ");		
		   weight[i]=Integer.parseInt(str[0]);
		   cost[i]=Integer.parseInt(str[1]);
		   max_profit+=cost[i];
		}

		System.out.println(solve(max_profit,w));
	}
    }
