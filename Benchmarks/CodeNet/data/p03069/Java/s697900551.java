import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String s = sc.next();

      int left = 0;
      for(; left < s.length(); left++)
        if(s.charAt(left) == '.') continue;
        else break;

      int right = s.length() - 1;
      for(; right >= left; right--)
        if(s.charAt(right) == '#') continue;
        else break;
      
      int whiteCnt = 0;
      int blackCnt = 0;
      for(int i = left; i <= right; i++) {
        if(s.charAt(i) == '.')
          whiteCnt++;
        else blackCnt++;
      }
      System.out.println(Math.min(whiteCnt, blackCnt));
  }
}