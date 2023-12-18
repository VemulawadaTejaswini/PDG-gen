import java.util.*;
import java.io.*;

/*
   AtCoder contest code
   coder : yoichidon
 */

public class Main {
    public static String longer(String x, String y){
        if(x.length() > y.length()) return x;
        else return y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();

        int A = S.length();
        int B = T.length();

        int[][] dp = new int[A+1][B+1];
        for(int a=0; a<=A; a++) dp[a][0]=0;
        for(int b=0; b<=B; b++) dp[0][b]=0;

        for(int a=1;a<=A;a++) for(int b=1;b<=B;b++){
            dp[a][b] = Math.max(dp[a-1][b], dp[a][b-1]);
            if(S.charAt(a-1)==T.charAt(b-1)) dp[a][b] = 1 + dp[a-1][b-1];
        }


        String ans = "";
        int a=A, b=B;
        while(a>0 && b>0){
            if(S.charAt(a-1)==T.charAt(b-1)){
                ans = S.charAt(a-1)+ans;
                a--;
                b--;
            }
            else if(dp[a-1][b]>dp[a][b-1]) a--;
            else b--;
        }
        System.out.println(ans);


    }
}
