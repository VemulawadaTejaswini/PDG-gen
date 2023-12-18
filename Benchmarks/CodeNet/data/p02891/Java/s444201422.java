import java.util.*;

public class Main {
  public static void main(String... args) {
    Scanner scan = new Scanner(System.in);
    String S = scan.next();
    int K = scan.nextInt();
    scan.close();
    
    char before_char = 0;
    char now_char = 0;
    int char_cnt = 1;
    int change_cnt = 0;
    for(int i=0; i<S.length(); i++) {
      now_char = S.charAt(i);
      if(before_char == now_char) {
        char_cnt++;
      } else if(char_cnt != 1){
        change_cnt += char_cnt/2;
        char_cnt = 1;
      }      
      before_char = now_char;
    }
    if(char_cnt != 1) {
      change_cnt += char_cnt/2;
    }
    
    long ans = 0;
    if(S.length() >= 3) {
      if((S.charAt(0) == S.charAt(S.length()-1))
          && (S.charAt(S.length()-1) != S.charAt(S.length()-2))) {
            char_cnt = 1;
            before_char = S.charAt(0);
            for(int i=1; i<S.length(); i++) {
              if(before_char == S.charAt(i)) char_cnt++;
              else break;
            }
            if(char_cnt%2 == 1) ans += K-1;
       }
    }
    
    ans += (long)change_cnt*K;    
    System.out.println(ans);
  }
}