import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[][] a = new int[N][N];
    int[][] b = new int[N][N];

    for (int i=0; i < N; i++) {
      a[i][0] = sc.nextInt();
      a[i][1] = sc.nextInt();
    }

    for (int i=0; i < N; i++) {
      b[i][0] = sc.nextInt();
      b[i][1] = sc.nextInt();
    }

    int count = 0;

    for (int i=0; i < N; i++) {
      int tmp_min = Integer.MAX_VALUE;

      for (int j=0; j < N; j++) {
        if (a[i][0] >= b[j][0]) {
          continue;
        } else if (a[i][1] >= b[j][1]) {
          continue;
        } else if (b[j][0] + b[j][1] - a[i][0] - a[i][1] < tmp_min) {
          tmp_min = b[j][0] + b[j][1] - a[i][0] - a[i][1];
          b[j][0] = 0;
          b[j][1] = 0;
          count++;
        }
      }
    }

    System.out.println(count);
  }
}
