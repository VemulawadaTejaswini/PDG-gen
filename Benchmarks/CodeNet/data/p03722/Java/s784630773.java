import java.math.BigDecimal;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Consumer<List<String>> consumer = solve();

    public static void main(String[] args) {
        consumer.accept(readInput());
    }

    private static List<String> readInput() {
        final List<String> lineList = new ArrayList<>();
        while (scanner.hasNextLine()) {
            lineList.add(scanner.nextLine());
        }
        return lineList;
    }

    static Consumer<List<String>> solve() {
        return args -> {
            int N = Integer.parseInt(args.get(0).split(" ")[0]);
            long[] dist = new long[N];
            Arrays.fill(dist, Long.MAX_VALUE / 2);

            List<Edge> edges = new ArrayList<>();
            for (int i = 1; i < args.size(); i++) {
                int[] edge = Arrays.stream(args.get(i).split(" ")).mapToInt(Integer::parseInt).toArray();
                int from = edge[0] - 1, to = edge[1] - 1, cost = -edge[2];
                edges.add(new Edge(from, to, cost));
            }

            dist[0] = 0;
            for (int i = 0; i <= N; i++) {
                boolean update = false;
                for (Edge e: edges) {
                    if (dist[e.to] > dist[e.from] + e.cost) {
                        dist[e.to] = dist[e.from] + e.cost;
                        update = true;
                    }
                }
                if (i == N && update) {
                    System.out.println("inf");
                    return;
                }
            }

            System.out.println(-dist[N - 1]);
        };
    }

    static class Edge {
        int from;
        int to;
        int cost;

        public Edge(int from, int to, int cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }
    }
}