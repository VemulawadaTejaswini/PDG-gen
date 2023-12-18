//package april2020;

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		FastReader scn = new FastReader();
		OutputStream out = new BufferedOutputStream ( System.out );
		int h=scn.nextInt(),w=scn.nextInt();
		int[][] g = new int[h][w];
		long MOD = (long)1e9+7;
		for(int i=0;i<h;i++) {
			String s = scn.next();
			for(int j=0;j<s.length();j++) {
				g[i][j]= s.charAt(j)=='#'?0:1;
			}
		}
		long[][] dp = new long[h][w];
		boolean flag = true;
		for(int i=h-1;i>=0;i--) {
			if(flag) {
				if(g[i][w-1]==0) {
					flag = false;
					dp[i][w-1]=0;
				}else {
					dp[i][w-1]=1;
				}
			}else {
				dp[i][w-1]=0;
			}
		}
//		System.out.println(MOD);
		flag = true;
		for(int i=w-1;i>=0;i--) {
			if(flag) {
				if(g[h-1][i]==0) {
					flag = false;
					dp[h-1][i]=0;
				}else {
					dp[h-1][i]=1;
				}
			}else {
				dp[h-1][i]=0;
			}
		}
		for(int i=h-2;i>=0;i--) {
			for(int j=w-2;j>=0;j--) {
				if(g[i][j]==0) {
					dp[i][j]=0;
				}else {
					dp[i][j]=(dp[i+1][j]%MOD+dp[i][j+1]%MOD)%MOD;
				}
			}
		}
//		for(int i=0;i<h;i++) {
//			for(int j=0;j<w;j++) {
//				System.out.print(g[i][j]+" ");
//			}
//			System.out.println();
//		}
		out.write((""+dp[0][0]+"\n").getBytes());
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
