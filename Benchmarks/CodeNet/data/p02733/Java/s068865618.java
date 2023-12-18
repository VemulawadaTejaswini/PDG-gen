
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    static final int INF = (int) 1e9;
    static int n, m, k;
    static char[][] bar;
    static int c, group[];

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner();
        PrintWriter out = new PrintWriter(System.out);
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();
        bar = new char[n][];
        for (int i = 0; i < n; i++)
            bar[i] = sc.next().toCharArray();
        group = new int[n];
        int ans = INF;
        for (int mask = 0; mask < 1 << (n - 1); mask++) {
            c = Integer.bitCount(mask) + 1;
            int g = 0;
            for (int i = 0; i < n - 1; i++) {
                group[i] = g;
                if ((mask & 1 << i) != 0) g++;
            }
            group[n - 1] = g;
            ans = Math.min(ans, c - 1 + solve());
        }
        out.println(ans);
        out.flush();
        out.close();
    }

    static int solve() {
        int cuts = 0;
        int[] cnt = new int[c], extra = new int[c];
        for (int j = 0; j < m; j++) {
            boolean needcut = false;
            for (int i = 0; i < n; i++)
                if (bar[i][j] == '1') {
                    extra[group[i]]++;
                    if (extra[group[i]] > k) return INF;
                    if (cnt[group[i]] + extra[group[i]] > k) needcut = true;
                }
            if (needcut) cuts++;
            for (int i = 0; i < c; i++) {
                if (needcut) cnt[i] = 0;
                cnt[i] += extra[i];
                extra[i] = 0;
            }
        }
        return cuts;
    }


    static class Scanner {
        BufferedReader br;
        StringTokenizer st;

        boolean ready() throws IOException {
            return br.ready();
        }

        double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        Scanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        int nextChar() throws IOException {
            return next().charAt(0);
        }

        int[] nextIntArray(int n) throws IOException {
            int[] ans = new int[n];
            for (int i = 0; i < n; i++)
                ans[i] = nextInt();
            return ans;
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }

    }
}
