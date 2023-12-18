import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] g = buildGraph(sc, n, n-1);
        int[] c = new int[n];
        long sum = 0L;
        int max = 0;
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
            sum += c[i];
            if(max < c[i]) max = c[i];
        }
        sum -= max;
        Arrays.sort(c);
        int[] d = new int[n];
        Arrays.fill(d, -1);
        ArrayDeque< Integer> q = new ArrayDeque<>();
        q.add(0);
        d[0] = max;
        int idx = n-2;
        while(!q.isEmpty()){
            for(int v : g[q.poll()]){
                if(d[v] < 0){
                    d[v] = c[idx];
                    idx--;
                    q.add(v);
                }
                if(idx < 0) break;
            }
        }
        StringBuilder sb = new StringBuilder(n*2);
        for (int i = 0; i < n; i++) {
            sb.append(d[i]).append(" ");
        }
        System.out.println(sum);
        System.out.println(sb.toString());
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

