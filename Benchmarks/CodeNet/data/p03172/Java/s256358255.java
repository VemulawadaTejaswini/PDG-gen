import java.io.*;
import java.util.*;


public class Main{
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));

        // Start writing your solution here. -------------------------------------
        int n = sc.nextInt(), K = sc.nextInt();
        int a[] = new int[n + 1];
        int pre[] = new int[n + 1];
        long MOD = 1000000007;
        long res = 0;
        for(int i = 1; i <= n ; i ++)
        {
            a[i] = sc.nextInt();
            pre[i] = pre[i - 1] +  a[i];
        }
        long dp[][] = new long[n + 1][K + 1];
        for(int i = 0; i <= n; i++) dp[i][0] = 1;
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= K; j++)
            {
                dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
                if(j - a[i] > 0) dp[i][j] -= dp[i - 1][j - a[i] - 1];
                dp[i][j] = (dp[i][j] + MOD) % MOD;
            }
        }
        //for(int i = 1; i <= n; i++) System.out.println(Arrays.toString(dp[i]));
        out.println(dp[n][K]);
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