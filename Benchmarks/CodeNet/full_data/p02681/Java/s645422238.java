
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 文字列の入力
    String s = sc.next();
    String t = sc.next();

    if (t.substring(0, s.length()).equals(s) && t.length() == s.length() + 1) {

      System.out.println("Yes");
    } else {

      System.out.println("No");
    }
  }
}
