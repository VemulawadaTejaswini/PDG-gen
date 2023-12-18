import java.util.*;
import java.io.*;

//atcoder need change class name to Main
//D - Knapsack 1
//stand dp <= Weight
//loop from right to left

//https://atcoder.jp/contests/dp/tasks/dp_c

public class Main {
    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

 
    public static void main(String[] args) throws IOException {
  
        int N = nextInt(); 
        int W = nextInt(); 
        long[] dp = new long[W+1];
        dp[0] = 0;

        for (int i=1; i<=N;  i++) {
            int w = nextInt();
            int v = nextInt();
            
            for (int j=W; j>=w; j--) {
                dp[j] = Math.max(dp[j], dp[j-w] + v); 
            }
        }
 
        System.out.println(dp[W]);
    }
    

    public static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
    public static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    public static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
}