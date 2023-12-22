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
        int[] a = new int[n+1];
        int[] b = new int[m+1];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        for (int i = 0; i < m; i++)
            b[i] = sc.nextInt();
        
        a[n] = Integer.MAX_VALUE;
        b[m] = Integer.MAX_VALUE;

        long time = 0;
        int ai = 0;
        int bi = 0;
        int ans = 0;
        while (time < k) {
            if (a[ai] < b[bi])
                time += a[ai++];
            else
                time += b[bi++];
            ans++;
        }

        if (time > k)
            ans--;

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