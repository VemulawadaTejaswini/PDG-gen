import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;

    void solve() throws IOException {
        int m = ni(), n = ni();

        long MOD = 1000000007;

        Modulo mo = new Modulo(MOD);

        out.println(mo.pow(m, n));
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

        long det(long[][] a) {
            int n = a.length;
            long det = 1;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    while (a[j][i] != 0) {
                        long r = a[i][i] / a[j][i];
                        for (int k = i; k < n; k++) {
                            long t = (a[i][k] - r * a[j][k]) % m;
                            a[i][k] = a[j][k];
                            a[j][k] = t;
                        }
                        det = -det;
                    }
                }
                det = (det * a[i][i]) % m;
            }
            return det;
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

    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        tok = new StringTokenizer("");
        Main main = new Main();
        main.solve();
        out.close();
    }
}