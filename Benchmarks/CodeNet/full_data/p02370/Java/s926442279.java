import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Queue;
import java.util.ArrayDeque;

import static java.lang.System.out;

public class Main {
    static class Vertex {
        int v;
        Set<Integer> vs;

        public Vertex(int v) {
            this.v = v;
            this.vs = new HashSet<>();
        }
    }

    public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
    
            Vertex[] g = new Vertex[n];
            for (int i = 0; i < n; i++)
                g[i] = new Vertex(i);

            int m = in.nextInt();
            for (int i = 0; i < m; i++) {
                int f = in.nextInt();
                int t = in.nextInt();

                g[f].vs.add(t);
            }

            topologicalSort(g, n);
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

    private static int getIndegree(Vertex[] g, int v) {
        int c = 0;
        for (int i = 0; i < g.length; i++) {
            if (g[i].vs.contains(v))
                c++;
        }

        return c;
    }

    private static List<Integer> getAdjacentVertices(Vertex[] g, int v) {
        List<Integer> vs = new ArrayList<>(g[v].vs);
        vs.sort((x, y) -> Integer.compare(x, y));

        return vs;
    }

    private static void topologicalSort(Vertex[] g, int n) {
        Queue<Integer> q = new ArrayDeque<>();
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int d = getIndegree(g, i);

            if (d == 0)
                q.add(i);

            m.put(i, d);
        }

        List<Integer> vs = new ArrayList<>();
        while (!q.isEmpty()) {
            int v = q.remove();
            out.println(v);

            for (int vv : getAdjacentVertices(g, v)) {
                int d = m.get(vv)-1;

                if (d == 0)
                    q.add(vv);

                m.replace(vv, d);
            }
        }

        out.println();
    }
}