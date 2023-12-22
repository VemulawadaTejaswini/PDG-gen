import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        int INF = Integer.MAX_VALUE/2;
        int n = sc.nextInt();
        
        int[] A = new int[n+1];
        int[] B = new int[n+1];
        for(int i=1; i<=n; i++){
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            int min = INF;
            int minIdx = i;
            for(int j=i; j<n; j++){
                int abs = Math.abs(A[i]-B[i]);
                if(abs<=min){
                    min = abs;
                    minIdx = j;
                }
            }
            int tmp = A[i];
            A[i] = A[minIdx];
            A[minIdx] = tmp;
            tmp = B[i];
            B[i] = B[minIdx];
            B[minIdx] = tmp;
        }
        
        int[][] dp = new int[n+1][n+1];
        for(int i=0; i<=n; i++) Arrays.fill(dp[i], INF);
        dp[0][0] = 0;
        for(int i=1; i<=n; i++){
            for(int j=0; j<=n; j++){
                int sum = A[i];
                if(j!=0) sum += dp[i-1][j-1];
                if(sum<=B[i]) dp[i][j] = Math.min(dp[i][j], sum);
                dp[i][j] = Math.min(dp[i][j], dp[i-1][j]);
            }
        }
        
        int max = 0;
        for(int i=0; i<=n; i++){
            if(dp[n][i]!=INF) max = i;
        }
        System.out.println(max);
    }
    public static void main(String[] args){
        new Main().solve();
    }
}