import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        boolean[][] g = input();
        boolean[] visited = new boolean[g[0].length];
        Arrays.fill(visited,false);
        visited[0] = true;
        System.out.println(dfs(g,0,visited));
    }

    private static boolean[][] input(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean[][] ret = new boolean[n][n];
        for(int i = 0; i < m;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            ret[a-1][b-1] = ret[b-1][a-1] = true;
        }
        sc.close();
        return ret;
    }

    private static int dfs(boolean[][] g, int s, boolean[] bools){
        boolean all_true = true;
        for(boolean b: bools){
            if(!b){
                all_true = false;
                break;
            }
        }
        if(all_true){
            return 1;
        }
        int ans = 0;
        for(int i = 0; i < bools.length; i++){
            if(!g[s][i] || bools[i]) continue;
                bools[i] = true;
                ans += dfs(g,i,bools);
                bools[i] = false;
        }
        return ans;
    }
}