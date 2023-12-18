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
    long sum = 0;
    long[] presum = new long[n.length() + 1];
    for (int i = 0; i < n.length(); i++) {
      sum += Integer.parseInt(n.charAt(i) + "");
      presum[i + 1] = sum;
    }
    for (int i = 0; i < n.length(); i++) {
      for (int j = i + 4; j <= n.length(); j++) {
        long diff = presum[j] - presum[i];
        if (diff % 3 == 0) {
          BigInteger integer = new BigInteger(n.substring(i, j));
          if (((integer.mod(BigInteger.valueOf(2019)).compareTo(BigInteger.ZERO)) == 0)) {
            c++;
          }
        }
      }
    }
    System.out.println(c);
  }
}