
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static class Pair {
        int a;
        int b;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return a == pair.a &&
                    b == pair.b;
        }

        @Override
        public int hashCode() {
            return Objects.hash(a, b);
        }

        public Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        Set<Pair> blockers = new HashSet<>();
        for (int i = 0 ;i < m; ++i) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            Set<Integer> aConnected = graph.getOrDefault(a, new HashSet<>());
            aConnected.add(b);
            graph.put(a, aConnected);
            Set<Integer> bConnected = graph.getOrDefault(b, new HashSet<>());
            bConnected.add(a);
            graph.put(b, bConnected);
        }
        for (int i = 0; i < k; ++i) {
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            blockers.add(new Pair(c, d));
        }
        int color = 0;
        int[] colors = new int[n + 1];
        int [] visited = new int[n + 1];
        int[] colorSize = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            if (visited[i] == 0) {
                dfs(graph, color, colors, colorSize, visited, i);
                color++;
            }
        }
        int[] blockerNum = new int[n + 1];
        for (Pair pair : blockers) {
            int c = pair.a;
            int d = pair.b;
     //       System.out.println("c: " + c + " d : " + d);
     //       System.out.println("color c: " + colors[c] + " colorD: " + colors[d]);
            if (colors[c] == colors[d]) {
                blockerNum[c]++;
                blockerNum[d]++;
            }
        }
        for (int i = 1; i <= n; ++i) {
            int fiendSize = colorSize[colors[i]];
            int directFriends = graph.getOrDefault(i, new HashSet<>()).size();
            int blockerFriends = blockerNum[i];
            int friendCandidates = fiendSize - 1 - directFriends - blockerFriends;
            System.out.print(friendCandidates + " ");
        }
        System.out.println();
    }
    static void dfs(
            Map<Integer, Set<Integer>> graph,
            int color,
            int[] colors,
            int[] colorSize,
            int[] visited,
            int current
    ) {
        if (visited[current] == 1) {
            return;
        }
        visited[current] = 1;
        colors[current] = color;
     //   System.out.println("colors[" + current + "]: " + colors[current]);
        colorSize[color]++;
        Set<Integer> connected = graph.getOrDefault(current, new HashSet<>());
        for (int connect : connected) {
     //       System.out.println("current: " + current + " connected: " + connect);
            dfs(graph, color, colors, colorSize, visited, connect);
        }
    }
}
