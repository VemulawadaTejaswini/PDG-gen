import java.io.*;
import java.util.*;


public class Main{
    static HashSet<Integer> set;

    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));

        // Start writing your solution here. -------------------------------------
        long MOD = 1000000007;
        //int t = sc.nextInt();
        int t = 1;

        while(t -- > 0)
        {
            int n = sc.nextInt();
            long [] a = new long[n + 1];
            long [] presum = new long[n + 1];
            long [][]dp = new long[n + 1][n + 1];
            for(int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
                presum[i] = presum[i - 1] + a[i];
            }
            for(int k = 1; k <= n; k ++){
                for(int i = 1; i + k <= n; i++) {
                    dp[i][i + k] = Long.MAX_VALUE;
                    for(int j = i; j < i + k; j++)
                    {
                        long resj = dp[i][j] + dp[j + 1][i + k];
                        dp[i][i + k] = Math.min(dp[i][i + k], dp[i][j] + dp[j + 1][i + k]);
                    }
                    dp[i][i + k] += presum[i + k] - presum[i - 1];
                }
            }
            out.println(dp[1][n]);
            //for(int ii = 0; ii <= n; ii++) System.out.println(Arrays.toString(dp[ii]));
        }
        out.close();

        /*
        int n      = sc.nextInt();        // read input as integer
        long k     = sc.nextLong();       // read input as long
        double d   = sc.nextDouble();     // read input as double
        String str = sc.next();           // read input as String
        String s   = sc.nextLine();       // read whole line as String

        int result = 3*n;
        out.println(result);                    // print via PrintWriter
        */
        // Stop writing your solution here. -------------------------------------
        out.close();
    }
    //-----------PrintWriter for faster output---------------------------------
    public static PrintWriter out;
    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
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
        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    //--------------------------------------------------------
}