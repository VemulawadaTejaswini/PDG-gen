import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int n = sc.nextInt();

        int[] cnt = new int[n];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    int tmp = calc(i, j, k, n);
                    if (tmp == -1)
                        break;
                    cnt[tmp-1]++;
                }
            }
        }

        PrintWriter pw = new PrintWriter(System.out);
        for (int i : cnt) {
            pw.println(i);
        }

        pw.flush();
    }

    static int calc(int x, int y, int z, int n) {
        int tmp = x*x + y*y + z*z;
        if (tmp > n)
            return -1;
        tmp += x*y + y*z + z*x;
        if (tmp > n)
            return -1;

        return tmp;
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