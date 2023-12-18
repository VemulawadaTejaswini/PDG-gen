import java.util.*;
import java.io.*;
import java.util.function.*;

class Main {
    static Scanner scanner = new Scanner();
    static int mod = 1000000007;
    static int inf = 0x7ffffff;

    public static void main(String[]$) throws Exception {
        int n = scanner.nextInt();
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        List<Integer> c = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
            c.add(i);
        }
        for (int i = 0; i < n; i++) {
            b.add(scanner.nextInt());
        }
        c.sort(Comparator.comparingInt(i -> -a.get(i)));
        int m = -1;
        for (int i = 0; i < n; i++) {
            if (a.get(c.get(i)) <= b.get(c.get(i))) {
                m = i;
                break;
            }
        }
        if (m == -1) {
            System.out.println("No");
        } else {
            a.remove(m);
            b.remove(m);
            Collections.sort(a);
            Collections.sort(b);
            for (int i = 0; i < n - 1; i++) {
                if (a.get(i) > b.get(i)) {
                    System.out.println("No");
                    return;
                }
            }
            System.out.println("Yes");
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
