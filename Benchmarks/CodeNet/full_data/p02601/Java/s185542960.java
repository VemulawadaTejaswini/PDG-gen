import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int a = sc.nextInt(); // 赤
        int b = sc.nextInt(); // 緑
        int c = sc.nextInt(); // 青
        int k = sc.nextInt();

        // 赤 < 緑 < 青 にする
        for (int i = 0; i < k; i++) {
            if (a >= b) {
                b *= 2;
                continue;
            }
            if (b >= c) {
                c *= 2;
                continue;
            }
            break;
        }

        if (a < b && b < c)
            System.out.println("Yes");
        else
            System.out.println("No");
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