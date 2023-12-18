import java.io.*;
import java.util.*;

class Main {
    static Scanner scanner = new Scanner();
    static long mod = 1000000007;

    public static void main(String[]$) {
        int n = scanner.nextInt();
        PriorityQueue<Integer> a = new PriorityQueue<>();
        PriorityQueue<Integer> b = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }
        for (int i = 0; i < n; i++) {
            b.add(scanner.nextInt());
        }
        long ans = 1;
        a.add(Integer.MAX_VALUE);
        b.add(Integer.MAX_VALUE);

        long countA = 0;
        long countB = 0;
        while (a.size() > 1 || b.size() > 1) {
            if (a.peek() < b.peek()) {
                a.poll();
                if (countB == 0) {
                    countA++;
                } else {
                    ans = ans * countB % mod;
                    countB--;
                }
            } else {
                b.poll();
                if (countA == 0) {
                    countB++;
                } else {
                    ans = ans * countA % mod;
                    countA--;
                }
            }
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