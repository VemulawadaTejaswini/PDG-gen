/*
[ ( ^ _ ^ ) ]
*/

// problem: atc/abc162_f

import java.io.*;
import java.util.*;


public class Main {
    int INF = (int)1e9;
    long MOD = 1000000007;
    long mninf = (long)(-1e16);

    int n;
    long[] a;
    HashMap<Long, Long> mp;

    long go(int i, int rem) {
        if(rem==0) {
            return 0;
        }
        if(i>=n) {
            return mninf;
        }
        long k = i * 1000000l + rem;
        if(mp.containsKey(k)) {
            return mp.get(k);
        }
        long x = a[i] + go(i+2, rem-1);
        long y = go(i+1, rem);
        long rs = Math.max(x<mninf?mninf:x, y<mninf?mninf:y);
        mp.put(k, rs);
        return rs;
    }

    void solve(InputReader in, PrintWriter out) throws IOException {
        n = in.nextInt();
        a = new long[n];
        for(int i=0; i<n; i++) {
            a[i] = in.nextInt();
        }
        mp = new HashMap<>();
        long rs = go(0, n/2);
        out.println(rs);
    }
    

    public static void main(String[] args) throws IOException {
        InputReader in = new InputReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = 1;//in.nextInt();
        while(t-- >0) {
            new Main().solve(in, out);
        }
        out.close();
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
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
    }
}