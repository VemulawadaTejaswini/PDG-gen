import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<Integer>[] graph;
    static int[] color;
    static long wCnt = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        graph = new List[N+1];
        for (int i = 1; i <= N; i++) graph[i] = new ArrayList<Integer>();
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a].add(b);
            graph[b].add(a);
        }
        long ans = 0;
        color = new int[N+1];
        if (dfs(0, 1, 1)) {
            ans = wCnt * (N - wCnt) - M;
        } else{
           ans = ((long) N * (N - 1)) / 2 - M;
        }
        System.out.println(ans);
        sc.close();

    }

    private static boolean dfs(int pre, int cur, int c) {
        if(color[cur] != 0){
            return color[cur] == c;
        }
        color[cur] = c;
        if(c == 1) wCnt++;
        boolean ret = true;
        for(int i = 0; i < graph[cur].size(); i++){
            int x = graph[cur].get(i);
            if(x == pre) continue;
            ret &= dfs(cur, x, -c);
        }

        return ret;
    }

}
