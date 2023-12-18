
import java.util.*;

public class Main {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    String c1 = sc.next();
    String c2 = sc.next();
    String c3 = sc.next();
    StringBuilder sb = new StringBuilder();
    sb.append(c1.charAt(0)).append(c2.charAt(1)).append(c3.charAt(2));
    System.out.println(sb.toString());
  }
}
