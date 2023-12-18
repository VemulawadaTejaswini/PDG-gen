import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = Integer.parseInt(sc.next());
    int m = Integer.parseInt(sc.next());
    int[][] a = new int[m][2];
    // int[] b = new int[n];
    for (int i = 0; i < m; i++) {
      a[i][0] = Integer.parseInt(sc.next());
      a[i][1] = Integer.parseInt(sc.next());
    }

    Arrays.sort(a, (x, y) -> Integer.compare(x[0], y[0]));

    String msg = "IMPOSSIBLE";
    for (int i = 0; i < m; i++) {
      if (a[i][0] != 1) {
        break;
      } else {
        for (int j = i + 1; j < m; j++) {
          if (a[j][0] == a[i][1]) {
            if (a[j][1] == n) {
              msg = "POSSIBLE";
            }
          }
        }

      }
    }

//    for (int i = 0; i < m; i++) {
//      System.out.println(a[i][0] + " " + a[i][1]);
//    }

    System.out.println(msg);
    sc.close();
  }

}