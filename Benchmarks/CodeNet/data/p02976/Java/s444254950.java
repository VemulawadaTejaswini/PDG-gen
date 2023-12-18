import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (m % 2 == 1) {
            System.out.println(-1);
            return;
        }
        TreeSet<Integer>[] graph = new TreeSet[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new TreeSet<Integer>();
        }
        
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a].add(b);
            graph[b].add(a);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (graph[i].size() % 2 != 0) {
                graph[i].pollLast();
            }
            for (int x : graph[i]) {
                sb.append(i).append(" ").append(x).append("\n");
                if (x > i) {
                    graph[x].remove(i);
                }
            }
        }
        System.out.print(sb);
    }
}
