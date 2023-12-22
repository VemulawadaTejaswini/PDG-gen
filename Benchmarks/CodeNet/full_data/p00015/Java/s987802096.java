import java.util.*;
import java.math.BigInteger;

public class Main {
  public static void main(String[] args) {
    new Main().run();
  }

  private void run() {
    int n = sc.nextInt();

    for(int i = 0; i < n; i++) {
      BigInteger a = sc.nextBigInteger();
      BigInteger b = sc.nextBigInteger();

      System.out.println(a.add(b));
    }
  }

  private final Scanner sc = new Scanner(System.in);
}