import java.util.*;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next() + sc.next();
    double b = Math.sqrt(Integer.parseInt(a));
    if (b == Math.floor(b)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
