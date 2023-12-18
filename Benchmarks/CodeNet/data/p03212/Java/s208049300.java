import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int target = sc.nextInt();
    int result = 0;
    int currentVal = 357;
    for (;;) {
       if (target >= currentVal) {
          result++;
       } else {
          break;
       }
       currentVal = nextVal(currentVal);
    }
    // 出力
    System.out.println(result);
  }
  private static int nextVal(int v) {
      String t = String.valueOf(v);
      String target = roundUp(t, t.length() - 1);
      int result = Integer.valueOf(target);
      return result;
  }
  private static String roundUp(String t, int n) {
      if (n <= 0) {
         return "3" + t;
      }
      String a = t.substring(n,n+1);
      String replace = "";
      if (a.equals("3")) {
          replace = "5";
      } else if (a.equals("5")) {
          replace = "7";
      } else {
          return Main.roundUp(t, n - 1);
      }
      return t.substring(0,n) + replace + t.substring(n+1, t.length());
  }
}