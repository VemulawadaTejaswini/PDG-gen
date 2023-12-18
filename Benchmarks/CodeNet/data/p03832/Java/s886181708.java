import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    long[][] dp = new long[1010][1010];
    long[][] ko = new long[1010][1010];

    void solve() throws IOException {
        int n = ni();
        int a = ni(), b = ni(), c = ni(), d = ni();

        int m = b - a + 1;

        long MOD = 1000000007;
        Modulo mo = new Modulo(MOD);

        for (int i = 0; i < 1010; i++) {
            ko[i][0] = 1;
        }
        for (int i = 1; i < 1010; i++) {
            for (int j = 1; j <= i; j++) {
                ko[i][j] = (ko[i - 1][j - 1] + ko[i - 1][j]) % MOD;
            }
        }

        dp[0][0] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <= n; j++) {
                if (dp[i][j] == 0) continue;
                dp[i + 1][j]  = (dp[i + 1][j] + dp[i][j]) % MOD;
                long p = ko[n - j][a + i];
                int cnt = 1;
                for (int k = c; k <= d; k++) {
                    if (j + k * (a + i) > n) break;
                    dp[i + 1][j + k * (a + i)] = (dp[i + 1][j + k * (a + i)] + dp[i][j] * p) % MOD;
                    p = (p * ko[n - j - (k - c + 1) * (a + i)][a + i]) % MOD;
                    cnt++;
                    p = (p * mo.rev(cnt)) % MOD;
                }
            }
        }

        out.println(dp[m][n]);
    }

    class Modulo {
        long m;

        Modulo(long m) {
            this.m = m;
        }

        long add(long a, long b) {
            return (a + b) % m;
        }

        long sub(long a, long b) {
            return (a - b + m) % m;
        }

        long mlt(long a, long b) {
            return (a * b) % m;
        }

        long rev(long a) {
            return pow(a, m - 2);
        }

        long pow(long a, long x) {
            long ans = 1;
            while (x > 0) {
                if ((x & 1) != 0) {
                    ans = (ans * a) % m;
                }
                x >>= 1;
                a = (a * a) % m;
            }
            return ans;
        }
    }

    String ns() throws IOException {
        while (!tok.hasMoreTokens()) {
            tok = new StringTokenizer(in.readLine(), " ");
        }
        return tok.nextToken();
    }

    int ni() throws IOException {
        return Integer.parseInt(ns());
    }

    long nl() throws IOException {
        return Long.parseLong(ns());
    }

    double nd() throws IOException {
        return Double.parseDouble(ns());
    }

    String[] nsa(int n) throws IOException {
        String[] res = new String[n];
        for (int i = 0; i < n; i++) {
            res[i] = ns();
        }
        return res;
    }

    int[] nia(int n) throws IOException {
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = ni();
        }
        return res;
    }

    long[] nla(int n) throws IOException {
        long[] res = new long[n];
        for (int i = 0; i < n; i++) {
            res[i] = nl();
        }
        return res;
    }

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;

    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        tok = new StringTokenizer("");
        Main main = new Main();
        main.solve();
        out.close();
    }
}