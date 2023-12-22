import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            int min = i;
            for(int j=i; j<n; j++){
                if(b[min]>b[j]) min = j;
            }
            int tmp = b[i];
            b[i] = b[min];
            b[min] = tmp;
            tmp = a[i];
            a[i] = a[min];
            a[min] = tmp;
        }

        int max = 0;
        int INF = Integer.MAX_VALUE/10;
        int[][] dp = new int[n+1][n+1];
        for(int i=0; i<=n; i++) Arrays.fill(dp[i], INF);
        for(int i=0; i<=n; i++) dp[i][0] = 0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                for(int k=0; k<i; k++){
                    dp[i][j] = Math.min(dp[i][j], dp[k][j]);
                    if(dp[k][j-1]!=INF && dp[k][j-1]+a[i-1]<=b[i-1]){
                        dp[i][j] = Math.min(dp[i][j], dp[k][j-1]+a[i-1]);
                    }
                    if(dp[i][j]!=INF) max = Math.max(max, j);
                }
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args){
        new Main().solve();
    }
}