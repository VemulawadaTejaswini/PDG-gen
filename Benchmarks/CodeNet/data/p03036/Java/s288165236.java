import java.util.*;
import java.util.Collections;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Long r = sc.nextLong();
    Long D = sc.nextLong();
    Long x = sc.nextLong();
    for (int i = 0; i < 10; i++) {
      Long ans = r * x - D;
      System.out.println(ans);
      x = ans;
    }
  }
}
