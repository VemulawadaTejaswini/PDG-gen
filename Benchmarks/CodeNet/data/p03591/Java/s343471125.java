import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    if (S.length() >= 4
        && S.substring(0, 4).equals("YAKI")) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}