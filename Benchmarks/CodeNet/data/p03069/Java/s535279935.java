import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String s = sc.next();

      int[] leftBlackCnt = new int[n];
      for(int i = 0; i < s.length(); i++) {
        if(i > 0)
          leftBlackCnt[i] = leftBlackCnt[i-1];
        if(s.charAt(i) == '#')
          leftBlackCnt[i]++;
      }

      int[] rightWhiteCnt = new int[n];
      for(int i = s.length() - 1; i >= 0; i--) {
          if(i < s.length() - 1)
            rightWhiteCnt[i] = rightWhiteCnt[i+1];
          if(s.charAt(i) == '.')
            rightWhiteCnt[i]++;
      }
      int cnt = rightWhiteCnt[0];
      for(int i = 0; i < s.length() - 1; i++) {
        cnt = Math.min(cnt, leftBlackCnt[i] + rightWhiteCnt[i+1]);
      }
      cnt = Math.min(cnt, leftBlackCnt[n-1]);
      System.out.println(cnt);
  }
}