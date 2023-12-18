import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        String[] dic = new String[H];
        for(int i=0;i<H;i++) dic[i]=sc.next();
        long ans = 0;
        for(int i=0;i<W-1;i++){
            char[] a = new char[H],b = new char[H];
            for(int j=0;j<H;j++){
                a[j]=dic[j].charAt(i);
                b[j]=dic[j].charAt(i+1);
            }
            ans += help(a,b);
        }
        System.out.println(ans);
    }
    static long help(char[] a, char[] b){
        int n = a.length;
        long[][] rec= new long[n+1][n+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++) rec[i][j] = rec[i-1][j-1]+(a[i-1]==b[j-1]?1:0);
        }
        long[][] dp = new long[n+1][n+1];
        for(int i=n-1;i>=0;i--) dp[i][n] = dp[i+1][n]+rec[i+1][n];
        for(int j=n-1;j>=0;j--) dp[n][j] = dp[n][j+1]+rec[n][j+1];
        for(int i=n-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                long m1 = dp[i+1][j]+rec[i+1][j];
                long m2 = dp[i][j+1]+rec[i][j+1];
                dp[i][j] = Math.min(m1,m2);
            }
        }
        return dp[0][0];
    }
}
