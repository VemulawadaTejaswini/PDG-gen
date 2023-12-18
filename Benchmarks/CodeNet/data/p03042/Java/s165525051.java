import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String arg = scan.next();
    int p = Integer.parseInt(arg.substring(0, 2));
    int s = Integer.parseInt(arg.substring(2));
    boolean pim = 1 <= p && p <= 12;
    boolean sim = 1 <= s && s <= 12;
    System.out.println(pim ? sim ? "AMBIGUOUS" : "MMYY" : sim ? "YYMM" : "NA");
  }
}