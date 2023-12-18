import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int[] A;

    public static void main(String[] args) {
        FastScanner fc = new FastScanner(System.in);
        N = fc.nextInt();
        A = fc.nextIntArray(N);
        System.out.println(solve() ? "Possible" : "Impossible");
    }

    static boolean solve() {
        Arrays.sort(A);

        int diameter = A[N-1];
        int center = A[0];

        int centerCnt = 1;
        int daimeterCnt = 0;
        boolean sequence = true;
        for (int i = 1; i < N; i++) {
            if( A[i] == center ) {
                centerCnt++;
            }
            if( A[i] == diameter ) {
                daimeterCnt++;
            }

            if( A[i-1] != A[i] && A[i-1]+1 != A[i] ) {
                sequence = false;
            }
        }

        if( !sequence ) return false;

        if( A[N-1] % 2 == 0 ) {
            if( centerCnt != 1 ) return false;
            if( daimeterCnt < 2 ) return false;
            if( diameter/2 != center ) return false;

        } else {
            if( centerCnt != 2 ) return false;
            if( daimeterCnt < 2 ) return false;
            if( diameter/2 + 1 != center ) return false;

        }
        return true;
    }

    @SuppressWarnings("unused")
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
