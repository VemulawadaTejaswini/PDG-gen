import java.io.*;
import java.util.*;

class Main {
    static Scanner scanner = new Scanner();
    static long mod = 1000000007;

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int xor = 0;
        boolean[] x = new boolean[32];
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            x[Integer.toBinaryString((a - 1) ^ a).length() - 1] = true;
            xor ^= a;
        }
        long ans = 0;
        for (int i = Integer.toBinaryString(Integer.highestOneBit(xor) - 1).length(); i >= 0; i--) {
            int j = 1 << i;
            if ((xor & j) != 0) {
                if (x[i]) {
                    ans++;
                    xor ^= j * 2 - 1;
                } else {
                    System.out.println(-1);
                    return;
                }
            }
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