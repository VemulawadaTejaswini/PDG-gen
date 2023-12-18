import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double x = sc.nextDouble();
        double theta;
        final double PI = Math.PI;

        if (x > a * a * b / 2) {
            theta = Math.atan(2 * (a * a * b - x) / (a * a* a));
        } else {
            theta = Math.atan((a * b * b) / (2 * x));
        }

        theta = theta * 180 / PI;
        System.out.println(theta);
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

        Double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}