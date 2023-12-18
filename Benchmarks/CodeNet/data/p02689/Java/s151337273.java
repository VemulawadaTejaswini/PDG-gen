import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] h = new int[n];
        int[] tmp = new int[n];

        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
            tmp[i] = h[i];
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;

            if (h[a] > h[b])
                tmp[b] = 0;
            else if (h[b] > h[a])
                tmp[a] = 0;
            else {
                tmp[a] = 0;
                tmp[b] = 0;
            }
        }

        int ans = 0;
        for (int i : tmp) {
            if (i > 0)
                ans++;
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