import java.util.*;

public class Main {
  public static void main(String[] args) {
    new Main().run();
  }

  private void run() {
    while(sc.hasNext()) {
      final long a = sc.nextInt();
      final long b = sc.nextInt();

      System.out.println(a + b);
    }
  }

  private final Scanner sc = new Scanner(System.in);
}