import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String O = sc.next();
    String E = sc.next();
    StringBuilder ans = new StringBuilder();
    for (int i = 0; i < O.length() + E.length(); i++) {
      if (i%2 ==0) {
        ans.append(O.charAt(i/2));
      } else {
        ans.append(E.charAt(i/2));
      }
    }
    
    System.out.println(ans.toString());
  }
}