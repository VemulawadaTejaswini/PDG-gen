import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    static ArrayList<LinkedList<TupleInt>> graph;
    static int n;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new LinkedList<TupleInt>());
        }
        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            graph.get(a).add(new TupleInt(b, c));
            graph.get(b).add(new TupleInt(a, c));
        }
        int q = sc.nextInt();
        int k = sc.nextInt();
        // distances from k
        long[] distances = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            distances[i] = dfs(k, i);
        }
        for (int i = 0; i < q; i++) {
            long dkx = distances[sc.nextInt()];
            long dky = distances[sc.nextInt()];
            System.out.println(dkx + dky);
        }
    }

    // distance from a to b
    static long dfs(int a, int b) {
        boolean[] visited = new boolean[n + 1];
        Stack<TupleLong> stack = new Stack<>();
        visited[a] = true;
        stack.push(new TupleLong(a, 0));
        while(!stack.isEmpty()) {
            TupleLong t = stack.pop();
            LinkedList<TupleInt> edges = graph.get(t.x);
            for (TupleInt edge : edges) {
                if (edge.x == b) return t.y + edge.y;
                if (!visited[edge.x]) {
                    visited[edge.x] = true;
                    stack.push(new TupleLong(edge.x, t.y + edge.y));
                }
            }
        }
        return -1;
    }

    static class TupleInt {
        final int x;
        final int y;
        TupleInt(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static class TupleLong {
        final int x;
        final long y;
        TupleLong(int x, long y) {
            this.x = x;
            this.y = y;
        }
    }
}
