import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      int cnt = 0;
      for(int i = 0; i < s.length() - 4; i++) {
        int num = Integer.valueOf(s.substring(i, i + 4));

        if(num % 2019 == 0) {
          cnt++;
        } else if(i + 5 <= s.length()){
          num = Integer.valueOf(s.substring(i, i + 5));
          if(num % 2019 == 0) {
            cnt++;
          }
        }

      }
      System.out.println(cnt);
  }
}