import java.io.*;
import java.util.*;


public class Main{
    static long MOD = 1000000007;
    static long dp[][] = new long[21][1 << 21];
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
            int a[][] = new int[n][n];
            for(int i = 0; i < n; i++)
                for(int j = 0; j < n; j++)
                    a[i][j] = sc.nextInt();
            for(int i = 0; i < n; i++)
                Arrays.fill(dp[i], -1l);
            long res = Main.solve(0, a, (1 << n) - 1);
            out.println(res);
            //for(int ii = 0; ii <= n; ii++) System.out.println(Arrays.toString(dp[ii]));
        }
        out.close();
    }
    public static long solve(int m, int[][] a, int state){
        int n = a.length;
        if(m >= n) return 1l;
        if(dp[m][state] != -1) return dp[m][state];
        if(state == 0) return 1l;
        long res = 0l;
        for(int i = 0;i < n; i++)
            if(a[m][i] == 1 && ((state & (1 << i)) > 0))
                res = (res + solve(m + 1, a, state ^ (1 << i))) % MOD;
        return dp[m][state] = res;
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