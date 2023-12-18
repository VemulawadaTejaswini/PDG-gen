import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static Train[] T;

    public static void main(String[] args) {
        FastScanner fc = new FastScanner(System.in);
        N = fc.nextInt();
        T = new Train[N];
        for (int i = 0; i < N-1; i++) {
            T[i] = new Train(fc.nextInt(), fc.nextInt(), fc.nextInt());
        }

        PrintWriter pw = new PrintWriter(System.out);
        for (int i : solve()) {
            pw.println(i);
        }
        pw.flush();
    }

    static class Train {
        int c, s, f;

        public Train(int c, int s, int f) {
            this.c = c;
            this.s = s;
            this.f = f;
        }

        public int run(int t) {

            if( t <= s ) {
                return s + c;
            } else {
                int q = (t - s) / f;
                int r = (t - s) % f;
                int g = s + (r == 0 ? q * f : q * (f+1));
                return g + c;
            }
        }
    }

    static int[] solve() {
        int[] ans = new int[N];
        for (int i = 0; i < N-1; i++) {
            ans[i] = calc(i);
        }
        return ans;
    }

    static int calc(int i) {
        int t = 0;
        for (int j = i; j < N-1; j++) {
            t = T[j].run(t);
        }
        return t;
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
