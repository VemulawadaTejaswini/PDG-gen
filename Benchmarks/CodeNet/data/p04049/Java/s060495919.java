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

    public static void main(String[] args) throws FileNotFoundException {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        int n = in.nextInt();
        int k = in.nextInt();
        List<Integer>[] nodes = new List[n + 1];
        for (int i = 1; i <= n; i++) {
            nodes[i] = new ArrayList<>();
        }

        for (int i = 0; i < n - 1; i++) {
            int u = in.nextInt();
            int v = in.nextInt();

            nodes[u].add(v);
            nodes[v].add(u);
        }

        int min = solve(n, k, nodes, 1, 0);
        out.println(min);

        out.close();
    }

    private static int solve(int n, int k, List<Integer>[] nodes, int nodeNum, int parent) {
        List<Integer> longestPath = bfs(nodeNum, n, nodes, parent);
        longestPath = bfs(longestPath.get(longestPath.size() - 1), n, nodes, parent);
        int diameter = longestPath.size() - 1;

        int min = Integer.MAX_VALUE;
        if (diameter <= k) {
            return 0;
        }

        Map<Integer, Integer> subTreeStarts = new HashMap<>();
        Map<Integer, Integer> subSolutions = new HashMap<>();
        boolean[] visited = new boolean[n + 1];
        visited[parent] = true;
        if (diameter % 2 == 1) {
            int v = longestPath.get((diameter + 1) / 2);
            int u = longestPath.get((diameter + 1) / 2 - 1);
            subTreeStarts.put(u, v);
            subTreeStarts.put(v, u);
        } else {
            int center = longestPath.get((diameter + 1) / 2);
            visited[center] = true;
            for (Integer child : nodes[center]) {
                subTreeStarts.put(child, center);
            }
        }

        Map<Integer, Map<Integer, Integer>> toCutForLevel = new HashMap<>();
        for (Integer subTreeStart : subTreeStarts.keySet()) {
            visited[subTreeStart] = true;
        }
        for (Integer subTreeStart : subTreeStarts.keySet()) {
            HashMap<Integer, Integer> subToCutForLevel = new HashMap<>();
            int res = dfs(subTreeStart, nodes, visited, subToCutForLevel, 0);
            subToCutForLevel.put(0, res);
            toCutForLevel.put(subTreeStart, subToCutForLevel);
            Integer subTreeSize = toCutForLevel.get(subTreeStart).getOrDefault(0, 0);
            if (subTreeSize <= 1) {
                subSolutions.put(subTreeStart, 0);
            } else {
                subSolutions.put(subTreeStart, solve(n, k, nodes, subTreeStart, subTreeStarts.get(subTreeStart)));
            }
        }

        int d = diameter % 2 == 0 ? diameter : (diameter - 1);
        for (int i = Math.max(0, (d - 2 * k) / 2); 2 * i <= d - k; i++) {
            int sum = 0;
            for (Map<Integer, Integer> subToCut : toCutForLevel.values()) {
                sum += subToCut.getOrDefault(i + k - d / 2, 0);
            }
            for (Integer subTreeStart : toCutForLevel.keySet()) {
                int s1 = sum - toCutForLevel.get(subTreeStart).getOrDefault(i + k - d / 2, 0);
                s1 += Math.max(toCutForLevel.get(subTreeStart).getOrDefault(d / 2 - i, 0),
                        subSolutions.get(subTreeStart));
                min = Math.min(min, s1);
            }
        }

        if (k <= (diameter + 1) / 2) {
            for (Integer subTreeStart : toCutForLevel.keySet()) {
                Integer subTreeSize = toCutForLevel.get(subTreeStart).getOrDefault(0, 0);
                if (subTreeSize <= 1) {
                    continue;
                }
                int s1 = n - subTreeSize;
                s1 += subSolutions.get(subTreeStart);
                min = Math.min(min, s1);
            }
        }
        return min;
    }

    private static int dfs(int node, List<Integer>[] nodes, boolean[] visited, HashMap<Integer, Integer> toCutForLevel, int level) {
        visited[node] = true;

        int res = 0;
        for (Integer child : nodes[node]) {
            if (!visited[child]) {
                res += dfs(child, nodes, visited, toCutForLevel, level + 1);
            }
        }
        toCutForLevel.put(level + 1, toCutForLevel.getOrDefault(level + 1, 0) + res);

        return res + 1;
    }

    private static List<Integer> bfs(int node, int n, List<Integer>[] nodes, int parent) {
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        boolean[] used = new boolean[n + 1];
        int[] parents = new int[n + 1];
        int[] distances = new int[n + 1];
        used[node] = true;
        used[parent] = true;
        parents[node] = -1;

        while (!q.isEmpty()) {
            Integer v = q.poll();
            for (Integer to : nodes[v]) {
                if (!used[to]) {
                    used[to] = true;
                    q.add(to);
                    distances[to] = distances[v] + 1;
                    parents[to] = v;
                }
            }
        }

        int maxNodeInd = -1;
        int maxDist = 0;
        for (int i = 1; i <= n; i++) {
            if (distances[i] > maxDist) {
                maxDist = distances[i];
                maxNodeInd = i;
            }
        }

        List<Integer> path = new ArrayList<>();
        for (int v = maxNodeInd; v != -1; v = parents[v]) {
            path.add(v);
        }
        Collections.reverse(path);
        return path;
    }


    private static void outputArray(long[] ans, PrintWriter out) {
        StringBuilder str = new StringBuilder();
        for (long an : ans) {
            str.append(an).append(' ');
        }
        out.println(str);
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