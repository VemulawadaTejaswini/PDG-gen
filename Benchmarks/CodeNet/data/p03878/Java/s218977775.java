import java.awt.Point;
import java.io.*;
import java.util.*;

class Main {
    static Scanner scanner = new Scanner();

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        List<Point> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int j = a[i] == b[i] ? 0 : a[i] > b[i] ? 1 : 2;
            if (!list.isEmpty() && list.get(list.size() - 1).x == j) {
                Point point = list.get(list.size() - 1);
                point.y++;
                list.set(list.size() - 1, point);
            } else {
                list.add(new Point(j, 1));
            }
        }
        long ans = 1;
        for (Point point : list) {
            ans *= point.y;
        }
        System.out.println(ans);
    }

    static class Scanner {
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