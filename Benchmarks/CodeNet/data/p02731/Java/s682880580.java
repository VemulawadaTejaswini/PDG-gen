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

    static public class trp implements Comparable<trp> {

        int idx;
        int val;

        public trp(int v, int i) {
            idx = i;
            val = v;
        }

        @Override
        public int compareTo(trp trp) {
            return idx - trp.idx;
        }
    }

    static int[] color;
    static ArrayList<pair>[] adj;
    static int[] Arrx, Arry;
    static int inf = (int) 1e9, n, w, h, x, y;
    static boolean[][] matrix;
    static int[][][] memo;

    public static int dp(int x, int y, int crit) {
        if (x >= h || y >= w)
            return (int) 1e8;
        if (x == h - 1 && y == w - 1) {
            return matrix[x][y] ? 0 : crit;
        }
        if (memo[crit][x][y] != -1)
            return memo[crit][x][y];
        int ans = Integer.MAX_VALUE;
        if (matrix[x][y]) {
            ans = min(ans, dp(x + 1, y, 1));
            ans = min(ans, dp(x, y + 1, 1));
        } else {
            ans = min(ans, crit + dp(x + 1, y, 0));
            ans = min(ans, crit + dp(x, y + 1, 0));
        }
        return memo[crit][x][y] = ans;
    }

    public static boolean isBadrome(String str) {
        for (int i = 0; i <= str.length() / 2; i++)
            if (str.charAt(i) != str.charAt(str.length() - 1 - i))
                return false;
        return true;


    }

    public static void main(String[] args) throws Exception {
//        Scanner sc = new Scanner("kitchen.in");
//        PrintWriter pw = new PrintWriter("kitchen.out");
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        long l=sc.nextLong();
        double dim=l*1d/3;
        pw.println(dim*dim*dim);
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
