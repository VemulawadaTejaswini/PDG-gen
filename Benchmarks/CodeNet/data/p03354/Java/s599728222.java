import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), m = sc.nextInt();
        int p[] = new int[n + 1];
        boolean neighbors[][] = new boolean[n + 1][n + 1];
        BFS.Vertex[] g = new BFS.Vertex[n + 1];
        for (int i = 1; i < n + 1; i++) {
            p[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            neighbors[a][b] = true;
            neighbors[b][a] = true;
        }
        for (int i = 1; i < n + 1; i++) {
            g[i] = new BFS.Vertex(i, neighbors[i]);
        }

        int count = 0;
        for (int i = 1; i < n + 1; i++) {
            BFS.clear(g);
            if (BFS.hasPath(g, i, p[i])) {
                count++;
            }
        }
        System.out.println(count);
    }
}

class BFS {

    static boolean hasPath(Vertex[] g, int start, int end) {
        Queue<Vertex> stack = new ArrayDeque<>();
        g[start].visited = true;
        stack.add(g[start]);
        while (!stack.isEmpty()) {
            Vertex p = stack.poll();
            if (p.id == g[end].id) {
                return true;
            }
            for (int i = 1; i < p.neighbors.length; i++) {
                if (p.neighbors[i] && !g[i].visited) {
                    g[i].visited = true;
                    stack.add(g[i]);
                }
            }
        }
        return false;
    }

    static void clear(Vertex[] g) {
        for (Vertex gg : g) {
            if (gg != null) {
                gg.visited = false;
            }
        }
    }

    static class Vertex {

        Vertex(int id, boolean[] neighbors) {
            this.id = id;
            this.neighbors = neighbors;
        }

        int id;
        boolean neighbors[];
        boolean visited;
    }
}
