import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
        String s=new String();
        String t=new String();
        Scanner in=new Scanner(System.in);
        s=in.next();
        t=in.next();
        String[][] dp=new String[s.length()+1][t.length()+1];
        for(int i=0;i<=s.length();i++)dp[i][0]="";
        for(int i=0;i<=t.length();i++)dp[0][i]="";
        for(int i=1;i<=s.length();i++){
            for(int j=1;j<=t.length();j++){
                dp[i][j]="";
                if(s.charAt(i-1)==t.charAt(j-1))dp[i][j]=dp[i-1][j-1]+s.charAt(i-1);
                else{
                    if(dp[i][j-1].length()>=dp[i-1][j].length())dp[i][j]=dp[i][j-1];
                    else dp[i][j]=dp[i-1][j];
                } 
            }
        }
        System.out.println(dp[s.length()][t.length()]);
    }
}