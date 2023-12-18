// package div2658.dpatcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static class FastReader {

        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
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

    public static void main(String[] args) {
        FastReader fs = new FastReader();
        int n = fs.nextInt();
        int[] h = new int[n];
        
        for (int i = 0; i < n; i++) {
            h[i] = fs.nextInt();
        }

        int[] dp = new int[n];

        dp[n-1] = 0;

        for (int i = n-2; i >= 0; i--) {
            int curr = Integer.MAX_VALUE;
            for (int k = 1; k <= 2; k++) {
                if (i+k < dp.length) {
                    curr = Math.min(curr, Math.abs(h[i] - h[i+k]) + dp[i+k]);
                }
            }
            dp[i] = curr;
        }

        System.out.println(dp[0]);

    }

}
