import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int M = scan.nextInt();
        boolean[] done = new boolean[N];
        HashMap<Integer, List<Integer>> edges = new HashMap<>();
        for (int i = 0; i < M; i++) {
            int a = scan.nextInt()-1;
            int b = scan.nextInt()-1;
            if (!edges.containsKey(a)) {
                edges.put(a, new ArrayList<Integer>());
            }
            if (!edges.containsKey(b)) {
                edges.put(b, new ArrayList<Integer>());
            }
            edges.get(a).add(b);
            edges.get(b).add(a);
        }
        int answer = dfs(0, done, edges);
        System.out.println(answer);
    }
    public int dfs(int current, boolean[] done, HashMap<Integer, List<Integer>> edges) {
        if (done[current]) {
            return 0;
        }
        done[current] = true;
        boolean all_visited = true;
        for (int i = 0; i < done.length; i++) {
            if (!done[i]) {
                all_visited = false;
                break;
            }
        }
        if (all_visited) {
            return 1;
        }
        List<Integer> neighbors = edges.get(current);
        int answer = 0;
        for (int next : neighbors) {
            if (done[next]) {
                continue;
            }
            answer += dfs(next, done, edges);
            done[next] = false;
        }
        return answer;
    }
}
