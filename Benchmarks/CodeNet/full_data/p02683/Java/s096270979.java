import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int[] c = new int[n];
        int[][] a = new int[n][m];

        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int ans = Integer.MAX_VALUE;
        for (long i = (1 << n)-1; i > 0; i--) {
            long tmp = i;
            int cash = 0;
            int[] exp = new int[m];
            for (int j = n-1; j >= 0; j--) {
                long t = tmp >> j;
                if (t > 0) {
                    for (int k = 0; k < m; k++) {
                        exp[k] += a[j][k];
                    }
                    cash += c[j];
                }
                tmp -= t << j;
            }

            boolean isExp = true;
            for (int j = 0; j < m; j++) {
                if (exp[j] < x) {
                    isExp = false;
                    break;
                }
            }
            if (isExp)
                ans = Math.min(cash, ans);
        }

        if (ans == Integer.MAX_VALUE)
            System.out.println(-1);
        else
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