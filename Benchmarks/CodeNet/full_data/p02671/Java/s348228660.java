import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.util.HashMap;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Map;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        C_StrangeDance solver = new C_StrangeDance();
        solver.solve(1, in, out);
        out.close();
    }

    static class C_StrangeDance {
        int[] pair;
        Map<Integer, int[]> cache = new HashMap<>();

        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            char[] str = in.next().toCharArray();
            int[] a = process(str);
            int lastShift = 0;
            if (a[a.length - 1] < 0) {
                lastShift = -a[a.length - 1];
                a = Arrays.copyOf(a, a.length - 1);
            }
            int[] p3 = new int[n + 1];
            p3[0] = 1;
            for (int i = 1; i < p3.length; i++) {
                p3[i] = 3 * p3[i - 1];
            }
            pair = new int[p3[n]];
            for (int i = 0; i < pair.length; i++) {
                int j = 0;
                for (int pos = 0; pos < n; pos++) {
                    int digit = (i / p3[pos]) % 3;
                    j += p3[pos] * ((digit ^ 1 ^ 2) % 3);
                }
                pair[i] = j;
            }
//        int[] p = identity();
//        for (int len : a) {
//            p = apply(p, f(len));
//        }
            int period = a.length - 1 - kmp(a)[a.length - 1];
            int[] full = identity();
            for (int i = 0; i < a.length; i++) {
                full = apply(full, f(a[i]));
            }
            int[] p = pow(full, a.length / period);
            for (int i = 0; i < a.length % period; i++) {
                p = apply(p, f(a[i]));
            }

            p = applyShift(p, lastShift);
            for (int i = 0; i < p.length; i++) {
                if (i > 0) {
                    out.print(" ");
                }
                out.print(p[i]);
            }
            out.println();
        }

        private int[] f(int len) {
            if (cache.containsKey(len)) {
                return cache.get(len);
            }
            int[] p = new int[pair.length];
            for (int i = 0; i < p.length; i++) {
                p[i] = pair[(i + len) % p.length];
            }
            cache.put(len, p);
            return p;
        }

        private int[] pow(int[] a, int n) {
            int[] r = identity();
            while (n > 0) {
                if (n % 2 != 0) {
                    r = apply(r, a);
                }
                a = apply(a, a);
                n /= 2;
            }
            return r;
        }

        private int[] identity() {
            int[] p = new int[pair.length];
            for (int i = 0; i < p.length; i++) {
                p[i] = i;
            }
            return p;
        }

        private int[] apply(int[] p, int[] q) {
            int[] np = new int[p.length];
            for (int i = 0; i < p.length; i++) {
                np[i] = q[p[i]];
            }
            return np;
        }

        private int[] applyShift(int[] p, int len) {
            int[] np = new int[p.length];
            for (int i = 0; i < p.length; i++) {
                np[i] = (p[i] + len) % p.length;
            }
            return np;
        }

        private int[] kmp(int[] s) {
            int n = s.length;
            int[] kmp = new int[n];
            Arrays.fill(kmp, -1);
            int k = -1;
            for (int i = 1; i < n; i++) {
                while (k != -1 && s[k + 1] != s[i]) {
                    k = kmp[k];
                }
                if (s[k + 1] == s[i]) {
                    ++k;
                }
                kmp[i] = k;
            }
            return kmp;
        }

        private int[] process(char[] s) {
            List<Integer> res = new ArrayList<>();
            int n = s.length;
            int curR = 0;
            for (int i = 0; i < n; ) {
                int j = i;
                while (j < n && s[i] == s[j]) {
                    ++j;
                }
                if (s[i] == 'R') {
                    curR += j - i;
                } else if ((j - i) % 2 != 0) {
                    res.add(curR);
                    curR = 0;
                }
                i = j;
            }
            if (curR != 0) {
                res.add(-curR);
            }
            int[] ret = new int[res.size()];
            for (int i = 0; i < res.size(); i++) {
                ret[i] = res.get(i);
            }
            return ret;
        }

    }

    static class FastScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public FastScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(in.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

