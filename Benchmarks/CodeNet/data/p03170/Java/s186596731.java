

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
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
        int k = fs.nextInt();
        int[] A = new int[n];
        
        for (int i = 0; i < n; i++) {
            A[i] = fs.nextInt();
        }
        
        Arrays.sort(A);

        boolean[] dp = new boolean[k+1];

        int i = 0;

        while (i < A[0]) {
            dp[i] = false;
            ++i;
        }


        // m gives one value of k;

        for (int m = i; m < dp.length; m++) {
            int j = 0;
            while (j < A.length && A[j] <= m) {
                if (!dp[m-A[j]]) {
                    dp[m] = true;
                    break;
                }
                ++j;
            }
        }

        if (dp[dp.length-1]) System.out.println("First");
        else System.out.println("Second");

    }

}