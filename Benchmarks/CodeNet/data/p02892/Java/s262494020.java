import java.io.*;
import java.util.*;

class Main {
    static Scanner scanner = new Scanner();
    static long mod = 1000000007;

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int[][] s = new int[n][n];
        for (int i = 0; i < n; i++) {
            char[] t = scanner.next().toCharArray();
            for (int j = 0; j < n; j++) {
                s[i][j] = t[j] == '1' ? 1 : 0x7ffffff;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    s[j][k] = Math.min(s[j][k], s[j][i] + s[i][k]);
                }
            }
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                max = Math.max(max, s[i][j]);
                for (int k = 0; k < n; k++) {
                    if ((s[i][j] + s[j][k] + s[k][i]) % 2 == 1) {
                        System.out.println(-1);
                        return;
                    }
                }
            }
        }
        System.out.println(max + 1);
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
