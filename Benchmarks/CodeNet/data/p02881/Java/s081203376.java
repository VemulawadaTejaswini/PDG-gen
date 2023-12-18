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
        List<Long> list = new ArrayList<>();
        for (long i = 2; i <= tmp; i++) {
            if (hoge % i == 0) {
                list.add(i);
                hoge /= i;
                isHoge = true;
                if (hoge == 1)
                    break;
                else
                    continue;
            }

            if (isHoge) {
                tmp = i * 2 + 1;
                isHoge = false;
            }
        }

        if (hoge > 1) {
            list.add(hoge);
        }

        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0)
                a *= list.get(i);
            else
                b *= list.get(i);
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