import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int s = S.length();
    int ans = 0;
    if(s > 1){
      ans += 9*(s-1);
      ans += S.charAt(0)-'1';
    }else{
      ans += S.charAt(0)-'0';
    }
    boolean c = true;
    for(int i = 0; i < s; i++){
      if(S.charAt(0) != '9'){
        c = false;
      }
      
      if(i == s-1 && c){
        ans = 9*s;
      }
    }
    System.out.println(ans);
  }
}