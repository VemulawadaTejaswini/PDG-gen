import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        arc078_b solver = new arc078_b();
        solver.solve(1, in, out);
        out.close();
    }

    static class arc078_b {
        Node[] nodes;

        public void solve(int testNumber, Scanner s, PrintWriter out) {
            int N = s.nextInt();
            nodes = new Node[N];
            for (int i = 0; i < N; i++)
                nodes[i] = new Node();
            for (int i = 1; i < N; i++) {
                int x = s.nextInt() - 1, y = s.nextInt() - 1;
                nodes[x].adj.add(nodes[y]);
                nodes[y].adj.add(nodes[x]);
            }
            int black = 0, white = 0;
            ArrayList<Node> queue = new ArrayList<>();
            nodes[0].color = 1;
            queue.add(nodes[0]);
            nodes[N - 1].color = 2;
            queue.add(nodes[N - 1]);
            while (queue.size() > 0) {
                int k = queue.size();
                while (k-- > 0) {
                    Node cur = queue.remove(0);
                    for (Node n : cur.adj) {
                        if (n.color == 0) {
                            n.color = cur.color;
                            queue.add(n);
                        }
                    }
                }
            }
            for (Node n : nodes)
                if (n.color == 1) black++;
                else white++;
            out.println((black > white) ? "Fennec" : "Snuke");
        }

        private class Node {
            int color = 0;
            ArrayList<Node> adj = new ArrayList<Node>();

        }

    }
}

