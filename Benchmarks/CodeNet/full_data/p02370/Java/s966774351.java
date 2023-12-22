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

    private static void topologicalSort(int[][] g, int n) {
        Queue<Integer> q = new ArrayDeque<>();
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int d = getIndegree(g, i);

            if (d == 0)
                q.add(i);

            m.put(i, d);
        }

        while (!q.isEmpty()) {
            int v = q.remove();
            out.println(v);

            for (int i = 0; i < n; i++) {
                if (g[v][i] == 1) {
                    int d = m.get(i)-1;

                    if (d == 0)
                        q.add(i);

                    m.replace(i, d);
                }
            }
        }

        out.println();
    }
}