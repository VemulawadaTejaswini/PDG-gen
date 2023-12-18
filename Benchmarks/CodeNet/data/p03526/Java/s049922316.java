import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] hp = new int[n][];
        for(int i=0;i<n;i++) hp[i]=new int[]{sc.nextInt(),sc.nextInt()};
        Arrays.sort(hp,new myC());
        int inf = Integer.MAX_VALUE/2;
        int[][] dp = new int[n+1][n+1];
        // dp[i][j] the minimum height when choosing j people from the first i people (1-base);
        for(int i=0;i<n+1;i++) Arrays.fill(dp[i],inf);
        for(int i=0;i<n+1;i++) dp[i][0]=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(dp[i-1][j-1]<=hp[i-1][0]) dp[i][j] = Math.min(Math.min(dp[i][j],dp[i-1][j]),dp[i-1][j-1]+hp[i-1][1]);
            }
        }
        int ans = 0;
        for(int i=1;i<=n;i++){
            if(dp[n][i]<inf) ans = Math.max(ans,i);
        }
        System.out.println(ans);
    }
    static class myC implements Comparator<int[]>{
        public int compare(int[] a, int[] b){
            if(a[0]+a[1]-b[0]-b[1]!=0) return a[0]+a[1]-b[0]-b[1];
            else return a[0]-b[0];
        }
    }
}
