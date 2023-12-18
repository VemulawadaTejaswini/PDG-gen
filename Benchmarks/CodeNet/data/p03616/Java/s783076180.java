import java.util.*;
import java.io.*;
import java.util.List;
import java.util.function.*;

class Main {
    static Scanner scanner = new Scanner();
    static int mod = 1000000007;
    static int inf = 0x7ffffff;

    static int max;
    static int min;
    static int value;
    static int x;
    void solve() {
        x = scanner.nextInt();
        int k = scanner.nextInt();
        List<int[]> queryList = new ArrayList<>();
        for (int i = 0, sum = 0; i < k; i++) {
            int r = scanner.nextInt();
            sum += i % 2 == 0 ? r : -r;
            queryList.add(new int[] {0, r, sum});
        }
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            queryList.add(new int[] {1, scanner.nextInt(), scanner.nextInt()});
        }
        queryList.sort(Comparator.<int[]>comparingInt(p -> p[1]).thenComparingInt(p -> p[0]));
        boolean b = true;
        max = x;
        min = 0;
        value = 0;
        int last = 0;
        for (int[] query : queryList) {
            update(b ? last - query[1] : query[1] - last);
            if (query[0] == 0) {
                b = !b;
            } else {
                System.out.println(get(query[2]));
            }
            last = query[1];
        }
    }

    static int get(int a) {
        if (min == max) {
            return value;
        } else if (a <= min) {
            return value;
        } else if (a <= max) {
            return value + a - min;
        } else {
            return value + max - min;
        }
    }

    static void update(int add) {
        if (add < 0) {
            if (get(x) + add < 0) {
                value = 0;
                min = max;
            } else if (value + add < 0) {
                value = 0;
                min -= value + add;
            } else {
                value += add;
            }
        } else if (0 < add) {
            if (x <= value + add) {
                value = x;
                max = min;
            } else if (x <= get(x) + add) {
                max -= get(x) + add - x;
                value += add;
            } else {
                value += add;
            }
        }
    }

    public static void main(String[]$) {
        try {
            new Main().solve();
            System.out.flush();
        } catch (Throwable t) {
            System.out.flush();
            t.printStackTrace();
        }
    }
}

class System {
    static PrintWriter out = new PrintWriter(java.lang.System.out);

    static void exit() {
        java.lang.System.exit(0);
    }
}

class Scanner {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(java.lang.System.in), 0x10000);
    private StringTokenizer tokenizer;

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
