import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int[] A;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        A = sc.nextIntArray(N);

        PrintWriter pw = new PrintWriter(System.out);
        for (int i : solve()) {
            pw.println(i);
        }
        pw.flush();
    }

    static int[] solve() {
        int sum = 0;
        sum += Math.abs(A[0]);
        for (int i = 1; i < N; i++) {
            sum += Math.abs(A[i-1] - A[i]);
        }
        sum += Math.abs(A[N-1]);

        int[] ans = new int[N];
        for (int i = 0; i < N; i++) {
            int prev = i == 0 ? 0 : A[i-1];
            int post = i == N-1 ? 0 : A[i+1];
            ans[i] = sum - Math.abs(prev - A[i]) - Math.abs(A[i] - post) + Math.abs(prev - post);
        }
        return ans;
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
