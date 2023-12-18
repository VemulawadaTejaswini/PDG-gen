import utils.GraphUtils;

import java.io.*;
import java.util.*;

/**
 * Created by Katushka on 11.03.2020.
 */
public class Main {

    static int[] readArray(int size, InputReader in) {
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = in.nextInt();
        }
        return a;
    }

    static long[] readLongArray(int size, InputReader in) {
        long[] a = new long[size];
        for (int i = 0; i < size; i++) {
            a[i] = in.nextLong();
        }
        return a;
    }

    static int binSearch(int[] list, int key) {
        int l = -1;
        int r = list.length;
        while (l < r - 1) {
            int m = (l + r) / 2;
            if (list[m] > key) {
                l = m;
            } else {
                r = m;
            }
        }
        return r;
    }

    public static void main(String[] args) throws FileNotFoundException {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        final int n = in.nextInt();
        final int m = in.nextInt();

        List<Integer>[] graph = new List[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int u = in.nextInt() - 1;
            int v = in.nextInt() - 1;
            graph[u].add(v);
            graph[v].add(u);
        }

        final int q = in.nextInt();

        int[] colors = new int[n];
        for (int i = 0; i < q; i++) {
            int v = in.nextInt() - 1;
            int dist = in.nextInt();
            int color = in.nextInt();
            colorVertices(v, graph, n, dist, colors, color);
        }

        for (int color : colors) {
            out.println(color);
        }


//      out.println("Time:" + (System.currentTimeMillis() - startTime));
        out.close();
    }

    private static void colorVertices(int start, List<Integer>[] graph, int n, int maxDist, int[] colors, int newColor) {
        colors[start] = newColor;
        if (maxDist == 0) {
            return;
        }

        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        boolean[] visited = new boolean[n];
        int[] distance = new int[n];
        visited[start] = true;
        while (!q.isEmpty()) {
            int v = q.poll();
            for (int i = 0; i < graph[v].size(); ++i) {
                int to = graph[v].get(i);
                if (!visited[to]) {
                    visited[to] = true;
                    distance[to] = distance[v] + 1;
                    if (distance[to] <= maxDist) {
                        colors[to] = newColor;
                    }
                    if (distance[to] < maxDist) {
                        q.add(to);
                    }
                }
            }
        }


    }


    private static String outputArray(Iterable<Integer> ans, Map<String, Integer> out) {
        StringBuilder str = new StringBuilder();
        for (int an : ans) {
            str.append(an).append(' ');
        }
        String s = str.toString();
        out.put(s, out.getOrDefault(s, 0) + 1);
        return s;
    }


    private static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                createTokenizer();
            }
            return tokenizer.nextToken();
        }

        private void createTokenizer() {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public String nextWord() {
            return next();
        }

        public String nextString() {
            try {
                return reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public char nextChar() {
            return next().charAt(0);
        }

        public int[] nextInts() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                createTokenizer();
            }
            List<Integer> res = new ArrayList<>();
            while (tokenizer.hasMoreElements()) {
                res.add(Integer.parseInt(tokenizer.nextToken()));
            }
            int[] resArray = new int[res.size()];
            for (int i = 0; i < res.size(); i++) {
                resArray[i] = res.get(i);
            }
            return resArray;
        }
    }
}
