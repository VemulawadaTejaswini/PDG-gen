import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        long x = Math.abs(sc.nextLong());
        long k = sc.nextLong();
        long d = sc.nextLong();

        long tmp = x / d;

        if (tmp <= k) {
            long t = k - tmp;
            if (t % 2 == 0) {
                System.out.println(Math.abs(x - d * tmp));
            } else {
                System.out.println(Math.abs(x - d * (tmp+1)));
            }
        } else {
            System.out.println(Math.abs(x - d * k));
        }
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