import java.util.Scanner;
import java.util.HashSet;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int num = 0;
        int len = str.length();
        BigInteger modVal = new BigInteger("2019");
        BigInteger keta = new BigInteger("10");
        for (int i = 0; i < len-3; i++) {
          BigInteger target = new BigInteger(str.substring(i));
          while (!target.equals(BigInteger.ZERO)) {
              if (target.mod(modVal).equals(BigInteger.ZERO)) {
                  num++;
              }
              target = target.divide(keta);
          }
        }
        System.out.println(num);
    }
}