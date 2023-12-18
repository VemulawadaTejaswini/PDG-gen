import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int n = sc.nextInt();
        int[] h = new int[n];
        int[] cnt = new int[n];

        int max = 0;
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
            for (int k = i-1; k >= 0; k--) {
                if (h[k] >= h[i]) {
                    h[k] = h[i];
                    cnt[k]++;
                    if (max+1 <= cnt[k]) {
                        max = cnt[k];
                        break;
                    }
                }
            }
        }

        System.out.println(max);
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