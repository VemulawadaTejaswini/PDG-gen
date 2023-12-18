import java.io.*;
import java.util.*;


public class Main{
    static long []pre1;
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));

        // Start writing your solution here. -------------------------------------
        long MOD = 1000000007;
        //int t = sc.nextInt();
        int t = 1;
        Main sol = new Main();
        while(t -- > 0)
        {
            int n = sc.nextInt();
            Long a[] = new Long[n];
            long res = 0l;
            for(int i = 0; i < n; i++)
                a[i] = sc.nextLong();
            pre1 = new long[n + 1];
            for(int i = 1; i <= n; i ++)
                pre1[i] = pre1[i - 1] + a[i - 1] * (i - 1);
            for(int i = 0; i < n; i++)
                res = Math.max(res, solve(a, i));
            out.println(res);
            //for(int ii = 0; ii <= n; ii++) System.out.println(Arrays.toString(dp[ii]));
        }
        out.close();
    }
    public static Long solve(Long[] a, int k){
        int n = a.length;
        long res = pre1[n] - 2 * pre1[k + 1];
        Long a1[] = new Long[k + 1];
        Long a2[] = new Long[n - k - 1];
        for(int i = 0; i <= k; i ++) a1[i] = a[i];
        for(int i = k + 1; i < n; i ++) a2[i - k - 1] = a[i];
        Arrays.sort(a1);
        Arrays.sort(a2);
        int tmp1 = n - k - 1, tmp2 = n - k - 2;
        for(int i = 0; i <= k; i ++) res += (tmp1 + i) * a1[i];
        for(int i = 0; i < n - k - 1; i ++) res -=  (tmp2 - i) * a2[i];
        return res;
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