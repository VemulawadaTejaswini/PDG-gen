import java.util.*;

public class Main {

    int[] visited;
    List<Integer>[] lists;
    PriorityQueue<Integer> q;
    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        lists = new ArrayList[n];
        visited = new int[n];
        q = new PriorityQueue<>((a, b) -> b - a);

        for (int i = 0; i < n; i++) {
            lists[i] = new ArrayList<>();
        }

        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            lists[a].add(b);
            lists[b].add(a);
        }

        for (int i = 0; i < n; i++) {
            q.add(sc.nextInt());
        }

        visited[0] = q.remove();
        dfs(0);

        long sum = 0;
        for (int i = 1; i < n; i++) {
            sum += visited[i];
        }
        System.out.println(sum);


        StringBuffer sb = new StringBuffer();
        for (int i : visited) {
            sb.append(i);
            sb.append(' ');
        }
        System.out.println(sb.substring(0, sb.length() - 1));
    }

    void dfs(int current) {
        for (int next: lists[current]) {
            if (visited[next] == 0) {
                visited[next] = q.remove();
                dfs(next);
            }
        }
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
