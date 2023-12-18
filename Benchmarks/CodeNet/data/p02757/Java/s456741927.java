import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int P = sc.nextInt();
    String S = sc.next();
    sc.close();

    BigInteger p = BigInteger.valueOf(P);
    long ans = 0;
    for (int i = 0; i < N; i++) {
      for (int j = i + 1; j < N + 1; j++) {
        BigInteger d = new BigInteger(S.substring(i, j));
        if (d.remainder(p).intValue() == 0) ans++;
      }
    }
    System.out.println(ans);
  }
}