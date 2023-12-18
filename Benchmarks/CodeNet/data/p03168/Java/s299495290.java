/*package whatever //do not write package name here */

import java.util.*;
import java.io.*;

class Main {
    static double dp[][];
    public static double probability(int i,int tails,int n,double []ar){
        if(i==n)return 1;
        if(dp[i][tails]!=-1)return dp[i][tails];
        double ans=0;
         if(tails<n-tails-1)ans+=probability(i+1, tails+1, n, ar)*(1-ar[i]);
         
         ans+=probability(i+1, tails, n, ar)*ar[i];
         dp[i][tails]=ans;
         return ans;
    }
	public static void main (String[] args)throws IOException{
		//code
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String[]s;
		
            int n=Integer.parseInt(br.readLine());
           
            

  
           double []ar=new double[n];
           s=br.readLine().split("\\s+");
		    for(int i=0;i<n;i++){
                ar[i]=Double.parseDouble(s[i]);  
            }

        
           dp=new double[n][n+1];
           for(int i=0;i<n;i++)Arrays.fill(dp[i], -1);
           System.out.println(probability(0, 0, n, ar));

            
            
         
        
          
		
		    
	
		
	}
}
