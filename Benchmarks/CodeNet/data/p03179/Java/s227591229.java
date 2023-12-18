//package april2020;

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

public class Main {
//	static long[] dp;
	static int n;
	static long MOD = (long)1e9+7;
//	static ArrayList<Integer>[] graph;
//	static HashSet<Integer> visited;
//	static long[][] dp;
//	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		FastReader scn = new FastReader();
		OutputStream out = new BufferedOutputStream ( System.out );
		int n = scn.nextInt();
		char[] k=scn.next().toCharArray();
		long[][] dp = new long[n+1][n+1],pref = new long[n+1][n+1];
		dp[1][1] = 1;
		for(int len=2;len<=n;len++) {
			for(int i =1;i<=len-1;i++) {
				pref[len-1][i]=pref[len-1][i-1]+dp[len-1][i];
			}
			for(int b=1;b<=len;b++) {
				int l,r;
				if(k[len-2]=='<') {
					l=1;
					r = b-1;
				}else {
					l=b;
					r=len-1;
				}
				
				if(l<=r) {
					dp[len][b] =(dp[len][b]+pref[len-1][r]-pref[len-1][l-1])%MOD;
				}
				
//				for(int a = 1;a<=len-1;a++) {
//					int real_a = a;
//					if(a>=b) {
//						real_a++;
//					}
//					if((real_a<b)!=(k[len-2]=='<')) {
//						continue;
//					}
//					dp[len][b] = (dp[len][b]+dp[len-1][a])%MOD;
//				}
			}
		}
		long ans =0;
		for(int b =1;b<=n;b++) {
			ans = (ans+dp[n][b])%MOD;
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
