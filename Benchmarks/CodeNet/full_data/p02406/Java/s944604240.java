import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    int n = stdin.nextInt();
    Main.call(n);
  }

  private static void call(int n) {
    for (int i = 1; i <= n; i++) {
      if (i % 3 == 0 || String.valueOf(i).contains("3")) {
        System.out.printf(" %d", i);
      }
    }
    System.out.println("");
  }
}