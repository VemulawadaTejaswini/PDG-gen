
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int v = scanner.nextInt();
            int e = scanner.nextInt();
            map.putIfAbsent(v,new ArrayList<>());
            map.get(v).add(e);
        }
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        for(int i : map.keySet()){
            path(map,i,dp);
        }
        int longestPath=0;
        for(int i : dp)
            longestPath = Math.max(longestPath,i);
        System.out.println(longestPath);

    }
    private static int path(HashMap<Integer, ArrayList<Integer>> map ,int n ,int[] dp){
        if(!map.containsKey(n)) {
            dp[n]=0;
            return 0;
        }
        if(dp[n] !=-1)
            return dp[n];
        int longestPath=0;
        for(int i : map.get(n)){
            longestPath = Math.max(longestPath,path(map,i,dp));
        }
        return dp[n]=longestPath+1;
    }
}
