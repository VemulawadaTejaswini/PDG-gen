import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        String s, t;
        s = in.next();
        t = in.next();
        int [][]dp = new int[s.length()+1][t.length()+1];
        for(int i=0;i<s.length();i++)
            dp[i][0] = 0;
        for(int i=0;i<t.length();i++)
            dp[0][i] = 0;
        for(int i=1;i<=s.length();i++){
            for(int j=1;j<=t.length();j++){
                if(s.charAt(i-1) != t.charAt(j-1))
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                else
                    dp[i][j] = dp[i-1][j-1]+1;
            }
        }
        if(dp[s.length()][t.length()] == 0){
            System.out.println();
            System.exit(0);
        }
        //Now to find the largest common subsquence
        StringBuilder ss = new StringBuilder();
        int i = s.length(), j = t.length();
        while(i != 0 || j!= 0){
            if(dp[i][j] == dp[i][j-1]){
                j -= 1;
            }
            else if(dp[i][j] == dp[i-1][j]){
                i -= 1;
            }
            else if(dp[i][j] == dp[i-1][j-1]+1){
                ss.append(t.charAt(j-1));
                i -= 1;
                j -= 1;
            }
        }

        ss.reverse();
        String ans = ss.toString();
        System.out.println(ans);
    }
}
