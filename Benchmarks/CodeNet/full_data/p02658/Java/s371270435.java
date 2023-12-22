import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    List<String> inputs = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      String input = sc.next();
      if (input.equals("0")) {
        System.out.println(0);
        return;
      }
      inputs.add(input);
    }
    BigInteger res = new BigInteger(inputs.get(0));
    BigInteger max = new BigInteger("1000000000000000000");
    for (int i = 1; i < n; i++) {
      BigInteger num = new BigInteger(inputs.get(i));
      res = res.multiply(num);
      if (res.compareTo(max) > 0) {
        System.out.println(-1);
        return;
      }
    }
    System.out.println(res.longValue());
  }
}
