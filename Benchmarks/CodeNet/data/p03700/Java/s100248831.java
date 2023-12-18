import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int N;
    static int A;
    static int B;
    static int[] H;


    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        A = sc.nextInt();
        B = sc.nextInt();
        H = sc.nextIntArray(N);

        System.out.println( solve() );
    }

    private static int solve() {
        Arrays.sort(H);
        int low = 1;
        int high = 1_000_000_000;
        while(low < high) {
            int mid = (high + low)/2;

            if( isAllKill(mid) ) {
                high = mid;

            } else {
                low = mid+1;
            }
        }
        return low;
    }

    static boolean isAllKill(int times) {
        long base = (long)B * times;
        if( base >= 1_000_000_000 ) return true;

        int low = 0;
        int high = N-1;
        while(low < high) {
            int mid = (high + low)/2;

            if( H[mid] > base ) {
                high = mid;

            } else {
                low = mid + 1;
            }
        }

        if( low == N-1 ) return true;

        int diff = A - B;

        long use_a = 0;
        for (int i = low; i < N; i++) {
            if( diff == 1 ) {
                use_a += ((H[i] - base));

            } else {
                use_a += (H[i] - base) / diff;
                if( (H[i] - base) % diff != 0 ) {
                    use_a++;
                }
            }
        }
        return times >= use_a;
    }

    static class FastScanner {

        private BufferedReader reader;
        private StringTokenizer tokenizer;

        FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            return tokenizer.nextToken("\n");
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }
}

