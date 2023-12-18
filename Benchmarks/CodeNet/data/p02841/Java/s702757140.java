import java.util.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args) {
    Main main = new Main();
    System.out.println(main.solve());
  }

  int[] a;

  public Main() {
    Scanner sc = new Scanner(System.in);
    try {
      a = IntStream.range(0, 4).map(i -> sc.nextInt()).toArray();
    } finally {
      sc.close();
    }
  }

  String solve() {
    return a[3] == 1 ? "1" : "0";
  }
}
