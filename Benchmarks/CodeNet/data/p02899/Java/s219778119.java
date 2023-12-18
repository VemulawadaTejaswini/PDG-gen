
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
    int current = 1;
    int getNumber = 0;
    for (int i = 0; i < n; i++) {
      getNumber = Integer.parseInt(sc.next());
      if (current == getNumber) {
        System.out.print(i + 1 + " ");
        current++;
        aList.add(999999);
      } else {
        aList.add(getNumber);
      }
    }


    int result = -1;
    int index = -1;
    for (int i = 0; i < n - current + 1; i++) {
      result = Collections.min(aList);
      index = aList.indexOf(result);
      System.out.print(index + 1 + " ");
      aList.set(index, 999999);
    }
  }

}
