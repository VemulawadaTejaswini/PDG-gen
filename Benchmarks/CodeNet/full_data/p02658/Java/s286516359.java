import java.util.*;
import java.math.*;

public class Main {

  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    BigDecimal[] A = new BigDecimal[N+1];
    BigDecimal a = new BigDecimal(1);
    BigDecimal b = new BigDecimal(Math.pow(10,18));
    for (int i =1; i<=N; i++) {
      A[i] = sc.nextBigDecimal();
      a = a.multiply(A[i]);
      if (i == N) {
        if (a.compareTo(b) > 0) {
        a = new BigDecimal(-1);
        break;
        }
      }
    }
    System.out.println(a);
  }
}