import java.io.*;
import java.util.*;


public class Main{
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));

        // Start writing your solution here. -------------------------------------
        int n = sc.nextInt(), W = sc.nextInt();
        int w[] = new int[n + 1], v[] = new int[n + 1];
        int max = 0, sum = 0;
        for(int i = 1; i <= n ; i ++)
        {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
            sum += v[i];
        }
        long dp[][] = new long[n + 1][sum + 1];
        Arrays.fill(dp[0], 100000000000000000l);
        dp[0][0] = 0;
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= sum; j++)
            {
                dp[i][j] = dp[i - 1][j];
                if(v[i] <= j) dp[i][j] = Math.min(dp[i][j], dp[i - 1][j - v[i]] + w[i]);
            }
        }
        for(int j = sum; j >= 0; j--)
            if(dp[n][j] <= W) {
                out.println(j);
                out.close();
                return;
            }
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