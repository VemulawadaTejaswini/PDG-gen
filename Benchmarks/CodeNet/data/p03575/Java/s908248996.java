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
        HashMap<Integer, List<Integer>> edges = new HashMap<>();
        int[] A = new int[M];
        int[] B = new int[M];
        for (int i = 0; i < M; i++) {
            int a = scan.nextInt()-1;
            int b = scan.nextInt()-1;
            A[i] = a;
            B[i] = b;
            if (!edges.containsKey(a)) {
                edges.put(a, new ArrayList<>());
            }
            if (!edges.containsKey(b)) {
                edges.put(b, new ArrayList<>());
            }
            edges.get(a).add(b);
            edges.get(b).add(a);
        }
        int answer = 0;
        for(int i = 0; i < M; i++) {
            boolean[] visited = new boolean[N];
            int a = A[i];
            int b = B[i];
            dfs(N, edges, visited, a, a, b);
            for (int j = 0; j < N; j++) {
                if (!visited[j]) {
                    answer += 1;
                    break;
                }
            }
        }
        System.out.println(answer);
    }
    private void dfs(int N, HashMap<Integer, List<Integer>> edges, boolean[] visited, int current, int a, int b) {
        if (visited[current]) {
            return;
        }
        visited[current] = true;
        for (int i : edges.get(current)) {
            if (current == a && i == b) {
                continue;
            }
            if (current == b && i == a) {
                continue;
            }
            if (visited[i]) {
                continue;
            }
            dfs(N, edges, visited, i, a, b);
        }
    }
}
