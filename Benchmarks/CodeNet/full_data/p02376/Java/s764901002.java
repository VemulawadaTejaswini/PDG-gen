import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int V = sc.nextInt();
        int E = sc.nextInt();
        int[][] g = new int[V][V];
        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int c = sc.nextInt();
            g[u][v] = c;
        }
        MaxFlow mf = new MaxFlow(g);
        System.out.println(mf.calc(0, V - 1));
    }

    static class MaxFlow {

        int[][] g;
        int[][] res;

        MaxFlow(int[][] g) {
            this.g = g;
            this.res = new int[g.length][];
            for (int i = 0; i < g.length; ++i) {
                this.res[i] = g[i].clone();
            }
        }

        int calc(int src, int sink) {
            int result = 0;
            int[] prev = new int[g.length];
            while (true) {
                Arrays.fill(prev, -1);
                boolean[] visited = new boolean[g.length];
                Queue<Integer> q = new LinkedList<>();
                q.add(src);
                visited[src] = true;
                OUT: while (!q.isEmpty()) {
                    int cur = q.poll();
                    for (int i = 0; i < g.length; ++i) {
                        if (!visited[i] && res[cur][i] > 0) {
                            prev[i] = cur;
                            visited[i] = true;
                            if (i == sink) {
                                break OUT;
                            }
                            q.add(i);
                        }
                    }
                }
                if (!visited[sink]) {
                    break;
                }
                int pos = sink;
                int pathCap = Integer.MAX_VALUE;
                while (pos != src) {
                    int p = prev[pos];
                    pathCap = Math.min(pathCap, res[p][pos]);
                    pos = p;
                }
                pos = sink;
                while (pos != src) {
                    int p = prev[pos];
                    res[p][pos] -= pathCap;
                    res[pos][p] += pathCap;
                    pos = p;
                }
                result += pathCap;
            }
            return result;
        }
    }
}

