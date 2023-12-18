import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    Boolean pass = false;
    int goal[] = {0, 0};
    int t = 0;

    for (int i = 0; i < n; i++) {
      List<int[]> queue = new ArrayList<int[]>();
      t = sc.nextInt() - t;
      int x = sc.nextInt();
      int y = sc.nextInt();
      int txy[] = {t, x, y};
      queue.add(txy);

      while (queue.size() != 0) {
        int[] c = queue.remove(queue.size() - 1);
        int tt = c[0];
        int xx = c[1];
        int yy = c[2];
        if (tt % 2 == 0) {
          if (xx == goal[0] && yy == goal[1]) {
            pass = true;
            break;
          } else {
            pass = false;
          }
        }
        if (tt != 0) {
          int txy1[] = {tt - 1, xx + 1, yy};
          queue.add(txy1);
          if (xx > 0) {
            int txy2[] = {tt - 1, xx - 1, yy};
            queue.add(txy2);
          }
          int txy3[] = {tt - 1, xx, yy + 1};
          queue.add(txy3);
          if (yy > 0) {
            int txy2[] = {tt - 1, xx, yy - 1};
            queue.add(txy2);
          }
          if (xx > 0 && yy > 0) {
            int txy4[] = {tt - 1, xx - 1, yy - 1};
            queue.add(txy4);
          }
        }
      }
      goal[0] = x;
      goal[1] = y;
    }
    if (pass) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
