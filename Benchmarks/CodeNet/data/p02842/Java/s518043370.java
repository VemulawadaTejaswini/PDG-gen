import static java.lang.Math.floor;
import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    if (floor(floor(n / 1.08) * 1.08) == n) {
      System.out.println(floor(n / 1.08));
    } else if (floor(floor(n / 1.08 + 1) * 1.08) == n) {
      System.out.println(floor(n / 1.08) + 1);
    } else {
      System.out.println(":(");
    }
  }

}