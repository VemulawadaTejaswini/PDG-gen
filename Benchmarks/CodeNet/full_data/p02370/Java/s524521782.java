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
    public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            int[][] g = new int[n][n];
    
            int m = in.nextInt();
            for (int i = 0; i < m; i++) {
                int f = in.nextInt();
                int t = in.nextInt();

                g[f][t] = 1;
            }

            topologicalSort(g, n);
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

    private static int getIndegree(int[][] g, int v) {
        int c = 0;
        for (int i = 0; i < g.length; i++) {
            if (g[i][v] == 1)
                c++;
        }

        return c;
    }

    private static List<Integer> getAdjacentVertices(int[][] g, int v) {
        List<Integer> vs = new ArrayList<>();
        for (int i = 0; i < g[0].length; i++) {
            if (g[v][i] == 1)
                vs.add(i);
        }

        vs.sort((x, y) -> Integer.compare(x, y));

        return vs;
    }

    private static void topologicalSort(int[][] g, int n) {
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