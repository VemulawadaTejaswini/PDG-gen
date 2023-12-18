import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // 標準入力から色（整数）a, b, cを取得
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();

    // 3色を比較して全て同じ色だった場合1を出力
    if(a == b && a == c) {
      System.out.println(1);

    // 3色中2色が同じ色だった場合2を出力
    } else if(a == b || b == c || c == a) {
      System.out.println(2);

    // 3色全てが異なる色だった場合3を出力
    } else {
      System.out.println();
    }
  }
}