import java.io.*;
import java.util.*;

class Main {
    static Scanner scanner = new Scanner();

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int[] a = new int[n];
        int highest = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            highest = Math.max(highest, Integer.toBinaryString(a[i]).length());
        }
        int[][] b = new int[n + 1][highest];
        int[][] c = new int[n + 1][highest];
        for (int i = 0; i < highest; i++) {
            b[0][i] = 0;
            for (int j = 0; j < n; j++) {
                if (((a[j] >> i) & 1) == 1) {
                    b[j + 1][i] = 0;
                } else {
                    b[j + 1][i] = b[j][i] + 1;
                }
            }
            c[n][i] = b[n][i];
            for (int j = n; j > 0; j--) {
                if (b[j][i] > b[j - 1][i]) {
                    if (j - b[j][i] == 0) {
                        c[j][i] = j;
                    } else {
                        c[j][i] = b[j][i] + b[j - b[j][i] - 1][i] + 1;
                    }
                } else {
                    c[j][i] = b[j - 1][i] + 1;
                }
            }
        }
        long ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += Arrays.stream(c[i]).min().getAsInt();
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