import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] g = buildGraph(sc, n, n-1);
        boolean[] used = new boolean[n];
        ArrayDeque<Integer> fq = new ArrayDeque<>();
        ArrayDeque<Integer> sq = new ArrayDeque<>();
        fq.add(0); sq.add(n-1);
        int fsum = 0; int ssum = 0;
        for (int i = 0; i < n; i++) {
            ArrayDeque<Integer> tq = new ArrayDeque<>();
            while(!fq.isEmpty()){
                int nex = fq.poll();
                if(!used[nex]){
                    fsum++; used[nex] = true;
                    for(int a : g[nex]){
                        tq.add(a);
                    }
                }
            }
            fq.addAll(tq);
            tq.clear();
            while(!sq.isEmpty()){
                int nex = sq.poll();
                if(!used[nex]){
                    ssum++; used[nex] = true;
                    for(int a : g[nex]){
                        tq.add(a);
                    }
                }
            }
            sq.addAll(tq);
        }
        System.out.println(fsum <= ssum ? "Snuke" : "Fennec");
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
