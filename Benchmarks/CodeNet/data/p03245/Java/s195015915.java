import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static int[] X;
    static int[] Y;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        X = new int[N];
        Y = new int[N];
        for (int i = 0; i < N; i++) {
            X[i] = sc.nextInt();
            Y[i] = sc.nextInt();
        }

        Answer answer = solve();
        PrintWriter pw = new PrintWriter(System.out);
        if( answer != null ) {
            pw.println(answer.m);
            StringJoiner j = new StringJoiner(" ");
            for (int i : answer.d) {
                j.add(String.valueOf(i));
            }
            pw.println(j.toString());
            for (String w : answer.w) {
                pw.println(w);
            }
        } else {
            pw.println(-1);
        }
        pw.flush();
    }

    static class Answer {
        int m;
        int[] d;
        List<String> w;

        public Answer(int m, int[] d, List<String> w) {
            this.m = m;
            this.d = d;
            this.w = w;
        }
    }

    static Answer solve() {
        int even = 0;
        int odd = 0;
        for (int i = 0; i < N; i++) {
            int len = Math.abs(X[i]) + Math.abs(Y[i]);
            if( len % 2 == 0 ) {
                even++;
            } else {
                odd++;
            }
        }

        if( even != 0 && odd != 0 ) return null;

        int m = even == 0 ? 39 : 40;
        List<String> ws = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int last = m;
            int x = X[i];
            int y = Y[i];
            StringBuilder b = new StringBuilder();
            if( x > 0 ) {
                for (int j = 0; j < x; j++) {
                    b.append("R");
                    last--;
                }

            } else {
                for (int j = 0; j < Math.abs(x); j++) {
                    b.append("L");
                    last--;
                }
            }
            if( y > 0 ) {
                for (int j = 0; j < y; j++) {
                    b.append("U");
                    last--;
                }

            } else {
                for (int j = 0; j < Math.abs(y); j++) {
                    b.append("D");
                    last--;
                }
            }

            while( last > 0 ) {
                b.append("UD");
                last -= 2;
            }

            ws.add(b.toString());
        }

        int[] d = new int[m];
        Arrays.fill(d, 1);
        return new Answer(m, d, ws);
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
