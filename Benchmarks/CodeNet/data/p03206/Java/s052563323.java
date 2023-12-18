
import java.util.*;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int input = sc.nextInt();

      if (input == 25) {
        System.out.println("Christmas");
      } else if (input == 24) {
        System.out.println("Christmas Eve");
      } else if (input == 23) {
        System.out.println("Christmas Eve Eve");
      } else if (input == 22) {
        System.out.println("Christmas Eve Eve Eve");
      }
    }
  }
}
