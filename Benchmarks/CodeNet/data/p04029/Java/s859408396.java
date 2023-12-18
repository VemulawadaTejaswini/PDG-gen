import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // 子どもの人数を標準入力から取得
    int number = scanner.nextInt();

    // キャンディーの個数は子どもの人数Nを利用して「(N + 1) * N / 2」と表される
    System.out.println((number + 1) * number / 2);
  }
}