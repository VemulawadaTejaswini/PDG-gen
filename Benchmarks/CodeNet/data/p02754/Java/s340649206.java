
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int quot = n / (a + b);
    int surplus = n - (a + b) * quot;
    if (surplus > a) {
      System.out.println(a * quot + a);
    } else {
      System.out.println(a * quot + surplus);
    }
  }
}
