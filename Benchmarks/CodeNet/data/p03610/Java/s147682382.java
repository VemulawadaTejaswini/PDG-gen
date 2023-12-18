import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String ans = "";
    for (int i=0; i<s.length(); i += 2) {
      char odd = s.charAt(i);
      ans = ans + String.valueOf(odd);
    }
    System.out.println(ans);
  }
}