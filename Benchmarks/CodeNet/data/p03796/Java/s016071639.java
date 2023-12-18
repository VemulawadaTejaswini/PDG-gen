import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;

public class Main {

  private static final BigDecimal DIVIDER = new BigDecimal((Math.pow(10d, 9d) + 7));

  private static final MathContext MC = new MathContext(0, RoundingMode.HALF_DOWN);


  public static void main(String[] args) {

    int n = 0;
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      n = Integer.parseInt(br.readLine());
    } catch(IOException e) {
      e.printStackTrace();
      System.exit(1);
    }

    BigDecimal quotient = new BigDecimal(1);
    quotient.round(MC);
    for (int i = 1; i <= n; i++) {
      quotient = quotient.multiply(new BigDecimal(i).round(MC));
    }

    System.out.print(quotient.remainder(DIVIDER));
  }
}
