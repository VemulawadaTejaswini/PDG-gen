import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }

    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int M = scan.nextInt();
        // 0 min_distance
        // 1 min_from
        int[][] ans = new int[N][2];
        for (int i = 0; i < N; i++) {
            Arrays.fill(ans[i], Integer.MAX_VALUE);
        }
        ans[0][0] = 0;
        ans[0][1] = -1;
        List<Integer>[] edges = new List[N];
        for (int i = 0; i < N; i++) {
            edges[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            int from = scan.nextInt()-1;
            int to = scan.nextInt()-1;
            edges[from].add(to);
            edges[to].add(from);
        }
        Deque<Edge> queue = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        for (int to : edges[0]) {
            queue.add(new Edge(0, to));
            visited.add(0);
        }
        while(!queue.isEmpty()) {
            Edge target = queue.poll();
            int target_to = target.to;
            int target_from = target.from;
            visited.add(target_to);
            if (ans[target_to][0] != Integer.MAX_VALUE && ans[target_to][0] < ans[target_from][0] + 1) {
                continue;
            }
            ans[target_to][0] = ans[target_from][0] + 1;
            ans[target_to][1] = target_from;
            for (int to : edges[target_to]) {
                if (visited.contains(to)) {
                    continue;
                }
                queue.add(new Edge(target_to, to));
            }
        }
        System.out.println("Yes");
        for (int i = 1; i < N; i++) {
            System.out.println(ans[i][1]+1);
        }
    }
    private long key(int from, int to) {
        int min = Math.min(from, to);
        int max = Math.min(from, to);
        return min * 1000000 + max;
    }
    class Edge {
        int from;
        int to;
        Edge(int from, int to) {
            this.from = from;
            this.to = to;
        }
    }
}
