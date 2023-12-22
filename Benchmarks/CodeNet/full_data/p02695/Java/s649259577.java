import java.util.*;

public class Main {
  static int n, m, q;
  static int[] a;
  static int score[][];
  static int res;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    m = sc.nextInt();
    q = sc.nextInt();
    a = new int[n];
    score = new int[q][4];
    res = 0;

    for (int i = 0; i < q; i++) {
      for (int j = 0; j <= 3; j++){
        score[i][j] = sc.nextInt();
      }
    }

    for (int i = 1; i <= m; i++) {
      cal(0, i);
    }

    System.out.println(res);
  }

  static void cal(int ind, int num) {
    if (ind == n) {
      int pt = 0;
      for (int i = 0; i < q; i++) {
        if (a[score[i][1] - 1] - a[score[i][0] - 1] == score[i][2]) pt += score[i][3];
      }
      res = Math.max(res, pt);
      return;
    }

    a[ind] = num;

    for (int i = num; i <= m; i++) {
      cal(ind+1, i);
    }
  }
}