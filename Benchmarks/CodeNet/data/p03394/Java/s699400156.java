import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int N;

    public static void main(String[] args) {
        FastScanner fc = new FastScanner(System.in);
        N = fc.nextInt();

        PrintWriter pw = new PrintWriter(System.out);
        int[] answer = solve();
        for (int i = 0; i < N; i++) {
            if( i != 0 ) {
                pw.print(" ");
            }
            pw.print(answer[i]);
        }
        pw.println();
        pw.flush();
    }

    static int[] solve() {
        int[] ans = new int[N];
        ans[0] = 3;
        ans[1] = 5;

        int evens = 0;
        for (int i = 2; i < N; i++) {
            ans[i] = (i-2) * 2;
            evens += ans[i];
        }
        // (evens + 3) % 5 == 0
        // (evens + 5) % 3 == 0
        // となるように調整する
        while(true) {
            int r3 = (evens + 5) % 3;
            int r5 = (evens + 3) % 5;

            if( r3 == 0 && r5 == 0 && ans[N-1] % 2 == 0) {
                break;
            } else {
                evens++;
                ans[N-1]++;
            }
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
