
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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

    List<Integer> aList = new ArrayList<>();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      aList.add(Integer.parseInt(sc.next()));
    }

    int result = -1;
    for (int i = 0; i < n; i++) {
      result = Collections.min(aList);
      System.out.print(aList.indexOf(result) + 1 + " ");
      aList.set(aList.indexOf(result), 999999);
    }
  }

}
