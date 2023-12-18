import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long k = scanner.nextLong();
    long a = scanner.nextLong();
    long b = scanner.nextLong();
    if (b - a <= 2 || k <= a) {
      System.out.println(k + 1);
      return;
    } else {
      long ans = a;
      long turn = k - a + 1;
      long syo = turn / 2;
      if (turn % 2 == 0) {
        System.out.println(ans + b * syo - a * syo);
      } else {
        System.out.println(ans + b * syo - a * syo + 1);
      }
    }
  }

}
