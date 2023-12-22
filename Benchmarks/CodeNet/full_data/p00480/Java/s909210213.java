import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[][] dp = new long[n-1][21];
        int[] a = new int[n-1];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        int ans = sc.nextInt();
        dp[0][a[0]]=1;
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                if(j-a[i]>=0 && j-a[i]<=20)
                    dp[i][j] += dp[i-1][j-a[i]];
                if(j+a[i]>=0 && j+a[i]<=20)
                    dp[i][j] += dp[i-1][j+a[i]];
            }
        }
        System.out.println(dp[dp.length-1][ans]);
    }

}