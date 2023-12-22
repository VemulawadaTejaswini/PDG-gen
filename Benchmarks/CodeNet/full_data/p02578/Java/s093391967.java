import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // abc176_a();
    // abc176_b();
    abc176_c();
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
      List<Integer> numList = new ArrayList<Integer>();

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

  private static void abc176_c() {
    try (Scanner sc = new Scanner(System.in)) {
      int nPeopleCount = sc.nextInt();
      int[] aTallList = new int[2 * 100000];

      long totalAdd = 0;
      int tall = 0;

      aTallList[0] = parseI(sc.next());
      for (int i = 1; i < nPeopleCount; i++) {
        tall = parseI(sc.next());
        if (0 < aTallList[i - 1] - tall) {
          totalAdd += aTallList[i - 1] - tall;
          tall = aTallList[i - 1];
        }
        aTallList[i] = tall;
      }
      System.out.println(totalAdd);

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
