import java.util.*;
import java.io.*;

// this question teach us calc totally
// then minus small set, so did not get TLE

public class Main {
    static StringTokenizer st;
    static BufferedReader br;  
    static PrintWriter out;
 
    static int parent[]; 

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
 
        int N = nextInt();
        int K = nextInt();

        long ans = 0;
        long mod = (long)1e9 + 7;

        //include 0, so number is N+1
        // int * int is int
        // int * long is long
        for (long x=K; x<=N+1; x++) {
            long small =(0 + x-1) * (x) / 2;
            long big = (N + N-x+1) * (x) / 2;
            ans += big - small +1;
            ans %= mod;
        }
 
        System.out.println(ans);
        
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