//package atcoderdp;
import java.util.*;
class Main {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int a[][]= new int[n][3];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <3 ; j++) {
                a[i][j]=s.nextInt();
            }
        }
        System.out.println(find(a,n));
    }
    public static int find(int a[][],int n){
        int dp[][]= new int[n][3];
        dp[0][0] = a[0][0];
        dp[0][1] = a[0][0];
        dp[0][2] = a[0][2];
        for (int i = 1; i <n ; i++) {
            dp[i][0] = Math.max(dp[i-1][1],dp[i-1][2])+a[i][0];
            dp[i][1] = Math.max(dp[i-1][0],dp[i-1][2])+a[i][1];
            dp[i][2] = Math.max(dp[i-1][0],dp[i-1][1])+a[i][2];
        }
        return Math.max(Math.max(dp[n-1][0],dp[n-1][1]),dp[n-1][2]);
    }

}
