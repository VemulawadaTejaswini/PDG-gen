import java.util.*;
import java.math.*;

/*
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BigInteger A = new BigInteger(sc.next());
    BigInteger B = new BigInteger(sc.next());
    BigInteger X = new BigInteger(sc.next());
    BigInteger limit = new BigInteger("1000000000");
    if (A.add(B).compareTo(X) == 1) {
      System.out.println(0);
      return;
    }

    BigInteger out = new BigInteger("1");
    BigInteger size = new BigInteger("1");

    BigInteger newOut = new BigInteger("10");
    BigInteger newSize = new BigInteger("2");
    while (A.multiply(newOut).add(B.multiply(newSize)).compareTo(X) != 1) {
      out = newOut;
      size = newSize;
      newOut = out.multiply(new BigInteger("10"));
      newSize = size.add(new BigInteger("1"));
    }

    X = X.subtract(B.multiply(size));
    out = X.divide(A);
    if (out.compareTo(limit) == 1) out = limit;
    System.out.print(out);
  }
}
*/

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    String S = sc.next();

    int step = 0, cur = S.length()-1;
    List<Integer> outList = new LinkedList<Integer>();
    while (true) {
      if (cur <= M) {
        outList.add(cur);
        String out = new String(""+outList.get(outList.size()-1));
        for (int i = outList.size() - 2; i >= 0; i--) {
          out += new String(" " + outList.get(i));
        }
        System.out.println(out);
        return;
      }

      for (int i = M; i >= 0; i--) {
        if (i == 0) {
          System.out.println("-1");
          return;
        }
        if (S.charAt(cur-i) != '1') {
          outList.add(i);
          cur -= i;
          break;
        }
      }
    }
  }
}
