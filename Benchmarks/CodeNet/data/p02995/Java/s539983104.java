import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @author author
 *
 */
public class Main {

  /**
   * @param args
   */
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    int c = Integer.parseInt(sc.next());
    int d = Integer.parseInt(sc.next());

    System.out
        .println(IntStream.range(a, b + 1).filter(i -> i % c != 0).filter(i -> i % d != 0).count());
  }

}
