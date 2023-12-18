/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args)throws IOException{
		//code
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String[]s;
		  
            int n=Integer.parseInt(br.readLine());
            
		    int [][]ar=new int[n][3];
		    
		    for(int i=0;i<n;i++){
                s=br.readLine().split("\\s+");
                ar[i][0]=Integer.parseInt(s[0]);
                ar[i][1]=Integer.parseInt(s[1]);
                ar[i][2]=Integer.parseInt(s[2]);
            }
            int dp[][]=new int[n][3];
            dp[0][0]=ar[0][0];
            dp[0][1]=ar[0][1];
            dp[0][2]=ar[0][2];
            int v=0;
            for(int i=0;i<3;i++)v=Math.max(v,dp[0][i]);
            for(int i=1;i<n;i++){
               for(int k=0;k<=2;k++){
                for(int j=0;j<=2;j++){
                    if(k!=j)
                    dp[i][k]=Math.max(dp[i-1][j]+ar[i][k],dp[i][k]);
                    
                }
                v=Math.max(dp[i][k],v);
              }
            }
                
            
          
            System.out.print(v);
		
		    
	
		
	}
}
