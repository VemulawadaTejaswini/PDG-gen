import java.io.*;
import java.util.*;

class Main {
    static Scanner scanner = new Scanner();
    static long mod = 1000000007;

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] a = new int[n];
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            if (i <= k) {
                set.add(a[i]);
            }
        }
        int count = 0;
        int c = 0;
        for (int i = 1; i < n; i++) {
            if (a[i - 1] < a[i]) {
                c++;
            } else {
                if (c >= k - 1) {
                    count++;
                }
                c = 0;
            }
        }
        if (c >= k - 1) {
            count++;
        }
        if (count > 0) {
            count--;
        }
        if (n != k) {
            for (int i = k + 1; i < n; i++) {
                if (set.first().equals(a[i - k - 1]) && set.last().equals(a[i - 1])) {
                    count++;
                }
                set.remove(a[i - k - 1]);
                set.add(a[i]);
            }
        }
        System.out.println(n - k + 1 - count);
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