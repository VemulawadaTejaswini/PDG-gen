/*
[ ( ^ _ ^ ) ]
*/

// problem: atc/dp_q

import java.io.*;
import java.util.*;


public class Main {
    int INF = (int)1e9;
    long MOD = 1000000007;

    class BIT {
        int n;
        long[] f;

        public BIT(int n) {
            this.n = n;
            f = new long[n+1];
        }

        public void update(int i, long v) {
            while(i<=n) {
                f[i] = Math.max(f[i], v);
                i += i & (-i);
            }
        }

        public long get(int i) {
            long rs = 0;
            while(i>0) {
                rs = Math.max(rs, f[i]);
                i -= i & (-i);
            }
            return rs;
        }
    }


    void solve(InputReader in, PrintWriter out) throws IOException {
        int n = in.nextInt();
        int[] h = new int[n];
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            h[i] = in.nextInt();
        }
        for(int i=0; i<n; i++) {
            a[i] = in.nextInt();
        }
        BIT bit = new BIT(n);
        long rs = 0;
        for(int i=0; i<n; i++) {
            long x = bit.get(h[i]-1);
            x += a[i];
            rs = Math.max(rs, x);
            bit.update(h[i], x);
        }
        out.println(rs);
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