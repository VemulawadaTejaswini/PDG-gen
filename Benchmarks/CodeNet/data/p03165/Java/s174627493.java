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

        String[][] dp = new String[A+1][B+1];
        for(int a=0; a<=A; a++) dp[a][0]="";
        for(int b=0; b<=B; b++) dp[0][b]="";

        for(int a=1;a<=A;a++) for(int b=1;b<=B;b++){
            dp[a][b] = longer(dp[a-1][b], dp[a][b-1]);
            if(S.charAt(a-1)==T.charAt(b-1)){
                dp[a][b] = longer(dp[a][b], dp[a-1][b-1]+S.charAt(a-1));
            }
        }
        System.out.println(dp[A][B]);


    }
}
