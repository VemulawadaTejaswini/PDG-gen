
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
        HashMap<Integer, List<Integer>> graph = new HashMap<Integer, List<Integer>>();
        for (int i = 0; i < M; i++) {
            int f = scan.nextInt()-1;
            int t = scan.nextInt()-1;
            if(!graph.containsKey(f)) {
                graph.put(f, new ArrayList<>());
            }
            graph.get(f).add(t+1000000);
            if(!graph.containsKey(f+1000000)) {
                graph.put(f+1000000, new ArrayList<>());
            }
            graph.get(f+1000000).add(t+2000000);
            if(!graph.containsKey(f+2000000)) {
                graph.put(f+2000000, new ArrayList<>());
            }
            graph.get(f+2000000).add(t);
        }
        int S = scan.nextInt() - 1;
        int T = scan.nextInt() - 1;
        int[][] d_S = dijkstra(graph, N, S);
        if (d_S[T][0] == 100000000) {
            System.out.println(-1);
        } else {
            System.out.println(d_S[T][0]/3);
        }
    }
    public int[][] dijkstra(HashMap<Integer, List<Integer>> graph, int N, int S) {
        int[][] d = new int[N][3];
        boolean[][] used = new boolean[N][3];
        for (int i = 0; i < N; i++) {
            Arrays.fill(d[i], 100000000);
            Arrays.fill(used[i], false);
        }
        d[S][0] = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(S);
        while(!q.isEmpty()) {
            int p = q.poll();
            int x = p % 1000000;
            int y = p / 1000000;
            if (used[x][y]) {
                continue;
            }
            used[x][y] = true;
            List<Integer> nexts = graph.get(p);
            if (nexts == null) {
                continue;
            }
            for (int n : nexts) {
                int nx = n % 1000000;
                int ny = n / 1000000;
                d[nx][ny] = Math.min(d[nx][ny], d[x][y] + 1);
                q.add(n);
            }
        }
        return d;
    }
}
