/*
[ ( ^ _ ^ ) ]
*/

import java.io.*;
import java.util.*;


public class Main {
    int INF = (int)1e9;
    long MOD = 1000000007;

    int onlyvcut(int[][] a, int k) {
        int n = a.length, m = a[0].length;
        int rs = 0;
        // for(int[] x: a) {
        //     System.out.println(Arrays.toString(x));
        // }
        int[] acc = new int[n];
        outer: for(int j=0; j<m; j++) {
            boolean cut = false;
            for(int i=0; i<n; i++) {
                acc[i] += a[i][j];
                if(acc[i]>k) cut = true;
            }
            if(cut) {
                rs++;
                acc = new int[n];
                for(int i=0; i<n; i++) {
                    acc[i] += a[i][j];
                    if(acc[i]>k) {
                        rs = INF;
                        break outer;
                    }
                }
            }
        }
        // show("rs", rs, k);
        return rs;
    }

    void solve(InputReader in, PrintWriter out) throws IOException {
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        int[][] s = new int[n+1][m];
        for(int i=1; i<=n; i++) {
            String x = in.next();
            for(int j=0; j<m; j++) {
                s[i][j] = x.charAt(j)-'0';
                s[i][j] += s[i-1][j];
            }
        }
        int min = INF;
        for(int p=0; p<(1<<n); p++) {
            int rs = 0;
            int i = 0;
            int c = 0;
            while(i<n) {
                boolean x = (p&(1<<i)) > 0;
                int j = i;
                while(j<n && (p&(1<<j))>0==x) {
                    j++;
                }
                if(j!=n) c++;
                i = j;
            }
            int[][] d = new int[c+1][m];
            rs += c;
            c = 0; i = 0;
            while(i<n) {
                boolean x = (p&(1<<i)) > 0;
                int j = i;
                while(j<n && (p&(1<<j))>0==x) {
                    j++;
                }
                for(int l=0; l<m; l++) {
                    d[c][l] = s[j][l] - s[i][l];
                }
                c++;
                i = j;
            }
            // System.out.println("-----------------");
            // show("cuts", rs);
            rs += onlyvcut(d, k);
            min = Math.min(min, rs);
        }
        out.println(min);
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