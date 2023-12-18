import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        long x = sc.nextLong();
        long y = sc.nextLong();

        long ans = 0;
        if (a + b <= c * 2) {
            ans = a * x + b * y;
        } else {
            long cnt = Math.min(x, y);
            if (cnt % 2 == 1)
                cnt--;

            ans = c * cnt * 2;
            x -= cnt;
            y -= cnt;

            cnt = Math.min(x, y);
            if (a * cnt + b * cnt <= c * cnt * 2) {
                ans += a * cnt + b * cnt;
            } else {
                ans += c * cnt * 2;
            }
            x -= cnt;
            y -= cnt;

            if (a * x + b * y <= c * Math.max(x, y) * 2) {
                ans += a * x + b * y;
            } else {
                ans += c * Math.max(x, y) * 2;
            }
        }

        System.out.println(ans);
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