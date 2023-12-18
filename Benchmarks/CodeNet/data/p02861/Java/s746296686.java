import java.util.*;
import java.io.*;
import java.util.function.*;

class Main {
    static Scanner scanner = new Scanner();
    static int mod = 1000000007;
    static int inf = 0x7ffffff;

    static int n;
    static int[] x, y;
    void solve() {
        n = scanner.nextInt();
        x = new int[n];
        y = new int[n];
        int[] a = new int[n];
        int k = 1;
        for (int i = 0; i < n; i++) {
            k *= i + 1;
            a[i] = i;
            x[i] = scanner.nextInt();
            y[i] = scanner.nextInt();
        }
        double sum = 0;
        do {
            for (int i = 1; i < n; i++) {
                sum += Math.sqrt((x[a[i]] - x[a[i - 1]]) * (x[a[i]] - x[a[i - 1]]) + (y[a[i]] - y[a[i - 1]]) * (y[a[i]] - y[a[i - 1]]));
            }
        } while (nextPermutation(a));
        System.out.println(sum / k);
    }

    static <T extends Comparable<? super T>> boolean nextPermutation(int[] array) {
        if (array.length <= 1) {
            return false;
        }
        BiConsumer<Integer, Integer> swap = (a, b) -> {
            int temp = array[a];
            array[a] = array[b];
            array[b] = temp;
        };
        int last = array.length;
        int i = last - 1;
        while (true) {
            int j = i;
            i--;
            if (array[i] < array[j]) {
                int k = last;
                while (array[i] >= array[--k]);
                swap.accept(i, k);
                while ((j != last) && (j != --last)) {
                    swap.accept(j++, last);
                }
                return true;
            }
            if (i == 0) {
                int first = 0;
                while ((first != last) && (first != --last)) {
                    swap.accept(first++, last);
                }
                return false;
            }
        }
    }

    public static void main(String[]$) throws Exception {
        new Main().solve();
        System.out.flush();
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
