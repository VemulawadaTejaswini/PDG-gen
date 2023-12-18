import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (InputReader in = new InputReader(); PrintWriter out = new PrintWriter(System.out)) {
            new Main().solve(in, out);
            out.flush();
        }
    }

    private void solve(InputReader in, PrintWriter out) {
        int n = in.nextInt();
        List<List<Node>> edgeList = new ArrayList<List<Node>>();
        for (int i = 0; i < n; i++) {
            edgeList.add(new ArrayList<>());
        }

        for (int i = 0; i < n - 1; i++) {
            int u = in.nextInt() - 1;
            int v = in.nextInt() - 1;
            int w = in.nextInt();

            Node node = new Node();
            node.to = v;
            node.cost = w;
            edgeList.get(u).add(node);

            node = new Node();
            node.to = u;
            node.cost = w;
            edgeList.get(v).add(node);
        }

        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = -1;
        }

        Queue<Integer> nodeQueue = new ArrayDeque<>();
        nodeQueue.add(0);
        ans[0] = 0;
        while (!nodeQueue.isEmpty()) {
            int index = nodeQueue.poll();
            for (Node toNode : edgeList.get(index)) {
                if (ans[toNode.to] != -1) {
                    continue;
                }

                ans[toNode.to] = (ans[index] + toNode.cost) % 2;
                nodeQueue.add(toNode.to);
            }
        }

        for (int i : ans) {
            out.println(i);
        }
    }
}

class Node {
    int to;
    int cost;
}

class InputReader implements AutoCloseable {
    private final Scanner sc = new Scanner(System.in);

    String next() {
        return this.sc.next();
    }

    int nextInt() {
        return Integer.parseInt(this.sc.next());
    }

    long nextLong() {
        return Long.parseLong(this.sc.next());
    }

    double nextDouble() {
        return Double.parseDouble(this.sc.next());

    }

    @Override
    public void close() {
        this.sc.close();
    }
}
