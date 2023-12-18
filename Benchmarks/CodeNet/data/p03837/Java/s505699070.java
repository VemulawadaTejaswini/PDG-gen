import java.util.*;

public class Main {
    private static final long INF = 1145141919;
    long map[][];

    public void main(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        map = new long[n][n];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            map[a - 1][b - 1] = c;
            map[b - 1][a - 1] = c;
        }

        Map<Integer, Set<Integer>> usedMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            dijkstra(i, n, usedMap);
        }

        int cnt = 0;
        for (Set<Integer> set : usedMap.values()) {
            cnt += set.size();
        }
        System.out.println(m - cnt);
    }

    public void dijkstra(int start, int n, Map<Integer, Set<Integer>> usedMap) {
        long mins[] = new long[n];
        Arrays.fill(mins, INF);
        boolean flgs[] = new boolean[n];

        Queue<Node> queue = new PriorityQueue<>((o1, o2) -> Long.compare(o1.cost, o2.cost));
        queue.add(new Node(start, 0));
        while (!queue.isEmpty()) {
            Node src = queue.poll();
            if (flgs[src.id]) {
                continue;
            }

            flgs[src.id] = true;
            mins[src.id] = src.cost;

            Integer route[] = src.route.toArray(new Integer[0]);
            for (int i = 0; i < route.length - 1; i++) {
                int id1 = Math.min(route[i], route[i + 1]);
                int id2 = Math.max(route[i], route[i + 1]);
                usedMap.putIfAbsent(id1, new HashSet<>());
                usedMap.get(id1).add(id2);
            }

            for (int dst = 0; dst < n; dst++) {
                if (!flgs[dst] && map[src.id][dst] != 0) {
                    if (mins[dst] > mins[src.id] + map[src.id][dst]) {
                        Node next = new Node(dst, mins[src.id] + map[src.id][dst]);
                        next.route.addAll(src.route);
                        queue.add(next);
                    }
                }
            }
        }
    }

    private class Node {
        int id;
        long cost;
        List<Integer> route = new ArrayList<>();

        public Node(int id, long cost) {
            this.id = id;
            this.cost = cost;
            route.add(id);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
