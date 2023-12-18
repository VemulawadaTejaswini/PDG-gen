import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int N;
    static int[] A;
    static int[] X;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        A = new int[N];
        X = new int[N+1];
        X[0] = -1;
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            X[A[i]] = i;
        }
        System.out.println( solve() );
    }

    private static long solve() {
        List<Integer> indice = new ArrayList<>(N);
        long sum = 0;
        for (int a = 1; a <= N; a++) {
            int ai = X[a];
            int ii = add(indice, ai);

            int l;
            if( ii == 0 ) {
                l = ai + 1;

            } else {
                int lai = indice.get(ii-1);
                l = ai - lai;
            }

            int r;
            if( ii == indice.size()-1) {
                r = N - ai;

            } else {
                int rai = indice.get(ii+1);
                r = rai - ai;
            }

            sum += (long)a * l * r;
        }
        return sum;
    }

    static int add(List<Integer> indice, int ai) {
        int low = 0;
        int high = indice.size();

        while( low < high ) {
            int mid = (low + high) / 2;

            if( indice.get(mid) < ai ) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        indice.add(low, ai);
        return low;
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
