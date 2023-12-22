import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // abc176_a();
    abc176_b();
  }

  private static void abc176_a() {
    try (Scanner sc = new Scanner(System.in)) {
      double nAll = sc.nextInt();
      double xOneTime = sc.nextInt();
      int tMinute = sc.nextInt();

      System.out.println((int) Math.ceil(nAll / xOneTime) * tMinute);

    } catch (Exception e) {
      System.out.println("エラー" + e);
    }
  }

  private static void abc176_b() {
    try (Scanner sc = new Scanner(System.in)) {
      String nValue = sc.next();
      ArrayList<Integer> numList = new ArrayList<Integer>();

      for (int i = 1; i <= nValue.length(); i++) {
        numList.add(parseI(nValue.substring(i - 1, i)));
      }

      int sum = 0;

      for (int num : numList) {
        sum += num;
      }

      if (sum % 9 == 0) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }

    } catch (Exception e) {
      System.out.println("エラー" + e);
    }
  }

  // int 2147483648 [ 2 * 10(9)]
  // long 9223372036854775808 [ 9 * 10(18)]

  public static int parseI(String value) {
    return Integer.parseInt(value);
  }

  public static long parseL(String value) {
    return Long.parseLong(value);
  }

  public static double parseD(String value) {
    return Double.parseDouble(value);
  }

  public static <T> String parseS(T value) {
    return String.valueOf(value);
  }

  public static BigDecimal parseBigD(String value) {
    return new BigDecimal(value);
  }

  public static BigInteger parseBigI(String value) {
    return new BigInteger(value);
  }

}
