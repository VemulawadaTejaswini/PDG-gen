import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        int N = sc.nextInt();
        String S = sc.next();

        if (N < 3) {
            System.out.println(0);
            return;
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int s = 1; s < N; s++) {
                if (i + s > N - 1) {
                    break;
                }
                for (int t = 1; t < N; t++) {
                    if (i + s + t > N - 1) {
                        break;
                    }
                    if (s == t) {
                        continue;
                    }
                    boolean ok = true;
                    ok &= S.charAt(i) != S.charAt(i + s);
                    ok &= S.charAt(i) != S.charAt(i + s + t);
                    ok &= S.charAt(i + s) != S.charAt(i + s + t);
                    if (ok) {
                        ans++;
                    }

                }
            }
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