import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    abc173_a();
  }

  // int 2147483648 [ 2 * 10(9)]
  // long 9223372036854775808 [ 9 * 10(18)]

  public static void abc173_a() {
    try (Scanner sc = new Scanner(System.in)) {
      int payment = parseI(sc.next());
      int max = 10000;
      int thou = 1000;

      System.out.println((max - payment) % thou);
    } catch (Exception e) {
      System.out.println("エラー" + e);
    }
  }

  // public static void abc000_a() {
  // try (Scanner sc = new Scanner(System.in)) {
  //
  // System.out.println("テスト");
  // } catch (Exception e) {
  // System.out.println("エラー" + e);
  // }
  // }

  public static int parseI(String value) {
    return Integer.parseInt(value);
  }
}
