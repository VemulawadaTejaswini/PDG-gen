import java.math.BigInteger;
    import java.util.*;
    import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BigInteger n = new BigInteger(sc.next());
    BigInteger c26 = new BigInteger("26");
    BigInteger tmp = BigInteger.ONE;
    BigInteger sum = BigInteger.ONE;
    int digit = 1;
    while (true) {
      tmp = tmp.multiply(c26);
      BigInteger t = sum.add(tmp);
      if (t.compareTo(n) <= 0) {
        digit++;
        sum = t;
      } else {
        break;
      }
    }

    BigInteger remain = n.subtract(sum);
    String s = remain.toString(26);

    Map<Character, String> map = new HashMap<>();
    for (char i = 'a'; i <= 'z'; i++) {
      map.put(BigInteger.valueOf(i - 'a').toString(26).charAt(0), Character.toString(i));
    }
    if (s.length() < digit) {
      String t = "";
      for (int i = 0, len = digit - s.length(); i < len; i++) {
        t += "0";
      }
      s = t + s;
    }
    String result = "";
    for (int i = 0; i < digit; i++) {
      result += map.get(s.charAt(i));
    }
    System.out.println(result);
  }
}
