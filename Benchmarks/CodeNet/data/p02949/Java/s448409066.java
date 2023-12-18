import java.io.*;
import java.util.*;

public class Main {
    public static final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static final PrintStream out = System.out;

    static class Edge {
        int from, to, cost;

        public Edge(int from, int to, int cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }
    }

    public static void main(String[] args) {
        int N = in.nextInt();
        int M = in.nextInt();
        int P = in.nextInt();

        List<Edge> G = new ArrayList<>(M);

        for (int i = 0; i < M; i++) {
            int A = in.nextInt();
            int B = in.nextInt();
            int C = in.nextInt();

            G.add(new Edge(A - 1, B - 1, -C + P));
        }

        long[] data = new long[N];
        Arrays.fill(data, 1, N, Long.MAX_VALUE);

        boolean updatedN = false;
        for (int i = 0; i < N + 1; i++) {
            // out.println(Arrays.toString(data));
            updatedN = false;

            for (Edge edge : G) {
                if (data[edge.from] != Long.MAX_VALUE
                        && data[edge.from] + edge.cost < data[edge.to]) {
                    data[edge.to] = data[edge.from] + edge.cost;
                    updatedN |= edge.to == N - 1;
                }
            }
        }

        if (updatedN) {
            out.println(-1);
        } else {
            out.println(Math.max(-data[N - 1], 0L));
        }
    }
}
