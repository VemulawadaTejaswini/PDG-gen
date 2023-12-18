import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;

    long[] memo1, memo2;

    void solve() throws IOException {
        int h = ni();
        int w = ni();
        int a = ni();
        int b = ni();

        memo1 = new long[h + w];
        memo2 = new long[h + w];
        memo1[0] = memo2[0] = memo1[1] = memo2[1] = 1;
        for (int i = 2; i < h + w; i++) {
            memo1[i] = mltMod(i, memo1[i - 1]);
            memo2[i] = mltMod(rev(i), memo2[i - 1]);
        }

        long ans = 0;
        for (int i = 0; i < w - b; i++) {
            ans = addMod(ans, mltMod(combMod(h - a - 1 + b + i, b + i), combMod(a - 1 + w - b - i - 1, w - b - i - 1)));
        }

        out.println(ans);
    }

    long MOD = 1000000007;

    long addMod(long a, long b) {
        return (a + b) % MOD;
    }

    long subMod(int a, int b) {
        return (a - b + MOD) % MOD;
    }

    long mltMod(long a, long b) {
        return (a * b) % MOD;
    }

    long combMod(long a, long b) {
        return mltMod(mltMod(memo1[(int) a], memo2[(int) b]), memo2[(int) (a - b)]);
    }

    long rev(long a) {
        return powMod(a, MOD - 2);
    }

    long powMod(long a, long b) {
        long ans = 1;
        while (b > 0) {
            if ((b & 1) != 0) {
                ans = (ans * a) % MOD;
            }
            b >>= 1;
            a = (a * a) % MOD;
        }
        return ans;
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