import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {
    class Reader {
        BufferedReader in;

        Reader() throws IOException {
            in = new BufferedReader(new InputStreamReader(System.in));
        }

        Reader(String name) throws IOException {
            in = new BufferedReader(new FileReader(name));
        }

        StringTokenizer tokin = new StringTokenizer("");

        String next() throws IOException {
            if (!tokin.hasMoreTokens()) {
                tokin = new StringTokenizer(in.readLine());
            }
            return tokin.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        boolean hasNext() throws IOException {
            if (tokin.hasMoreTokens()) {
                return true;
            } else {
                String s = in.readLine();
                while (s != null && s.length() == 0) {
                    s = in.readLine();
                }
                if (s == null) {
                    return false;
                } else {
                    tokin = new StringTokenizer(s);
                    return true;
                }
            }
        }
    }

    class Writer {
        PrintWriter cout;

        Writer() throws IOException {
            cout = new PrintWriter(System.out);
        }

        Writer(String name) throws IOException {
            cout = new PrintWriter(new FileWriter(name));
        }

        StringBuilder out = new StringBuilder();

        void print(Object a) {
            out.append(a);
        }

        void close() {
            cout.print(out.toString());
            cout.close();
        }
    }

    long mod = 998244353;

    class SegmentTree {
        long a[];
        long t[];

        SegmentTree(int n) {
            int k2 = 1;
            while (k2 < n)
                k2 *= 2;
            k2 *= 2;
            a = new long[k2];
            t = new long[k2];
            t[k2 / 2 - 1] = 1;
        }

        void update(int v, int tl, int tr, int l, int r, long add) {
            if (l > r)
                return;
            if (l == tl && tr == r) {
                t[v] = (t[v] + add) % mod;
            } else {
                int tm = (tl + tr) / 2;
                update(v * 2 + 1, tl, tm, l, min(r, tm), add);
                update(v * 2 + 2, tm + 1, tr, max(l, tm + 1), r, add);
            }
        }

        void update(int l, int r, long add) {
            update(0, 0, a.length / 2 - 1, l, r, add);
        }

        long get(int v, int tl, int tr, int pos) {
            if (tl == tr) {
                return t[v];
            }
            int tm = (tl + tr) / 2;
            if (pos <= tm) {
                return (t[v] + get(v * 2 + 1, tl, tm, pos)) % mod;
            } else {
                return (t[v] + get(v * 2 + 2, tm + 1, tr, pos)) % mod;
            }
        }

        long get(int n) {
            return get(0, 0, a.length / 2 - 1, n);
        }
    }


    void run() throws Exception {
        Reader in = new Reader();
        Writer out = new Writer();
        int n = in.nextInt();
        int k = in.nextInt();
        SegmentTree t = new SegmentTree(n);
        int bounds[][] = new int[k][2];
        for (int i = 0; i < k; i++) {
            bounds[i][0] = in.nextInt();
            bounds[i][1] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            long val = t.get(i);
            for (int j = 0; j < k; j++) {
                if (bounds[j][0] + i < n) {
                    t.update(bounds[j][0] + i, min(bounds[j][1] + i, n - 1), val);
                }
            }
        }
        out.print(t.get(n - 1));
        out.close();
    }

    public static void main(String[] args) throws Exception {
        new Main().run();
    }
}