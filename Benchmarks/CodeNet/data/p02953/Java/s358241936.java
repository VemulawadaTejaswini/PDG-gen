import java.io.*;
import java.util.*;

class Main {
    static Scanner scanner = new Scanner();

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int last = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            int h = scanner.nextInt();
            if (last <= h) {
                last = h;
            } else if (last <= h + 1) {
                last = h + 1;
            } else {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

    static class Scanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 32768);
        StringTokenizer tokenizer;

        String next() {
            try {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    tokenizer = new StringTokenizer(reader.readLine());
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}