import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long a = scanner.nextLong();
    long b = scanner.nextLong();
    long k = scanner.nextLong();

    if (a > k) {
      System.out.println((a - k) + " " + b);
    } else if (a + b > k) {
      System.out.println(0 + " " + (a + b - k));
    } else{
      System.out.println(0 + " " + 0);
    }
  }
}
