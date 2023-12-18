
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
    for (int i = 0; i < n; i++) {
      aList.add(Integer.parseInt(sc.next()));
    }


    int result = -1;
    int index = -1;
    for (int i = 0; i < n; i++) {
      result = Collections.min(aList);
      index = aList.indexOf(result);
      System.out.print(index + 1);
      System.out.print("");
      aList.set(index, 999999);
    }
  }

}
