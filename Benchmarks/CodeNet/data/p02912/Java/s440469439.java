import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    static Scanner sc = new Scanner();

    public static void main(final String[] args) throws IOException {
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        Arrays.sort(a);
//        int cnt = a.length - 1;
        for (int i = 0; i < m; i++) {
            long max = a[a.length - 1];
            if (a[a.length - 1] <= max) {
                long div = a[a.length - 1]/2;
                a[a.length - 1] = div;
                for (int j = n-2; 0 < j; j--) {
                    if (div < a[j]) {
                        a[j + 1] = a[j];
                        a[j] = div;
                    } else {
                        break;
                    }
                }
            }
        }

        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += a[i];
        }
        System.out.println(ans);
    }

    static class Scanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1 << 15);
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
    }
}
