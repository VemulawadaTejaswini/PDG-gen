import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner();
    // 整数の入力
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    //　条件分岐と出力
    if (a==b && a==c) {
      System.out.println(1);
    } else if (a==b) {
      System.out.println(2);
    } else if (b==c) {
      System.out.println(2);
    } else {
      System.out.println(3);
    }
  }
}