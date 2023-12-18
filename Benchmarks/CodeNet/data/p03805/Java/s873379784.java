import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static int count;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        List<List<Integer>> g = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            g.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            g.get(a - 1).add(b - 1);
            g.get(b - 1).add(a - 1);
        }

        dfs(0, new boolean[n], g);

        System.out.println(count);
    }

    private static void dfs(int num, boolean[] visited, List<List<Integer>> graph) {
        visited[num] = true;
        boolean done = true;
        for (int i = 0; i < graph.size(); i++) {
            if (visited[i] == false) {
                done = false;
                break;
            }
        }
        if (done) {
            count++;
            return;
        }

        List<Integer> l = graph.get(num);
        for (Integer i : l) {
            if (visited[i]) {
                continue;
            }
            dfs(i, visited, graph);
            visited[i] = false;
        }
    }
}
