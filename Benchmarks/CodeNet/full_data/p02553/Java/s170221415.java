import java.math.BigInteger;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    var inps = new BigInteger[4];
    try (var sc = new Scanner(System.in)) {
      for (int i = 0; i < 4; ++i) {
        inps[i] = new BigInteger(String.valueOf(sc.nextInt()));
      }
    }
      var ac = inps[0].multiply(inps[2]);
      var ad = inps[0].multiply(inps[3]);
      var bc = inps[1].multiply(inps[2]);
      var bd = inps[1].multiply(inps[3]);

      ac = ac.max(ad);
      ac = ac.max(bc);
      ac = ac.max(bd);

      System.out.println(ac);
  }
}
