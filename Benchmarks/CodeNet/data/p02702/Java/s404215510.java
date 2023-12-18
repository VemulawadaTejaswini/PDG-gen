import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      String s = sc.next();

      long cnt = 0;
      
      for(int i = 0; i < s.length(); i++) {
        long curCnt = 0;
        if(i + 5 <= s.length() && Integer.valueOf(s.substring(i, i + 5)) % 2019 == 0) {
            int idx = i;
            while(idx + 5 <= s.length() && Integer.valueOf(s.substring(idx, idx + 5)) % 2019 == 0) {
                curCnt++;
                idx += 5;
            }
            cnt += curCnt;
        }

      }

      System.out.println(cnt);
  }
}