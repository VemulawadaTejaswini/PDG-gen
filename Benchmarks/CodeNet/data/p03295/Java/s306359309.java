import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int N;
    static int M;
    static Edge[] E;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        E = new Edge[M];
        for (int i = 0; i < M; i++) {
            E[i] = new Edge(sc.nextInt()-1, sc.nextInt()-1, i);
        }
        System.out.println( solve() );
    }

    static class Edge {
        int a;
        int b;
        int i;

        public Edge(int a, int b, int i) {
            this.a = a;
            this.b = b;
            this.i = i;
        }
    }

    static int solve() {

        List<Integer>[] start = new List[N];
        List<Integer>[] end = new List[N];

        for (Edge e : E) {
            if( start[e.a] == null ) {
                start[e.a] = new ArrayList<>();
            }
            start[e.a].add(e.i);

            if( end[e.b] == null ) {
                end[e.b] = new ArrayList<>();
            }
            end[e.b].add(e.i);
        }

        int ans = 0;
        Set<Integer> curr = new HashSet<>();
        for (int i = 0; i < N; i++) {

            if( end[i] != null ) {
                for (Integer each : end[i]) {
                    if( curr.contains(each) ) {
                        ans++;
                        curr.clear();
                        break;
                    }
                }
            }

            if( start[i] != null ) {
                curr.addAll(start[i]);
            }
        }

        if( !curr.isEmpty() ) ans++;

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
