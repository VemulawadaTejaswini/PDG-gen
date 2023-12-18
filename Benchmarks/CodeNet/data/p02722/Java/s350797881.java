/*
[ ( ^ _ ^ ) ]
*/

// problem: practice/practice

import java.io.*;
import java.util.*;


public class Main {
    int INF = (int)1e9;
    long MOD = 1000000007;

    boolean go(long n, long v) {
        if(v==1) return false;
        while(n%v==0 && n>=v) {
            n /= v;
        }
        return n%v==1;
    }

    void solve(InputReader in, PrintWriter out) throws IOException {
        long n = in.nextLong();
        HashSet<Long> set = new HashSet<>();

        long r = 1;
        while(r*r<n) r++;

        for(long i=1; i<=r; i++) {
            if(n%i==0) {
                if(go(n, i)) set.add(i);
                if(go(n, n/i)) set.add(n/i);
            }
        }
        n--;
        for(long i=1; i<=r; i++) {
            if(n%i==0) {
                if(1!=i) set.add(i);
                if(n!=i)set.add(n/i);
            }
        }
        // show("set", set);
        out.println(set.size());
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