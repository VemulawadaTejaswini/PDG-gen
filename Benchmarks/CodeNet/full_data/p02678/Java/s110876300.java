import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {

    private static final Scanner SCANNER = new Scanner(System.in);

    static int readOneInt() {
        String line = SCANNER.nextLine();
        return Integer.parseInt(line);
    }

    private static int[] readInts() {
        String s = SCANNER.nextLine();
        String[] str = s.split(" ");
        int[] ints = new int[str.length];
        for (int j = 0; j < str.length; ++j) {
            ints[j] = Integer.parseInt(str[j]);
        }
        return ints;
    }

    public static void main(String[] args) {
        int tc = 1;
        for (int i = 0; i < tc; ++i) {
            int[] ints = readInts();
            int n = ints[0];
            int m = ints[1];

            int adjSize = Math.min(n, m) / 4;

//            Map<Integer, Set<Integer>> g = new HashMap<>(m);
            Set[] g = new Set[n + 1];
            for (int j = 1; j <= n; ++j) {
                g[j] = new HashSet<Integer>();
            }
            Set<Integer> nodes = new HashSet<>();

            for (int j = 0; j < m; ++j) {
                int[] p = readInts();
                nodes.add(p[0]);
                nodes.add(p[1]);

                g[p[0]].add(p[1]);
                g[p[1]].add(p[0]);
            }

            if (nodes.size() < n) {
                System.out.println("No");
            } else {
                test(n, m, g);
            }
        }
    }

    private static void test(int n, int m, Set[] g) {
        System.out.println("Yes");
        int[] d = new int[n+1];
        int[] s = new int[n+1];
        boolean[] visited = new boolean[n+1];
        Arrays.fill(d, Integer.MAX_VALUE);
        d[1] = 0;
        LinkedList<Integer> q = new LinkedList<>();
        q.add(1);
        while (!q.isEmpty()) {
            int roomId = q.remove();
            if (visited[roomId]) continue;
            visited[roomId] = true;

            Set<Integer> adj = g[roomId];

            for (int a : adj) {
                int dist = d[roomId] + 1;
                if (d[a] > dist) {
                    d[a] = dist;
                    s[a] = roomId;
                }

                if (!visited[a]) {
                    q.addLast(a);
                }
            }
        }

        StringBuilder b = new StringBuilder();
        for (int i = 2; i < s.length; ++i) {
            b.append(s[i]);
            b.append("\n");
        }

        System.out.println(b.toString());

    }


}

