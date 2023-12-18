//package april2020;

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		FastReader scn = new FastReader();
		OutputStream out = new BufferedOutputStream ( System.out );
		String s1 = scn.next();
		String s2 = scn.next();
		
		int[][] dp = new int[s1.length()+1][s2.length()+1];
		for(int i = s1.length();i>=0;i--) {
			for(int j=s2.length();j>=0;j--) {
				if(i==s1.length()||j==s2.length()) {
					dp[i][j]=0;
				}else {
					if(s1.charAt(i)==s2.charAt(j)) {
						dp[i][j]=dp[i+1][j+1]+1;
					}else {
						int c1 = dp[i+1][j];
						int c2 = dp[i][j+1];
						
						dp[i][j] = Math.max(c1, c2);
					}
				}
			}
		}
		StringBuilder res = new StringBuilder();
		int s1l = s1.length(), s2l = s2.length();
		int i=0,j=0;
		while(i<s1l&&j<s2l) {
			if(s1.charAt(i)==s2.charAt(j)) {
				res.append(s1.charAt(i));
				i++;
				j++;
			}else if(dp[i+1][j]>dp[i][j+1]) {
				i++;
			}else {
				j++;
			}
		}
		out.write((res.toString()+"\n").getBytes());
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
