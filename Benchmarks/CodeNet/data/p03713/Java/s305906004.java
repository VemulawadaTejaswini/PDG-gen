import java.io.*;
import java.util.*;

class Main {
    static Scanner scanner = new Scanner();

    public static void main(String[]$) throws IOException {
        long h = scanner.nextInt();
        long w = scanner.nextInt();
        long diff = Long.MAX_VALUE;

        long a = h * (w / 3);
        long b = h * ((w - a / h) / 2);
        long c = h * w - a - b;
        diff = Math.min(diff, Math.max(Math.max(a, b), c) - Math.min(Math.min(a, b), c));

        a = h * (w / 3);
        b = (w - a / h) * (h / 2);
        c = h * w - a - b;
        diff = Math.min(diff, Math.max(Math.max(a, b), c) - Math.min(Math.min(a, b), c));

        a = h * (w / 3 + 1);
        b = h * ((w - a / h) / 2);
        c = h * w - a - b;
        diff = Math.min(diff, Math.max(Math.max(a, b), c) - Math.min(Math.min(a, b), c));

        a = h * (w / 3 + 1);
        b = (w - a / h) * (h / 2);
        c = h * w - a - b;
        diff = Math.min(diff, Math.max(Math.max(a, b), c) - Math.min(Math.min(a, b), c));

        long t = h;
        h = w;
        w = t;

        a = h * (w / 3);
        b = h * ((w - a / h) / 2);
        c = h * w - a - b;
        diff = Math.min(diff, Math.max(Math.max(a, b), c) - Math.min(Math.min(a, b), c));

        a = h * (w / 3);
        b = (w - a / h) * (h / 2);
        c = h * w - a - b;
        diff = Math.min(diff, Math.max(Math.max(a, b), c) - Math.min(Math.min(a, b), c));

        a = h * (w / 3 + 1);
        b = h * ((w - a / h) / 2);
        c = h * w - a - b;
        diff = Math.min(diff, Math.max(Math.max(a, b), c) - Math.min(Math.min(a, b), c));

        a = h * (w / 3 + 1);
        b = (w - a / h) * (h / 2);
        c = h * w - a - b;
        diff = Math.min(diff, Math.max(Math.max(a, b), c) - Math.min(Math.min(a, b), c));

        System.out.println(diff);
    }

    static class Scanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1 << 15);
        StringTokenizer tokenizer;

        String next() throws IOException {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(reader.readLine());
            }
            return tokenizer.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }
    }
}