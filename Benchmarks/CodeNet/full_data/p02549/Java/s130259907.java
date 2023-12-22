import java.util.*;

public class Main {
    public static int MOD = 998244353;
    
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int[][] array= new int[k][2];
        for (int i = 0; i < k; i++) {
            array[i][0] = sc.nextInt();
            array[i][1] = sc.nextInt();
        }
        
        Set<Integer> ok = new HashSet<Integer>();
        for (int i = 0; i < k; i++) {
            int start = array[i][0];
            int end = array[i][1];
            for (int j = start; j <= end; j++) {
                ok.add(j);
            }
        }
        
        // dp[i]: iマスに行く方法のパターン数
        int[] dp = new int[n+1];
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (Integer j : ok) {
                if (i-j>0) {
                    dp[i] += dp[i-j];
                    dp[i] %= MOD;
                }
            }
        }
        System.out.println(dp[n]);
        // System.out.println(Arrays.toString(dp));
        
        // 5 2
        // 1 1
        // 3 4
        // S=1,3,4
        
        // 1->5
        // 4マス進む
        // 4を1,3,4を使って表現するパターン数
        // 5を1,3,4で表現するパターン数
    }
}
