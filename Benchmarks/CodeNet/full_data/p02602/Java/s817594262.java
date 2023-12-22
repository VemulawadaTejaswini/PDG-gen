import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    BigInteger point = BigInteger.ONE;
    List<BigInteger> aList = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      BigInteger a = new BigInteger(sc.next());
      aList.add(a);
      BigInteger prev = point;
      point = point.multiply(a);
      if (i < k) {
        continue;
      }
      point = point.divide(aList.get(i - k));
      System.out.println(point.compareTo(prev) > 0 ? "Yes" : "No");
    }
  }
}
