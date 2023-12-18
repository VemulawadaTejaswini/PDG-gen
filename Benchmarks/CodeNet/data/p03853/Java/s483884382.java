
import java.util.*;

public class Main {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();

    for (int i = 0; i < H; i++) {
      String line = sc.next();
      for (int j = 0; j < 2; j++) {
        System.out.println(line);
      }
    }
  }
}
