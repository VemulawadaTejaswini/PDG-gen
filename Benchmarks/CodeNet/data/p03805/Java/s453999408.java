import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        int m = sc.nextInt();
        boolean[][] graph = new boolean[n][n];
        boolean[] vid = new boolean[n];
        for(int i = 0;i < m;i++){
            int ai = sc.nextInt()-1;
            int bi = sc.nextInt()-1;
            graph[ai][bi] = true;
            graph[bi][ai] = true;
        }
        vid[0] = true;
        System.out.println(dfs(0, n, vid, graph));
    }
    public static int dfs(int v, int N, boolean[] Vid, boolean[][] Graph){
        for(int i = 0;i < N;i++){
            if(!Vid[i])     break;
            if(i == N-1)    return 1;
        }
        int ret = 0;
        for(int i = 0;i < N;i++){
            if(!Graph[v][i] || Vid[i])    continue;
            Vid[i] = true;
            ret += dfs(i, N, Vid, Graph);
            Vid[i] = false;
        }
        return ret;
    }
}