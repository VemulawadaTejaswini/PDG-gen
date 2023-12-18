import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();

            @SuppressWarnings("unchecked")
            List<Edge>[] edges = new List[N];
            for (int i = 0; i < N; i++) {
                edges[i] = new ArrayList<>();
            }

            for (int i = 0; i < N - 1; i++) {
                int a = sc.nextInt() - 1;
                int b = sc.nextInt() - 1;

                edges[a].add(new Edge(i, b));
                edges[b].add(new Edge(i, a));
            }

            int[] colors = new int[N - 1];
            dfs(0, -1, -1, colors, edges);

            int K = Arrays.stream(colors).max().getAsInt();

            StringBuilder ans = new StringBuilder();
            ans.append(K).append("\n");
            for (int c : colors) {
                ans.append(c).append("\n");
            }

            System.out.print(ans.toString());
        }
    }

    public static void dfs(int v, int pv, int pc, int[] colors, List<Edge>[] edges) {
        int c = 1;
        for (Edge e : edges[v]) {
            if (e.to == pv) {
                continue;
            }

            if (c == pc) {
                c++;
            }

            colors[e.index] = c;

            dfs(e.to, v, c, colors, edges);

            c++;
        }
    }

    public static class Edge {

        int index;

        int to;

        public Edge(int index, int to) {
            this.index = index;
            this.to = to;
        }

    }

}
