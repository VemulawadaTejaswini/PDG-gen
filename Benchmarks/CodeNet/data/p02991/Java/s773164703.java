import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Collection;
import java.util.Scanner;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Eric
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EHopscotchAddict solver = new EHopscotchAddict();
        solver.solve(1, in, out);
        out.close();
    }

    static class EHopscotchAddict {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            EHopscotchAddict.Vertex[] vertices = new EHopscotchAddict.Vertex[n];
            for (int i = 0; i < n; i++) {
                vertices[i] = new EHopscotchAddict.Vertex();
            }
            for (int i = 0; i < m; i++) {
                vertices[in.nextInt() - 1].next.add(vertices[in.nextInt() - 1]);
            }
            EHopscotchAddict.Vertex s = vertices[in.nextInt() - 1];
            EHopscotchAddict.Vertex t = vertices[in.nextInt() - 1];
            Queue<EHopscotchAddict.Vertex> queue = new ArrayDeque<>();
            queue.add(s);
            s.isAdded = true;
            boolean found = false;
            int nbSteps = -1;
            while (!queue.isEmpty()) {
                EHopscotchAddict.Vertex current = queue.poll();
                for (EHopscotchAddict.Vertex vertex : current.next) {
                    for (EHopscotchAddict.Vertex vertex2 : vertex.next) {
                        for (EHopscotchAddict.Vertex vertex3 : vertex2.next) {
                            if (vertex3.isAdded)
                                continue;
                            vertex3.nbSteps = current.nbSteps + 1;
                            vertex3.isAdded = true;
                            queue.add(vertex3);
                            if (vertex3 == t) {
                                nbSteps = vertex3.nbSteps;
                                found = true;
                                break;
                            }
                        }
                    }
                }
                if (found)
                    break;
            }
            out.println(nbSteps);
        }

        public static class Vertex {
            List<EHopscotchAddict.Vertex> next = new ArrayList<>();
            boolean isAdded;
            int nbSteps;

        }

    }
}

