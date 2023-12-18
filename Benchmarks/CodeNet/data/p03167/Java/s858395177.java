import javax.swing.text.AbstractDocument;
import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {
    static public class pair {
        int u;
        int idx;
        int val;

        public pair(int x, int i) {
            u = x;
            idx = i;
            val = -1;
        }
    }


    static ArrayList<Integer>[] adj;
    static int[] value, weight, Arr;
    static long inf = (long) 1e16;
    static int n, m;

    static boolean[][] matrix;
    static long[][] memo;
    static long mod = (long) (1e9+7);

    public static boolean sub(String a, String b) {
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b.charAt(i) || a.charAt(i) == '?' || b.charAt(i) == '?')
                continue;
            return false;
        }
        return true;
    }

    public static boolean cont(String a, String b) {
        int n = b.length();
        for (int i = 0; i < a.length() - n; i++) {
            if (sub(a.substring(i, i + n), b))
                return true;
        }
        return false;
    }

    public static int inter(String a, String b) {
        int n = min(a.length(), b.length());
        if (cont(a, b) || cont(b, a))
            return n;
        while (n > 0) {
            if (sub(a.substring(a.length() - n), (b.substring(0, n))))
                return n;
            n--;
        }
        return 0;
    }

    static TreeSet<String> ts;

    public static void backtrack(int idx, int upperBound, String str) {
        if (idx == n) {
            ts.add(str);
            return;
        }
        for (int i = 0; i <= upperBound + 1; i++) {
            backtrack(idx + 1, Math.max(upperBound, i), str + (char) ('a' + i));
        }
    }

    static int w, maxvalue;

    public static long dp(int i,int j) {
      if(i>=n||j>=m)return 0;
        if(!matrix[i][j])return 0;
        if(i==n-1&&j==m-1)return 1;
      if(memo[i][j]!=-1)return memo[i][j];
      return memo[i][j]=(dp(i+1, j)%mod+dp(i, j+1)%mod)%mod;
    }

    static PrintWriter pw;


    static int[] dp;

    public static void dfs(int u) {

    }

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        pw = new PrintWriter(System.out);
        n = sc.nextInt();
        m = sc.nextInt();
        matrix = new boolean[n][m];
        for (int i=0; i < n; i++) {
            String str = sc.next();
            for (int j = 0; j < m; j++)
                matrix[i][j] = str.charAt(j) == '.';
        }
         memo = new long[n+1][m+1];
        for(long[]x:memo)Arrays.fill(x,-1 );
        pw.println(dp(0, 0));
        pw.close();
    }

    public static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(String s) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(s));

        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public double nextDouble() throws IOException {
            String x = next();
            StringBuilder sb = new StringBuilder("0");
            double res = 0, f = 1;
            boolean dec = false, neg = false;
            int start = 0;
            if (x.charAt(0) == '-') {
                neg = true;
                start++;
            }
            for (int i = start; i < x.length(); i++)
                if (x.charAt(i) == '.') {
                    res = Long.parseLong(sb.toString());
                    sb = new StringBuilder("0");
                    dec = true;
                } else {
                    sb.append(x.charAt(i));
                    if (dec)
                        f *= 10;
                }
            res += Long.parseLong(sb.toString()) / f;
            return res * (neg ? -1 : 1);
        }

        public boolean ready() throws IOException, IOException {
            return br.ready();
        }

    }
}
