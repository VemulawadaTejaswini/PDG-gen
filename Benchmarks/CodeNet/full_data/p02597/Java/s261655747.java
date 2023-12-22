import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int n = sc.nextInt();
        char[] c = sc.next().toCharArray();

        // 赤：右から数える
        int[] red = new int[n];
        if (c[n-1] == 'R')
            red[n-1] = 1;
        for (int i = n-2; i >= 0; i--) {
            red[i] = red[i+1];
            if (c[i] == 'R')
                red[i]++;
        }

        // 白：左から数える
        int[] white = new int[n];
        if (c[0] == 'W')
            white[0] = 1;
        for (int i = 1; i < n; i++) {
            white[i] = white[i-1];
            if (c[i] == 'W')
                white[i]++;
        }

        int min = Math.min(red[0], white[0]);
        for (int i = 1; i < n; i++) {
            int tmp = Math.min(red[i], white[i]);
            if (min < tmp) {
                min = tmp;
            }
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