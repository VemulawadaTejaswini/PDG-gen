import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();
        int[][] cnt = new int[n][26];

        for (int i = 0; i < n; i++) {
            cnt[i][s[i] - 'a']++;

            if (i > 0) {
                for (int j = 0; j < 26; j++)
                    cnt[i][j] += cnt[i - 1][j];
            }
        }

        int max = 0;
        for (int i = 0; i < n-1; i++) {
            int tmp = 0;
            for (int j = 0; j < 26; j++) {
                if (cnt[i][j] > 0 && cnt[i][j] < cnt[n-1][j])
                    tmp++;
            }

            max = Math.max(tmp, max);
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