import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      int cnt = 0;
      for(int i = 0; i < s.length(); i++) {
          
        if(i + 4 <= s.length()) {
            if(Integer.valueOf(s.substring(i, i + 4)) % 2019 == 0) {
              cnt++;
            }
        }
        
        if(i + 5 <= s.length()) {
            if(Integer.valueOf(s.substring(i, i + 5)) % 2019 == 0) {
              cnt++;
            }
        }

      }
      System.out.println(cnt);
  }
}