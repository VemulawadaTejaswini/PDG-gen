import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    final static int MOD = (int) 1E9 +7;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        final int MOD  = (int) 1E9 + 7;
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        int n = scanner.nextInt();
        for (int i = 0; i < n-1; i++) {
            int p =scanner.nextInt();
            int c = scanner.nextInt();
            map.putIfAbsent(p,new ArrayList<>());
            map.get(p).add(c);
            map.putIfAbsent(c,new ArrayList<>());
            map.get(c).add(p);
        }
        int[][] dp  = new int[n+1][2];
        ways(map,dp,1,-1);
        System.out.println((dp[1][0] + dp[1][1])% MOD);
    }
    private static void ways(HashMap<Integer,ArrayList<Integer>> map ,int[][] dp,int node,int parent){
        dp[node][0]=1;
        dp[node][1]=1;
        for(int i : map.get(node)){
            if(i != parent){
                ways(map,dp,i,node);
                dp[node][0] = (dp[node][0]*dp[i][1])%MOD;
                dp[node][1] = (dp[node][1]*(dp[i][0] + dp[i][1])%MOD)%MOD;
            }
        }
    }
}