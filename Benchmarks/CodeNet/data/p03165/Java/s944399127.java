import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args){
		new Main().run();
    }

    void run(){
      Scanner sc=new Scanner(System.in);
      String s=sc.next();
      String t=sc.next();
      int[][] dp=new int[s.length()][t.length()];
      for(int sum=0;sum<s.length()+t.length();++sum){
          for(int i=0;i<=sum;++i){
              int j=sum-i;
              if(i>=s.length()||j>=t.length())continue;
              dp[i][j]=Math.max(dp[i][j],(i>0?dp[i-1][j]:0));
              dp[i][j]=Math.max(dp[i][j],(j>0?dp[i][j-1]:0));
              if(s.charAt(i)!=t.charAt(j))continue;
              dp[i][j]=Math.max(dp[i][j],(i>0&&j>0?dp[i-1][j-1]:0)+1);
          }
      }
      String ans="";
      int curVal=dp[s.length()-1][t.length()-1];
      int curI=s.length(),curJ=t.length();
      out:for(int sum=s.length()+t.length()-1;sum>=0;--sum){
          for(int i=0;i<=sum;++i){
            int j=sum-i;
            if(i>=curI||j>=curJ)continue;
            if(dp[i][j]==curVal&&s.charAt(i)==t.charAt(j)){
                --curI;
                --curJ;
                --curVal;
                ans=String.valueOf(s.charAt(i))+ans;
                continue out;
            }
	    }
	}

	System.out.println(ans);
    }
}
