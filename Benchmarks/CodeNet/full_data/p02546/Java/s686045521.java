import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.nextLine();
    if (S.charAt(S.length()) == 's') {
      System.out.println(S + "es");
    } else {
      System.out.println(S + "s");
    }
  }
}
