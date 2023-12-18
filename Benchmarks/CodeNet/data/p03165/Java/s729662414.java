/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.lang.reflect.Array;
import java.io.*;

class Main {
    static int dp[][];
    
	public static void main (String[] args)throws IOException{
		//code
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String s=br.readLine();
		String t=br.readLine();
           int n=s.length(),m=t.length();


        dp=new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s.charAt(i-1)==t.charAt(j-1))dp[i][j]=dp[i-1][j-1]+1;
                else dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        StringBuilder res=new StringBuilder();
        int i=n,j=m;
        while(i>0&&j>0){
           if(dp[i][j]>dp[i-1][j]&&dp[i][j]>dp[i][j-1]){
               res.append(s.charAt(i-1));
               i--;j--;
           }
           else{
               if(dp[i-1][j]>dp[i][j-1])i--;
               else j--;
           }

        }
        
           // for( i=1;i<=n;i++)
             //System.out.println(Arrays.toString(dp[i]));
            System.out.print(res.reverse());
		
		    
	
		
	}
}
