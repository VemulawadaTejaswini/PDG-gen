import java.io.*;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Collections;
// import java.util.List;
// import java.util.HashSet;
// import java.util.Set;
// import java.util.Map;
// import java.util.HashMap;

import java.math.*;

public class Main {
    private static Scanner sc;
    private static final long mod = 1000000007;

    public static void main(final String[] args) {
        final Main instance = new Main();
        sc = instance.new Scanner();
        instance.solve();
    }

    private static String getUpperAlpha(int i) {
        return String.valueOf((char) (i + 64));
    }

    /* i=1 return a */
    private static String getLowerAlpha(int i) {
        return String.valueOf((char) (i + 96));
    }

    private class Scanner {
        String[] s;
        int i;
        BufferedReader br;
        String regex = " ";

        public Scanner() {
            s = new String[0];
            i = 0;
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        @Override
        protected void finalize() throws Throwable {
            try {
                super.finalize();
            } finally {
                destruction();
            }
        }

        private void destruction() throws IOException {
            if (br != null)
                br.close();
        }

        public String next() throws IOException {
            if (i < s.length)
                return s[i++];
            String st = br.readLine();
            while (st == "")
                st = br.readLine();
            s = st.split(regex, 0);
            i = 0;
            return s[i++];
        }

        public int nextInt() throws NumberFormatException, IOException {
            return Integer.parseInt(next());
        }

        public Long nextLong() throws NumberFormatException, IOException {
            return Long.parseLong(next());
        }

        public Double nextDouble() throws NumberFormatException, IOException {
            return Double.parseDouble(next());
        }

        public long[] nextLongArray(int n) throws NumberFormatException, IOException {
            long[] ret = new long[n];
            for (int i = 0; i < n; i++) {
                ret[i] = nextLong();
            }
            return ret;
        }

        public int[] nextIntArray(int n) throws NumberFormatException, IOException {
            int[] ret = new int[n];
            for (int i = 0; i < n; i++) {
                ret[i] = nextInt();
            }
            return ret;
        }
    }

    public static int GCD(final int a, final int b) {
        if (b == 0)
            return a;
        else
            return GCD(b, a % b);
    }

    public static long GCD(final long a, final long b) {
        if (b == 0)
            return a;
        else
            return GCD(b, a % b);
    }

    static Set<Integer> set = new HashSet<>();
    static boolean pairwise = true;

    private static void enum_divisors(int a) {
        long aa = a;
        int previ = 0;
        for (int i = 2; i * i <= a; i++) {
            if (aa == 1)
                break;
            while (aa % i == 0) {
                if (previ != i) {
                    aa /= i;
                    if (set.contains(i)) {
                        pairwise = false;
                    }
                    set.add(i);
                }
                previ = i;
            }
        }
    }

    // private static void enum_divisors(int a) {
    // long aa = a;
    // Set<Integer> nset = new HashSet<>();
    // for (int i = 2; i * i <= a; i++) {
    // if (aa == 1)
    // break;
    // while (aa % i == 0) {
    // aa /= i;
    // nset.add(i);
    // }
    // }

    // }

    private void solve() {
        try {
            int n = sc.nextInt();
            int m = sc.nextInt();
            UnionFindTree uft = new UnionFindTree(n);
            for (int i = 0; i < m; i++) {
                uft.unite(sc.nextInt() - 1, sc.nextInt() - 1);
            }
            int ans = 0;
            for (int i = 0; i < n; i++) {
                ans = Math.max(ans, uft.size(i));
            }
            System.out.println(ans);
        } catch (

        Exception e) {
            e.printStackTrace();
        }

    }

    class UnionFindTree {
        // 自身が親であれば、その集合に属する頂点数に-1を掛けたもの
        // そうでなければ親のid
        int[] r;

        public UnionFindTree(int n) {
            r = new int[n];
            for (int i = 0; i < n; i++) {
                r[i] = -1;
            }
        }

        // idの小さい方を親にする
        public boolean unite(int x, int y) {
            x = root(x);
            y = root(y);
            if (x == y)
                return false;
            if (r[x] > r[y]) {
                int tmp = r[x];
                r[x] = r[y];
                r[y] = tmp;
            }
            r[x] += r[y];
            r[y] = x;
            return true;
        }

        // 親のIDを返す
        int root(int x) {
            if (r[x] < 0)
                return x;
            return r[x] = root(r[x]);
        }

        int size(int x) {
            return -r[root(x)];
        }
    }
}
