import java.io.*;
import java.util.*;

class Main {
    static Scanner scanner = new Scanner();
    static PrintWriter out = new PrintWriter(System.out);

    void solve() {
        int n = scanner.nextInt();
        String[] s = new String[n];

        System.out.println(0);
        s[0] = scanner.next();
        if (s[0].equals("Vacant")) {
            return;
        }

        int ok = 0, ng = n;
        while (Math.abs(ok - ng) > 1) {
            int mid = (ok + ng) / 2;

            System.out.println(mid);
            s[mid] = scanner.next();
            if (s[mid].equals("Vacant")) {
                return;
            }

            if (s[mid].equals(s[0]) == (mid % 2 == 0)) {
                ok = mid;
            } else {
                ng = mid;
            }
        }
    }

    public static void main(String[]$) {
        new Main().solve();
        out.close();
    }

    static class Scanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 32768);
        StringTokenizer tokenizer;

        String next() {
            try {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    tokenizer = new StringTokenizer(reader.readLine());
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}