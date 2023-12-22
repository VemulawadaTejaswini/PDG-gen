import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

class Edge {
    int from, to;

    Edge(int from, int to) {
        this.from = from;
        this.to = to;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>(N + 1);
        for (int i = 0; i <= N; i++) graph.add(new ArrayList<>());
        for (int i = 0; i < M; i++) {
            int A = scan.nextInt(), B = scan.nextInt();
            graph.get(A).add(B);
            graph.get(B).add(A);
        }

        Queue<Edge> explore = new ArrayDeque<>();
        explore.add(new Edge(0, 1));
        ArrayList<Integer> ans = new ArrayList<>(N + 1);
        for (int i = 0; i <= N; i++) ans.add(-1);

        while (!explore.isEmpty()) {
            Edge now = explore.poll();
            if (ans.get(now.to) != -1) continue;
            ans.set(now.to, now.from);

            for (Integer next : graph.get(now.to)) {
                if (ans.get(next) != -1) continue;
                explore.add(new Edge(now.to, next));
            }
        }

        System.out.println("Yes");
        for (int i = 2; i <= N; i++) {
            System.out.println(ans.get(i));
        }
    }
}
