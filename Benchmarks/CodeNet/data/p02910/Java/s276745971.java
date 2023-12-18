import java.io.*;
import java.util.*;

class Main {
    static Scanner scanner = new Scanner();
    static long mod = 1000000007;

    public static void main(String[]$) {
        String s = scanner.next();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                if (!"RUD".contains(String.valueOf(s.charAt(i)))) {
                    System.out.println("No");
                    return;
                }
            } else {
                if (!"LUD".contains(String.valueOf(s.charAt(i)))) {
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");
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