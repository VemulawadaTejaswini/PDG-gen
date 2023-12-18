import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
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
        EvenRelation solver = new EvenRelation();
        solver.solve(1, in, out);
        out.close();
    }

    static class EvenRelation {
        int[] result;
        List<List<Node>> list;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();

            list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(new ArrayList<>());
            }

            for (int i = 1; i < n; i++) {
                int u = in.nextInt() - 1;
                int v = in.nextInt() - 1;
                int w = in.nextInt();
                list.get(u).add(new Node(v, w));
                list.get(v).add(new Node(u, w));
            }
            result = new int[n];
            for (int i = 0; i < n; i++) {
                if (result[i] == 0) {
                    dfs(i, 1);
                }
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                if (result[i] == 1) {
                    sb.append("1\n");
                } else {
                    sb.append("0\n");
                }
            }
            out.println(sb.toString());
        }

        public void dfs(int v, int c) {
            result[v] = c;
            for (Node n : list.get(v)) {
                if (result[n.dist] == 0) {
                    if (n.weight % 2 == 1) {
                        dfs(n.dist, -c);
                    } else {
                        dfs(n.dist, c);
                    }
                }
            }
        }

        class Node {
            public final Integer dist;
            public final Integer weight;

            Node(Integer dist, Integer weight) {
                this.dist = dist;
                this.weight = weight;
            }

        }

    }
}

