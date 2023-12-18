import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String s = sc.next();
      int cntR = 0;
      int cntG = 0;
      int cntB = 0;
      for(char c : s.toCharArray())
        if(c == 'R')
          cntR++;
        else if(c == 'G')
          cntG++;
        else
          cntB++;
      long cnt = cntR * cntG * cntB;
      
      int sub = 0;
      for(int i = 0; i < n; i++) {
        for(int j = i+1; j < n; j++) {
            if(s.charAt(i) == s.charAt(j)) continue;
            int k = j * 2 - i;
            if(k < n && s.charAt(i) != s.charAt(k) && s.charAt(k) != s.charAt(j)) sub++;
        }
      }
      System.out.println(cnt - sub);
  }
}