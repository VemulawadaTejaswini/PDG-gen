import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int n = sc.nextInt();
        int[] a = new int[n];
        int money = 1000;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int min = 0;
        int max = 0;
        for (int i = 1; i < n; i++) {
            if (a[i-1] > a[i]) {
                if (min < max) {
                    int t = money / a[min];
                    money -= a[min] * t;
                    money += a[max] * t;

                    min = i;
                    max = i;
                }
            }

            if (a[i] < a[min])
                min = i;
            if (a[i] >= a[max])
                max = i;
        }

        if (min < max) {
            int t = money / a[min];
            money -= a[min] * t;
            money += a[max] * t;
        }

        System.out.println(money);
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