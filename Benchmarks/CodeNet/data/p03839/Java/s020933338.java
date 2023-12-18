import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {

    void solve() throws IOException {
        int n = ni(), k = ni();

        long[] a = nla(n);

        long sum = 0;
        long tmp1 = 0;
        long tmp2 = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] > 0) sum += a[i];
            if (i < k && a[i] > 0) tmp1 += a[i];
            if (i < k && a[i] < 0) tmp2 += a[i];
        }

        long ans = Math.max(sum + tmp2, sum - tmp1);

        for (int i = k; i < n; i++) {
            if (a[i] > 0) {
                tmp1 += a[i];
            } else {
                tmp2 += a[i];
            }
            if (a[i - k] > 0) {
                tmp1 -= a[i - k];
            } else {
                tmp2 -= a[i - k];
            }
            ans = Math.max(ans, sum + tmp2);
            ans = Math.max(ans, sum - tmp1);
        }

        out.println(ans);
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

    class INA {
        int[][] a;

        INA(int n, int m) throws IOException {
            this(n, m, -1);
        }

        INA(int n, int m, int t) throws IOException {
            a = new int[m][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[j][i] = ni() + t;
                }
            }
        }

        int[] get(int i) {
            return a[i - 1];
        }
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