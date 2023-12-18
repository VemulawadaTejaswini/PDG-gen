import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] header = reader.readLine().split(" ");
        int vertexCount = Integer.parseInt(header[0]);
        int edgeCount = Integer.parseInt(header[1]);

        Map<Integer, List<Integer>> edges = new HashMap<>();
        for (int i = 0; i < vertexCount; ++i) {
            edges.put(i, new ArrayList<>());
        }
        int[] incoming = new int[vertexCount];

        for (int i = 0; i < edgeCount; ++i) {
            String[] parts = reader.readLine().split(" ");
            int src = Integer.parseInt(parts[0]);
            int dst = Integer.parseInt(parts[1]);
            edges.get(src).add(dst);
            incoming[dst] += 1;
        }

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < vertexCount; ++i) {
            if (incoming[i] == 0) {
                queue.addLast(i);
            }
        }

        ArrayList<Integer> sorted = new ArrayList<>();
        while (!queue.isEmpty()) {
            int vertex = queue.removeFirst();
            for (int dst : edges.get(vertex)) {
                incoming[dst] -= 1;
                if (incoming[dst] == 0) {
                    queue.addLast(dst);
                }
            }
            sorted.add(vertex);
        }

        int[] dp = new int[vertexCount];
        int maxPath = 0;
        for (int vertex : sorted) {
            for (int dst : edges.get(vertex)) {
                dp[dst] = Math.max(dp[dst], dp[vertex] + 1);
                maxPath = Math.max(maxPath, dp[dst]);
            }
        }

        System.out.println(maxPath);
    }
}
