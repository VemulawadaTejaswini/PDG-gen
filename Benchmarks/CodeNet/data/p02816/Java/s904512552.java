import java.io.*;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int[] A, B;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        A = sc.nextIntArray(N);
        B = sc.nextIntArray(N);

        PrintWriter pw = new PrintWriter(System.out);
        solve(pw);
        pw.flush();
    }

    static void solve(PrintWriter pw) {
        // kmpとか使うのだろうとはわかるのだけど Ai + Ai+1 = Bi + Bi+1 にはたどり着けなかった
        // xorのときの典型なんだろうか...
        int[] U = new int[N*2];
        int[] V = new int[N];
        for (int i = 0; i < N; i++) {
            int u = A[i] ^ A[(i+1)%N];
            U[i] = u;
            U[i+N] = u;
            V[i] = B[i] ^ B[(i+1)%N];
        }

        IntKMP kmp = IntKMP.create(U);
        int[] ks = kmp.findMatchIndice(V);
        // debug(ks);

        for (int k : ks) {
            if( k >= N ) continue;
            int x = A[k] ^ B[0];
            pw.println(k + " " + x);
        }
    }

    static class IntKMP {
        public static IntKMP create(int[] s) {
            int n = s.length;
            int[] table = new int[n+1];
            table[0] = -1;
            for (int i = 0; i < n; i++) {
                int t = table[i];
                while( t != -1 && s[i] != s[t] ) {
                    t = table[t];
                }
                table[i+1] = t+1;
            }
            return new IntKMP(s, table);
        }

        final int[] s;
        final int[] table;

        public IntKMP(int[] S, int[] table) {
            this.s = S;
            this.table = table;
        }

        public int[] findMatchIndice(int[] w) {
            int n = s.length;
            boolean[] match = new boolean[n];
            int cnt = 0;
            {
                int i = 0, j = 0;
                while(i < n) {
                    if( s[i] == w[j] ) {
                        i++; j++;

                        if( j == w.length ) {
                            int idx = i-w.length;
                            match[idx] = true;
                            cnt++;
                            j = table[j];
                        }

                    } else {
                        if( j != 0 ) {
                            j = table[j];
                        } else {
                            i++;
                        }
                    }
                }
            }
            int idx = 0;
            int[] indice = new int[cnt];
            for (int i = 0; i < n; i++) {
                if( match[i] ) {
                    indice[idx++] = i;
                }
            }
            return indice;
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
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        int[] nextIntArray(int n, int delta) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt() + delta;
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = nextLong();
            return a;
        }
    }

    static void writeLines(int[] as) {
        PrintWriter pw = new PrintWriter(System.out);
        for (int a : as) pw.println(a);
        pw.flush();
    }

    static void writeLines(long[] as) {
        PrintWriter pw = new PrintWriter(System.out);
        for (long a : as) pw.println(a);
        pw.flush();
    }

    static void writeSingleLine(int[] as) {
        PrintWriter pw = new PrintWriter(System.out);
        for (int i = 0; i < as.length; i++) {
            if (i != 0) pw.print(" ");
            pw.print(as[i]);
        }
        pw.println();
        pw.flush();
    }

    static int max(int... as) {
        int max = Integer.MIN_VALUE;
        for (int a : as) max = Math.max(a, max);
        return max;
    }

    static int min(int... as) {
        int min = Integer.MAX_VALUE;
        for (int a : as) min = Math.min(a, min);
        return min;
    }

    static void debug(Object... args) {
        StringJoiner j = new StringJoiner(" ");
        for (Object arg : args) {
            if (arg == null) j.add("null");
            else if (arg instanceof int[]) j.add(Arrays.toString((int[]) arg));
            else if (arg instanceof long[]) j.add(Arrays.toString((long[]) arg));
            else if (arg instanceof double[]) j.add(Arrays.toString((double[]) arg));
            else if (arg instanceof Object[]) j.add(Arrays.toString((Object[]) arg));
            else j.add(arg.toString());
        }
        System.err.println(j.toString());
    }

    static void printSingleLine(int[] array) {
        PrintWriter pw = new PrintWriter(System.out);
        for (int i = 0; i < array.length; i++) {
            if (i != 0) pw.print(" ");
            pw.print(array[i]);
        }
        pw.println();
        pw.flush();
    }

    static int lowerBound(int[] array, int value) {
        int lo = 0, hi = array.length, mid;
        while (lo < hi) {
            mid = (hi + lo) / 2;
            if (array[mid] < value) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }

    static int upperBound(int[] array, int value) {
        int lo = 0, hi = array.length, mid;
        while (lo < hi) {
            mid = (hi + lo) / 2;
            if (array[mid] <= value) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }
}
