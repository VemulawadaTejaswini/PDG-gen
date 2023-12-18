import java.io.*;
import java.util.*;
import java.util.Map.Entry;

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

    public static void main(String[] args) throws FileNotFoundException {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        final int n = in.nextInt();
        final int m = in.nextInt();

        List<Integer>[] graph = new List[n];
        Map<Integer, Integer>[] distances = new Map[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
            distances[i] = new HashMap<>();
            distances[i].put(i, 0);
        }

        for (int i = 0; i < m; i++) {
            int u = in.nextInt() - 1;
            int v = in.nextInt() - 1;
            graph[u].add(v);
            graph[v].add(u);
            distances[u].put(v, 1);
            distances[v].put(u, 1);
        }

        for (int i = 0; i < n; i++) {
            for (Integer v1 : distances[i].keySet()) {
                for (Integer v2 : distances[i].keySet()) {
                    int newDist = distances[i].get(v1) + distances[i].get(v2);
                    if (newDist <= 10 && newDist < distances[v1].getOrDefault(v2, Integer.MAX_VALUE)) {
                        distances[v1].put(v2, newDist);
                        distances[v2].put(v1, newDist);
                    }
                }
            }
        }

        TreeMap<Integer, Set<Integer>>[] dist2vertex = new TreeMap[n];
        for (int i = 0; i < distances.length; i++) {
            Map<Integer, Integer> vToDistance = distances[i];
            dist2vertex[i] = new TreeMap<>();
            for (Integer v : vToDistance.keySet()) {
                if (!dist2vertex[i].containsKey(vToDistance.get(v))) {
                    dist2vertex[i].put(vToDistance.get(v), new HashSet<>());
                }
                dist2vertex[i].get(vToDistance.get(v)).add(v);
            }
        }

        final int q = in.nextInt();
        int[][] qs = new int[q][3];
        for (int i = 0; i < q; i++) {
            qs[i][0] = in.nextInt() - 1;
            qs[i][1] = in.nextInt();
            qs[i][2] = in.nextInt();
        }


        int[] colors = new int[n];
        for (int i = q - 1; i >= 0; i--) {
            int v = qs[i][0];
            int dist = qs[i][1];
            int color = qs[i][2];

            Entry<Integer, Set<Integer>> entry = dist2vertex[v].floorEntry(dist);
            if (entry == null) {
                continue;
            }
            Entry<Integer, Set<Integer>> f = dist2vertex[v].firstEntry();
            while (f != null) {
                for (Integer u : f.getValue()) {
                    if (colors[u] == 0) {
                        colors[u] = color;
                    }
                    dist2vertex[u].get(f.getKey()).remove(v);
                }

                dist2vertex[v].remove(f.getKey());

                if (f.getKey().equals(entry.getKey())) {
                    break;
                }
                f = dist2vertex[v].firstEntry();
            }
        }

        for (int color : colors) {
            out.println(color);
        }


//      out.println("Time:" + (System.currentTimeMillis() - startTime));
        out.close();
    }

    private static void colorVertices(int start, List<Integer>[] graph, int n, int maxDist, int[] colors, int newColor, int[] colored) {
        if (colors[start] == 0) {
            colors[start] = newColor;
            colored[start] = maxDist;
        }
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

                    if (distance[to] < maxDist && colored[to] < maxDist - distance[to]) {
                        q.add(to);
                    }
                    if (distance[to] <= maxDist && colors[to] == 0) {
                        colors[to] = newColor;
                        colored[to] = maxDist - distance[to];
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
