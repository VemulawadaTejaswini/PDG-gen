import java.util.Arrays;
import java.util.Scanner;

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
    int n = Integer.parseInt(sc.next());

    int[] b = new int[n - 1];
    for (int i = 0; i < n - 1; i++) {
      b[i] = Integer.parseInt(sc.next());
    }

    int[] max = new int[n];
    max[0] = b[0];
    max[n - 1] = b[n - 2];

    for (int i = 1; i < n - 1; i++) {
      max[i] = Math.min(b[i - 1], b[i]);
    }
    System.out.println(Arrays.stream(max).sum());

  }

}
