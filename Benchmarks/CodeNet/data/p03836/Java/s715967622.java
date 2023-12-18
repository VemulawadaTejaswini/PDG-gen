import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {

    void solve() throws IOException {
        int[] s = nia(4);
        int dx = s[2] - s[0];
        int dy = s[3] - s[1];

        String ans = "";
        for (int i = 0; i < dx; i++) {
            ans += "R";
        }
        for (int i = 0; i < dy; i++) {
            ans += "U";
        }
        for (int i = 0; i < dx; i++) {
            ans += "L";
        }
        for (int i = 0; i < dy; i++) {
            ans += "D";
        }
        ans += "D";
        for (int i = 0; i < dx + 1; i++) {
            ans += "R";
        }
        for (int i = 0; i < dy + 1; i++) {
            ans += "U";
        }
        ans += "L";
        ans += "U";
        for (int i = 0; i < dx + 1; i++) {
            ans += "L";
        }
        for (int i = 0; i < dy + 1; i++) {
            ans += "D";
        }
        ans += "R";
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