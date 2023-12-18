import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    static void solve() {
        int n = nextInt();
        int m = nextInt();

        int[] a = new int[m];
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = nextInt() - 1;
            b[i] = nextInt() - 1;
        }

        int ans = 0;
        for (int i = 0; i < m; i++) {
            // a[i] b[i] 以外のedgeを連結したグラフを生成
            UnionFind uf = new UnionFind(n);
            for (int j = 0; j < m; j++) {
                if (i == j)
                    continue;

                uf.unit(a[j], b[j]);
            }

            boolean isBridge = false;
            for (int x = 0; x < n; x++) {
                for (int y = 0; y < n; y++) {
//                    if (x == y)
//                        continue;

                    if (!uf.isSame(x, y)) {
                        isBridge = true;
                        break;
                    }
                }
                if (isBridge)
                    break;
            }
            if (isBridge)
                ans++;
        }

        out.println(ans);
    }

    static class UnionFind {
        int[] parent;

        UnionFind(int n) {
            parent = new int[n];
            init();
        }

        void init() {
            for (int i = 0; i < parent.length; i++) {
                parent[i] = i;
            }
        }

        int getRoot(int i) {
            if (parent[i] == i) {
                return i;
            } else {
                return parent[i] = getRoot(parent[i]);
            }
        }

        boolean isSame(int x, int y) {
            return getRoot(x) == getRoot(y);
        }

        void unit(int x, int y) {
            x = getRoot(x);
            y = getRoot(y);
            if (x != y) {
                parent[x] = y;
            }

        }
    }

    static PrintWriter out;
    static Scanner sc;

    static int[][] newIntArray(int h, int w, int value) {
        int[][] ret = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                ret[i][j] = value;
            }
        }
        return ret;
    }

    static int nextInt() {
        return Integer.parseInt(sc.next());
    }

    static long nextLong() {
        return Long.parseLong(sc.next());
    }

    static String nextString() {
        return sc.next();
    }

    static int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextInt();
        }
        return a;
    }

    static List<Integer> nextIntList(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(nextInt());
        }
        return list;
    }

    static List<Double> nextDoubleList(int n) {
        List<Double> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add((double) nextInt());
        }
        return list;
    }

    static List<Long> nextLongList(int n) {
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(nextLong());
        }
        return list;
    }

    static char[][] nextCharArray(int h, int w) {
        char[][] c = new char[h][w];
        for (int i = 0; i < h; i++) {
            String str = nextString();
            for (int j = 0; j < w; j++) {
                c[i][j] = str.charAt(j);
            }
        }
        return c;
    }

    static <T extends Comparable<? super T>> void sort(List<T> list) {
        Collections.sort(list);
    }

    // greatest common divisor
    // 最大公約数
    static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // least common multiple
    // 最小公倍数
    static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    // baseのn乗を計算を返す
    static int pow(int base, int n) {
        int ret = 1;
        for (int i = 0; i < n; i++) {
            ret *= base;
        }
        return ret;
    }

    // return n^k mod m
    static long powMod(long n, long k, long m) {
        if (k == 0) {
            return 1;
        } else if (k % 2 == 1) {
            return powMod(n, k - 1, m) * n % m;
        } else {
            long tmp = powMod(n, k / 2, m);
            return tmp * tmp % m;
        }
    }

    // intをlength桁のbit文字列に変換
    static String toBinaryString(int input, int length) {
        return toBinaryString(input).substring(29 - length);
    }

    // intを29桁のbit文字列に変換
    static String toBinaryString(int input) {
        String ret = "";
        int max = 0x10000000;
        for (int i = 0; i < 29; i++) {
            int tmp = input / max;
            ret += tmp;
            input %= max;
            max /= 2;
        }
        return ret;
    }

    public static void main(String[] args) {
        out = new PrintWriter(System.out);
        sc = new Scanner(System.in);

        solve();

        out.flush();
        sc.close();
    }

}
