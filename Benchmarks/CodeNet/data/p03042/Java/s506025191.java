import java.util.Scanner;

public class Main {
  private static boolean isMonth(String ns) {
    int n = Integer.parseInt(ns);
    return n >= 1 && n <= 12;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    sc.close();
    boolean first = isMonth(s.substring(0, 2));
    boolean second = isMonth(s.substring(2));
    String result = "NA";
    if (first && second) result = "AMBIGUOUS";
    else if (first) result = "MMYY";
    else if (second) result = "YYMM";
    System.out.println(result);
  }
}
