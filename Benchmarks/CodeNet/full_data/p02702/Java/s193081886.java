import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      String s = sc.next();

      int cnt = 0;
      
      for(int i = 0; i < s.length(); i++) {
        int curCnt = 0;
        if(i + 4 <= s.length() || i + 5 <= s.length()) {
            int idx = i;
            while(true) {
              if(idx + 4 <= s.length() && Integer.valueOf(s.substring(idx, idx + 4)) % 2019 == 0) {
                curCnt++;
                idx += 4;
                continue;
              }
              if(idx + 5 <= s.length() && Integer.valueOf(s.substring(idx, idx + 5)) % 2019 == 0) {
                curCnt++;
                idx += 5;
                continue;
              }
              break;
            }
            cnt += curCnt;
        }

      }

      System.out.println(cnt);
  }
}