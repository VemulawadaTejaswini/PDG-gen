import java.io.*;
import java.util.*;

public class Main {

    static final long INF = Long.MAX_VALUE / 10;

    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        long x = sc.nextLong();

        for (int i = 0; i < 10000; i++) {
            for (int j = i; j < 10000; j++) {
                long a = calc(i);
                long b = calc(j);

                if (a < 0 || b < 0)
                    continue;

                if (a - b == x) {
                    System.out.println(i + " " + j);
                    return;
                } else if (a + b == x) {
                    System.out.println(i + " -" + j);
                    return;
                } else if (-a + b == x) {
                    System.out.println("-" + i + " -" + j);
                    return;
                }
            }
        }
    }

    static long calc(int a) {
        long t = a;
        for (int i = 1; i < 5; i++) {
            if (t > INF || t < 0)
                return -1;
            t *= a;
        }
        return t;
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