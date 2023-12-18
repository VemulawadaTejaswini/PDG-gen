import javax.swing.text.StyledEditorKit;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
  private static Scanner sc;

  public static void main(String[] args) {
    sc = new Scanner(System.in);
    new Main().solve();
  }


  private void solve() {
    String S = sc.next();
    String K = sc.next();
    Map<BigInteger, Integer> map = new TreeMap<>();
    BigInteger right = BigInteger.ZERO;
    for (int i = 0; i < S.length(); i++) {
      int num = Character.getNumericValue(S.charAt(i));
      BigInteger bi = null;
      if (num == 1) {
        bi = BigInteger.ONE;
      } else {
        bi = BigInteger.valueOf(5000000000000000L).multiply(BigInteger.valueOf(num));
      }
      BigInteger bi2 = bi.add(right);
      right = right.add(bi);
      map.put(bi2, num);
    }
    BigInteger kbi = new BigInteger(K);
    for (Map.Entry<BigInteger, Integer> entry : map.entrySet()) {
      if (kbi.compareTo(entry.getKey()) <= 0){
        System.out.println(entry.getValue());
        break;
      }
    }
  }
}

