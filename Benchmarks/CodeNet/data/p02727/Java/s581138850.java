/*
[ ( ^ _ ^ ) ]
*/

import java.io.*;
import java.util.*;


public class Main {
    int INF = (int)1e9;
    long MOD = 1000000007;


    void solve(InputReader in, PrintWriter out) throws IOException {
        int x = in.nextInt();
        int y = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        Long[] r = new Long[n];
        Long[] g = new Long[m];
        Long[] c = new Long[k];
        for(int i=0; i<n; i++) r[i] = in.nextLong();
        for(int i=0; i<m; i++) g[i] = in.nextLong();

        PriorityQueue<Long> e = new PriorityQueue<>();
        for(int i=0; i<k; i++) e.add(-1*in.nextLong());

        Arrays.sort(r, new Comparator<Long>() {
            public int compare(Long x, Long y) {
                return -1 *Long. compare(x, y);
            }
        });
        Arrays.sort(g, new Comparator<Long>() {
            public int compare(Long x, Long y) {
                return -1 *Long. compare(x, y);
            }
        });
        // show(e);
        // show("", r);
        // show("", g);
        long rs = 0;
        PriorityQueue<Long> t = new PriorityQueue<>();
        for(int i=0; i<x; i++) {
            rs += r[i];
            t.add(r[i]);
        }
        for(int i=0; i<y; i++) {
            rs += g[i];
            t.add(g[i]);
        }
        // show(t);
        while(e.size()>0) {
            long v = -1*e.remove();
            long u = t.peek();
            if(u>=v) break;
            rs = rs - u + v;
            t.remove();
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