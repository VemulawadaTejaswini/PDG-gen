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

      BigInteger sum = a.add(b);

      if(sum.compareTo(bound) >= 0) System.out.println("overflow");
      else System.out.println(sum);
    }
  }

  private final Scanner sc = new Scanner(System.in);
  private final BigInteger bound = BigInteger.TEN.pow(80);
}