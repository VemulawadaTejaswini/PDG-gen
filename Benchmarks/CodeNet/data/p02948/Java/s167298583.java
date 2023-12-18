import java.awt.*;
import java.io.*;
import java.util.*;

class Main {
    static Scanner scanner = new Scanner();

    public static void main(String[]$) throws IOException {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Point[] ab = new Point[n];
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            ab[i] = new Point(b, a);
        }
        Arrays.sort(ab, Comparator.comparingInt(a -> a.y));
        PriorityQueue<Point> queue = new PriorityQueue<>(Comparator.comparingInt(a -> -a.x));
        long ans = 0;
        for (int i = 1, j = 0; i <= m; i++) {
            while (j < n && ab[j].y <= i) {
                queue.add(ab[j++]);
            }
            if (!queue.isEmpty()) {
                ans += queue.poll().x;
            }
        }
        System.out.println(ans);
    }

    static class Scanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 32768);
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

        double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }
    }
}