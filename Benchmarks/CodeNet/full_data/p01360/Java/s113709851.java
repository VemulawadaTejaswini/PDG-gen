import java.util.*;

class Main{

    int INF = Integer.MAX_VALUE;
    int[] pos = {INF, 0, 1, 2, 0, INF, 2, 0, 1, 2};

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            String line = sc.next();
            if(line.equals("#")) break;
            char[] step = line.toCharArray();
            int n = step.length;

            int[][] dp = new int[n][2];
            for(int i=0; i<n; i++) Arrays.fill(dp[i], INF);

            dp[0][0] = 0; dp[0][1] = 0;
            for(int i=0; i<n-1; i++){
                int idx1 = step[i+1]-'0', idx2 = step[i]-'0';
                
                if(checkRL(idx2, idx1)) dp[i+1][0] = dp[i][1];
                else if(dp[i][0]!=INF) dp[i+1][0] = Math.min(dp[i+1][0], dp[i][0]+1);
                
                if(checkRL(idx1, idx2)) dp[i+1][1] = dp[i][0];
                else if(dp[i][1]!=INF) dp[i+1][1] = Math.min(dp[i+1][1], dp[i][1]+1);
            }

            System.out.println(Math.min(dp[n-1][0], dp[n-1][1]));
        }
    }

    boolean checkRL(int r, int l){
        if(pos[l]>pos[r]) return false;
        return true;
    }

    public static void main(String[] args){
        new Main().solve();
    }
}