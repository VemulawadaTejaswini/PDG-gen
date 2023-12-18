//package EducationalDPContest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
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
        
        int[] nextIntArray(int n)
        {
        	int a[]=new int[n];
        	for(int i=0;i<n;i++)
        	{
        		a[i]=Integer.parseInt(next()); 
        	}
        	return a;
        }
    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FastReader sc=new FastReader();
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=sc.nextIntArray(n);
		
		
		//Now we have two changing variables n and k;
		//for each i we have k choices;
		//I need to reach from 0 to end;
		int dp[]=new int[n+1];
		Arrays.fill(dp, Integer.MAX_VALUE);
		//cost to reach 0 will be 0 only;
		dp[0]=0;
		
		for(int i=0;i<n;i++)
		{
			//now to cost to reach 1; 
			//dp[i];
			//we can take k steps;
			//we are already at i;
			for(int j=i+1;j<=i+k;j++)
			{
				if(j<n)
				{
					int cost=Math.abs(a[j]-a[i])+dp[i];
					dp[j]=Math.min(dp[j],cost);
				}
			}
		}
		System.out.println(dp[n-1]);

	}
	
	

}
