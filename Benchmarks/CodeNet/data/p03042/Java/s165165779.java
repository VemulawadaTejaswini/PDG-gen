import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.next();

    int first = Integer.parseInt(s.substring(0,2), 10);
    int second = Integer.parseInt(s.substring(2,4), 10);

    if (first < 1 || second < 1) {
      System.out.println("NA");
    } else if (first  <= 12 && second <= 12 ) {
      System.out.println("AMBIGUOUS");
    } else if (second <= 12) {
      System.out.println("YYMM");
    } else if (first  <= 12) {
      System.out.println("MMYY");
    }
  }
}
