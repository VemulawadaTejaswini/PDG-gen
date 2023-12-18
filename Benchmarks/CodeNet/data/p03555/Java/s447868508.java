import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S1 = sc.next();
    String S2 = sc.next();
    if (S1.charAt(0) == S2.charAt(2) && S1.charAt(1) == S2.charAt(1) && S1.charAt(0) == S2.charAt(2) ) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}