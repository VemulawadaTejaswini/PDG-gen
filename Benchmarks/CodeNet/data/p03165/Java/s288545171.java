import java.util.*;
import java.io.*;
import java.lang.*;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String t=sc.nextLine();
    StringBuilder[][] dp=new StringBuilder[s.length()+1][t.length()+1];
    for(int i=0;i<=s.length();i++)
    {
      for(int j=0;j<=t.length();j++)
      {
        dp[i][j]=new StringBuilder();
      }
    }
      
    
    for(int i=1;i<=s.length();i++)
    {
      for(int j=1;j<=t.length();j++)
      {
        if(s.charAt(i-1)==t.charAt(j-1))
        {
          dp[i][j]=dp[i-1][j-1].append(s.charAt(i-1));
        }
        else
        {
          dp[i][j]=dp[i-1][j].length()>dp[i][j-1].length()?dp[i-1][j]:dp[i][j-1];
        }
      }
    }
    System.out.println(dp[s.length()][t.length()]);
  }
}
                       
      
  