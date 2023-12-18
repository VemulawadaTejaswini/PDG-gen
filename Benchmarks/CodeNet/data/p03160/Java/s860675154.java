import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int N = scanner.nextInt();
        int[] h = new int[N];
        for(int i= 0; i < N; i++) h[i] = scanner.nextInt();
        //Want the solution at N
        //cost at 0 = 0
        //Overlapping subproblem -> recompute :(
        //                          store intermediate answers :)
        int[] dp = new int[N];
        dp[0] = 0;
        dp[1] = Math.abs(h[1]-h[0]);
        for(int i = 2; i < N; i++) {
//            dp[i] = h[i] + Math.min(dp[i-1], dp[i-2]);
            //Cost of hopping from previous??
            dp[i] = Math.min(Math.abs(h[i] - h[i-1]) + dp[i-1], Math.abs(h[i] - h[i-2]) + dp[i-2]);
//            int min = Math.abs(h[i] - h[i-1]) + dp[i-1];
//            min = Math.min(min, Math.abs(h[i]-h[i-2]) + dp[i-2]);
//            dp[i] = min;
        }
        out.println(dp[N-1]);
        out.flush();
    }
    
    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
        
        public FastScanner(Reader in) {
            br = new BufferedReader(in);
        }
        
        public FastScanner() {
            this(new InputStreamReader(System.in));
        }
        
        String next() {
            while (st == null || !st.hasMoreElements()) {
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
        
        String readNextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
        
        int[] readIntArray(int n) {
            int[] a = new int[n];
            for (int idx = 0; idx < n; idx++) {
                a[idx] = nextInt();
            }
            return a;
        }
    }
}
