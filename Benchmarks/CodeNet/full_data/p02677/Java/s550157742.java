import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();

        if (h > 12)
            h -= 12;

        int angH = 360 / 12 * h;
        int angM = 360 / 60 * m;

        int angC = Math.abs(angH - angM) % 180;
        double cosC = Math.cos(Math.toRadians(angC));
        cosC = ((double)Math.round(cosC * 1000000000))/1000000000;
        double c = a * a + b * b - 2 * a * b * cosC;

        System.out.println(Math.sqrt(c));
        System.out.println(cosC);
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