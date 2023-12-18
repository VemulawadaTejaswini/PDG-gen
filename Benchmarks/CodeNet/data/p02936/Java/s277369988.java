import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static int                      N;
    static int                      Q;
    static List<ArrayList<Integer>> adj = new ArrayList<>();
    static boolean[]                visited;
    static long[]                   counter;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.next());
        Q = Integer.parseInt(sc.next());
        visited = new boolean[N];
        counter = new long[N];

        for (int i = 0; i < N; i++) {
            ArrayList<Integer> ab = new ArrayList<>();
            adj.add(ab);
        }

        for (int i = 0; i < N - 1; i++) {
            int a = Integer.parseInt(sc.next()) - 1;
            int b = Integer.parseInt(sc.next()) - 1;

            adj.get(a).add(b);
            adj.get(b).add(a);
        }

        for (int i = 0; i < Q; i++) {
            int p = Integer.parseInt(sc.next()) - 1;
            int x = Integer.parseInt(sc.next());
            counter[p] += x;
        }

        dfs(0, -1);

        StringBuilder sb = new StringBuilder();
        for (long count : counter) {
            sb.append(count).append(" ");
        }

        System.out.println(sb.toString());
    }

    public static void dfs(int at, int prev) {
        visited[at] = true;

        if (prev != -1) {
            counter[at] += counter[prev];
        }

        for (int next : adj.get(at)) {
            if (!visited[next]) {
                dfs(next, at);
            }
        }
    }
}
