import java.awt.*;
import java.io.*;
import java.util.*;

class Main {
    static Scanner scanner = new Scanner();

    public static void main(String[]$) throws IOException {
        int n = scanner.nextInt();
        Point[] a = new Point[n];
        Point[] b = new Point[n];
        for (int i = 0; i < n; i++) {
            a[i] = b[i] = new Point(scanner.nextInt(), i);
        }
        Arrays.sort(b, Comparator.comparingInt(array -> array.x));
        for (int i = 0; i < n; i++) {
            a[b[i].y].x = i;
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i].x % 2 != i % 2) {
                count++;
            }
        }
        System.out.println(count / 2);
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