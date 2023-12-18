import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String T = sc.next();
    char c = T.charAt(0);
    int s = S.length();
    int count = 0;
    String ans = "UNRESTORABLE";
    for(int i = s-1; i >= 0; i--){
      char d = S.charAt(i);
      if(d == c && count+1 == T.length()){
        ans = S.substring(0,i) + T;
        ans = ans.replace("?", "a");
        break;
      }
      if(d == '?'){
        count++;
      }else{
        count = 0;
      }
    }
    System.out.println(ans);
  }
}