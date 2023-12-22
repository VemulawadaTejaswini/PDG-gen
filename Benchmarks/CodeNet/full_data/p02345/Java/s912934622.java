import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;

    void solve() throws IOException {
        int n = ni(), q = ni();
        int[] com = new int[q];
        int[] x = new int[q];
        int[] y = new int[q];
        for (int i = 0; i < q; i++) {
            com[i] = ni();
            x[i] = ni();
            y[i] = ni();
        }

        RMQ rmq = new RMQ(n);
        for (int i = 0; i < q; i++) {
            if (com[i] == 0) {
                rmq.update(x[i], y[i]);
            } else {
                out.println(rmq.query(x[i], y[i]));
            }
        }
    }

    class RMQ {
        int n;
        int[] dat;

        RMQ (int n1) {
            n = 1;
            while (n < n1) {
                n <<= 1;
            }
            dat = new int[2 * n - 1];
            Arrays.fill(dat, Integer.MAX_VALUE);
        }

        void update(int k, int a) {
            k += n - 1;
            dat[k] = a;
            while (k > 0) {
                k = (k - 1) / 2;
                dat[k] = Math.min(dat[k * 2 + 1], dat[k * 2 + 2]);
            }
        }

        int query(int a, int b) {
            return query(a, b + 1, 0, 0, n);
        }

        private int query(int a, int b, int k, int l, int r) {
            if (r <= a || b <= l) return Integer.MAX_VALUE;

            if (a <= l && r <= b) {
                return dat[k];
            } else {
                int vl = query(a, b, k * 2 + 1, l, (l + r) / 2);
                int vr = query(a, b, k * 2 + 2, (l + r) / 2, r);
                return Math.min(vl, vr);
            }
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