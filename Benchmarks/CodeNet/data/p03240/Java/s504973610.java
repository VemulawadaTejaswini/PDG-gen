import java.io.*;
import java.util.*;

public class ABC112 {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        int[] h = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            h[i] = sc.nextInt();
        }

        int cx = 0;
        int cy = 0;
        int ch = 1;
        label:
        for (int i = 0; i <= 100; i++) {
            for (int j = 0; j <= 100; j++) {
                boolean isAns = true;
                cx = i;
                cy = j;
                ch = Math.abs(x[0] - cx) + Math.abs(y[0] - cy) + h[0];

                for (int k = 1; k < n; k++) {
                    int tmp = Math.abs(x[k] - cx) + Math.abs(y[k] - cy) + h[k];
                    if ((ch != tmp && h[k] > 0) || (ch > tmp && h[k] == 0)) {
                        isAns = false;
                        break;
                    }
                }

                if (isAns)
                    break label;
            }
        }

        System.out.println(cx + " " + cy + " " + ch);
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