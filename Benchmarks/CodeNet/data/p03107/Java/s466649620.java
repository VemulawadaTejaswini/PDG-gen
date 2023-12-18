import java.util.Scanner;

public class Main {

  private static final String ZEROONE = "01";
  private static final String ONEZERO = "10";
  private static final String EMPTY = "";

  public static void main(String[] args) {
    // 入力
    try (Scanner sc = new Scanner(System.in);) {
      int sum = 0;
      String tmp = sc.nextLine();
      while (true) {
        int zeroone = tmp.indexOf(ZEROONE);
        int onezero = tmp.indexOf(ONEZERO);
        if (0 <= zeroone && (onezero < 0 || zeroone < onezero)) {
          tmp = tmp.replaceFirst(ZEROONE, EMPTY);
          sum += 2;
          continue;
        }
        if (0 <= onezero && (zeroone < 0 || onezero < zeroone)) {
          tmp = tmp.replaceFirst(ONEZERO, EMPTY);
          sum += 2;
        }
        if (zeroone < 0 && onezero < 0) {
          break;
        }
      }
      System.out.println(sum);
    }
  }
}