import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vertexCount = scanner.nextInt();
        int edgeCount = scanner.nextInt();

        Map<Integer, List<Integer>> edges = new HashMap<>();
        int[] incoming = new int[vertexCount];

        for (int i = 0; i < edgeCount; ++i) {
            int src = scanner.nextInt() - 1;
            int dst = scanner.nextInt() - 1;
            edges.computeIfAbsent(src, ArrayList::new).add(dst);
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
            List<Integer> destinations = edges.get(vertex);
            if (destinations != null) {
                for (int dst : destinations) {
                    incoming[dst] -= 1;
                    if (incoming[dst] == 0) {
                        queue.addLast(dst);
                    }
                }
            }
            sorted.add(vertex);
        }

        int[] dp = new int[vertexCount];
        int maxPath = 0;
        for (int vertex : sorted) {
            List<Integer> destinations = edges.get(vertex);
            if (destinations != null) {
                for (int dst : edges.get(vertex)) {
                    dp[dst] = Math.max(dp[dst], dp[vertex] + 1);
                    maxPath = Math.max(maxPath, dp[dst]);
                }
            }
        }

        System.out.println(maxPath);
    }