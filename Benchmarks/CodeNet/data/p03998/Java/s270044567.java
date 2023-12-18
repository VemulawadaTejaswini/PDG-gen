import java.util.Scanner;

public class Main {

  static String a = "";
  static String b = "";
  static String c = "";

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner sc = new Scanner(System.in);
    a = sc.next();
    b = sc.next();
    c = sc.next();

    judge('a');
  }

  public static void judge(char ch) {

    if (ch == 'a') {
      if (a.length() == 0) {
        System.out.println("A");
        return;
      } else {
        char card = a.charAt(0);
        a = a.substring(1);
        judge(card);
      }
    }

    if (ch == 'b') {
      if (b.length() == 0) {
        System.out.println("B");
        return;
      } else {
        char card = b.charAt(0);
        b = b.substring(1);
        judge(card);
      }
    }

    if (ch == 'c') {
      if (c.length() == 0) {
        System.out.println("C");
        return;
      } else {
        char card = c.charAt(0);
        c = c.substring(1);
        judge(card);
      }
    }
  }
}