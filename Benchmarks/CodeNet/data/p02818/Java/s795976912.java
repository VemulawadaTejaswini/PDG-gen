import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long a = scanner.nextLong();
    long b = scanner.nextLong();
    long k = scanner.nextLong();

    if (a + b > k) {
      System.out.println(a + b - k);
    } else {
      System.out.println(0);
    }
  }
}
