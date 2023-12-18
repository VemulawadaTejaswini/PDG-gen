import java.math.*;
import java.io.*;
import java.util.*;
 
class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
       String[] l1 = br.readLine().split(" ");
       int N = Integer.parseInt(l1[0]);
       int M = Integer.parseInt(l1[1]);
       HashMap<Integer, List<Integer>> map = new HashMap<>();

        for(int i = 0; i < M; i++){
            String[] l2 = br.readLine().split(" ");
            int a = Integer.parseInt(l2[0]);
            int b = Integer.parseInt(l2[1]);

            if(!map.containsKey(a)){
                map.put(a, new ArrayList<Integer>());
            }

            map.get(a).add(b);

        }
        int[] dp = new int[M];
        
      	for(int i = 0; i < dp.length; i++){
        	dp[i] = -1;
        }
      
        int ans = 0;
        for(int i = 1; i <= N; i++){
            ans = Math.max(ans, helper(map, i, dp));
        }
        System.out.println(ans);
    }

    public static int helper(Map<Integer, List<Integer>> map, int node, int[] dp){
        if(dp[node] != -1){
            return dp[node];
        }

        dp[node] = 0;
        int count = 0;

        if(map.containsKey(node)){
            for(int neigh: map.get(node)){
                count = Math.max(count, helper(map, neigh, dp) + 1);
            }
        }
        dp[node] = count;
        return dp[node];
    }

}
