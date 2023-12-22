import java.math.BigInteger;
import java.util.*;

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
      if (i < k) {
        continue;
      }
      System.out.println(a.compareTo(aList.get(i - k)) > 0 ? "Yes" : "No");
    }
  }
}
