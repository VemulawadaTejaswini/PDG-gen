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

    int count = 1;
    long sq = 0l;
    int first = 0;
    int second = 0;
    for (int i = 1; i < n; i++) {
      if (first == 0) {
        if (a[i] == a[i - 1] && count == 1) {
          count++;
          first = a[i];
        }
      } else {
        if (second == 0) {
          if (a[i] == a[i - 1]) {
            if (count == 1) {
              count++;
              second = a[i];
              sq = (long) first * second;
              System.out.println(sq);
            } else {
              count = 1;
              continue;
            }
          } else {
            count = 1;
          }
        }
      }
    }
    if (second == 0) {
      System.out.println(0);
    }
    sc.close();
  }
}