import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String n = sc.next();
    int c = 0;
    for (int i = 0; i < n.length() - 4; i++) {
      for (int j = i + 3; j <= n.length(); j++) {
        BigInteger integer = new BigInteger(n.substring(i, j));
        //System.out.println(integer);
        if (((integer.mod(BigInteger.valueOf(2019)).compareTo(BigInteger.ZERO)) == 0)) {
          //System.out.println(integer);
          c++;
        }
      }
    }
    System.out.println(c);
  }
}