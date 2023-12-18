import java.util.*;

public class Main {
    private static boolean[] arrived;
    private static Set<Integer>[] friends;
    private static int groupCount = 0;
    
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        arrived = new boolean[n];
        friends = new HashSet[n];
        Arrays.setAll(friends, i -> new HashSet<Integer>(n));
        
        while (m-- > 0) {
            int me = sc.nextInt() - 1;
            int you = sc.nextInt() - 1;
            sc.nextInt();
            friends[me].add(you);
            friends[you].add(me);
        }
        
        for (int i = 0; i < n; i++) {
            if (!arrived[i]) {
                dfs(i, true);
            }
        }
        
        System.out.println(groupCount);
    }
    public static void dfs(int p, boolean isFirst) {
        if (isFirst) groupCount++;
        arrived[p] = true;
        
        for (Integer friend : friends[p]) {
            if (arrived[friend]) continue;
            dfs(friend, false);
        }
    }
}