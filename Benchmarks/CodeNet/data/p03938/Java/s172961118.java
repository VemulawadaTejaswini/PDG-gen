import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;

    void solve() throws IOException {
        int n = ni();

        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = ni() - 1;
        }

        int[] a = new int[n];
        int[] b = new int[n];

        int[] da = new int[n];
        int[] db = new int[n];
        for (int i = 0; i < n; i++) {
            if (p[n - 1 - i] > 0) {
                db[p[n - 1 - i] - 1] += i;
            }
            if (p[n - 1 - i] < n - 1) {
                da[p[n - 1 - i] + 1] += i;
            }
        }

        for (int i = 1; i < n; i++) {
            da[i] += da[i - 1];
            db[n - 1 - i] += db[n - i];
        }

        for (int i = 0; i < n; i++) {
            a[i] = i + 1 + da[i];
            b[i] = n - i + 1 + db[i];
        }

        for (int i = 0; i < n; i++) {
            out.print(a[i] + " ");
        }
        out.println();
        for (int i = 0; i < n; i++) {
            out.print(b[i] + " ");
        }
        out.println();
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