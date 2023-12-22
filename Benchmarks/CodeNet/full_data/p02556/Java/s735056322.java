import java.util.*;

/**
 * E Main
 *
 * @date 2020.09.19
 * @author 焼き鮭 <yaki-shake@up-tri.me>
 */

public class Main {
  Scanner sc;

  public static void main(String[] args) {
    new Main().execute();
  }

  public void execute() {
    this.sc = new Scanner(System.in);

    int n = sc.nextInt();

    int[][] points = new int[n][4];
    int maxi_2 = -1;
    int mini_2 = -1;
    int maxi_3 = -1;
    int mini_3 = -1;

    for (int i = 0; i < n; i++) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      points[i][0] = x;
      points[i][1] = y;
      points[i][2] = x + y;
      points[i][3] = x - y;
      if (maxi_2 == -1 || points[maxi_2][2] < points[i][2]) {
        maxi_2 = i;
      }
      if (maxi_3 == -1 || points[maxi_3][3] < points[i][3]) {
        maxi_3 = i;
      }
      if (mini_2 == -1 || points[mini_2][2] > points[i][2]) {
        mini_2 = i;
      }
      if (mini_3 == -1 || points[mini_3][3] > points[i][3]) {
        mini_3 = i;
      }
    }

    int a = (points[maxi_2][2] - points[mini_2][2]);
    int b = (points[maxi_3][3] - points[mini_3][3]);

    System.out.println(a < b ? b : a);
  }
}
