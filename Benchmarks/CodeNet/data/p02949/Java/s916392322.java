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

        int data[] = new int[N];
        Arrays.fill(data, 1, N, Integer.MAX_VALUE);

        boolean updatedN = false;
        for (int i = 0; i < M; i++) {
            //out.println(Arrays.toString(data));
            int tmp[] = Arrays.copyOf(data, N);

            for (Edge edge : G) {
                if (data[edge.from] != Integer.MAX_VALUE) {
                    tmp[edge.to] = Math.min(tmp[edge.to], tmp[edge.from] + edge.cost);
                }
            }

            updatedN = data[N - 1] != tmp[N - 1];
            data = tmp;
        }

        if (updatedN) {
            out.println(-1);
        } else {
            out.println(Math.max(-data[N - 1], 0));
        }
    }
}
