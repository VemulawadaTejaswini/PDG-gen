import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int len = S.length();
    String inverse = "";
    for(int i = S.length() - 1; i >= 0; i--) {
      inverse += String.valueOf(S.charAt(i));
    }
    String s1 = "maerd";
    String s2 = "remaerd";
    String s3 = "esare";
    String s4 = "resare";
    String ans = "YES";
    // dp[i]はインデックスiから末尾までの部分文字列に対する判定結果（出来るなら1、出来ないなら0）
    int[] dp = new int[len + 1];
    dp[len] = 1;
    for(int i = len - 5; i >= 0; i--) {
      String str5 = inverse.substring(i, i + 5);
      String str6 = inverse.substring(i, i + 6);
      String str7 = inverse.substring(i, i + 7);
      if(s1.equals(str5) && (dp[i + 5] == 1)) dp[i] = 1;
      if(s2.equals(str7) && (dp[i + 7] == 1)) dp[i] = 1;
      if(s3.equals(str5) && (dp[i + 5] == 1)) dp[i] = 1;
      if(s4.equals(str6) && (dp[i + 6] == 1)) dp[i] = 1;
    }
    if(dp[0] == 0) ans = "NO";
    System.out.println(ans);
  }
}