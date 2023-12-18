
import java.util.Scanner;
import java.util.stream.LongStream;

/**
 * @author author
 *
 */
public class main {

  /**
   * @param args
   */
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    long a = Integer.parseInt(sc.next());
    long b = Integer.parseInt(sc.next());
    long c = Integer.parseInt(sc.next());
    long d = Integer.parseInt(sc.next());

    System.out
        .println(
            LongStream.range(a, b + 1).filter(i -> i % c != 0).filter(i -> i % d != 0).count());
  }

}
