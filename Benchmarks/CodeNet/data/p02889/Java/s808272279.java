import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();
        int[][] e = new int[m*2][3];
        for (int i = 0; i < m*2; i+=2) {
            e[i][0] = sc.nextInt()-1;
            e[i][1] = sc.nextInt()-1;
            e[i][2] = sc.nextInt();
            e[i+1][0] = e[i][1];
            e[i+1][1] = e[i][0];
            e[i+1][2] = e[i][2];
        }
        long[][] w1 = warshallFloyd(n, e);
        int[][] e2 = new int[n*n][3];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == j)continue;
                if(w1[i][j] <= l) {
                    e2[cnt++] = new int[]{i, j, 1};
                }
            }
        }
        int[][] e3 = Arrays.copyOf(e2, cnt);
        long[][] w2 = warshallFloyd(n, e3);
        StringBuilder sb = new StringBuilder();
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int s = sc.nextInt()-1;
            int t = sc.nextInt()-1;
            sb.append(w2[s][t] == Integer.MAX_VALUE ? -1 : w2[s][t]-1).append("\n");
        }
        System.out.print(sb.toString());
        sc.close();

    }

    public static int[][][] buildWeightedGraph(int n, int[][] edges){
        int m = edges.length;
        int[][][] graph = new int[n][][];
        int[] deg = new int[n];
        for (int i = 0; i < m; i++) {
            deg[ edges[i][0] ]++;
            deg[ edges[i][1] ]++;
        }
        for (int i = 0; i < n; i++) {
            graph[i] = new int[deg[i]][2];
        }
        for (int i = 0; i < m; i++) {
            int a = edges[i][0];
            int b = edges[i][1];
            int c = edges[i][2];
            graph[a][--deg[a]][0] = b;
            graph[a][deg[a]][1] = c;
            graph[b][--deg[b]][0] = a;
            graph[b][deg[b]][1] = c;
        }

        return graph;
    }

    public static long[][] warshallFloyd(int n, int[][] edge){
        long[][] d = new long[n][n];
        for (int i = 0; i < n; i++) Arrays.fill(d[i], Integer.MAX_VALUE);
        for(int i = 0; i < n; i++) d[i][i] = 0;
        for (int i = 0; i < edge.length; i++) {
            d[edge[i][0]][edge[i][1]] = edge[i][2];
        }
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
                }
            }
        }
        return d;
    }

}
