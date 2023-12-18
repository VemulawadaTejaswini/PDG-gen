//package april2020;

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

public class Main {
	static int n, max_wt, w[], v[];
	static Long[][] dp;
	public static void main(String[] args) {
		FastReader scn = new FastReader();
		
		n = scn.nextInt();
		max_wt = scn.nextInt();
		w = new int[n];
		v = new int[n];
		dp = new Long[n+10][max_wt+1];
		for(int i =0;i<n;i++) {
			w[i] = scn.nextInt();
			v[i] = scn.nextInt();
		}
		
		Long ans = search(0, 0);
		System.out.println(ans);
	}
	public static Long search(int idx, int wt) {
		if(idx>=n) {
			return 0l;
		}
		if(wt>max_wt) {
			return dp[idx][wt]=Long.MAX_VALUE;
		}
		if(wt==max_wt) {
			return 0l;
		}
		if(dp[idx][wt]!=null) {
			return dp[idx][wt];
		}
		//exclude 
		Long exc = search(idx+1,wt);
		//include 
		Long inc = 0l;
		if(w[idx]+wt<=max_wt) {
			inc = search(idx+1,wt+w[idx]);
			inc = (inc==Long.MAX_VALUE?inc:inc+v[idx]);
		}
		
		return dp[idx][wt]=Math.max(inc,  exc);
		
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
