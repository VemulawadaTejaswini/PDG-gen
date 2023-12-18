import java.util.*;


class Main{
    static long mod = 1000000007;
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        n = n-k;

        int dp_index=2000;
        int[][] dp = new int[dp_index][dp_index];
        dp = make_combi(dp_index);
        for(int i=1;i<=k;i++){
            System.out.println((dp[n+1][i]*dp[k-1][i-1])%mod);
        }
    }

    public static int[][] make_combi(int a) {
        int[][] d = new int[a][a];
        for(int j=0;j<a;j++){
            d[0][j] = 0;
        }
        for(int i=1;i<a;i++){
            d[i][0]=1;
            d[i][1]=i;
            for(int j=2;j<a;j++){
                d[i][j] = d[i-1][j] + d[i-1][j-1];
            }
        }
        return d;
    }
}