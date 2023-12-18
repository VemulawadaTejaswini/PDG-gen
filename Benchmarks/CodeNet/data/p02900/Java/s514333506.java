import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        FastScanner scan = new FastScanner(System.in);
        final long A = scan.nextInt();
        final long B = scan.nextInt();

        List<Long> list = new ArrayList<>();
        
        long larger = Math.max(A, B);
        long smaller = Math.min(A, B);
        for (int i = 1; true; i++) {
            if (smaller / i < 1) {
                break;
            }
            if (smaller % i != 0) {
                continue;
            }
            long tmp = larger % (smaller / i);
            if (tmp == 0) {
                list.add(smaller / i);
            }
        }
        
        for (int i = 0; i < list.size(); i++) {
            boolean flag = true;
            while (flag) {
                flag = false;
                for (int j = i + 1; j < list.size(); j++) {
                    if (isCoprime(list.get(i), list.get(j))) {
                        continue;
                    } else {
                        list.remove(i);
                        flag = true;
                        break;
                    }
                }
            }
        }
        
        System.out.println(list.size());
    }

    private static boolean isCoprime(long a, long b) {
        if (b == 0) return false;
        if (b == 1) return true;
        if (b > a) return isCoprime(b, a);
        return isCoprime(b, a % b);
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