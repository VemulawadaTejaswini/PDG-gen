import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.List;
import java.util.Collection;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author bcools
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            TaskD.Vertex[] vs = new TaskD.Vertex[n + 1];
            for (int i = 0; i < n - 1; ++i) {
                int a = in.nextInt();
                TaskD.Vertex va = (vs[a] == null) ? new TaskD.Vertex() : vs[a];
                va.index = a;
                int b = in.nextInt();
                TaskD.Vertex vb = (vs[b] == null) ? new TaskD.Vertex() : vs[b];
                vb.index = b;
                va.adj.add(vb);
                vb.adj.add(va);
                vs[a] = va;
                vs[b] = vb;
            }
            vs[1].visited = true;
            vs[1].bDist = 0;
            vs[1].isBlack = true;
            vs[n].visited = true;
            vs[n].wDist = 0;
            vs[n].isBlack = false;

            Queue<TaskD.Vertex> q = new LinkedList<>();
            q.add(vs[1]);
            q.add(vs[n]);
            int blackScore = 1;
            int whiteScore = 1;
            int checker = 0;
            while (!q.isEmpty()) {
                checker++;
                TaskD.Vertex v = q.remove();
                if ((v.isBlack && v.bDist > v.wDist) || (!v.isBlack && v.wDist > v.bDist))
                    continue;
                for (TaskD.Vertex a : v.adj) {
                    if (a.visited) continue;
                    a.visited = true;
                    a.isBlack = v.isBlack;
                    if (a.isBlack) blackScore++;
                    else whiteScore++;
                    q.add(a);
                }
            }
            System.err.println(checker);
            if (whiteScore >= blackScore) out.println("Snuke");
            else out.println("Fennec");
        }

        static class Vertex {
            int index;
            List<TaskD.Vertex> adj = new ArrayList<>();
            boolean visited = false;
            boolean isBlack = false;
            int bDist = Integer.MAX_VALUE;
            int wDist = Integer.MAX_VALUE;

        }

    }
}

