package abc106;

import java.util.Scanner;

//https://abc106.contest.atcoder.jp/tasks/abc106_a
public class A {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int A = scanner.nextInt();
    int B = scanner.nextInt();

    System.out.printf("%d\n", (A-1)*(B-1));
    scanner.close();
  }

}