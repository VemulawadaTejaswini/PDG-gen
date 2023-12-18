import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arrT = new int[n];
    int[] arrA = new int[n];
    for (int i = 0; i < n; i++) {
      arrT[i] = sc.nextInt();
      arrA[i] = sc.nextInt();
    }
    sc.close();

    BigDecimal t = BigDecimal.valueOf(arrT[0]);
    BigDecimal a = BigDecimal.valueOf(arrA[0]);
    for (int i = 1; i < n; i++) {
      BigDecimal ratT = BigDecimal.valueOf(arrT[i]);
      BigDecimal ratA = BigDecimal.valueOf(arrA[i]);
      BigDecimal mltT = t.divide(ratT, 0, RoundingMode.CEILING);
      BigDecimal mltA = a.divide(ratA, 0, RoundingMode.CEILING);
      BigDecimal mlt = mltT.compareTo(mltA) >= 0 ? mltT : mltA;
      t = ratT.multiply(mlt);
      a = ratA.multiply(mlt);
    }
    System.out.println(t.add(a).intValue());
  }
}
