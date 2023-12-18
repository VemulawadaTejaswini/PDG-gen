import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[] s = sc.next().toCharArray();
        boolean[] ok = new boolean[n+1];
        for (int i = 0; i < n+1; i++) {
            if(s[i] == '0') ok[i] = true;
        }
        int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.add(0);
        for (int i = 1; i <= n; i++) {
            if(m < i - q.peek()) q.poll();
            if(q.isEmpty()) break;
            if(!ok[i]) continue;
            dp[i] = dp[q.peek()] + 1;
            q.add(i);
        }
        if(n < dp[n]){
            System.out.println(-1);
        }else{
            int pre = n;
            int tpre = n;
            int idx = dp[n]-1;
            int[] ans = new int[dp[n]+1];
            for (int i = n-1; i >= 0; i--) {
                if(m < pre - i){
                    ans[idx+1] = pre - tpre;
                    pre = tpre;
                    idx--;
                }
                if(dp[i] == idx){
                    tpre = i;
                }
            }
            ans[1] = pre;
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= dp[n]; i++) {
                sb.append(ans[i] + " ");
            }
            System.out.println(sb.toString().trim());
        }
        sc.close();

    }

}
