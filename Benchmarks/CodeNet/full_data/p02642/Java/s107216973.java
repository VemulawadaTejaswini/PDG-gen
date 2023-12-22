import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int n = sc.nextInt();
        final int ARRAY_LEN = 1000010;

        int[] num = new int[ARRAY_LEN];
        boolean[] isMultiple = new boolean[ARRAY_LEN];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (num[a] <= 0 && !isMultiple[a]) {
                for (int j = a*2; j < ARRAY_LEN; j+=a) {
                    isMultiple[j] = true;
                }
            }

            num[a]++;
        }

        int ans = 0;
        for (int i = 0; i < ARRAY_LEN; i++) {
            if (!isMultiple[i] && num[i] == 1)
                ans++;
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