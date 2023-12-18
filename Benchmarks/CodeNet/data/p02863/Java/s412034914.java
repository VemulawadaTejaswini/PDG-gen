import java.util.*;
import java.io.*;

class Main{
    static int[][] dp,  ab;
    static int n, t;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt(); t=sc.nextInt();
        ab=new int[n][2];
        for(int i=0;i<n;i++){
            int a=sc.nextInt(), b=sc.nextInt();
            ab[i][0]=a; ab[i][1]=b;
        }
        sc.close();
        Arrays.sort(ab, (u, v)->u[0]>v[0]?1:u[0]<v[0]?-1:0);
        dp=new int[n][t+1];
        System.out.println(dp(0, t));
    }
    static int dp(int i, int rest){
        if(rest<=0 || i>=n) return 0;
        if(dp[i][rest]>0) return dp[i][rest];
        return dp[i][rest]=Math.max(dp(i+1, rest), dp(i+1, rest-ab[i][0])+ab[i][1]);
    }
}
