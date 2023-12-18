import lib.Combination;

import javax.swing.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    // int N = Integer.parseInt(scanner.nextLine());
    // int N = scanner.nextInt(), M = scanner.nextInt();
    // scanner.nextLine();
    // int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    // long[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToLong(Long::parseLong).toArray();
    static void solve(Scanner scanner) {
        int N = scanner.nextInt(), M = scanner.nextInt();
        scanner.nextLine();
        Map<Integer, Set<Integer>> edges = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            edges.put(i, new HashSet<>());
        }
        for (int i = 0; i < M; i++) {
            int[] e = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            edges.get(e[0]).add(e[1]);
        }
        int S = scanner.nextInt(), T = scanner.nextInt();

        int[][] dist = new int[N + 1][3];
        for (int[] d: dist) {
            Arrays.fill(d, Integer.MAX_VALUE / 2);
        }
        Queue<Long> q = new ArrayDeque<>();
        Set<Long> visited = new HashSet<>();
        q.add(((long) S) << 32);
        while (!q.isEmpty()) {
            long top = q.poll();
            int node = (int) (top >> 32);
            int cost = (int) top;
            int rem = cost % 3;
            if (visited.add((((long) node) << 32) + rem)) {
                dist[node][rem] = cost;
                for (int next: edges.get(node)) {
                    q.add((((long) next) << 32) + cost + 1);
                }
            }
        }

        if (dist[T][0] == Integer.MAX_VALUE / 2) {
            System.out.println(-1);
            return;
        }

        System.out.println(dist[T][0] / 3);
    }

}
