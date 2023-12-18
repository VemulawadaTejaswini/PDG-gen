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
                ABE.add( new Edge(x, y) );
            }
        }

        int[][] GA = adjB(N, AE);
        int[][] GB = adjB(N, BE);
        int[][] GAB = adjB(N, ABE);
        boolean[][] used = new boolean[N][4];
        int[][] from = new int[N][4];
        for (int[] arr : from) {
            Arrays.fill(arr, -1);
        }

        for (int i = 0; i < N; i++) {
            if( S.charAt(i) == 'A' && check(i, GA, GB, GAB, used, from) ) {
                return true;
            }
        }

        return false;
    }

    static ArrayDeque<State> q = new ArrayDeque<>();

    static boolean check(int a, int[][] GA, int[][] GB, int[][] GAB, boolean[][] used, int[][] from) {
        if( used[a][0] ) return false;

        q.add(new State(a, 0));
        from[a][0] = a;

        while( !q.isEmpty() ) {
            State s = q.poll();

            if( s.d % 4 == 0 ) {
                // a1 -> a2
                for (int a2 : GA[s.a]) {
                    if( used[a2][1] ) continue;

                    if( from[a2][1] == -1 ) {
                        from[a2][1] = s.d;
                        q.add( new State(a2, s.d+1) );

                    } else if( from[a2][1] != s.d ) {
                        return true;
                    }
                }

            } else if( s.d % 4 == 1 ) {
                // a2 -> b1
                for (int b1 : GAB[s.a]) {
                    if( used[b1][2] ) continue;

                    if( from[b1][2] == -1 ) {
                        from[b1][2] = s.d;
                        q.add( new State(b1, s.d+1) );

                    } else if( from[b1][2] != s.d ) {
                        return true;
                    }
                }

            } else if( s.d % 4 == 2 ) {
                // b1 -> b2
                for (int b2 : GB[s.a]) {
                    if( used[b2][3] ) continue;

                    if( from[b2][3] == -1 ) {
                        from[b2][3] = s.d;
                        q.add( new State(b2, s.d+1) );

                    } else if( from[b2][3] != s.d ) {
                        return true;
                    }
                }

            } else if( s.d % 4 == 3 ) {
                // b2 -> a1
                for (int a1 : GAB[s.a]) {
                    if( used[a1][0] ) continue;

                    if( from[a1][0] == -1 ) {
                        from[a1][0] = s.d;
                        q.add( new State(a1, s.d+1) );

                    } else if( from[a1][0] != s.d ) {
                        return true;
                    }
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 4; j++) {
                if( from[i][j] != -1 ) {
                    used[i][j] = true;
                    from[i][j] = -1;
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
            if( e.x != e.y ) {
                cnt[e.x]++;
                cnt[e.y]++;
            } else {
                cnt[e.x]++;
            }
        }
        for (int i = 0; i < n; i++) {
            adj[i] = new int[cnt[i]];
        }
        for (Edge e : edges) {
            if( e.x != e.y ) {
                adj[e.x][--cnt[e.x]] = e.y;
                adj[e.y][--cnt[e.y]] = e.x;
            } else {
                adj[e.x][--cnt[e.x]] = e.x;
            }
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
