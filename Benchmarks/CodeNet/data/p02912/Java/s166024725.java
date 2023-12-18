import java.io.*;
import java.util.*;


public class Main {
    public static void main (String[] args) {
        MyScanner sc = new MyScanner();

        int n = sc.nextInt();
        int m = sc.nextInt();
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            queue.add(a);
        }

        int cnt = 0;
        while (cnt < m) {
            queue.add(queue.poll() / 2);
            cnt++;
        }

        long ans = 0;
        for (int i : queue) {
            ans += i;
        }

        System.out.println(ans);
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