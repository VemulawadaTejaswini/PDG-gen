import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    static class Pair {
        int left;
        int right;
        Pair(int l, int r) {
            left = l;
            right = r;
        }
    }

    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int q = std.nextInt();
        int[] costs = new int[n];

        List<List<Integer>> edgeTo = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            edgeTo.add(new ArrayList<>());
        }

        for (int i = 0; i < n - 1; i++) {
            int a = std.nextInt() - 1;
            int b = std.nextInt() - 1;
            edgeTo.get(a).add(b);
        }

        for (int i = 0; i < q; i++) {
            int v = std.nextInt() - 1;
            costs[v] = costs[v] + std.nextInt();
        }

        Deque<Pair> deque = new ArrayDeque<>();
        deque.add(new Pair(0, 0));

        int[] totalCosts = new int[n];
        boolean[] visited = new boolean[n];

        while (!deque.isEmpty()) {
            Pair p = deque.pollFirst();
            int v = p.left;
            int cost = p.right + costs[v];
            totalCosts[v] = cost;
            if (visited[v]) {
                continue;
            }

            visited[v] = true;
            for (int nv : edgeTo.get(v)) {
                deque.add(new Pair(nv, cost));
            }
        }

        String ans = Arrays.stream(totalCosts).mapToObj(String::valueOf).collect(Collectors.joining(" "));
        System.out.println(ans);
    }
}
