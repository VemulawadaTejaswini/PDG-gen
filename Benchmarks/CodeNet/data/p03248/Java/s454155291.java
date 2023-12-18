package tools;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static String S;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        S = sc.next();

        List<Edge> answers = solve();
        if( answers == null ) {
            System.out.println("-1");

        } else {
            PrintWriter pw = new PrintWriter(System.out);
            for (Edge e : answers) {
                pw.println( e.a + " " + e.b );
            }
            pw.flush();
        }
    }

    static List<Edge> solve() {
        if( S.charAt(S.length()-1) == '1' ) {
            return null;
        }
        if( S.charAt(0) == '0' ) {
            return null;
        }

        // N　から　i　を作ると N-i　残る
        for (int i = 0; i < S.length()/2; i++) {
            if( S.charAt(i) != S.charAt(S.length()-i-2) ) return null;
        }

        List<Edge> answers = new ArrayList<>();
        int cur = 1;
        int seed = 1;
        for (int i = 0; i < S.length()/2; i++) {
            if( S.charAt(i) == '0' ) {
                answers.add(new Edge(cur, ++seed));
            } else {
                int next = ++seed;
                answers.add(new Edge(cur, next));
                cur = next;
            }
        }

        int last = S.length() - answers.size() - 1;
        for (int i = 0; i < last; i++) {
            answers.add( new Edge(cur, ++seed) );
        }

        return answers;
    }

    static class Edge {
        int a, b;

        public Edge(int a, int b) {
            this.a = a;
            this.b = b;
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
