import java.util.*;
import java.util.Collections;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Long A = sc.nextLong();
    Long B = sc.nextLong();
    if (A > B) {
      System.out.println("GREATER");
    } else if (A < B) {
      System.out.println("LESS");
    } else {
      System.out.println("EQUAL");
    }
  }
}
