import java.io.*;
import java.util.*;
import java.util.function.IntPredicate;

class Main {
    static Scanner scanner = new Scanner();

    static long ans = Long.MAX_VALUE;
    static int n;
    static long[] a, b;
    public static void main(String[]$) {
        n = scanner.nextInt();
        a = new long[n];
        b = new long[n + 1];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            b[i + 1] = a[i] + b[i];
        }
        for (int m = 2; m < n; m++) {
            long maxL = b[m];
            long maxR = b[n];
            int l = binarySearch(0, m, i -> b[i] * 2 <= maxL);
            int r = binarySearch(m, n, i -> b[i] * 2 <= maxL + maxR);
            f(l, m, r);
            f(l, m, r - 1);
            f(l - 1, m, r);
            f(l - 1, m, r - 1);
        }
        System.out.println(ans);
    }

    static void f(int l, int m, int r) {
        long a1 = b[l];
        long b1 = b[m] - b[l];
        long c1 = b[r] - b[m];
        long d1 = b[n] - b[r];
        ans = Math.min(ans, max(a1, b1, c1, d1) - min(a1, b1, c1, d1));
    }

    static long min(long... a) {
        long n = a[0];
        for (int i = 1; i < a.length; i++) {
            n = Math.min(n, a[i]);
        }
        return n;
    }

    static long max(long... a) {
        long n = a[0];
        for (int i = 1; i < a.length; i++) {
            n = Math.max(n, a[i]);
        }
        return n;
    }

    static int binarySearch(int min, int max, IntPredicate predicate) {
        int ok = min, ng = max;
        while (ng - ok > 1) {
            int mid = (ok + ng) / 2;
            if (predicate.test(mid)) {
                ok = mid;
            } else {
                ng = mid;
            }
        }
        return ng;
    }

    static class Scanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1 << 15);
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
    }
}