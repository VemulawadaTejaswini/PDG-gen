// 解説の実装例が分かりやすすぎて惚れた
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int n = sc.nextInt();
        int m = sc.nextInt();
        long k = sc.nextLong();
        long[] a = new long[n+1];
        long[] b = new long[m+1];

        a[0] = 0;
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            a[i+1] = a[i] + t;
        }

        b[0] = 0;
        for (int i = 0; i < m; i++) {
            int t = sc.nextInt();
            b[i+1] = b[i] + t;
        }

        int ans = 0, j = m;
        for (int i = 0; i <= n; i++) {
            if (a[i] > k)
                break;
            while (b[j] > k - a[i])
                j--;
            ans = Math.max(i+j, ans);
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