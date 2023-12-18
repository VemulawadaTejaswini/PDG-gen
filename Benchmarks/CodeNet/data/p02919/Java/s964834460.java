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

    int[] P = new int[n];
    for (int i = 0; i < n; i++) {
      P[i] = Integer.parseInt(sc.next());
    }

    long x = 0;
    int[] copyArray;
    for (int l = 0; l < n - 1; l++) {
      for (int r = l + 1; r < n; r++) {
        copyArray = Arrays.copyOfRange(P, l, r + 1);
        Arrays.sort(copyArray);
        x += copyArray[copyArray.length - 2];
      }
    }

    System.out.println(x);

  }

}
