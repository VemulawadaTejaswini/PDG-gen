//package april2020;

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

public class Main {
	static int n, max_wt, w[], v[];
	static Long[][] dp;
	public static void main(String[] args) throws IOException {
		FastReader scn = new FastReader();
		OutputStream out = new BufferedOutputStream ( System.out );
		n = scn.nextInt();
		max_wt = scn.nextInt();
		w = new int[n];
		v = new int[n];
		dp = new Long[n+1][max_wt+1];
		for(int i =0;i<n;i++) {
			w[i] = scn.nextInt();
			v[i] = scn.nextInt();
		}
		
		Long ans = search();
		out.write((""+ans).getBytes());
		out.close();
	}
	public static Long search() {
		
		for(int i =0;i<dp.length;i++) {
			for(int j =0;j<dp[0].length;j++) {
				if(i==0||j==0)
					dp[i][j]=0l;
				else {
					if(w[i-1]>j) {
						dp[i][j] = dp[i-1][j];
					}else {
						Long inc = v[i-1]+dp[i-1][j-w[i-1]];
						Long exc = dp[i-1][j];
						
						dp[i][j]=Math.max(inc,  exc);
					}
				}
			}
		}
		return dp[dp.length-1][dp[0].length-1];
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
