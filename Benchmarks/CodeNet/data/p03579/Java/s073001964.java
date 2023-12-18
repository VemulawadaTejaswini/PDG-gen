import java.util.Scanner;

public class Main {

    static int[][] graph;
    static int[] color;
    static long wCnt = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        graph = buildGraph(sc, N, M);
        long ans = 0;
        color = new int[N];
        if (dfs(0, 0, 1)) {
            ans = wCnt * (N - wCnt) - M;
        } else{
           ans = ((long) N * (N - 1)) / 2 - M;
        }
        System.out.println(ans);
        sc.close();

    }

    private static boolean dfs(int pre, int cur, int c) {
        color[cur] = c;
        if(c == 1) wCnt++;
        boolean ret = true;
        for(int i = 0; i < graph[cur].length; i++){
            int x = graph[cur][i];
            if(color[x] == 0){
                if(x == pre) continue;
                ret &= dfs(cur, x, -c);
            }else if(color[x] != -c){
                ret = false;
            }
            if(!ret) break;
        }

        return ret;
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