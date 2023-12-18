import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n, m;
    static int[] s, c;

    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        n = sc.nextInt();
        m = sc.nextInt();
        s = new int[m];
        c = new int[m];

        for (int i = 0; i < m; i++) {
            s[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }

        for (int i = 0; i < 1000; i++) {
            if (isAns(i)) {
                System.out.println(i);
                break;
            }
        }

        System.out.println(-1);
    }

    static boolean isAns(int a) {
        boolean isAns = true;
        if (a < 10 && n != 1)
            isAns = false;
        else if (a < 100 && n != 2)
            isAns = false;
        else if (n != 3)
            isAns = false;

        if (isAns) {
            int[] ans = new int[3];
            int tmp = a;
            for (int i = 0; i < 3; i++) {
                ans[2-i] = tmp % 10;
                tmp /= 10;
            }
            for (int i = 0; i < m; i++) {
                if (ans[s[i]-1] != c[i]) {
                    isAns = false;
                    break;
                }
            }
        }

        return isAns;
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