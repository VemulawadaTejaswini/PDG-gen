import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    while(sc.hasNext()){
      char[] s1 = sc.next().toCharArray();
      char[] s2 = sc.next().toCharArray();
      int len1 = s1.length;
      int len2 = s2.length;

      //intテ・ツ楪凝」ツ?ァ, 4000*4000テ」ツつ津ァツ「ツコテ、ツソツ敕」ツ?凖」ツつ凝」ツ?ィMLEテ」ツ?凖」ツつ凝」ツつ嘉」ツ?療」ツ??
      //shortテ・ツ楪凝」ツ?繰avaテ」ツ?ァテ、ツスツ陛」ツδ静」ツつ、テ」ツδ暗」ツ?凝、ツクツ催ヲツ伉偲」ツ??」ツ?古ィツゥツヲテ」ツ??
      short[][] dp = new short[len1 + 1][len2 + 1];
      short maxLen = 0;

      for(int idx1 = 0; idx1 < len1; idx1++){
        for(int idx2 = 0; idx2 < len2; idx2++){
          if(s1[idx1] == s2[idx2]){
            dp[idx1 + 1][idx2 + 1] = (short)(dp[idx1][idx2] + 1);
            maxLen = (short)Math.max(maxLen, dp[idx1 + 1][idx2 + 1]);
          }
        }
      }

      System.out.println(maxLen);
    }
  }
}