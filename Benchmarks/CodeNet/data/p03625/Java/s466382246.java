import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = Integer.parseInt(sc.next());
    Integer[] a = new Integer[n];

    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(sc.next());
    }
    Arrays.sort(a, Collections.reverseOrder());

    int count = 0;
    long sq = 1;

    for (int i = 1; i < n; i++) {
      if (a[i].equals(a[i - 1])) {
        sq *= a[i];
        i++;
        count++;
        if (count >= 2) {
          break;
        }
      }
    }

    if (count < 2) {
      System.out.println(sq);
    } else {
      System.out.println(0);
    }
    sc.close();
  }
}