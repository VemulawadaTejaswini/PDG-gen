/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
  	int dp[];
  	Main(int n){
      dp = new int[n];
    }
	public static void main (String[] args) throws java.lang.Exception
	{
      	FastReader s = new FastReader();
		int  n = s.nextInt();
      	int k = s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		arr[i]= s.nextInt();
		Main ob = new Main(n);
		//k = Math.min(k,n-1);
		int ans = ob.getCost(n,arr,k);
		System.out.println(ans);
	}
  int getCost(int n,int arr[], int k){
   dp[0]=0;
   dp[1]=Math.abs(arr[1]-arr[0]);
   for(int i=2; i<n;i++){
     int min = 100001;
   for(int j = Math.max(0,i-k); j<i;j++)
     min = Math.min(Math.abs(arr[i]-arr[j])+dp[j],min);
     dp[i]=min;
   }
    return dp[n-1];
  }


  static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
}
