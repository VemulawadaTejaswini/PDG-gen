import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][][] g = buildWeightedGraph(n, sc);
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.add(0);
        int[] ans = new int[n];
        boolean[] used = new boolean[n];
        used[0] = true;
        while(!ad.isEmpty()){
            int x = ad.poll();
            int[][] next = g[x];
            for(int[] nv : next){
                if(used[nv[0]]) continue;
                used[nv[0]] = true;
                ans[nv[0]] = nv[1] % 2 == 0 ? ans[x] : Math.abs(ans[x] - 1);
                ad.add(nv[0]);
            }
        }
        for (int i = 0; i < n; i++) System.out.println(ans[i]);
        sc.close();

    }

    public static int[][][] buildWeightedGraph(int n, Scanner sc){
        int m = n-1;
        int[][][] graph = new int[n][][];
        int[][] edges = new int[n-1][3];
        int[] deg = new int[n];
        for (int i = 0; i < m; i++) {
            edges[i][0] = sc.nextInt()-1;
            edges[i][1] = sc.nextInt()-1;
            edges[i][2] = sc.nextInt();
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

}
