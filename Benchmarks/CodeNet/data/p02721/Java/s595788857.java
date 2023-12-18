/*
[ ( ^ _ ^ ) ]
*/

// problem: atc/abc161_e

import java.io.*;
import java.util.*;


public class Main {
    int INF = (int)1e9;
    long MOD = 1000000007;

    int max(int a, int b) {return a>=b?a:b;}
    int min(int a, int b) {return a<=b?a:b;}

    void solve(InputReader in, PrintWriter out) throws IOException {
        int n = in.nextInt();
        int k = in.nextInt();
        int c = in.nextInt();
        char[] s = in.next().trim().toCharArray();
        char yes = 'o';

        int[] dp1 = new int[n];
        int[] dp2 = new int[n];
        int mx = 0;
        for(int i=0; i<n; i++) {
            if(s[i] == yes) {
                dp1[i] = 1 + mx++;
                i += c;
            }
        }
        mx = 0;
        for(int i=n-1; i>=0; i--) {
            if(s[i] == yes) {
                dp2[i] = 1 + mx++;
                i -= c;
            }
        }
        // show("", dp1);
        // show("", dp2);
        for(int i=0; i<n; i++) {
            if(s[i] != yes) continue;
            if(dp1[i] + dp2[i] - 1 == k) {
                out.println(i+1);
            }
        }
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