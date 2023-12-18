/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.lang.reflect.Array;
import java.io.*;

class Main {
    static long dp[][];
    public static long knapsack(int i,int v[],int w[],int C,long value){
         if(i==0||C==0)return value;
         if(dp[i][C]!=-1)return dp[i][C] ;
         if(C<w[i-1])dp[i][C]= knapsack(i-1, v, w, C, value);
         else dp[i][C]= Math.max(knapsack(i-1, v, w, C-w[i-1],value+v[i-1]),knapsack(i-1, v, w, C, value));
         return dp[i][C];
    }
	public static void main (String[] args)throws IOException{
		//code
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String[]s=br.readLine().split("\\s+");
		
            int n=Integer.parseInt(s[0]);
            int C=Integer.parseInt(s[1]);
            int []v=new int[n];
            int []w=new int[n];
		   
		    for(int i=0;i<n;i++){
                s=br.readLine().split("\\s+");
                w[i]=Integer.parseInt(s[0]);
                v[i]=Integer.parseInt(s[1]);
            }
            dp=new long[n+1][C+1];
            for(int i=0;i<=n;i++)
            Arrays.fill(dp[i],-1);
            long res=knapsack(n, v, w, C,0);
            for(int i=0;i<n;i++)
             System.out.println(Arrays.toString(dp[i]));
            System.out.print(res);
		
		    
	
		
	}
}
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.lang.reflect.Array;
import java.io.*;

class Main {
    static long dp[][];
    public static long knapsack(int i,int v[],int w[],int C,long value){
         if(i==0||C==0)return value;
         if(dp[i][C]!=-1)return dp[i][C] ;
         if(C<w[i-1])dp[i][C]= knapsack(i-1, v, w, C, value);
         else dp[i][C]= Math.max(knapsack(i-1, v, w, C-w[i-1],value+v[i-1]),knapsack(i-1, v, w, C, value));
         return dp[i][C];
    }
	public static void main (String[] args)throws IOException{
		//code
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String[]s=br.readLine().split("\\s+");
		
            int n=Integer.parseInt(s[0]);
            int C=Integer.parseInt(s[1]);
            int []v=new int[n];
            int []w=new int[n];
		   
		    for(int i=0;i<n;i++){
                s=br.readLine().split("\\s+");
                w[i]=Integer.parseInt(s[0]);
                v[i]=Integer.parseInt(s[1]);
            }
            dp=new long[n+1][C+1];
            for(int i=0;i<=n;i++)
            Arrays.fill(dp[i],-1);
            long res=knapsack(n, v, w, C,0);
            for(int i=0;i<n;i++)
             System.out.println(Arrays.toString(dp[i]));
            System.out.print(res);
		
		    
	
		
	}
}
