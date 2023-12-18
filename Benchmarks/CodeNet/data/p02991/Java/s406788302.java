import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] g = buildGraph(sc, n, m);
        int s = sc.nextInt()-1;
        int t = sc.nextInt()-1;
        int[][] a = new int[n][3];
        for (int i = 0; i < n; i++) {
            Arrays.fill(a[i], -1);
        }
        ArrayDeque<int[]> ad = new ArrayDeque<>();
        ad.add(new int[]{s, 0});
        while(!ad.isEmpty()){
            int v = ad.peek()[0];
            int l = ad.peek()[1];
            int nl =( l + 1) % 3;
            ad.poll();
            for(int next : g[v]){
                if(a[next][nl] != -1) continue;
                a[next][nl] = l + 1;
                ad.add(new int[]{next, l+1});
            }
        }
        System.out.println(a[t][0] == -1 ? -1 : a[t][0] / 3);
        sc.close();

    }

    public static int[][] buildGraph(Scanner sc, int n, int m){
        int[][] graph = new int[n][];
        int[][] edges = new int[m][2];
        int[] deg = new int[n];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() -1;
            int b = sc.nextInt() -1;
            edges[i][0] = a;
            edges[i][1] = b;
            deg[a]++;
        }
        for (int i = 0; i < n; i++) {
            graph[i] = new int[deg[i]];
        }
        for (int i = 0; i < m; i++) {
            int a = edges[i][0];
            int b = edges[i][1];
            graph[a][--deg[a]] = b;
        }

        return graph;
    }

}

