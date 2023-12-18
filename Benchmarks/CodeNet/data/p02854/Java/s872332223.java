import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int n = sc.nextInt();
        long[] a = new long[n];

        long[] sum = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            if (i == 0)
                sum[i] = a[i];
            else
                sum[i] = sum[i-1] + a[i];
        }

        long min = Long.MAX_VALUE;
        long diff = sum[n-1];
        for (int i = 0; i < n; i++) {
            min = Math.min(Math.abs(sum[i] - diff), min);
            diff -= sum[i];
        }

        System.out.println(min);
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