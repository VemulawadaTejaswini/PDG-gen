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
        int[] x = new int[N];
        int[] y = new int[N];
        HashMap<Integer, List<Integer>> edges = new HashMap<>();
        for (int i = 0; i < N; i++) {
            x[i] = scan.nextInt();
            y[i] = scan.nextInt()+100005;
            if (!edges.containsKey(x[i])) {
                edges.put(x[i], new ArrayList<>());
            }
            if (!edges.containsKey(y[i])) {
                edges.put(y[i], new ArrayList<>());
            }
            edges.get(x[i]).add(y[i]);
            edges.get(y[i]).add(x[i]);
        }
        boolean[] visited = new boolean[100005 * 2];
        long count = 0;
        for (int i = 0; i < N; i++) {
            if (visited[x[i]]) {
                continue;
            }
            int[] cnt = new int[2];
            cnt[0] = 0;//x
            cnt[1] = 0;//y
            dfs(cnt, visited, edges, x[i]);
            count += cnt[0] * cnt[1];
        }
        System.out.println(count - N);
    }
    public void dfs(int[] cnt, boolean[] visited, HashMap<Integer, List<Integer>> edges, int x) {
        if (visited[x]) {
            return;
        }
        visited[x] = true;
        if (x < 100005) {
            cnt[0] += 1;
        } else {
            cnt[1] += 1;
        }
        for (int y : edges.get(x)) {
            dfs(cnt, visited, edges, y);
        }
    }
}
