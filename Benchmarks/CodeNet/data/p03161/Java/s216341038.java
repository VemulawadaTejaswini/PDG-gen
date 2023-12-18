import java.io.*;
import java.util.*;


public class Main{
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));

        // Start writing your solution here. -------------------------------------
        //int t = sc.nextInt();
        int t = 1;
        while(t -- > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            long h[] = new long[n + 1];
            long dp[] = new long[n + 1];
            for(int i = 1; i <= n; i++) h[i] = sc.nextLong();
            Arrays.fill(dp, 20000000000l);
            dp[1] = 0;
            for(int i = 2; i <= n; i++)
                for(int j = 1; j <= k && j <= i; j++)
                    dp[i] = Math.min(dp[i], dp[i - j] + Math.abs(h[i] - h[i - j]));
            out.println(dp[n]);
        }
        //for(int i = 1; i <= n; i++) System.out.println(Arrays.toString(dp[i]));
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