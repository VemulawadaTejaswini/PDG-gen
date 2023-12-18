import java.math.BigInteger;
import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] S = scanner.nextLine().split(" ");
    scanner.close();
    BigInteger N = new BigInteger(S[0]);
    BigInteger A = new BigInteger(S[1]);
    BigInteger B = new BigInteger(S[2]);
    BigInteger step = A.add(B);
    BigInteger blueCount = BigInteger.ZERO;
    BigInteger allCount = BigInteger.ZERO;
    while(allCount.add(A).compareTo(N) <= 0) {
        blueCount = blueCount.add(A);
        allCount = allCount.add(step);
    }
    if(N.compareTo(allCount) >= 0) {
        blueCount = blueCount.add(N.subtract(allCount));
    }
    System.out.println(blueCount.toString());
  }
}
