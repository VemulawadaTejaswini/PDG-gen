import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    BigInteger k = new BigInteger(sc.next());
    ArrayList<BigInteger> a = new ArrayList<>();
    ArrayList<BigInteger> b = new ArrayList<>();

    int indexA = -1;
    int indexB = -1;
    BigInteger sum = BigInteger.ZERO;
    for (int i = 0; i < n; i++) {
      BigInteger aTmp = new BigInteger(sc.next());
      BigInteger tmp = sum.add(aTmp);
      if (tmp.compareTo(k) <= 0) {
        indexA = i;
        sum = tmp;
      }
      a.add(aTmp);
    }
    for (int i = 0; i < m; i++) {
      BigInteger bTmp = new BigInteger(sc.next());
      BigInteger tmp = sum.add(bTmp);
      if (tmp.compareTo(k) <= 0) {
        indexB = i;
        sum = tmp;
      }
      b.add(bTmp);
    }

    int max = (indexA + 1) + (indexB + 1);
    for (int i = indexA; i >= 0; i--) {
      if (indexB == m - 1) {
        break;
      }
      sum = sum.subtract(a.get(indexA));
      BigInteger tmp = sum;
      while (true) {
        if (indexB == m - 1) {
          break;
        }
        tmp = tmp.add(b.get(indexB + 1));
        if (tmp.compareTo(k) <= 0) {
          indexB++;
        } else {
          break;
        }
      }
      sum = tmp;
      int t = (indexA + 1) + (indexB + 1);
      if (t > max) {
        max = t;
      }
    }
    System.out.println(max);
  }


}
