import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] s = new int[m];
        int[] c = new int[m];

        for (int i = 0; i < m; i++) {
            s[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }

        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        boolean isAns = true;
        for (int i = 0; i < m; i++) {
            if (ans[s[i]-1] != -1 && ans[s[i]-1] != c[i]) {
                isAns = false;
                break;
            } else {
                ans[s[i]-1] = c[i];
            }

            if (s[i] == 1 && c[i] == 0) {
                isAns = false;
                break;
            }
        }

        int ans_ = -1;
        int tmp = 1;
        if (isAns) {
            if (n > 1 && ans[0] == -1)
                ans[0] = 1;
            ans_ = 0;
            for (int i = n-1; i >= 0; i--) {
                if (ans[i] != -1)
                    ans_ += ans[i] * tmp;
                tmp *= 10;
            }
        }

        System.out.println(ans_);
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