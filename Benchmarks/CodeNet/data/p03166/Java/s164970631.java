import java.io.*;
import java.util.*;
import java.math.*;

public class Main {

    static ArrayList<Integer>[] graph;
    public static void solve() {
        int n = in.nextInt();
        graph = new ArrayList[n+1];

        for(int i = 1; i <= n; i += 1)
            graph[i] = new ArrayList<>();

        int m = in.nextInt();

        for(int i = 1; i <= m; i += 1) {
            graph[in.nextInt()].add(in.nextInt());
        }

        Integer[] store = new Integer[n+1]; // length of longest path from vertex i;

        int result = 0;
        for(int i = 1; i <= n; i += 1) {
            result = Math.max(result, longestPath(i, store));
        }

        out.println(result);

    }

    private static int longestPath(int v, Integer[] store) {
        if(store[v] != null)
            return store[v];

        int length = -1;
        for(int n: graph[v]) {
            length = Math.max(length, longestPath(n, store));
        }

        store[v] = length+1;
        return store[v];
    }


    public static InputReader in = new InputReader();
    public static PrintWriter out;

    public static void main(String[] args) {
        out = new PrintWriter(System.out);
        solve();
        out.close();
    }


    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader() {
            reader = new BufferedReader(new InputStreamReader(System.in));
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        /**
         * When you call next(), that entire line will be skipped.
         * No flushing buffers.
         * Doesn't work when you want to scan the remaining line.
         *
         * @return entire line
         */
        public String nextLine() {
            String str = "";
            try {
                str = reader.readLine();
                tokenizer = null;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return str;
        }
    }
}