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

    int sum = 0;
    for (int i = 1; i < n; i++) {
      sum += i;
    }

    System.out.println(sum);
  }

}
