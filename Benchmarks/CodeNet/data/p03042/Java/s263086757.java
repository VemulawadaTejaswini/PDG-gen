import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String A = sc.next();
    boolean B = isYYMM(A);
    boolean C = isMMYY(A);
    if (B & C) {
      System.out.println("AMBIGUOUS");
    } else if (B && C == false) {
      System.out.println("YYMM");
    } else if (C && B == false) {
      System.out.println("MMYY");
    } else {
      System.out.println("NA");
    }
  }

  private static boolean isYYMM(String num) {
    String YY = num.substring(0, 2);
    String MM = num.substring(2, 4);
    int newYY = Integer.parseInt(YY);
    int newMM = Integer.parseInt(MM);
    if (newYY != 00 && newMM >= 1 && newMM <= 12) {
      return true;
    } else {
      return false;
    }
  }

  private static boolean isMMYY(String num) {
    String MM = num.substring(0, 2);
    String YY = num.substring(2, 4);
    int newMM = Integer.parseInt(MM);
    int newYY = Integer.parseInt(YY);
    if (newYY != 00 && newMM >= 1 && newMM <= 12) {
      return true;
    } else {
      return false;
    }
  }
}
