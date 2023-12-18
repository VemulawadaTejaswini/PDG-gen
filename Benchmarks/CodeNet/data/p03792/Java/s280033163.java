import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    MyScanner                sc    = new MyScanner();
    Scanner                  sc2   = new Scanner(System.in);
    long                     start = System.currentTimeMillis();
    long                     fin   = System.currentTimeMillis();
    final int                MOD   = 1000000007;
    int[]                    dx    = { 1, 0, 0, -1 };
    int[]                    dy    = { 0, 1, -1, 0 };

    int                      N, ans;
    HashMap<String, Integer> map;

    void run() {
        N = sc.nextInt();
        if (N > 3)
            return;
        char[][] f = sc.nextCharField(N, N);
        map = new HashMap<>();
        ans = Integer.MAX_VALUE;
        nousi(0, f);
        System.out.println(ans == Integer.MAX_VALUE ? -1 : ans);
    }

    void nousi(int depth, char[][] c) {
        if (depth > 7) return;
        if (fin(c)) {
            ans = Math.min(ans, depth);
            return;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                // select i,j
                char[] p = new char[N];
                for (int k = 0; k < N; k++) {
                    p[k] = c[i][k];
                }
                char[][] next = new char[N][N];
                for (int k = 0; k < N; k++) {
                    for (int l = 0; l < N; l++) {
                        next[k][l] = c[k][l];
                    }
                }
                for (int k = 0; k < N; k++) {
                    next[k][j] = p[k];
                }
                String s = "";
                for (int k = 0; k < N; k++) {
                    for (int l = 0; l < N; l++) {
                        s += next[k][l];
                    }
                }
                if (!map.containsKey(s)) {
                    map.put(s, depth + 1);
                    nousi(depth + 1, next);
                } else if (map.get(s) > depth + 1) {
                    map.put(s, depth + 1);
                    nousi(depth + 1, next);
                }
            }
        }
    }

    boolean fin(char[][] c) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (c[i][j] == '.')
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        new Main().run();
    }

    void debug(Object... o) {
        System.out.println(Arrays.deepToString(o));
    }

    void debug2(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    boolean inner(int h, int w, int limH, int limW) {
        return 0 <= h && h < limH && 0 <= w && w < limW;
    }

    void swap(int[] x, int a, int b) {
        int tmp = x[a];
        x[a] = x[b];
        x[b] = tmp;
    }

    // find minimum i (k <= a[i])
    int lower_bound(int a[], int k) {
        int l = -1;
        int r = a.length;
        while (r - l > 1) {
            int mid = (l + r) / 2;
            if (k <= a[mid])
                r = mid;
            else
                l = mid;
        }
        // r = l + 1
        return r;
    }

    // find minimum i (k < a[i])
    int upper_bound(int a[], int k) {
        int l = -1;
        int r = a.length;
        while (r - l > 1) {
            int mid = (l + r) / 2;
            if (k < a[mid])
                r = mid;
            else
                l = mid;
        }
        // r = l + 1
        return r;
    }

    long gcd(long a, long b) {
        return a % b == 0 ? b : gcd(b, a % b);
    }

    long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    boolean palindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    class MyScanner {
        int nextInt() {
            try {
                int c = System.in.read();
                while (c != '-' && (c < '0' || '9' < c))
                    c = System.in.read();
                if (c == '-')
                    return -nextInt();
                int res = 0;
                do {
                    res *= 10;
                    res += c - '0';
                    c = System.in.read();
                } while ('0' <= c && c <= '9');
                return res;
            } catch (Exception e) {
                return -1;
            }
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        String next() {
            try {
                StringBuilder res = new StringBuilder("");
                int c = System.in.read();
                while (Character.isWhitespace(c))
                    c = System.in.read();
                do {
                    res.append((char) c);
                } while (!Character.isWhitespace(c = System.in.read()));
                return res.toString();
            } catch (Exception e) {
                return null;
            }
        }

        int[] nextIntArray(int n) {
            int[] in = new int[n];
            for (int i = 0; i < n; i++) {
                in[i] = nextInt();
            }
            return in;
        }

        int[][] nextInt2dArray(int n, int m) {
            int[][] in = new int[n][m];
            for (int i = 0; i < n; i++) {
                in[i] = nextIntArray(m);
            }
            return in;
        }

        double[] nextDoubleArray(int n) {
            double[] in = new double[n];
            for (int i = 0; i < n; i++) {
                in[i] = nextDouble();
            }
            return in;
        }

        long[] nextLongArray(int n) {
            long[] in = new long[n];
            for (int i = 0; i < n; i++) {
                in[i] = nextLong();
            }
            return in;
        }

        char[][] nextCharField(int n, int m) {
            char[][] in = new char[n][m];
            for (int i = 0; i < n; i++) {
                String s = sc.next();
                for (int j = 0; j < m; j++) {
                    in[i][j] = s.charAt(j);
                }
            }
            return in;
        }
    }
}