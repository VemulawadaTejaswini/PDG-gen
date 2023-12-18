import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int n = sc.nextInt();

        long ans = 1;
        for (int i = 0; i < n; i++) {
            long t = sc.nextLong();
            ans = lcm(ans, t);
        }

        System.out.println(ans);
    }

    static long gcd(long a, long b) {
        long max = Math.max(a, b);
        long min = Math.min(a, b);

        long re = max % min;
        if (re == 0)
            return min;
        return gcd(min, re);
    }

    static long lcm(long a, long b) {
        long g = gcd(a, b);
        return a / g * b;
    }

    static class MyScanner {
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