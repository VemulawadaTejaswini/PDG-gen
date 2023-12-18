// 変数名がクソ
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        long n = sc.nextLong();

        long a = 1;
        long b = 1;
        long tmp = n;
        long hoge = n;
        boolean isHoge = true;
        for (int i = 2; i <= tmp; i++) {
            if (hoge % i == 0) {
                if (a > b)
                    b *= i;
                else
                    a *= i;
                hoge /= i;
                isHoge = true;
                continue;
            }

            if (isHoge) {
                tmp = i * 2 + 1;
                isHoge = false;
            }
        }

        if (hoge > 1) {
            if (a > b)
                b *= hoge;
            else
                a *= hoge;
        }

        long ans = a + b - 2;
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