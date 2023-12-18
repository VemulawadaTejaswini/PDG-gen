/*
[ ( ^ _ ^ ) ]
*/

// problem: atc/dp_r

import java.io.*;
import java.util.*;


public class Main {
    int INF = (int)1e9;
    long MOD = 1000000007;

    long[][] mul(long[][] a, long[][] b) {
        int n = a.length;
        long[][] rs = new long[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                for(int k=0; k<n; k++) {
                    rs[i][j] += a[i][k] * b[k][j];
                    rs[i][j] %= MOD;
                }
            }
        }
        return rs;
    }

    void solve(InputReader in, PrintWriter out) throws IOException {
        int n = in.nextInt();
        long k = in.nextLong();
        long[][] a = new long[n][n];
        long[][] rs = new long[n][n];
        for(int i=0; i<n; i++) {
            rs[i][i] = 1;
            for(int j=0; j<n; j++) {
                a[i][j] = in.nextInt();
            }
        }
        while(k>0) {
            if(k%2==1) {
                rs = mul(rs, a);
            }
            k /= 2;
            a = mul(a, a);
        }   
        long t = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                t += rs[i][j];
                if(t >= MOD) t -= MOD;
            }
        }
        out.println(t);
    }
    

    public static void main(String[] args) throws IOException {
        if(args.length>0 && args[0].equalsIgnoreCase("d")) {
            DEBUG_FLAG = true;
        }
        InputReader in = new InputReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = 1;//in.nextInt();
        long start = System.nanoTime();
        while(t-- >0) {
            new Main().solve(in, out);
        }
        long end = System.nanoTime();
        debug("\nTime: " + (end-start)/1e6 + " \n\n");
        out.close();
    }
    
    static boolean DEBUG_FLAG = false;
    static void debug(String s) {
        if(DEBUG_FLAG) System.out.print(s);
    }
    
    public static void show(Object... o) {
        System.out.println(Arrays.deepToString(o));
    }
    
    static class InputReader {
        static BufferedReader br;
        static StringTokenizer st;
    
        public InputReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        
        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        
        int nextInt() {
            return Integer.parseInt(next());
        }
        
        long nextLong() {
            return Long.parseLong(next());
        }
        
        double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}