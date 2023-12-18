import java.io.*;
import java.util.*;


public class Main{
    static long MOD = 998244353;
    static long dp[] = new long[1 << 21];
    static HashMap <Long, Long> memo;
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));

        // Start writing your solution here. -------------------------------------

        //int t = sc.nextInt();
        int t = 1;
        while(t-- > 0)
        {
            long sum = 0l;
            int n = sc.nextInt();
            for(long i = 1; i <= n; i++)
            {
                if(i % 3 != 0 && i % 5 != 0)
                    sum += i;
            }
            out.println(sum);
            //for(int ii = 0; ii <= n; ii++) System.out.println(Arrays.toString(dp[ii]));
        }
        out.close();
    }
    private static long gcd(long u, long v)
    {
        if(u == 0) return v;
        return gcd(v, u % v);
    }
    public static String SCS(String str1, String str2) {
        int n = str1.length(), m = str2.length();
        int dp[][] = new int[n + 1][m + 1];
        for(int i = 0; i <= n; i ++) dp[i][0] = i;
        for(int j = 0; j <= m; j ++) dp[0][j] = j;
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= m; j++)
            {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) dp[i][j] = 1 + dp[i - 1][j - 1];
                else dp[i][j] = 1 + Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        StringBuilder ans = new StringBuilder();
        int i = n, j = m;
        while (i > 0 && j > 0)
        {
            if (str1.charAt(i - 1) == str2.charAt(j - 1))
            {
                ans.append(str1.charAt(--i));
                j--;
            }
            else if (dp[i - 1][j] > dp[i][j - 1]) ans.append(str2.charAt(--j));
            else ans.append(str1.charAt(--i));
        }
        while (i > 0) ans.append(str1.charAt(--i));
        while (j > 0) ans.append(str2.charAt(--j));
        return ans.reverse().toString();
    }
    private static long solve(long u) {
        if(u == 1l) return 1l;
        if(memo.get(u) != null) return memo.get(u);
        HashMap <Long, Integer> map = new HashMap<>();
        int cnt = 0;
        while(u % 2 == 0)
        {
            u >>= 1;
            cnt++;
        }
        if(cnt > 0) map.put(2l, cnt);
        for (long i = 3l; i <= Math.sqrt(u); i+= 2)
        {
            cnt = 0;
            while (u%i == 0)
            {
                u /= i;
                cnt++;
            }
            if(cnt > 0) map.put(i, cnt);
        }
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