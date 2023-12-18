import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int N;
    static int M;
    static String S;
    static int[] X;
    static int[] Y;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        S = sc.next();

        X = new int[M];
        Y = new int[M];
        for (int i = 0; i < M; i++) {
            X[i] = sc.nextInt()-1;
            Y[i] = sc.nextInt()-1;
        }

        System.out.println( solve() ? "Yes" : "No" );
    }

    static boolean solve() {
        List<Edge> AE = new ArrayList<>();
        List<Edge> BE = new ArrayList<>();
        List<Edge> ABE = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            int x = X[i];
            int y = Y[i];

            if( S.charAt(x) == 'A' && S.charAt(y) == 'A' ) {
                AE.add( new Edge(x, y) );

            } else if(S.charAt(x) == 'B' && S.charAt(y) == 'B') {
                BE.add( new Edge(x, y) );

            } else {
                if( S.charAt(x) == 'A' ) {
                    ABE.add( new Edge(x, y) );
                } else {
                    ABE.add( new Edge(y, x) );
                }
            }
        }

        int[][] GA = adjB(N, AE);
        int[][] GB = adjB(N, BE);
        int[][] GAB = adjB(N, ABE);


        return check(GA, GB, GAB);
    }

    static ArrayDeque<State> q = new ArrayDeque<>();

    static boolean check(int[][] GA, int[][] GB, int[][] GAB) {

        for (int i = 0; i < N; i++) {
            if( S.charAt(i) == 'A' ) {
                q.add(new State(i, 0));
            }
        }

        boolean[] loop = new boolean[N];

        while( !q.isEmpty() ) {
            State s = q.poll();

            if( s.d == 0 ) {
                // a -> aa
                for (int aa : GA[s.a]) {
                    q.add( new State(aa, 1) );
                    loop[s.d] = true;
                    loop[aa] = true;
                }

            } else if( s.d == 1 ) {
                // aa -> bb
                for (int bb : GAB[s.a]) {
                    q.add( new State(bb, 2) );
                }

            } else if( s.d == 2 ) {
                // bb -> b
                for (int b : GB[s.a]) {
                    q.add(new State(b, 3));
                }

            } else if( s.d == 3 ) {
                // b -> a
                for (int ra : GAB[s.a]) {
                    if( loop[ra] ) {
                        return true;
                    } else {
                        q.add(new State(ra, 0));
                    }
                }
            }
        }
        return false;
    }

    static class State {
        int a;
        int d;

        public State(int a, int d) {
            this.a = a;
            this.d = d;
        }
    }

    static int[][] adjB(int n, List<Edge> edges) {
        int[][] adj = new int[n][];
        int[] cnt = new int[n];
        for (Edge e : edges) {
            cnt[e.x]++;
        }
        for (Edge e : edges) {
            cnt[e.y]++;
        }
        for (int i = 0; i < n; i++) {
            adj[i] = new int[cnt[i]];
        }
        for (Edge e : edges) {
            adj[e.x][--cnt[e.x]] = e.y;
            adj[e.y][--cnt[e.y]] = e.x;
        }
        return adj;
    }

    static class Edge {
        int x;
        int y;

        public Edge(int x, int y) {
            this.x = x;
            this.y = y;
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
