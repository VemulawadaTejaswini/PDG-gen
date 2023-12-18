import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

// https://cses.fi/problemset/task/1130
public class CSESTreeMatching {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out);

        int n = Integer.parseInt(reader.readLine());
        Map<Integer, Set<Integer>> edges = new HashMap<>();
        for (int i = 0; i < n; i++) {
            edges.put(i, new HashSet<>());
        }
        // n - 1 edges in a tree of n nodes
        for (int i = 0; i < n - 1; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int a = Integer.parseInt(tokenizer.nextToken()) - 1;
            int b = Integer.parseInt(tokenizer.nextToken()) - 1;
            edges.get(a).add(b);
            edges.get(b).add(a);
        }
        int[] on = new int[n];
        int[] off = new int[n];
        dfs(edges, 0, -1, on, off);
        writer.println(Math.max(on[0], off[0]));
        reader.close();
        writer.close();
    }
    public static void dfs(Map<Integer, Set<Integer>> edges, int current, int parent, int[] on, int[] off) {
        for (int neighbor : edges.get(current)) {
            // don't go backwards
            if (neighbor == parent) {
                continue;
            }
            dfs(edges, neighbor, current, on, off);
            // update dp
            off[current] += Math.max(on[neighbor], off[neighbor]);
        }
        for (int neighbor : edges.get(current)) {
            // don't go backwards
            if (neighbor == parent) {
                continue;
            }
            on[current] = Math.max(on[current], off[neighbor] + 1 + off[current] - Math.max(on[neighbor], off[neighbor]));
        }
    }
}
