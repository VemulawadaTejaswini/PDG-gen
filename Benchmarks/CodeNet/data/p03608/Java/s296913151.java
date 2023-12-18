import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.function.ToLongFunction;

public class Main {

    static int N;
    static int M;
    static int[] R;
    static Edge[] E;

    static class Edge {
        int a;
        int b;
        int c;

        public Edge(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }


    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        int r = sc.nextInt();
        R = sc.nextIntArray(r);
        E = new Edge[M];
        for (int i = 0; i < M; i++) {
            E[i] = new Edge(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }

        System.out.println( solve() );
    }

    private static final long INF = Long.MAX_VALUE/2;

    private static long solve() {
        long[][] dist = new long[N+1][N+1];
        for (long[] array : dist) {
            Arrays.fill(array, INF);
        }
        for (int i = 1; i <= N; i++) {
            dist[i][i] = 0;
        }
        for (Edge edge : E) {
            dist[edge.a][edge.b] = edge.c;
            dist[edge.b][edge.a] = edge.c;
        }

        for (int k = 1; k <= N; k++) {
            for (int i = 1; i <= N-1; i++) {
                for (int j = i+1; j <= N; j++) {
                    if( dist[i][k] == INF || dist[k][j] == INF ) continue;

                    if( dist[i][k] + dist[k][j] < dist[i][j] ) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }

        return calcMin(R, R.length, array -> {
            long sum = 0;
            for (int i = 0; i < array.length-1; i++) {
                int j = i+1;

                int a = array[i];
                int b = array[j];
                if( a > b ) {
                    int t = a;
                    a = b;
                    b = t;
                }

                sum += dist[a][b];
            }
            return sum;
        });
    }

    static long calcMin(int[] array, int n, ToLongFunction<int[]> f) {
        if( n == 1 ) {
            return f.applyAsLong(array);

        } else {
            long min = INF;
            for (int i = 0; i < n-1; i++) {
                min = Math.min(calcMin(array, n-1, f), min);

                if( n % 2 == 0 ) {
                    int temp = array[n-1];
                    array[n-1] = array[i];
                    array[i] = temp;
                } else {
                    int temp = array[n-1];
                    array[n-1] = array[0];
                    array[0] = temp;
                }
            }
            min = Math.min(calcMin(array, n-1, f), min);
            return min;
        }
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

