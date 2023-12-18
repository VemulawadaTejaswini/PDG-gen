import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int s = S.length();
    String T = sc.next();
    int t = T.length();
    char d = T.charAt(0);
    int count = 0;
    String ans = "UNRESTORABLE";
    for(int i = s-t; i >= 0; i--){
      char c = S.charAt(i);
      boolean check = true;
      if(c == d){
        String SP = S.substring(i, i+t);
        for(int j = 0; j < t; j++){
          if(SP.charAt(j) != '?' && SP.charAt(j) != T.charAt(j)){
            check = false;
            break;
          }
        }
        
        if(check){
          ans = S.substring(0, i) + T;
          ans = ans.replace("?", "a");
          break;
        }
      }
    }
    System.out.println(ans);
  }
}