import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int N;
    static int[] A;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        A = sc.nextIntArray(N*3);

        System.out.println( solve() );
    }

    private static long solve() {
        // LOからは小さいもの、HIからはおおきいものを優先的に取り除きたい
        Comparator<Integer> c = Comparator.naturalOrder();
        PriorityQueue<Integer> lo = new PriorityQueue<>(c);
        PriorityQueue<Integer> hi = new PriorityQueue<>(c.reversed());

        for (int i = 0; i < N; i++) {
            lo.add(A[i]);
            hi.add(A[i+2*N]);
        }
        int ml = N;
        int mh = N*2-1;

        for (int i = 0; i < N; i++) {
            int l = lo.peek();
            int h = hi.peek();

            if( A[ml] - l >= h - A[mh] ) {
                lo.poll();
                lo.add(A[ml]);
                ml++;
            } else {
                hi.poll();
                hi.add(A[mh]);
                mh--;
            }
        }

        long lo_sum = 0;
        for (Integer i : lo) {
            lo_sum += i;
        }
        long hi_sum = 0;
        for (Integer i : hi) {
            hi_sum += i;
        }
        return lo_sum - hi_sum;
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

