import java.util.*;
import java.io.*;
import java.util.function.*;

class Main {
    static Scanner scanner = new Scanner();
    static int mod = 1000000007;
    static int inf = 0x7ffffff;

    static int n;
    static List<Integer> a, b, c, d, e;
    public static void main(String[]$) throws Exception {
        n = scanner.nextInt();
        a = new ArrayList<>();
        b = new ArrayList<>();
        c = new ArrayList<>();
        d = new ArrayList<>();
        e = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int aa = scanner.nextInt();
            a.add(aa);
            d.add(aa);
            c.add(i);
        }
        for (int i = 0; i < n; i++) {
            int bb = scanner.nextInt();
            b.add(bb);
            e.add(bb);
        }
        c.sort(Comparator.comparingInt(i -> -a.get(i)));
        System.out.println("Yes");
    }

    static boolean g() {
        boolean[][] can = new boolean[5][n];
        Collections.sort(d);
        Collections.sort(e);
        for (int i = 0; i < n; i++) {
            can[0][i] = i >= 2 && d.get(i) <= e.get(i - 2);
            can[1][i] = i >= 1 && d.get(i) <= e.get(i - 1);
            can[2][i] = d.get(i) <= e.get(i);
            can[3][i] = i >= n - 1 || d.get(i) <= e.get(i + 1);
            can[4][i] = i >= n - 2 || d.get(i) <= e.get(i + 2);
        }
        for (int j = 0; j < 5; j++) {
            for (int i = n - 2; i >= 0; i--) {
                can[j][i] &= can[j][i + 1];
            }
        }
        return false;
    }

    static boolean f() {
        int m = -1;
        for (int i = 0; i < n; i++) {
            if (a.get(c.get(i)) <= b.get(c.get(i))) {
                m = c.get(i);
                break;
            }
        }
        if (m == -1) {
            return false;
        } else {
            a.remove(m);
            b.remove(m);
            Collections.sort(a);
            Collections.sort(b);
            for (int i = 0; i < n - 1; i++) {
                if (a.get(i) > b.get(i)) {
                    return false;
                }
            }
            return true;
        }
    }

    static class System {
        static PrintWriter out = new PrintWriter(java.lang.System.out);

        static {
            Runtime.getRuntime().addShutdownHook(new Thread(System.out::flush));
        }

        static void exit() {
            java.lang.System.exit(0);
        }
    }

    static class Scanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(java.lang.System.in), 0x10000);
        StringTokenizer tokenizer;

        String next() {
            try {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    tokenizer = new StringTokenizer(reader.readLine());
                }
            } catch (IOException ignored) {
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        char[][] nextCharArray(int n, int m) {
            char[][] a = new char[n][m];
            for (int i = 0; i < n; i++) {
                a[i] = next().toCharArray();
            }
            return a;
        }
        int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextInt();
            }
            return a;
        }

        int[] nextIntArray(int n, IntUnaryOperator op) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = op.applyAsInt(nextInt());
            }
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextLong();
            }
            return a;
        }

        long[] nextLongArray(int n, LongUnaryOperator op) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = op.applyAsLong(nextLong());
            }
            return a;
        }
    }
}
