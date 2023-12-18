/*
[ ( ^ _ ^ ) ]
*/

import java.io.*;
import java.util.*;


public class Main {
    int INF = (int)1e9;
    long MOD = 1000000007;

    int n;
    ArrayList<ArrayList<Integer>> g;
    boolean[] vis;
    int[] l;

    int go(int v) {
        if(vis[v]) {
            return l[v];
        }
        int rs = 0;
        vis[v] = true;
        for(int u: g.get(v)) {
            rs = Math.max(rs, go(u)+1);
        }
        l[v] = rs;
        return rs;
    }

    void solve(InputReader in, PrintWriter out) throws IOException {
        n = in.nextInt();
        int m = in.nextInt();
        g = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<n; i++) {
            g.add(new ArrayList<Integer>());
        }
        for(int i=0; i<m; i++) {
            int x = in.nextInt()-1;
            int y = in.nextInt()-1;
            g.get(x).add(y);
            // g.get(y).add(x);
        }
        vis = new boolean[n];
        l = new int[n];
        int rs = 0;
        for(int i=0; i<n; i++) {
            if(!vis[i]) {
                rs = Math.max(rs, go(i));
            }
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