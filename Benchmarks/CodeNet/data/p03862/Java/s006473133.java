import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    int x = in.nextInt();

    int[] a = new int[N];
    for (int i = 0; i < N; i++) {
      a[i] = in.nextInt();
    }

    int cnt = 0;
    int[] b = new int[N - 1];
    for (int i = 0; i < N - 1; i++) {
      if (a[i] + a[i + 1] > x) {
        int sub = a[i] + a[i + 1] - x;
        cnt += sub;
        if (a[i] > a[i + 1]) {
          if (a[i] >= sub) {
            a[i] -= sub;
          } else {
            int tmp = sub - a[i];
            a[i] = 0;
            a[i + 1] -= tmp;
          }
        } else {
          if (a[i + 1] >= sub) {
            a[i + 1] -= sub;
          } else {
            int tmp = sub - a[i + 1];
            a[i + 1] = 0;
            a[i] -= tmp;
          }
        }
      }
    }

    System.out.println(cnt);
  }
}