//package april2020;

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		FastReader scn = new FastReader();
		OutputStream out = new BufferedOutputStream ( System.out );
		int n =scn.nextInt();
		double[] p = new double[n];
		for(int i=0;i<n;i++) {
			p[i] = scn.nextDouble();
		}
		double[] dp = new double[n+1];
		
		dp[0]=1;
		
		for(int coin = 0;coin<n;coin++) {
			for(int i=coin+1;i>=0;i--) {
				dp[i] = (i==0?0:(dp[i-1]*p[coin]))+dp[i]*(1-p[coin]);
			}
		}
		double ans = 0;
		for(int heads = 0;heads<=n;heads++) {
			int tails = n-heads;
			if(heads>tails) {
				ans+=dp[heads];
			}
		}
		out.write((ans+"\n").getBytes());
		out.close();
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
