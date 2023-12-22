import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] g = buildGraph(sc, n, m);
        int[] ans = new int[n];
        ArrayDeque<Integer> q = new ArrayDeque<>();
        boolean[] used = new boolean[n];
        used[0] = true;
        q.add(0);
        while(!q.isEmpty()){
            int v = q.poll();
            for(int nv : g[v]){
                if(used[nv]) continue;
                used[nv] = true;
                ans[nv] = v;
                q.add(nv);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Yes\n");
        for (int i = 1; i < n; i++) {
            int v = ans[i] + 1;
            sb.append(v + "\n");
        }
        System.out.print(sb.toString());
        sc.close();

    }

    public static int[][] buildGraph(Scanner sc, int n, int m) {
        int[][] graph = new int[n][];
        int[][] edges = new int[m][2];
        int[] deg = new int[n];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            edges[i][0] = a;
            edges[i][1] = b;
            deg[a]++;
            deg[b]++;
        }
        for (int i = 0; i < n; i++) {
            graph[i] = new int[deg[i]];
        }
        for (int i = 0; i < m; i++) {
            int a = edges[i][0];
            int b = edges[i][1];
            graph[a][--deg[a]] = b;
            graph[b][--deg[b]] = a;
        }

        return graph;
    }

}
