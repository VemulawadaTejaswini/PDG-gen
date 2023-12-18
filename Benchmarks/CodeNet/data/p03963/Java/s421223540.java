import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ

    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int n = sc.nextInt();

    int pattern = n;
    for (int i = 0; i < m - 1; i++) {
      pattern = pattern * (n - 1);
    }

    System.out.println(pattern);
  }
}
