import java.io.PrintWriter;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        FastReader in  = new FastReader(); 
        Solver s = new Solver();
        int t = 1;
        while(t-- > 0) s.solve(in, out);
        out.close();
    }

    static class Solver {
        public void solve(FastReader in, PrintWriter out) throws IOException {
            // solve
            int n=in.nextInt();
            int W=in.nextInt();
            int[] w=new int[n];
            int[] v=new int[n];
            long dp[][]=new long[n+1][W+1];
            for(int i=0;i<n;i++) {
                w[i]=in.nextInt();
                v[i]=in.nextInt();
            }
            for(int i=1;i<dp.length;i++){
                for(int j=1;j<dp[0].length;j++){
                    if(w[i-1]<= j) 
                        dp[i][j]=Math.max(dp[i-1][j], v[i-1]+dp[i-1][j-w[i-1]]);
                    else dp[i][j]=dp[i-1][j];
                }
            }
            out.println(dp[n][W]);
        }
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public char nextChar() {
            return next().charAt(0);
        }

        public String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}