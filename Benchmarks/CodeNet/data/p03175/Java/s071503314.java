import java.util.*;
import java.io.*;
class Main {
    static ArrayList<Integer>[] graph;
    static long MOD = (long)(1e9+7);
    static long[][] dp;
    static long dfs(int src, int par, boolean isBlack) {
        int x = isBlack?1:0;
        if(dp[src][x]!=-1)
            return dp[src][x];
        long count = 1;
        for(int i: graph[src]) {
            if(par==i) continue;
            long subTreeCount = 0;
            if(isBlack)
                subTreeCount = (subTreeCount + dfs(i, src, false))%MOD;
            subTreeCount = (subTreeCount + dfs(i, src, true));
            count = (count * subTreeCount)%MOD;
        }
        return dp[src][x] = count%MOD;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        graph = new ArrayList[n];
        for(int i = 0; i<n; i++)
            graph[i] = new ArrayList<>();
        dp = new long[n][2];
        for(long[] i: dp)
            Arrays.fill(i, -1);
        for(int i = 0; i<n-1; i++) {
            int u = sc.nextInt()-1;
            int v = sc.nextInt()-1;
            graph[u].add(v);
            graph[v].add(u);
        }
        System.out.println((dfs(0, -1, true)+dfs(0, -1, false))%MOD);
    }
}