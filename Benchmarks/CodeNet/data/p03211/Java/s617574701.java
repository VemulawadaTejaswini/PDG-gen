import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int l = S.length();
    int ans = 999;
    
    for (int i = 0; i < l - 2; i++) {
      String sub = S.substring(i,i+2);
      int I = Integer.parseInt(sub);
      if(ans > Math.abs(753-I)){
        ans = I;
      }
    }
    System.out.println(ans);
  }
}
    
    