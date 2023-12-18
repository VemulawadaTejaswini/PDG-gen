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

    private static class Node {
        int num;
        Set<Node> children = new HashSet<>();

        public Node(int num) {
            this.num = num;
        }

        @Override
        public String toString() {
            return "Node:" + num;
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        int n = in.nextInt();
        int k = in.nextInt();
        Node[] nodes = new Node[n + 1];
        for (int i = 1; i <= n; i++) {
            nodes[i] = new Node(i);
        }

        for (int i = 0; i < n - 1; i++) {
            int u = in.nextInt();
            int v = in.nextInt();

            nodes[u].children.add(nodes[v]);
            nodes[v].children.add(nodes[u]);
        }

        int min = solve(n, k, nodes, 1);
        out.println(min);

        out.close();
    }

    private static int solve(int n, int k, Node[] nodes, int nodeNum) {
        List<Node> longestPath = bfs(nodes[nodeNum], n, nodes);
        longestPath = bfs(nodes[longestPath.get(longestPath.size() - 1).num], n, nodes);
        int diameter = longestPath.size() - 1;

        int min = Integer.MAX_VALUE;
        if (diameter <= k) {
            return 0;
        }

        List<Node> subTreeStarts = new ArrayList<>();
        boolean[] visited = new boolean[n + 1];
        if (diameter % 2 == 1) {
            Node v = longestPath.get((diameter + 1) / 2);
            subTreeStarts.add(v);
            Node u = longestPath.get((diameter + 1) / 2 - 1);
            subTreeStarts.add(u);

            u.children.remove(v);
            v.children.remove(u);
        } else {
            int center = longestPath.get((diameter + 1) / 2).num;
            visited[center] = true;
            subTreeStarts.addAll(nodes[center].children);
            for (Node subTreeStart : subTreeStarts) {
                subTreeStart.children.remove(nodes[center]);
                nodes[center].children.remove(subTreeStart);
            }
        }

        Map<Integer, Map<Integer, Integer>> toCutForLevel = new HashMap<>();
        for (Node subTreeStart : subTreeStarts) {
            visited[subTreeStart.num] = true;
        }
        for (Node subTreeStart : subTreeStarts) {
            HashMap<Integer, Integer> subToCutForLevel = new HashMap<>();
            int res = dfs(subTreeStart, visited, subToCutForLevel, 0);
            subToCutForLevel.put(0, res);
            toCutForLevel.put(subTreeStart.num, subToCutForLevel);
        }


        int d = diameter % 2 == 0 ? diameter : (diameter - 1);
        for (int i = Math.max(0, (d - 2 * k) / 2); 2 * i <= d - k; i++) {
            int sum = 0;
            for (Map<Integer, Integer> subToCut : toCutForLevel.values()) {
                sum += subToCut.getOrDefault(i + k - d / 2, 0);
            }
            for (Map<Integer, Integer> subToCut : toCutForLevel.values()) {
                int s1 = sum - subToCut.getOrDefault(i + k - d / 2, 0);
                s1 += subToCut.getOrDefault(d / 2 - i, 0);
                min = Math.min(min, s1);
            }
        }

        if (k < (diameter + 1) / 2) {
            for (Integer subTreeStart : toCutForLevel.keySet()) {
                Integer subTreeSize = toCutForLevel.get(subTreeStart).getOrDefault(0, 0);
                if (subTreeSize <= 1) {
                    continue;
                }
                int s1 = n - subTreeSize;
                s1 += solve(n, k, nodes, subTreeStart);
                min = Math.min(min, s1);
            }
        }
        return min;
    }

    private static int dfs(Node node, boolean[] visited, HashMap<Integer, Integer> toCutForLevel, int level) {
        visited[node.num] = true;

        int res = 0;
        for (Node child : node.children) {
            if (!visited[child.num]) {
                res += dfs(child, visited, toCutForLevel, level + 1);
            }
        }
        toCutForLevel.put(level + 1, toCutForLevel.getOrDefault(level + 1, 0) + res);

        return res + 1;
    }

    private static List<Node> bfs(Node node, int n, Node[] nodes) {
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        boolean[] used = new boolean[n + 1];
        int[] parents = new int[n + 1];
        int[] distances = new int[n + 1];
        used[node.num] = true;
        parents[node.num] = -1;

        while (!q.isEmpty()) {
            Node v = q.poll();
            for (Node to : v.children) {
                if (!used[to.num]) {
                    used[to.num] = true;
                    q.add(to);
                    distances[to.num] = distances[v.num] + 1;
                    parents[to.num] = v.num;
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

        List<Node> path = new ArrayList<>();
        for (int v = maxNodeInd; v != -1; v = parents[v]) {
            path.add(nodes[v]);
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