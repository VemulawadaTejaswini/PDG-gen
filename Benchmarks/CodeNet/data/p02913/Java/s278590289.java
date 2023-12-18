import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();

        long base2 =1007;
        long mod2 = 145399;
        long[] hash2 = new long[n + 1];
        long[] pow2 = new long[n + 1];
        Arrays.fill(hash2, 0);
        Arrays.fill(pow2, 1);
        for(int i=0;i<n;i++) {
            hash2[i+1] = (hash2[i]+s.charAt(i)) * base2 % mod2;
            //  pow1[i+1] = pow1[i] * base1 % mod1;
            pow2[i+1] = pow2[i] * base2 % mod2;
        }
        Map<Long, Integer> map = new HashMap<>(1053557);

        long max = 0;
        for(int i=0;i<n;i++) {
            for (int j=(i + 1);j<=n;j++) {
                long sub = ((hash2[j] - hash2[i] * pow2[j - i]) % mod2 + mod2) % mod2;
                //long sub = ((hash2[j] - hash2[i] * pow2[j - i]) % mod2 + mod2) % mod2;
                Integer lastIndex = map.get(sub);
                if (lastIndex == null) {
                    map.put(sub, j - 1);
                } else {
                    if ((int) lastIndex < i) {
                        max = Math.max(max, j - i);
                    }
                }
            }
        }

        PrintWriter printWriter = new PrintWriter(System.out);
        printWriter.printf("%d\n", max);
        printWriter.close();

    }

    static class FastScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        public String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            return tokenizer.nextToken("\n");
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }

}
