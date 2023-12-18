import java.io.*;
import java.util.*;

class Main {
    static Scanner scanner = new Scanner();

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int xor = a[0];
        int sum = a[0];
        int l = 0, r = 0;
        long ans = 0;
        while (l < n) {
            while (r + 1 < n && (xor ^ a[r + 1]) == sum + a[r + 1]) {
                r++;
                xor ^= a[r];
                sum += a[r];
            }
            ans += r - l + 1;
            xor ^= a[l];
            sum -= a[l];
            l++;
        }
        System.out.println(ans);
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