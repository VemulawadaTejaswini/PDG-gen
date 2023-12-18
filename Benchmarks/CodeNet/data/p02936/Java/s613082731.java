import java.util.*;

public class Main {

    static void dfs(int at, int prev) {
        if (prev != -1)
            counter[at] += counter[prev];

        for (Integer e : graph.get(at)) {
            if(e == prev) continue;
            dfs(e, at);
        }
    }

    static int N;
    static int Q;
    static List<List<Integer>> graph;
    static long[] counter;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.next());
        Q = Integer.parseInt(sc.next());
        counter = new long[N];
        graph = new ArrayList<>();

        for (int i = 0; i < N; ++i) graph.add(new ArrayList<>());

        for (int i = 0; i < N-1; ++i) {
            int a = Integer.parseInt(sc.next()) - 1;
            int b = Integer.parseInt(sc.next()) - 1;
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        for (int i = 0; i < Q; ++i) {
            int id = Integer.parseInt(sc.next()) - 1;
            int x = Integer.parseInt(sc.next());
            counter[id] += x;
        }

        dfs(0, -1);

        for (int i = 0; i < N; ++i)
            System.out.print(counter[i] + " ");
        System.out.println();
    }
}