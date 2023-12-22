import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i < n; i++) {
      list.add(sc.nextInt());
    }
    Collections.sort(list);
    ArrayList<Integer> avoid = new ArrayList<Integer>();
    boolean ok = true;
    int res = 0;

    for (int i = 0; i < n; i++) {
      ok = true;
      if (!avoid.contains(i)) {
        for (int j = 0; j < n; j++) {
          if (i != j) {
            if (list.get(j) % list.get(i) == 0) {
              avoid.add(j);
            }
            if (list.get(i) % list.get(j) == 0) {
              ok = false;
              break;
            } else {
              continue;
            }
          }
        }
        if (ok) {
          res++;
        }
      }
    }
    System.out.println(res);
  }

}