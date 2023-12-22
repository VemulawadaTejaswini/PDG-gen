import java.math.BigInteger;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String n = sc.next();
    int sum = 0;

    for (int i = 0; i < n.length() - 4; i++) {
      for (int j = i + 4; j < n.length() + 1; j++) {
        BigInteger a = new BigInteger(n.substring(i, j));
        if (a.mod(new BigInteger("2019")).intValue() == 0) {
          sum++;
        }
      }
    }
    System.out.println(sum);
  }
}
