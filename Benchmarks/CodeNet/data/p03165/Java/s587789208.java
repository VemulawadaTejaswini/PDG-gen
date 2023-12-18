import java.io.*;
import java.util.*;
import java.lang.Math.*;

class Main{

    static int[][] dp = new int[3001][3001];

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
    
        String s = new String();
        String t = new String();

        s = sc.next();
        t = sc.next();

        int sLen = s.length();
        int tLen = t.length();

    
        for(int i = 0; i < 3001; i++){
            dp[0][i] = 0;
            dp[i][0] = 0;
        }

        for(int i = 1; i <= sLen; i++){
            for(int j = 1; j <= tLen; j++){
                if(s.charAt(i-1) == t.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else{
                    dp[i][j] = Math.max( dp[i-1][j], dp[i][j-1] );
                }
            }
        }
        
        //stvaranje stringa
        String mRes = new String("");
        
        int i = sLen;
        int j = tLen;
        
        while(i>0 && j>0){
            //if( dp[i][j] == 0 ) break;
            if(dp[i][j] == (dp[i-1][j-1] + 1)	){
                mRes = s.charAt(i-1) + mRes;
                i--;
                j--;
            }
            else if(dp[i][j] == dp[i-1][j]){
                i--;
            }
            else j--;
        
        }
        System.out.println(mRes);        

        sc.close();
    }
}














