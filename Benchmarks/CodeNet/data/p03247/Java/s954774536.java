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
        String[] w;

        public Answer(int m, int[] d, String[] w) {
            this.m = m;
            this.d = d;
            this.w = w;
        }
    }

    static Answer solve() {
        int max = Math.abs(X[0]) + Math.abs(Y[0]);
        boolean even = max % 2 == 0;
        for (int i = 1; i < N; i++) {
            int xy = Math.abs(X[i]) + Math.abs(Y[i]);
            if( xy % 2 == 0 != even ) {
                return null;
            }
            max = Math.max(xy, max);
        }

        int bit;
        if( even ) {
            bit = Integer.toBinaryString(max-1).length();

        } else {
            bit = Integer.toBinaryString(max).length();
        }

        String[] w = new String[N];
        for (int i = 0; i < N; i++) {
            int x = X[i];
            int y = Y[i];

            StringBuilder sb = new StringBuilder();
            for (int b = bit-1; b >= 0 ; b--) {
                int arm = 1 << b;
                if( Math.abs(x) > Math.abs(y) ) {
                    if( x > 0 ) {
                        x = x - (arm);
                        sb.append("R");

                    } else {
                        x = x + (arm);
                        sb.append("L");
                    }
                } else {
                    if( y > 0 ) {
                        y = y - (arm);
                        sb.append("U");

                    } else {
                        y = y + (arm);
                        sb.append("D");
                    }
                }
            }

            if( even ) {
                if( x == 1 ) {
                    sb.append("R");
                } else if( x == -1 ) {
                    sb.append("L");
                } else if( y == 1 ) {
                    sb.append("U");
                } else if( y == -1 ) {
                    sb.append("D");
                } else {
                    throw new RuntimeException("even " + x + " " + y);
                }
            }

            w[i] = sb.toString();
        }

        if( even ) {
            int m = bit+1;
            int[] d = new int[m];
            for (int b = bit-1; b >= 0 ; b--) {
                d[bit-b-1] = 1 << b;
            }
            d[m-1] = 1;
            return new Answer(m, d, w);

        } else {
            int m = bit;
            int[] d = new int[m];
            for (int b = bit-1; b >= 0 ; b--) {
                d[bit-b-1] = 1 << b;
            }
            return new Answer(m, d, w);
        }
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
