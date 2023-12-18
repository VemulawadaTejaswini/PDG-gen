// 解説を参照
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int[] ans = new int[n];
        for (int i = 1; i < n; i++) {
            for (int j = i+1; j <= n; j++) {
                int a = Math.abs(j - i);
                int b = Math.abs(x - i) + Math.abs(j - y) + 1;
                int c = Math.abs(y - i) + Math.abs(j - x) + 1;  // ここの計算がよくわかんない

                int min = Math.min(Math.min(a, b), c);
                ans[min]++;
            }
        }

        for (int i = 1; i < n; i++) {
            System.out.println(ans[i]);
        }
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