import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int n = s.length(), m = t.length();
        Pair[][] dp = new Pair[n+1][m+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                dp[i][j] = new Pair(0);
                dp[i][j].from[0] = 0;
                dp[i][j].from[1] = 0;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(s.charAt(i)==t.charAt(j)){
                    if(dp[i+1][j+1].val<=dp[i][j].val+1){
                        dp[i+1][j+1].val = dp[i][j].val + 1;
                        dp[i+1][j+1].from[0] = i;
                        dp[i+1][j+1].from[1] = j;
                    }
                }
                if(dp[i+1][j].val<=dp[i][j].val){
                    dp[i+1][j].val = dp[i][j].val;
                    dp[i+1][j].from[0] = i;
                    dp[i+1][j].from[1] = j;
                }
                if(dp[i][j+1].val<dp[i][j].val+1){
                    dp[i][j+1].val = dp[i][j].val;
                    dp[i][j+1].from[0] = i;
                    dp[i][j+1].from[1] = j;
                }
            }
        }
        int ans = 0;
        int[] maxind = new int[2];
        for(int i=0;i<=n;i++){
            for(int j = 0;j<=m;j++){
                if(ans<dp[i][j].val){
                    ans = dp[i][j].val;
                    maxind[0] = i;
                    maxind[1] = j;
                }
            }
        }
        StringBuilder ans1 =new StringBuilder();
        int prev = 0;
        //System.out.println(ans);
        while(!(maxind[0]==0 || maxind[1]==0)){
            int[] p = dp[maxind[0]][maxind[1]].from;
            if(p[0]==maxind[0]-1 && p[1] == maxind[1]-1)
                 ans1.append(s.charAt(maxind[0]-1)+"");
            maxind = p;
        }
        System.out.println(ans1.reverse());
    }
    static class Pair {
        int val;
        int[] from;
        public Pair(int val){
            this.val = val;
            from = new int[2];
        }
    }
}