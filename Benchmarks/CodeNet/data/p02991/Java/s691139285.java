
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {

    public static void solve(int n, int[] steps, int[] visited1, int [] visited2, int[] visited3, int s, int t, Map<Integer, Set<Integer>> graph ) {
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        queue.add(s);
        int step = 1;
        visited1[s] = 1;
        while (!queue.isEmpty()) {
            int current = queue.poll();
           // System.out.println("current: " + current);

            Set<Integer> next1s = graph.getOrDefault(current, new HashSet<>());
            Set<Integer> canNext1s = new HashSet<>();
            for (Integer next1 : next1s) {
                if (visited2[next1] == 0) {
                    canNext1s.add(next1);
                    visited2[next1] = 1;
                }
            }
            Set<Integer> canNext2s = new HashSet<>();
            for (Integer next2 : canNext1s) {
                Set<Integer> next3s = graph.getOrDefault(next2, new HashSet<>());
                for (Integer next3 : next3s) {
                    if (visited3[next3] == 0) {
                        canNext2s.add(next3);
                        visited3[next3] = 1;
                    }
                }
            }
            for (Integer next3: canNext2s) {
                Set<Integer> next4s = graph.getOrDefault(next3, new HashSet<>());
                for (Integer next4 : next4s) {
                    if (visited1[next4] == 0) {
                        visited1[next4] = 1;
                        queue.add(next4);
                        steps[next4] = step;
                    }
                }
            }
            ++step;


        }


    }
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        for (int i = 1; i <= m; ++i) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            Set<Integer> next = graph.getOrDefault(u, new HashSet<>());
            next.add(v);
            graph.put(u, next);
        }
        int s = scanner.nextInt();
        int t = scanner.nextInt();
        int [] visited1 = new int[n + 1];
        int [] visited2 = new int[n + 1];
        int [] visited3 = new int[n + 1];
        int[] steps = new int[n + 1];
        solve(n, steps, visited1, visited2, visited3, s, t, graph);
        if (steps[t] > 0) {
            System.out.println(steps[t]);
        } else {
            System.out.println(-1);
        }
    }

}
