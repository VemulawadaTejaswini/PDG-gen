/*
[ ( ^ _ ^ ) ]
*/

// problem: atc/abc161_d

import java.io.*;
import java.util.*;


public class Main {
    int INF = (int)1e9;
    long MOD = 1000000007;

    int max(int a, int b) {return a>=b?a:b;}
    int min(int a, int b) {return a<=b?a:b;}

    void solve(InputReader in, PrintWriter out) throws IOException {
        int k = in.nextInt();
        if(k<=10) {
            out.println(k);
            return;
        }
        Queue<Long> q = new LinkedList<>();
        HashSet<Long> set = new HashSet<>();
        int c = 9;
        for(long i=0; i<=9; i++) {
            q.add(i);
            set.add(i);
        }
        while(q.size()>0) {
            long v = q.remove();

            int m = (int)(v%10);
            for(int i=max(0, m-1); i<=min(9, m+1); i++) {
                long u = v*10l+i;
                if(!set.contains(u)) {
                    q.add(u);
                    set.add(u);
                    // show("add", u, c+1);
                    c++;
                    if(c==k) {
                        out.println(u);
                        return;
                    }
                }
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