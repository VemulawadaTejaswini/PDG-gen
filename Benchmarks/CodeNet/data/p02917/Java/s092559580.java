import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n-1];
        for (int i = 0; i < n-1; i++) {
            b[i] = sc.nextInt();
            a[i] = -1;
        }

        int ans = 0;
        for (int i = 0; i < n-1; i++) {
            if (a[i] == -1) {
                a[i] = b[i];
            }
            if (i < n-2 && b[i] < b[i+1]) {
                a[i + 1] = b[i];
            }
            ans += a[i];
        }
        ans += b[n-2];

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