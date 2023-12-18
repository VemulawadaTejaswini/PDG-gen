import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String code = sc.next();
    String ans = "Good";
    for (int i=0; i<code.length()-1; i++) {
      if (code.substring(i, i+1).equals(code.substring(i+1, i+2))) {
        ans = "Bad";
      }
    }
    System.out.println(ans);
  }
}