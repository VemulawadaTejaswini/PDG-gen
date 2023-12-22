import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
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

            Map<Integer, Set<Integer>> g = new HashMap<>();
            for (int j = 0; j < m; ++j) {
                int[] p = readInts();
                g.computeIfAbsent(p[0], k -> new HashSet<>()).add(p[1]);
                g.computeIfAbsent(p[1], k -> new HashSet<>()).add(p[0]);
            }

            test(n, m, g);
        }
    }

    private static void test(int n, int m, Map<Integer, Set<Integer>> g) {
        if (g.size() < n) {
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
        int[] d = new int[n];
        int[] s = new int[n];
        boolean[] visited = new boolean[n];
        Arrays.fill(d, Integer.MAX_VALUE);
        d[0] = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>();
        q.add(1);
        while (!q.isEmpty()) {
            int roomId = q.poll();
            if (visited[roomId - 1]) continue;
            visited[roomId - 1] = true;

            Set<Integer> adj = g.get(roomId);

            for (int a : adj) {
                if (d[a - 1] > d[roomId - 1] + 1) {
                    d[a - 1] = d[roomId - 1] + 1;
                    s[a - 1] = roomId;
                }

                q.add(a);
            }
        }

        for (int i = 1; i < s.length; ++i) {
            System.out.println(s[i]);
        }

    }


}

