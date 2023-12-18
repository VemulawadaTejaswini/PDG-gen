import java.util.*;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    // int N = scanner.nextInt();
    // scanner.nextLine();
    // int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    static void solve(Scanner scanner) {
        int N = scanner.nextInt(), M = scanner.nextInt();
        scanner.nextLine();
        List<List<Edge>> edgeList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            edgeList.add(new ArrayList<>());
            if (i > 0) {
                edgeList.get(i).add(new Edge(i - 1, 0));
            }
        }
        for (int i = 0; i < M; i++) {
            int[] e = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            edgeList.get(e[0] - 1).add(new Edge(e[1] - 1, e[2]));
        }

        Queue<Edge> q = new PriorityQueue<>(Comparator.comparingLong(x -> x.cost));
        q.add(new Edge(0, 0));
        long dist[] = new long[N];
        Arrays.fill(dist, Long.MAX_VALUE / 2);
        while (!q.isEmpty()) {
            Edge e = q.poll();
            if (dist[e.to] <= e.cost) {
                continue;
            }
            dist[e.to] = e.cost;
            for (Edge ne: edgeList.get(e.to)) {
                q.add(new Edge(ne.to, e.cost + ne.cost));
            }
        }
        System.out.println(dist[N - 1] == Long.MIN_VALUE / 2 ? -1 : dist[N - 1]);
    }

    static class Edge {
        int to;
        long cost;

        public Edge(int to, long cost) {
            this.to = to;
            this.cost = cost;
        }
    }
}