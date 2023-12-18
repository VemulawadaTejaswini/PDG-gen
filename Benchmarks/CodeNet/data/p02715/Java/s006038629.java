import java.io.*;
import java.util.*;


public class Main{
    static long MOD = 1000000009;
    static int [][] dp = new int[201][201];
    static ArrayList<Integer>[] fac;
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));

        // Start writing your solution here. -------------------------------------

        //int t = sc.nextInt();
        int t = 1;
        while(t-- > 0)
        {
            long n = sc.nextLong(), sum = 0l;
            int k = sc.nextInt();
            long [] cnt = new long[k + 1];
            fac = new ArrayList[k + 1];
            for(int i = 1; i <= k; i++) fac[i] = new ArrayList();
            for(int i = 1; i <= k; i++)
                for(int j = 2 * i; j <= k; j += i)
                    fac[j].add(i);
            System.out.println(Arrays.toString(fac));
            for(int g = k; g >= 1; g--)
                cnt[g] = powmod((long)(k / g), n);
            for(int g = k; g >= 1; g--)
            {
                for(int i : fac[g])
                    cnt[i] = (cnt[i] + MOD - cnt[g]) % MOD;
                sum = (sum + cnt[g] * g) % MOD;
            }
            System.out.println(Arrays.toString(cnt));
            out.println(sum);
            //for(int ii = 0; ii <= n; ii++) System.out.println(Arrays.toString(dp[ii]));
        }
        out.close();
    }
    private static int gcd(int u, int v) {
        if (dp[u][v] != 0) return dp[u][v];
        //System.out.println(u + " " + v);
        int res = 0;
        if (v == 0) res = u;
        else res = gcd(v, u % v);
        return dp[u][v] = res;
    }
    private static long powmod(long k, long n)
    {
        long ans = 1l;
        while(n != 0)
        {
            if(n % 2 != 0) ans = ans * k % MOD;
            k = k * k % MOD;
            n >>= 1;
        }
        return ans;
    }
    private static long solve(long u) {

        return 0;
    }
    private static int dfs(int[][] dp, int x, int st, boolean op, char[] c) {
        if (x >= c.length) return st == 11 ? 0 : 1;
        if (!op && dp[x][st] != -1) return dp[x][st];
        int maxx = op ? c[x] - '0' : 9, res = 0;
        for(int i = 0; i <= maxx; i++)
        {
            if(st != 11 && Math.abs(st - i) >= 2) continue;
            if(st == 11 && i == 0)
                res += dfs(dp, x - 1, 11, op && (i == maxx), c);
            else
                res += dfs(dp, x - 1, i, op && (i == maxx), c);
        }
        if(!op) dp[x][st] = res;
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