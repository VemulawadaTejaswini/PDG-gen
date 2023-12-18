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
            int M = Integer.parseInt(args.get(0).split(" ")[1]);
            int[][] dist = new int[N][N];
            int[][] fromList = new int[N][N];

            for (int i = 0; i < N; i++) {
                Arrays.fill(dist[i], Integer.MAX_VALUE / 2);
            }
            for (int i = 0; i < N; i++) {
                dist[i][i] = 0;
            }

            for (String l: args.stream().skip(1).collect(Collectors.toList())) {
                int[] edge = Arrays.stream(l.split(" ")).mapToInt(Integer::parseInt).toArray();
                int from = edge[0] - 1, to = edge[1] - 1, cost = edge[2];
                dist[from][to] = cost;
                dist[to][from] = cost;
                fromList[from][to] = from;
                fromList[to][from] = to;
            }

            for (int f = 0; f < N; f++) {
                for (int t = 0; t < N; t++) {
                    for (int m = 0; m < N; m++) {
                        if (dist[f][t] > dist[f][m] + dist[m][t]) {
                            dist[f][t] = dist[f][m] + dist[m][t];
                            fromList[f][t] = m;
                        }
                    }
                }
            }

            Set<String> edgeSet = new HashSet<>();
            for (int f = 0; f < N; f++) {
                for (int t = 0; t < N; t++) {
                    int curr = t;
                    while (curr != f) {
                        int prev = fromList[f][curr];
                        edgeSet.add(String.format("%d:%d", Math.min(curr, prev), Math.max(curr, prev)));
                        curr = prev;
                    }
                }
            }

            System.out.println(M - edgeSet.size());
        };
    }
}