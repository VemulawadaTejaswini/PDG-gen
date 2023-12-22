
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        Set<Integer>[] graph = new Set[N + 1];

        for (int i = 1 ; i <= N ; i++) {
            Set<Integer> g = new HashSet<>();
            g.add(i);
            graph[i] = g;
        }


        for (int i = 0 ; i < M ; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            Set<Integer> ga = graph[a];
            Set<Integer> gb = graph[b];
            ga.add(b);
            gb.add(a);
            graph[a] = ga;
            graph[b] = gb;
        }

        int count = 0;
        Set<Integer> base = graph[1];
        Set<Integer> extra = new HashSet<>();
        for (int a : base) {
            extra.addAll(graph[a]);
        }
        base.addAll(extra);

        for (int i = 2 ; i <= N ; i++) {
            if (!base.contains(i)) {
                count++;
                for (int b : graph[i]) {
                    base.addAll(graph[b]);
                }
            }
        }

        System.out.println(count);
    }

}
