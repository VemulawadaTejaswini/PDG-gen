import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int d = sc.nextInt();  // 365
        int[] c = new int[26];
        int[][] s = new int[d][26];

        for (int i = 0; i < 26; i++) {
            c[i] = sc.nextInt();
        }

        for (int i = 0; i < d; i++) {
            for (int j = 0; j < 26; j++) {
                s[i][j] = sc.nextInt();
            }
        }

        PrintWriter pw = new PrintWriter(System.out);
        int[] last_day = new int[26];
        for (int i = 0; i < d; i++) {
            int max_p = Integer.MIN_VALUE;
            int max_i = 0;
            for (int j = 0; j < 26; j++) {
                int tmp = -c[i] * (i+1 - last_day[j]);

                if (max_p <= tmp+s[i][j]) {
                    max_p = tmp+s[i][j];
                    max_i = j;
                }
            }

            last_day[max_i] = i+1;
            pw.println(max_i + 1);
        }

        pw.flush();
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