import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int[] V;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        V = sc.nextIntArray(N);

        System.out.println(solve());
    }

    static int solve() {
        int[] even = new int[100001];
        int[] odd = new int[100001];

        for (int i = 0; i < N; i++) {
            if( i % 2 == 0 ) {
                even[V[i]]++;
            } else {
                odd[V[i]]++;
            }
        }

        int evenMax = -1;
        int evenMaxVal = -1;
        int evenSecondMax = -1;
        int evenSecondMaxVal = -1;
        int oddMax = -1;
        int oddMaxVal = -1;
        int oddSecondMax = -1;
        int oddSecondMaxVal = -1;
        for (int i = 1; i <= 10000; i++) {
            if( evenMax < even[i] ) {
                evenSecondMax = evenMax;

                evenMax = even[i];
                evenMaxVal = i;

            } else if( evenSecondMax < even[i] ) {
                evenSecondMax = even[i];
            }

            if( oddMax < odd[i] ) {
                oddSecondMax = oddMax;

                oddMax = odd[i];
                oddMaxVal = i;

            } else if( oddSecondMax < odd[i] ) {
                oddSecondMax = odd[i];
            }
        }

        if( evenMaxVal == oddMaxVal ) {
            return Math.min(calc(evenMax, oddSecondMax), calc(evenSecondMax, oddMax));


        } else {
            return calc(evenMax, oddMax);
        }
    }

    static int calc(int evenMax, int oddMax) {
        int allEven = (N+1) / 2;
        int allOdd = N / 2;
        return (allEven - evenMax) + (allOdd - oddMax);
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
