//package april2020;

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

public class Main {
	static long[] dp;
	static int n,k, a[];
	static long MOD = (long)1e9+7;
	public static void main(String[] args) throws IOException {
		FastReader scn = new FastReader();
		OutputStream out = new BufferedOutputStream ( System.out );
		n = scn.nextInt();
		a = new int[n];
		long[] ps = new long[n];
		for(int i =0;i<n;i++) {
			a[i] = scn.nextInt();
			if(i>0)
				ps[i]=ps[i-1]+a[i];
			else
				ps[i]=a[i];
		}
		long[][] dp = new long[n][n];
		
//		for(int i=1;i<n;i++) {
//			dp[i][i]=0;
//		}
		for(int l=n-1;l>=0;l--) {
			for(int r=l;r<n;r++) {
				if(l==r) {
					dp[l][r]=0;
				}else {
					dp[l][r] = Long.MAX_VALUE;
					for(int i=l;i<=r-1;i++) {
						dp[l][r] = Math.min(dp[l][r], dp[l][i]+dp[i+1][r]+ps[r]-((l==0)?0:ps[l-1]));
					}
				}
			}
		}
		out.write((dp[0][n-1]+"\n").getBytes());
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
