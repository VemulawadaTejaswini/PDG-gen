import java.util.*;

public class Main {

    static final int NONE = -1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        List<List<Integer>> out = new ArrayList<>();
        List<Set<Integer>> in = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            out.add(new ArrayList<>());
            in.add(new HashSet<>());
        }

        for (int i = 0; i < M; i++) {
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            out.get(u).add(v);
            in.get(v).add(u);
        }

        List<Integer> sol = null;

        for (int u = 0; u < N; u++) {
            List<Integer> cycle = shortestCycle(u, out, in.get(u));
            if (cycle != null && (sol == null || cycle.size() < sol.size())) {
                sol = cycle;
            }
        }

        if (sol == null) System.out.println(-1);
        else {
            System.out.println(sol.size());
            for (int u : sol) System.out.println(u + 1);
        }
    }


    static List<Integer> shortestCycle(int s, List<List<Integer>> adj, Set<Integer> in) {
        int[] pred = new int[adj.size()];
        Arrays.fill(pred, NONE);
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(s);

        while (!deque.isEmpty()) {
            int u = deque.pollLast();

            for (int v : adj.get(u)) {
                if (pred[v] != NONE) continue;
                if (in.contains(v)) {
                    List<Integer> cycle = new ArrayList<>();
                    while (pred[u] != NONE) {
                        cycle.add(u);
                        u = pred[u];
                    }
                    cycle.add(s);
                    cycle.add(v);
                    return cycle;
                }
                pred[v] = u;
                deque.addFirst(v);
            }
        }

        return null;
    }
}