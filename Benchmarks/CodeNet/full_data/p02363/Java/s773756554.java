import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static void solve(Scanner scanner) {
        int V = scanner.nextInt();
        int E = scanner.nextInt();
        scanner.nextLine();

        WarshallFroyd warshallFroyd = new WarshallFroyd(V);
        for (int i = 0; i < E; i++) {
            int[] e = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            warshallFroyd.addEdge(e[0], e[1], e[2]);
        }
        warshallFroyd.run();
        for (int i = 0; i < V; i++) {
            if (warshallFroyd.dist[i][i] < 0) {
                System.out.println("NEGATIVE CYCLE");
                return;
            }
        }
        for (int i = 0; i < V; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < V; j++) {
                if (warshallFroyd.dist[i][j] == Long.MAX_VALUE / 2)
                    sb.append("INF");
                else
                    sb.append(warshallFroyd.dist[i][j]);
                sb.append(' ');
            }
            System.out.println(sb.toString().trim());
            sb = new StringBuilder();
        }
    }


}

class WarshallFroyd {

    private int size;
    public long[][] dist;
    public long[][] from;

    public WarshallFroyd(int size) {
        this.size = size;
        dist = new long[size][size];
        for (int i = 0; i < size; i++) {
            Arrays.fill(dist[i], Long.MAX_VALUE / 2);
            dist[i][i] = 0;
        }
        from = new long[size][size];
        for (long[] arr : from) {
            Arrays.fill(arr, -1);
        }
    }

    public void addEdge(int from, int to, int cost) {
        dist[from][to] = cost;
    }

    public void run() {
        for (int via = 0; via < size; via++) {
            for (int fr = 0; fr < size; fr++) {
                for (int to = 0; to < size; to++) {
                    if (dist[fr][via] != Long.MAX_VALUE / 2
                            && dist[via][to] != Long.MAX_VALUE / 2
                            && dist[fr][to] > dist[fr][via] + dist[via][to]) {
                        dist[fr][to] = dist[fr][via] + dist[via][to];
                        from[fr][to] = via;
                    }
                }
            }
        }
    }
}


class Edge {
    public final int from;
    public final int to;
    public final int cost;

    public Edge(int from, int to, int cost) {
        this.from = from;
        this.to = to;
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edge edge = (Edge) o;
        return from == edge.from &&
                to == edge.to &&
                cost == edge.cost;
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to, cost);
    }
}

