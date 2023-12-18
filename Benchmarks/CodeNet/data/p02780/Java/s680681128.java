import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] p = new int[n];

        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }

        double[] tmp = new double[n];
        for (int i = 0; i < n; i++) {
            tmp[i] = (p[i]-1) / 2.0 + 1;
        }

        double max = 0;
        for (int i = 0; i < k; i++) {
            max += tmp[i];
        }

        int j = 0;
        double t = max;
        for (int i = k; i < n; i++) {
            t = t - tmp[j++] + tmp[i];
            max = Math.max(t, max);
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