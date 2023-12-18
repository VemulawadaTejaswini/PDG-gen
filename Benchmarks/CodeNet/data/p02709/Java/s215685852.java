import java.util.*;

public class Solution {
    int[] ip;
    int N;

    private int dfs(int st, Set<Integer> visited ){
        if(st >= N)
            return 0;

        int ans = 0;
        for(int i = 0; i < N; i++){
            if(!visited.contains(i) && i != st){
                visited.add(i);
                ans = Math.max(ans, (ip[st] * Math.abs(i - st)) + dfs(st + 1, visited));
                visited.remove(i);
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Solution s1 = new Solution();
        s1.N = Integer.parseInt(sc.nextLine());
        String[] ar = sc.nextLine().split("\\s");
        s1.ip = new int[ar.length];

        for(int i = 0; i < ar.length; i++){
            s1.ip[i] = Integer.parseInt(ar[i]);
        }
        int ans = s1.dfs(0, new HashSet<>());
        System.out.println(ans);
    }
}
