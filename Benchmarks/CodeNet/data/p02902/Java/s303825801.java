import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    private static Graph g;

    private static int[] color;
    private static LinkedList<Integer> q = new LinkedList<>();

    static void dfs(int v) {
        color[v] = 1;
        q.addLast(v);

        for (int u: g.nodes.get(v).neighbours) {
            if (color[u] == 1) {
                System.out.println(q.size());
                for (int x: q) {
                    System.out.println(x + 1);
                }
                System.exit(0);
            } else if (color[u] == 0) {
                dfs(u);
            }
        }

        q.removeLast()  ;
        color[v] = 2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        g = new Graph(n);
        for (int i = 0; i < m; ++i) {
            int u = in.nextInt() - 1, v = in.nextInt() - 1;
            g.nodes.get(u).neighbours.add(v);
        }

        color = new int[n];
        for (int i = 0; i < n; ++i) {
            if (color[i] == 0) {
                dfs(i);
            }
        }
    }

    static class Graph {
        ArrayList<Node> nodes = new ArrayList<>();

        Graph(int n) {
            for (int i = 0; i < n; ++i) {
                nodes.add(new Node());
            }
        }
    }

    static class Node {
        ArrayList<Integer> neighbours = new ArrayList<>();
    }
}
